
package supermarket;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Seller extends javax.swing.JFrame {
    
    Connection con=null;
    Statement st=null;
    PreparedStatement pst=null;
    ResultSet rs= null;
    String gender;
    
    
    public Seller() {
        initComponents();
        selectSeller();//method called to pass data from db of the table
    }

    // *************************************Define some new methods***********************************************************
    
    //To select all products from the database
    public void selectSeller(){
        dbconn db=new dbconn();
        con = db.getConn();
        String query = "SELECT * FROM seller";
        
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
        txtUsername.setText("");
        txtName.setText("");
        btnGender.clearSelection();
        txtPassword.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrd = new javax.swing.JTable();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        menuPos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        menuProducts = new javax.swing.JPanel();
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
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Name");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("Gender");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setText("Password");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("Manage Sellers");

        btnAddPrd.setBackground(new java.awt.Color(0, 0, 0));
        btnAddPrd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddPrd.setForeground(new java.awt.Color(255, 204, 51));
        btnAddPrd.setText("Add seller");
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
        btnUpdate.setText("Update seller");
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
        btnDelete.setText("Delete seller");
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

        tblPrd.setBackground(new java.awt.Color(0, 0, 0));
        tblPrd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblPrd.setForeground(new java.awt.Color(255, 204, 51));
        tblPrd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Gender", "Password"
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

        txtUsername.setBackground(new java.awt.Color(0, 0, 0));
        txtUsername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 204, 51));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtUsername.setCaretColor(new java.awt.Color(255, 204, 51));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 204, 51));
        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtName.setCaretColor(new java.awt.Color(255, 204, 51));
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 204, 51));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 51), 1, true));
        txtPassword.setCaretColor(new java.awt.Color(255, 204, 51));
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel12.setBackground(new java.awt.Color(153, 153, 153));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("Sellers List");

        rbMale.setBackground(new java.awt.Color(0, 0, 0));
        btnGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbMale.setForeground(new java.awt.Color(255, 204, 51));
        rbMale.setText("Male");

        rbFemale.setBackground(new java.awt.Color(0, 0, 0));
        btnGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(255, 204, 51));
        rbFemale.setText("Female");

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
                                .addComponent(jLabel2)
                                .addGap(57, 57, 57)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductsLayout.createSequentialGroup()
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductsLayout.createSequentialGroup()
                                        .addComponent(rbMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(txtPassword))))
                        .addGap(53, 53, 53)
                        .addComponent(btnAddPrd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddPrd, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        menuProducts.setBackground(new java.awt.Color(255, 153, 51));
        menuProducts.setForeground(new java.awt.Color(0, 0, 0));
        menuProducts.setPreferredSize(new java.awt.Dimension(200, 50));
        menuProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductsMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("/home/mush/NetBeansProjects/supermarket/img/product.jpg")); // NOI18N
        jLabel8.setText("PRODUCTS");

        javax.swing.GroupLayout menuProductsLayout = new javax.swing.GroupLayout(menuProducts);
        menuProducts.setLayout(menuProductsLayout);
        menuProductsLayout.setHorizontalGroup(
            menuProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        menuProductsLayout.setVerticalGroup(
            menuProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(menuProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(61, 61, 61)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(menuPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(menuProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(menuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if(txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Select the seller in the table first");
        }
        else{   
            String username=txtUsername.getText();
            String query="DELETE FROM seller WHERE username='"+username+"'";
            
            try { 
                int reply=JOptionPane.showConfirmDialog(null, "Are you sure to delete product  "+ username, "Delete", 1);
                //Only executes if user click yes
                if(reply==0){
                    dbconn db=new dbconn();
                    con=db.getConn();
                    st=con.createStatement();
                    st.executeUpdate(query);

                    st.close();
                    con.close();
                }
                    
                        
                selectSeller();
                clear();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    //to update any information
    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
         if(txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Select the product in the table first");
        }
        else{
            dbconn db=new dbconn();
            
            String username=txtUsername.getText();
            String name=txtName.getText();
            if(rbMale.isSelected()){
                this.gender="Male";
            }
            else{
                this.gender="Female";
            }
            String password=txtPassword.getText();
            String query="UPDATE seller SET username='"+username+"',name='"+name+"', gender='"+this.gender+"',password='"+password+"' WHERE username='"+username+"'" ;
                   
            try {
                int reply=JOptionPane.showConfirmDialog(null, "Update the seller  "+ username, "Update", 1);
                //Only executes if user click yes
                if(reply==0){
                    con=db.getConn();
                    st=con.createStatement();
                    st.executeUpdate(query);             
                    st.close();
                    con.close();
                }
                selectSeller();
                clear();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    //Set the values in the table to the specific text boxes for editing purpose
    private void tblPrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrdMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPrd.getModel();
            int index = tblPrd.getSelectedRow(); 
            txtUsername.setText(model.getValueAt(index, 0).toString());
            txtName.setText(model.getValueAt(index, 1).toString());
            this.gender=(model.getValueAt(index, 2).toString());
   
            if(this.gender.equals("Male")){
                rbMale.setSelected(true);
            }
            else if(this.gender.equals("Female")){
                rbFemale.setSelected(true);
            }
            txtPassword.setText(model.getValueAt(index,3).toString());
    }//GEN-LAST:event_tblPrdMouseClicked

    //navigate to the POS menu
    private void menuPosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPosMouseClicked
        Pos p=new Pos("ADMIN");
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuPosMouseClicked

    //navigate to the Products menu
    private void menuProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductsMouseClicked
        Product p=new Product();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProductsMouseClicked

    //Logout from the application
    private void menuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLogoutMouseClicked
        Login l=new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuLogoutMouseClicked

    //event to Clear all the textboxes to the event button
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    //Add new sellers to the system
    private void btnAddPrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddPrdMouseClicked
        if(txtUsername.getText().equals("")  ||  txtName.getText().equals("")
            || (rbMale.isSelected()==false && rbFemale.isSelected()==false)
            ||txtPassword.getText().equals("") || btnGender.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Fill all the fields");
        }
        else{
            dbconn db=new dbconn();
            con=db.getConn();
            
            if(rbMale.isSelected()){
                this.gender="Male";
            }
            else{
                this.gender="Female";
            }
            String query="INSERT INTO seller(username,name,gender,password) VALUES(?,?,?,?)";

            try {
                pst=con.prepareStatement(query);
                pst.setString(1,txtUsername.getText());
                pst.setString(2,txtName.getText());
                pst.setString(3,gender);
                pst.setString(4,(txtPassword.getText()));
                pst.executeUpdate();

                pst.close();
                con.close();
                selectSeller();
                clear();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnAddPrdMouseClicked

    
     
   
   
   

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPrd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGender;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menuLogout;
    private javax.swing.JPanel menuPos;
    private javax.swing.JPanel menuProducts;
    private javax.swing.JPanel panelProducts;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable tblPrd;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
