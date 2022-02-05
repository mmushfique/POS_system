
package supermarket;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Product extends javax.swing.JFrame {
    
    Connection con=null;
    Statement st=null;
    PreparedStatement pst=null;
    ResultSet rs= null;
    
    
    public Product() {
        initComponents();
        selectPrd();
    }

    // *************************************Define some new methods***********************************************************
    
    //To select all products from the database
    public void selectPrd(){
        dbconn db=new dbconn();
        con = db.getConn();
        String query = "SELECT * FROM product";
        
        try {
            st=con.createStatement();
            rs= st.executeQuery(query);
            tblPrd.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
              System.out.println(ex);
        }
    }

    //To clear all the textboxes
    public void clear(){
        txtPrdCode.setText("");
        txtPrdName.setText("");
        txtPrdDesc.setText("");
        txtPrdQty.setText("");
        txtPrdPrice.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelProducts = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddPrd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrd = new javax.swing.JTable();
        txtPrdCode = new javax.swing.JTextField();
        txtPrdName = new javax.swing.JTextField();
        txtPrdQty = new javax.swing.JTextField();
        txtPrdPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrdDesc = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        menuPos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        menuSellers = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        menuLogout = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUPERMARKET SYSTEM");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));

        panelProducts.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Product Code");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Product Name");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Quantity");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Price");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("Manage Products");

        btnAddPrd.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPrd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddPrd.setForeground(new java.awt.Color(255, 204, 51));
        btnAddPrd.setText("Add item");
        btnAddPrd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        btnAddPrd.setFocusPainted(false);
        btnAddPrd.setPreferredSize(new java.awt.Dimension(93, 30));
        btnAddPrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddPrdMouseClicked(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 204, 51));
        btnUpdate.setText("Update item");
        btnUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        btnUpdate.setFocusPainted(false);
        btnUpdate.setMaximumSize(new java.awt.Dimension(128, 30));
        btnUpdate.setMinimumSize(new java.awt.Dimension(128, 30));
        btnUpdate.setPreferredSize(new java.awt.Dimension(93, 30));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 204, 51));
        btnDelete.setText("Delete item");
        btnDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.setMaximumSize(new java.awt.Dimension(119, 30));
        btnDelete.setMinimumSize(new java.awt.Dimension(119, 30));
        btnDelete.setPreferredSize(new java.awt.Dimension(119, 30));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 204, 51));
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        btnClear.setFocusPainted(false);
        btnClear.setPreferredSize(new java.awt.Dimension(54, 30));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Descrption");

        tblPrd.setBackground(new java.awt.Color(0, 0, 0));
        tblPrd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblPrd.setForeground(new java.awt.Color(255, 204, 51));
        tblPrd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT CODE", "PRODUCT NAME", "DESCRIPTION", "STOCK QTY", "PRICE"
            }
        ));
        tblPrd.setColumnSelectionAllowed(true);
        tblPrd.setFocusable(false);
        tblPrd.setGridColor(new java.awt.Color(153, 153, 153));
        tblPrd.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPrd.setRowHeight(25);
        tblPrd.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblPrd.setSelectionForeground(new java.awt.Color(255, 204, 51));
        tblPrd.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPrd.setShowVerticalLines(false);
        tblPrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrd);
        tblPrd.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        txtPrdCode.setBackground(new java.awt.Color(0, 0, 0));
        txtPrdCode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrdCode.setForeground(new java.awt.Color(255, 204, 51));
        txtPrdCode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPrdCode.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPrdCode.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtPrdName.setBackground(new java.awt.Color(0, 0, 0));
        txtPrdName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrdName.setForeground(new java.awt.Color(255, 204, 51));
        txtPrdName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPrdName.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPrdName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtPrdQty.setBackground(new java.awt.Color(0, 0, 0));
        txtPrdQty.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrdQty.setForeground(new java.awt.Color(255, 204, 51));
        txtPrdQty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPrdQty.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPrdQty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPrdQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrdQtyKeyTyped(evt);
            }
        });

        txtPrdPrice.setBackground(new java.awt.Color(0, 0, 0));
        txtPrdPrice.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrdPrice.setForeground(new java.awt.Color(255, 204, 51));
        txtPrdPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPrdPrice.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPrdPrice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtPrdPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrdPriceKeyTyped(evt);
            }
        });

        txtPrdDesc.setBackground(new java.awt.Color(0, 0, 0));
        txtPrdDesc.setColumns(20);
        txtPrdDesc.setForeground(new java.awt.Color(255, 204, 51));
        txtPrdDesc.setRows(5);
        txtPrdDesc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPrdDesc.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPrdDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(txtPrdDesc);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("Products List");

        javax.swing.GroupLayout panelProductsLayout = new javax.swing.GroupLayout(panelProducts);
        panelProducts.setLayout(panelProductsLayout);
        panelProductsLayout.setHorizontalGroup(
            panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductsLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductsLayout.createSequentialGroup()
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProductsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelProductsLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(33, 33, 33))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductsLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtPrdCode, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrdName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrdPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrdQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductsLayout.createSequentialGroup()
                                .addComponent(btnAddPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelProductsLayout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(271, 271, 271))
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        panelProductsLayout.setVerticalGroup(
            panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPrdCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrdQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtPrdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddPrd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel7))
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/su.jpg")); // NOI18N

        menuPos.setBackground(new java.awt.Color(255, 153, 51));
        menuPos.setForeground(new java.awt.Color(0, 0, 0));
        menuPos.setPreferredSize(new java.awt.Dimension(200, 50));
        menuPos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPosMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/pos.jpg")); // NOI18N
        jLabel10.setText("  POS");

        javax.swing.GroupLayout menuPosLayout = new javax.swing.GroupLayout(menuPos);
        menuPos.setLayout(menuPosLayout);
        menuPosLayout.setHorizontalGroup(
            menuPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        menuPosLayout.setVerticalGroup(
            menuPosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuSellers.setBackground(new java.awt.Color(255, 153, 51));
        menuSellers.setForeground(new java.awt.Color(0, 0, 0));
        menuSellers.setPreferredSize(new java.awt.Dimension(200, 50));
        menuSellers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSellersMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/selller.png")); // NOI18N
        jLabel8.setText("  SELLERS");

        javax.swing.GroupLayout menuSellersLayout = new javax.swing.GroupLayout(menuSellers);
        menuSellers.setLayout(menuSellersLayout);
        menuSellersLayout.setHorizontalGroup(
            menuSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSellersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        menuSellersLayout.setVerticalGroup(
            menuSellersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menuLogout.setBackground(new java.awt.Color(255, 153, 51));
        menuLogout.setForeground(new java.awt.Color(0, 0, 0));
        menuLogout.setPreferredSize(new java.awt.Dimension(200, 50));
        menuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLogoutMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/logout.png")); // NOI18N
        jLabel13.setText("  LOGOUT");
        jLabel13.setPreferredSize(new java.awt.Dimension(200, 23));

        javax.swing.GroupLayout menuLogoutLayout = new javax.swing.GroupLayout(menuLogout);
        menuLogout.setLayout(menuLogoutLayout);
        menuLogoutLayout.setHorizontalGroup(
            menuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        menuLogoutLayout.setVerticalGroup(
            menuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("FAMILY");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("MARKET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuSellers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(46, 46, 46)))
                .addComponent(panelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(menuPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(menuSellers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(menuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Event executed when a record is deleted
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if(txtPrdCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Select the product in the table first");
        }
        else{
            
            String code=txtPrdCode.getText();
            String query="DELETE FROM product WHERE prdCode='"+code+"'";
            
            try {
                int reply=JOptionPane.showConfirmDialog(null, "Are you sure to delete product  "+ code, "Delete", 1);
                //executes only if user accepts
                if(reply==0){
                    dbconn db=new dbconn();
                    con=db.getConn();
                    st=con.createStatement();
                    st.executeUpdate(query);
                    st.close();
                    con.close();
                }
                    
                    selectPrd();
                    clear();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
         if(txtPrdCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Select the product in the table first");
        }
        else{
            
            String code=txtPrdCode.getText();
            String query="UPDATE product SET prdCode='"+code+"',prdName='"+txtPrdName.getText()+"',"
                    + "prdDesc='"+txtPrdDesc.getText()+"',prdStock='"+txtPrdQty.getText()+"',"
                    + "prdPrice='"+txtPrdPrice.getText()+"' WHERE prdCode='"+code+"'";
            
            
            try {
                int reply=JOptionPane.showConfirmDialog(null, "Update the product  "+ code, "Update", 1);
                //executes only if user accepts
                if(reply==0){
                    dbconn db=new dbconn();
                    con=db.getConn();       
                    st=con.createStatement();
                    st.executeUpdate(query);               
                    st.close();
                    con.close();
                }
                    
                selectPrd();
                clear();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnAddPrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPrdMouseClicked
        if(txtPrdCode.getText().equals("")  ||  txtPrdName.getText().equals("") 
            || txtPrdDesc.getText().equals("")  ||  txtPrdQty.getText().equals("") 
                ||txtPrdPrice.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }
        else{
            dbconn db=new dbconn();
            con=db.getConn();
            String code=txtPrdCode.getText();
            String query="INSERT INTO product(prdCode,prdName,prdDesc,prdStock,prdPrice) VALUES(?,?,?,?,?)";

            try {
                pst=con.prepareStatement(query);
                pst.setString(1,txtPrdCode.getText());
                pst.setString(2,txtPrdName.getText());
                pst.setString(3,txtPrdDesc.getText());
                pst.setInt(4,Integer.parseInt(txtPrdQty.getText()));
                pst.setDouble(5,Double.parseDouble(txtPrdPrice.getText()));
                pst.executeUpdate();

                pst.close();
                con.close();
                selectPrd();
                clear();
            } catch (SQLException ex) {
                    System.out.println(ex);
                }
        }
    }//GEN-LAST:event_btnAddPrdMouseClicked

    //Set the values in the table to the specific text boxes for editing purpose
    private void tblPrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrdMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPrd.getModel();
            int index = tblPrd.getSelectedRow(); 
            txtPrdCode.setText(model.getValueAt(index, 1).toString());
            txtPrdName.setText(model.getValueAt(index, 2).toString());
            txtPrdDesc.setText(model.getValueAt(index, 3).toString());
            txtPrdQty.setText(model.getValueAt(index, 4).toString());
            txtPrdPrice.setText(model.getValueAt(index, 5).toString()); 
    }//GEN-LAST:event_tblPrdMouseClicked

    //event to Clear all the textboxes to the event button
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    //navigate to the POS menu
    private void menuPosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPosMouseClicked
        Pos p=new Pos("ADMIN");
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuPosMouseClicked

    //navigate to the sellers menu
    private void menuSellersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSellersMouseClicked
        Seller s=new Seller();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSellersMouseClicked

    //Logout from the application
    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLogoutMouseClicked

    
    
    //validation for the forms
    private void txtPrdQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrdQtyKeyTyped
        char ch=evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Enter only number in the field");
        }
    }//GEN-LAST:event_txtPrdQtyKeyTyped

    private void txtPrdPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrdPriceKeyTyped
        char ch=evt.getKeyChar();
        
        if(Character.isAlphabetic(ch)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Enter only number in the field");
        }
    }//GEN-LAST:event_txtPrdPriceKeyTyped
 
   
   
   

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPrd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuLogout;
    private javax.swing.JPanel menuPos;
    private javax.swing.JPanel menuSellers;
    private javax.swing.JPanel panelProducts;
    private javax.swing.JTable tblPrd;
    private javax.swing.JTextField txtPrdCode;
    private javax.swing.JTextArea txtPrdDesc;
    private javax.swing.JTextField txtPrdName;
    private javax.swing.JTextField txtPrdPrice;
    private javax.swing.JTextField txtPrdQty;
    // End of variables declaration//GEN-END:variables
}
