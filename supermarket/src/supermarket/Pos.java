package supermarket;

import java.awt.Font;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Pos extends javax.swing.JFrame {
    dbconn db=new dbconn();
    String user;
    
    public Pos(String user) {
        this.user=user;
        initComponents();
        panel();
    }
Connection con;

    //This is a preview of the bill
    public void bill(){
        String total = txttotal.getText();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)tblItem.getModel(); 
        
        txtbill.setText(txtbill.getText() + "   ******************************************\n"
                                          + "                      POSBILL              \n");
        txtbill.setFont(txtbill.getFont().deriveFont(Font.BOLD, 14f));
 
        txtbill.setText(txtbill.getText() + "   ******************************************\n");   
         //Heading
        txtbill.setText(txtbill.getText() + "   Product" + "\t" + "Price" + "\t" + "Amount" + "\n" 
                                          + "   --------------------------------------------------\n" ); 
        
          for(int i = 0; i < model.getRowCount(); i++)
          {              
              String prdName = (String)model.getValueAt(i, 0);
              Double price = (Double)model.getValueAt(i, 1);
              Double amount = (Double)model.getValueAt(i, 3);        
              txtbill.setText(txtbill.getText() +"   " +prdName  + "\t" + price + "\t" + amount  + "\n"  );
          }   
          
        txtbill.setText(txtbill.getText() + "\n"
                                          + "\t" +  "Total : " + total + "\n"
                                          + "\n"
                                          + "   *******************************************\n"
                                          + "               THANK YOU COME AGAIN         \n");
    }
    
    //This to update to the database of the data
    public void update(String query){
        con=db.getConn();
        
        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            
        }
        
    }
    
    //Clear all the fields 
    public void clear(){
        txtprdCode.setText("");
        txtprdName.setText("");
        txtprice.setText("");
        txtqty.setText("");
        txtStock.setText("");
    }
    
    //This is to authenticate the user and prevent unauthorized access 
     public void panel(){
        if(user.equals("SELLER")){
            menuProducts.setVisible(false);
            menuSellers.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        pos = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtprdCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtprdName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        txtprint = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        logout1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        menuProducts = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        menuSellers = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jButton2.setText("jButton2");

        setTitle("POINT OF SALE SYSTEM");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pos.setBackground(new java.awt.Color(0, 0, 0));
        pos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pos.setPreferredSize(new java.awt.Dimension(900, 650));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 204, 51));
        jTextField1.setText("POINT OF SALES");
        jTextField1.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Barcode");

        txtprdCode.setBackground(new java.awt.Color(0, 0, 0));
        txtprdCode.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtprdCode.setForeground(new java.awt.Color(255, 255, 0));
        txtprdCode.setCaretColor(new java.awt.Color(255, 204, 51));
        txtprdCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprdCodeKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Prd-Name");

        txtprdName.setBackground(new java.awt.Color(0, 0, 0));
        txtprdName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtprdName.setForeground(new java.awt.Color(255, 255, 0));
        txtprdName.setCaretColor(new java.awt.Color(255, 204, 51));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Price");

        txtprice.setBackground(new java.awt.Color(0, 0, 0));
        txtprice.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtprice.setForeground(new java.awt.Color(255, 255, 0));
        txtprice.setCaretColor(new java.awt.Color(255, 204, 51));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Quantity");

        txtqty.setBackground(new java.awt.Color(0, 0, 0));
        txtqty.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtqty.setForeground(new java.awt.Color(255, 255, 0));
        txtqty.setCaretColor(new java.awt.Color(255, 204, 51));

        tblItem.setAutoCreateRowSorter(true);
        tblItem.setBackground(new java.awt.Color(0, 0, 0));
        tblItem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblItem.setForeground(new java.awt.Color(255, 204, 51));
        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Qty", "Amount"
            }
        ));
        tblItem.setEnabled(false);
        tblItem.setFocusable(false);
        tblItem.setGridColor(new java.awt.Color(153, 153, 153));
        tblItem.setRowHeight(20);
        tblItem.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblItem);

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        txtprint.setBackground(new java.awt.Color(153, 153, 153));
        txtprint.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtprint.setForeground(new java.awt.Color(0, 0, 0));
        txtprint.setText("PRINT BILL");
        txtprint.setToolTipText("Click to print");
        txtprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprintActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(153, 153, 153));
        btnadd.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnadd.setForeground(new java.awt.Color(0, 0, 0));
        btnadd.setText("ADD");
        btnadd.setToolTipText("Add item to the list");
        btnadd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Total");

        txttotal.setBackground(new java.awt.Color(0, 0, 0));
        txttotal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 0));
        txttotal.setCaretColor(new java.awt.Color(255, 204, 51));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Stock");

        txtStock.setBackground(new java.awt.Color(0, 0, 0));
        txtStock.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 0));
        txtStock.setCaretColor(new java.awt.Color(255, 204, 51));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("BILL");

        javax.swing.GroupLayout posLayout = new javax.swing.GroupLayout(pos);
        pos.setLayout(posLayout);
        posLayout.setHorizontalGroup(
            posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posLayout.createSequentialGroup()
                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(posLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(posLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(posLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(posLayout.createSequentialGroup()
                                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprdName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(posLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6))
                            .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(posLayout.createSequentialGroup()
                                    .addComponent(txtprint)
                                    .addGap(15, 15, 15)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12))
        );
        posLayout.setVerticalGroup(
            posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(posLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(posLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(37, 37, 37)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGroup(posLayout.createSequentialGroup()
                            .addComponent(txtprdCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtprdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(27, 27, 27)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(posLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(posLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))))
                    .addGroup(posLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, posLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(posLayout.createSequentialGroup()
                        .addGroup(posLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(posLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4))
                            .addGroup(posLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(posLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(txtprint, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );

        getContentPane().add(pos, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 0, 900, 650));

        mainpanel.setBackground(new java.awt.Color(0, 0, 0));

        logout1.setBackground(new java.awt.Color(255, 153, 51));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/logout.png")); // NOI18N
        jLabel9.setText("  LOGOUT");

        javax.swing.GroupLayout logout1Layout = new javax.swing.GroupLayout(logout1);
        logout1.setLayout(logout1Layout);
        logout1Layout.setHorizontalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logout1Layout.setVerticalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        menuProducts.setBackground(new java.awt.Color(255, 153, 51));
        menuProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductsMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/product.jpg")); // NOI18N
        jLabel10.setText("PRODUCTS");

        javax.swing.GroupLayout menuProductsLayout = new javax.swing.GroupLayout(menuProducts);
        menuProducts.setLayout(menuProductsLayout);
        menuProductsLayout.setHorizontalGroup(
            menuProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuProductsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuProductsLayout.setVerticalGroup(
            menuProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuSellers.setBackground(new java.awt.Color(255, 153, 51));
        menuSellers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSellersMouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/selller.png")); // NOI18N
        jLabel11.setText("SELLERS");

        javax.swing.GroupLayout menuSellersLayout = new javax.swing.GroupLayout(menuSellers);
        menuSellers.setLayout(menuSellersLayout);
        menuSellersLayout.setHorizontalGroup(
            menuSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSellersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        menuSellersLayout.setVerticalGroup(
            menuSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("FAMILY");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("MARKET");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/su.jpg")); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(255, 153, 51));
        jSeparator2.setForeground(new java.awt.Color(255, 153, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel13))
                            .addComponent(jLabel12))
                        .addGap(5, 5, 5))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuSellers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(menuSellers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(menuProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2))
        );

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   // to add the list of items to the table one by when user adds 
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel model;
        
        String prdCode=txtprdCode.getText();
        String prdName=txtprdName.getText();
        double price=Double.parseDouble(txtprice.getText());
        int prdStock=Integer.parseInt(txtStock.getText());
        int qty=Integer.parseInt(txtqty.getText());
        
        int balStock=prdStock - qty;
        
        String query="UPDATE product SET prdStock= '"+balStock +"' WHERE prdCode=  '"+prdCode+"'  ";
        update(query);
        
        double subtotal=price*qty;
        
        model = (DefaultTableModel)tblItem.getModel();
            
            model.addRow(new Object[]
                    {
                        prdName ,
                        price,
                        qty,
                        subtotal, 
                    });
            
            double total = 0.0;
           
            for(int i = 0; i<tblItem.getRowCount(); i++)
            {
                total = total + Double.parseDouble(tblItem.getValueAt(i, 3).toString());
            }
       
            txttotal.setText(Double.toString(total));
             
            clear();
            txtprdCode.requestFocus();
            
           
    }//GEN-LAST:event_btnaddActionPerformed
    
    //retrive the data to the fields from database when the barcode is entered
    int avlQty=0,newQty;
    private void txtprdCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprdCodeKeyReleased
        con=db.getConn();
        String sqlcmd="SELECT prdCode,prdName,prdStock,prdPrice FROM product WHERE prdCode=?";
        
        String prdCode=txtprdCode.getText();
        
        try {
            PreparedStatement pst=con.prepareStatement(sqlcmd);
            pst.setString(1,prdCode);
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()==true)
            {
                String prdName = rs.getString(2);
                String stock = rs.getString(3);
                String price = rs.getString(4);
                txtprdName.setText(prdName);
                txtStock.setText(stock);
                txtprice.setText(price);
            }
            
            
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_txtprdCodeKeyReleased

    //print the bill
    private void txtprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprintActionPerformed
        bill();    
    }//GEN-LAST:event_txtprintActionPerformed

    //logout from the app
    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    //navigate to the products menu(only for admin)
    private void menuProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductsMouseClicked
        Product p=new Product();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProductsMouseClicked

    //navigate to the sellers menu(only for admin)
    private void menuSellersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSellersMouseClicked
        Seller s=new Seller();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSellersMouseClicked

   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {  
                Login l=new Login();
                new Pos(l.user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel logout1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel menuProducts;
    private javax.swing.JPanel menuSellers;
    private javax.swing.JPanel pos;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtprdCode;
    private javax.swing.JTextField txtprdName;
    private javax.swing.JTextField txtprice;
    private javax.swing.JButton txtprint;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
