/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant3;
//hitstimg1233

import java.text.DecimalFormat;

/**
 *
 * @author saxetan18
 */
public class Restaurant3 extends javax.swing.JFrame {
//tania
//cynthia
//hi
double total = 0;
double tax = 0;
int tablenum = 0;
    /**
     * Creates new form Restaurant1
     */
    public Restaurant3() {
        initComponents();
        jDialog1.setVisible(true);
        jDialog1.setAlwaysOnTop(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tableOneButton = new javax.swing.JButton();
        tableTwoButton = new javax.swing.JButton();
        tableThreeButton = new javax.swing.JButton();
        tableFourButton = new javax.swing.JButton();
        tableFiveButton = new javax.swing.JButton();
        tableSixButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        FrieswketchupCheckbox = new javax.swing.JCheckBox();
        CurlyFriesCheckbox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        DrinksLabel = new javax.swing.JLabel();
        DrinksCombobox = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        TaxCheckbox = new javax.swing.JCheckBox();
        HomeDeliveryCheckBox = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        ChickenBurgerCheckbox = new javax.swing.JCheckBox();
        ChickenBurgerMealCheckbox = new javax.swing.JCheckBox();
        CheeseCheckbox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(1000, 850));
        jDialog1.setModal(true);
        jDialog1.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Welcome to Archie's Munchies!");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Pick your table :");

        tableOneButton.setBackground(new java.awt.Color(204, 255, 204));
        tableOneButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableOneButton.setForeground(new java.awt.Color(0, 102, 102));
        tableOneButton.setText("Table 1");
        tableOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableOneButtonActionPerformed(evt);
            }
        });

        tableTwoButton.setBackground(new java.awt.Color(204, 255, 204));
        tableTwoButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableTwoButton.setForeground(new java.awt.Color(0, 102, 102));
        tableTwoButton.setText("Table 2");
        tableTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTwoButtonActionPerformed(evt);
            }
        });

        tableThreeButton.setBackground(new java.awt.Color(204, 255, 204));
        tableThreeButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableThreeButton.setForeground(new java.awt.Color(0, 102, 102));
        tableThreeButton.setText("Table 3");
        tableThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableThreeButtonActionPerformed(evt);
            }
        });

        tableFourButton.setBackground(new java.awt.Color(204, 255, 204));
        tableFourButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableFourButton.setForeground(new java.awt.Color(0, 102, 102));
        tableFourButton.setText("Table 4");
        tableFourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFourButtonActionPerformed(evt);
            }
        });

        tableFiveButton.setBackground(new java.awt.Color(204, 255, 204));
        tableFiveButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableFiveButton.setForeground(new java.awt.Color(0, 102, 102));
        tableFiveButton.setText("Table 5");
        tableFiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFiveButtonActionPerformed(evt);
            }
        });

        tableSixButton.setBackground(new java.awt.Color(204, 255, 204));
        tableSixButton.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        tableSixButton.setForeground(new java.awt.Color(0, 102, 102));
        tableSixButton.setText("Table 6");
        tableSixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableSixButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Entrance");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Exit");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(307, 307, 307))))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(451, 451, 451)
                        .addComponent(jLabel5))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tableFourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tableOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tableTwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tableFiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tableThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tableSixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tableTwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tableOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tableFiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableFourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tableSixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Fries");

        FrieswketchupCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FrieswketchupCheckbox.setText("Fries with ketchup");
        FrieswketchupCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrieswketchupCheckboxActionPerformed(evt);
            }
        });

        CurlyFriesCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CurlyFriesCheckbox.setText("Curly Fries");
        CurlyFriesCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurlyFriesCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CurlyFriesCheckbox)
                    .addComponent(FrieswketchupCheckbox)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(FrieswketchupCheckbox)
                .addGap(18, 18, 18)
                .addComponent(CurlyFriesCheckbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("             Archie's Munchies\n\t\t   ~~~\n");
        jScrollPane2.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Receipt", jScrollPane2);

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton2)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Calculator", jPanel2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        DrinksLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DrinksLabel.setText("Drinks ");

        DrinksCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DrinksCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<None>", "Coke", "Sprite", "Fanta", "Root Beer" }));
        DrinksCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinksComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(DrinksLabel)
                .addGap(64, 64, 64)
                .addComponent(DrinksCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrinksLabel)
                    .addComponent(DrinksCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        TaxCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TaxCheckbox.setText("Tax");
        TaxCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxCheckboxActionPerformed(evt);
            }
        });

        HomeDeliveryCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HomeDeliveryCheckBox.setText("Home Delivery ");
        HomeDeliveryCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeDeliveryCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HomeDeliveryCheckBox)
                    .addComponent(TaxCheckbox))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TaxCheckbox)
                .addGap(18, 18, 18)
                .addComponent(HomeDeliveryCheckBox)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        ChickenBurgerCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChickenBurgerCheckbox.setText("Chicken Burger ");
        ChickenBurgerCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenBurgerCheckboxActionPerformed(evt);
            }
        });

        ChickenBurgerMealCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ChickenBurgerMealCheckbox.setText("Chicken Burger meal ");
        ChickenBurgerMealCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenBurgerMealCheckboxActionPerformed(evt);
            }
        });

        CheeseCheckbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheeseCheckbox.setText("Cheese Burger");
        CheeseCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheeseCheckboxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Burgers");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChickenBurgerMealCheckbox)
                            .addComponent(ChickenBurgerCheckbox)
                            .addComponent(CheeseCheckbox)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(ChickenBurgerCheckbox)
                .addGap(18, 18, 18)
                .addComponent(ChickenBurgerMealCheckbox)
                .addGap(18, 18, 18)
                .addComponent(CheeseCheckbox)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Management System ");

        ExitButton.setText("exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChickenBurgerCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenBurgerCheckboxActionPerformed
        jTextArea1.append("1 Chicken Burger\t\t$2.50\n");
        total+=2.50;
    }//GEN-LAST:event_ChickenBurgerCheckboxActionPerformed

    private void ChickenBurgerMealCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenBurgerMealCheckboxActionPerformed
        jTextArea1.append("1 Chicken Burger Meal\t\t$3.50\n");
        total+=3.50;
    }//GEN-LAST:event_ChickenBurgerMealCheckboxActionPerformed

    private void CheeseCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheeseCheckboxActionPerformed
        jTextArea1.append("1 Cheese Burger\t\t\t$2.50\n");
        total+=2.50;
    }//GEN-LAST:event_CheeseCheckboxActionPerformed

    private void TaxCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxCheckboxActionPerformed
        tax = total*0.095;
        DecimalFormat df = new DecimalFormat("#.##");
        String t = df.format(tax);
        jTextArea1.append("\nTax:\t\t\t\t$" + t + "\n");
    }//GEN-LAST:event_TaxCheckboxActionPerformed

    private void DrinksComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinksComboboxActionPerformed
        if(DrinksCombobox.getSelectedIndex() == 0){
            jTextArea1.append("No Drink\t\t\t$0.00\n");
            total+=1.00;
        }else if(DrinksCombobox.getSelectedIndex() == 1){
            jTextArea1.append("1 Coke Drink\t\t\t$1.00\n");
            total+=1.00;
        }else if(DrinksCombobox.getSelectedIndex() == 2){
            jTextArea1.append("1 Sprite Drink\t\t\t$1.00\n");
            total+=1.00;
        }else if(DrinksCombobox.getSelectedIndex() == 3){
            jTextArea1.append("1 Fanta Drink\t\t\t$1.00\n");
            total+=1.00;
        }else if(DrinksCombobox.getSelectedIndex() == 4){
            jTextArea1.append("1 Root Beer Drink\t\t$1.00\n");
            total+=1.00;
        }
    }//GEN-LAST:event_DrinksComboboxActionPerformed

    private void HomeDeliveryCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeDeliveryCheckBoxActionPerformed
        jTextArea1.append("Delivery Fee\t\t\t$3.00\n");
        total += 3.00;
    }//GEN-LAST:event_HomeDeliveryCheckBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double taxtotal = tax + total;
        DecimalFormat df = new DecimalFormat("#.##");
        String t = df.format(taxtotal);
        jTextArea1.append("Total\t\t\t\t$" + t + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableOneButtonActionPerformed
        tablenum = 1;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableOneButtonActionPerformed

    private void tableTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTwoButtonActionPerformed
        tablenum = 2;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableTwoButtonActionPerformed

    private void tableThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableThreeButtonActionPerformed
        tablenum = 3;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableThreeButtonActionPerformed

    private void tableFourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFourButtonActionPerformed
        tablenum = 4;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableFourButtonActionPerformed

    private void tableFiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFiveButtonActionPerformed
        tablenum = 5;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableFiveButtonActionPerformed

    private void tableSixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableSixButtonActionPerformed
        tablenum = 6;
        jDialog1.setVisible(false);
        jTextArea1.append("\t\t Table " + tablenum + "\n");
    }//GEN-LAST:event_tableSixButtonActionPerformed

    private void FrieswketchupCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrieswketchupCheckboxActionPerformed
        jTextArea1.append("1 Fries with Ketchup \t\t$1.00\n");
        total+=1.00;
    }//GEN-LAST:event_FrieswketchupCheckboxActionPerformed

    private void CurlyFriesCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurlyFriesCheckboxActionPerformed
        jTextArea1.append("1 Curly Fries \t\t\t$3.00\n");
        total+=3.00;
    }//GEN-LAST:event_CurlyFriesCheckboxActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Restaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant3().setVisible(true);
                new Tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheeseCheckbox;
    private javax.swing.JCheckBox ChickenBurgerCheckbox;
    private javax.swing.JCheckBox ChickenBurgerMealCheckbox;
    private javax.swing.JCheckBox CurlyFriesCheckbox;
    private javax.swing.JComboBox DrinksCombobox;
    private javax.swing.JLabel DrinksLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JCheckBox FrieswketchupCheckbox;
    private javax.swing.JCheckBox HomeDeliveryCheckBox;
    private javax.swing.JCheckBox TaxCheckbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton tableFiveButton;
    private javax.swing.JButton tableFourButton;
    private javax.swing.JButton tableOneButton;
    private javax.swing.JButton tableSixButton;
    private javax.swing.JButton tableThreeButton;
    private javax.swing.JButton tableTwoButton;
    // End of variables declaration//GEN-END:variables
}
