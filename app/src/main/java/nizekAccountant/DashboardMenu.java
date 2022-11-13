package nizekAccountant;

//import testProject.ButtonRounder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DashboardMenu extends javax.swing.JFrame {

    Dimension dimension = new Dimension(72, 26);
    private LoginLogic loginLogic;
    private AddCheckLogic addCheckLogic;
    private AddDocLogic addDocLogic;
    private AddUserLogic addUserLogic;
    private ShowCheckLogic showCheckLogic;
    private ChangeStateCheckLogic changeStateCheckLogic;
    private ShowDocLogic showDocLogic;
    private GraphicsManager btnmanager;
    //  private ButtonRounder btnRounder;

    /**
     * Creates new form DashboardMenu
     */
    public DashboardMenu() {
        initComponents();
//        jMenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        btnmanager = new GraphicsManager(102, 102, 255, dimension);
     //   setVisible(true);
      //  peopleDocList.addItem("Baran");
      //  peopleDocList.addItem("Sharifi");
      //  System.out.println("FFF: " + (String)peopleDocList.getSelectedItem());


    Landpage(LoginPanel);
        //  Landpage(LoginError);
//        LoginError.setVisible(false);
//        //   jMenuBar1.getContentPane().setBackground( Color.YELLOW ); 
       
        addCheckLogic = new AddCheckLogic();
        addDocLogic = new AddDocLogic();
        addUserLogic = new AddUserLogic();
        showCheckLogic = new ShowCheckLogic();
        changeStateCheckLogic = new ChangeStateCheckLogic();
        showDocLogic = new ShowDocLogic();

        //   ButtonRounder btnRounder =new ButtonRounder(10);
        //===========changing button colors====================
        btnmanager.btnChangeColor(addPeopleback);
        btnmanager.btnChangeColor(passWordRecovery);
        btnmanager.btnChangeColor(enterBtn);
        btnmanager.btnChangeColor(signInbtn);
        btnmanager.btnChangeColor(registerCheck);
        btnmanager.btnChangeColor(addCheckBack);
        btnmanager.btnChangeColor(registerChangeCheck);
        btnmanager.toggleChangeColor(isCreditorToggle);
        btnmanager.btnChangeColor(backCheckState);
        btnmanager.btnChangeColor(submitDoc);
        btnmanager.btnChangeColor(addDocback);
        btnmanager.btnChangeColor(btnconfirm);
        btnmanager.btnChangeColor(addcategory);
        btnmanager.btnChangeColor(tableback);
        btnmanager.btnChangeColor(addback);
        btnmanager.btnChangeColor(confirmCategory);
        btnmanager.btnChangeColor(dashboardBtnshowCheck);
        btnmanager.btnChangeColor(addUserBtn);
        btnmanager.btnChangeColor(dashboardBtnshowDoc);
        btnmanager.btnChangeColor(dashboardBtnadd);
        btnmanager.btnChangeColor(dashboardBtnaddDoc);
        btnmanager.btnChangeColor(backshowDoc1);
        btnmanager.btnChangeColor(backshowDoc);
        btnmanager.btnChangeColor(ShowDocsbtn);        
        btnmanager.btnChangeColor(backshowCheck1);
        btnmanager.btnChangeColor(backshowCheck);
                
                
//=============changing lables===========================

        //============changing size  the registered buttons ============================
        btnmanager.btnSize(submitDoc);
        btnmanager.btnSize(registerChangeCheck);
        btnmanager.btnSize(btnconfirm);
        btnmanager.btnSize(registerCheck);
        btnmanager.btnSize(confirmCategory);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timeFilter = new javax.swing.ButtonGroup();
        LoginPanel = new javax.swing.JPanel();
        emailfieldLogin = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        passWordRecovery = new javax.swing.JButton();
        enterBtn = new javax.swing.JButton();
        signInbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        LoginError = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        addcheckPanel = new javax.swing.JPanel();
        registerCheck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        discriptionText = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        payee2Cost = new javax.swing.JTextField();
        payee2 = new javax.swing.JTextField();
        addCheckBack = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        stateChangePanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        payee3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        payee3Cost = new javax.swing.JTextField();
        registerChangeCheck = new javax.swing.JButton();
        isCreditorToggle = new javax.swing.JToggleButton();
        backCheckState = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        showDocPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        ShowDocsbtn = new javax.swing.JButton();
        backshowDoc = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        dailyِDoc = new javax.swing.JRadioButton();
        weeklyDoc = new javax.swing.JRadioButton();
        MonthlyDoc = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        payee5 = new javax.swing.JTextField();
        Monthscheck = new javax.swing.JComboBox<>();
        peopleDocList = new javax.swing.JComboBox<>();
        addDocPanel = new javax.swing.JPanel();
        payee = new javax.swing.JTextField();
        submitDoc = new javax.swing.JButton();
        cost = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        creditorBtn = new javax.swing.JRadioButton();
        debtorBtn = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        discription = new javax.swing.JTextField();
        addDocback = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        addPeoplePanel = new javax.swing.JPanel();
        addName = new javax.swing.JTextField();
        addId = new javax.swing.JTextField();
        AddressField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        employeeBtn = new javax.swing.JRadioButton();
        clientBtn = new javax.swing.JRadioButton();
        partnerBtn = new javax.swing.JRadioButton();
        btnconfirm = new javax.swing.JButton();
        addcategory = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addPeopleback = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tableback = new javax.swing.JButton();
        addCategoryPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        categoryField = new javax.swing.JTextField();
        confirmCategory = new javax.swing.JButton();
        addback = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        categoryFieldName = new javax.swing.JTextField();
        categoryFieldEmail = new javax.swing.JTextField();
        categoryFieldId = new javax.swing.JTextField();
        categoryFieldPhone = new javax.swing.JTextField();
        categoryFieldَAddress = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        dashboardBtnshowCheck = new javax.swing.JButton();
        addUserBtn = new javax.swing.JButton();
        dashboardBtnshowDoc = new javax.swing.JButton();
        dashboardBtnadd = new javax.swing.JButton();
        dashboardBtnaddDoc = new javax.swing.JButton();
        dashboardlabel = new javax.swing.JLabel();
        showCheckpanel = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        payee4 = new javax.swing.JTextField();
        ShowCheckDocs2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        backshowDoc1 = new javax.swing.JButton();
        dailyCheck = new javax.swing.JRadioButton();
        weeklyCheck = new javax.swing.JRadioButton();
        monthlyCheck = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        checkDayField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkMonthField = new javax.swing.JTextField();
        checkYearField = new javax.swing.JTextField();
        Monthscheckshow = new javax.swing.JComboBox<>();
        checksReport = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        checksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backshowCheck = new javax.swing.JButton();
        docsReport = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        docsTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        backshowCheck1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jFrame1.setTitle("checkFrame");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        emailfieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldLoginActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel20.setText("نام کاربری و رمز عبور را وارد کنید");

        passWordRecovery.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        passWordRecovery.setText("رمز عبور را فراموش کردید؟ ");

        enterBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        enterBtn.setText("ورود");
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        signInbtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        signInbtn.setText("ثبت نام");

        jLabel3.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel3.setText("ایمیل");

        jLabel21.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel21.setText("رمز عبور");

        javax.swing.GroupLayout LoginErrorLayout = new javax.swing.GroupLayout(LoginError);
        LoginError.setLayout(LoginErrorLayout);
        LoginErrorLayout.setHorizontalGroup(
            LoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );
        LoginErrorLayout.setVerticalGroup(
            LoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        jLabel22.setBackground(new java.awt.Color(102, 102, 255));
        jLabel22.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("پنل ورود ");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LoginError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addComponent(emailfieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addComponent(enterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(LoginPanelLayout.createSequentialGroup()
                                        .addComponent(passwordField)
                                        .addGap(12, 12, 12)))
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel20)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(passWordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signInbtn)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addContainerGap())))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addComponent(LoginError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailfieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(enterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInbtn)
                    .addComponent(passWordRecovery))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        registerCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        registerCheck.setText("ثبت");
        registerCheck.setPreferredSize(dimension);
        registerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCheckActionPerformed(evt);
            }
        });

        discriptionText.setColumns(20);
        discriptionText.setRows(5);
        jScrollPane1.setViewportView(discriptionText);

        jLabel17.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel17.setText("طرف حساب");

        jLabel18.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel18.setText("مبلغ");

        jLabel19.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel19.setText("توضیحات");

        payee2Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee2CostActionPerformed(evt);
            }
        });

        payee2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee2ActionPerformed(evt);
            }
        });

        addCheckBack.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addCheckBack.setText("بازگشت به داشبورد اصلی");
        addCheckBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCheckBackActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(102, 102, 255));
        jLabel29.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("افزودن چک");

        javax.swing.GroupLayout addcheckPanelLayout = new javax.swing.GroupLayout(addcheckPanel);
        addcheckPanel.setLayout(addcheckPanelLayout);
        addcheckPanelLayout.setHorizontalGroup(
            addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcheckPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcheckPanelLayout.createSequentialGroup()
                        .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addcheckPanelLayout.createSequentialGroup()
                                .addComponent(payee2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(addcheckPanelLayout.createSequentialGroup()
                                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(payee2Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addcheckPanelLayout.createSequentialGroup()
                                        .addComponent(addCheckBack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(registerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcheckPanelLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addContainerGap())))
        );
        addcheckPanelLayout.setVerticalGroup(
            addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcheckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addGap(44, 44, 44)
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payee2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(payee2Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addcheckPanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel19))
                    .addGroup(addcheckPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCheckBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel25.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel25.setText("طرف حساب");

        payee3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee3ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel26.setText("مبلغ");

        payee3Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee3CostActionPerformed(evt);
            }
        });

        registerChangeCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        registerChangeCheck.setText("ثبت");
        registerChangeCheck.setPreferredSize(dimension);
        registerChangeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerChangeCheckActionPerformed(evt);
            }
        });

        isCreditorToggle.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        isCreditorToggle.setText("وصول شده است");

        backCheckState.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backCheckState.setText("بازگشت به داشبورد اصلی");
        backCheckState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCheckStateActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(102, 102, 255));
        jLabel30.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("تغییر وضعیت چک");

        javax.swing.GroupLayout stateChangePanelLayout = new javax.swing.GroupLayout(stateChangePanel);
        stateChangePanel.setLayout(stateChangePanelLayout);
        stateChangePanelLayout.setHorizontalGroup(
            stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stateChangePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backCheckState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerChangeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stateChangePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stateChangePanelLayout.createSequentialGroup()
                .addComponent(isCreditorToggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payee3Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payee3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stateChangePanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stateChangePanelLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(74, 74, 74))))
        );
        stateChangePanelLayout.setVerticalGroup(
            stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stateChangePanelLayout.createSequentialGroup()
                .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stateChangePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30)
                        .addGap(58, 58, 58)
                        .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(payee3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(payee3Cost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(stateChangePanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(isCreditorToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(stateChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerChangeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backCheckState, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel23.setText("طرف حساب");

        ShowDocsbtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        ShowDocsbtn.setText("نمایش سندها");
        ShowDocsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDocsbtnActionPerformed(evt);
            }
        });

        backshowDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backshowDoc.setText("بازگشت به داشبورد اصلی");
        backshowDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backshowDocActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(102, 102, 255));
        jLabel31.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("نمایش سند");

        timeFilter.add(dailyِDoc);
        dailyِDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        dailyِDoc.setForeground(new java.awt.Color(255, 255, 255));
        dailyِDoc.setText("روزانه");
        dailyِDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyِDocActionPerformed(evt);
            }
        });

        timeFilter.add(weeklyDoc);
        weeklyDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        weeklyDoc.setForeground(new java.awt.Color(255, 255, 255));
        weeklyDoc.setText("هفتگی");

        timeFilter.add(MonthlyDoc);
        MonthlyDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        MonthlyDoc.setForeground(new java.awt.Color(255, 255, 255));
        MonthlyDoc.setText("ماهانه");
        MonthlyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyDocActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("فیلتر زمان");

        payee5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee5ActionPerformed(evt);
            }
        });

        Monthscheck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد ", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن ", "اسفند" }));
        Monthscheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthscheckActionPerformed(evt);
            }
        });

        peopleDocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleDocListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showDocPanelLayout = new javax.swing.GroupLayout(showDocPanel);
        showDocPanel.setLayout(showDocPanelLayout);
        showDocPanelLayout.setHorizontalGroup(
            showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showDocPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31))
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(backshowDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShowDocsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dailyِDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weeklyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MonthlyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(Monthscheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(payee5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)))
                        .addGap(21, 74, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showDocPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(peopleDocList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        showDocPanelLayout.setVerticalGroup(
            showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDocPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dailyِDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weeklyDoc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MonthlyDoc)
                .addGap(24, 24, 24)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Monthscheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payee5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(36, 36, 36)
                .addComponent(peopleDocList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowDocsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backshowDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186))
        );

        payee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeActionPerformed(evt);
            }
        });

        submitDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        submitDoc.setText("ثبت");
        submitDoc.setPreferredSize(dimension);
        submitDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDocActionPerformed(evt);
            }
        });

        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel13.setText("مشخصات سند");

        buttonGroup2.add(creditorBtn);
        creditorBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        creditorBtn.setText("بستانکار");

        buttonGroup2.add(debtorBtn);
        debtorBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        debtorBtn.setText("بدهکار");

        jLabel14.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel14.setText("طرف حساب");

        jLabel15.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel15.setText("مبلغ");

        jLabel16.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel16.setText("توضیحات");

        addDocback.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addDocback.setText("بازگشت به داشبورد اصلی");
        addDocback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocbackActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(102, 102, 255));
        jLabel32.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("افزودن سند");

        javax.swing.GroupLayout addDocPanelLayout = new javax.swing.GroupLayout(addDocPanel);
        addDocPanel.setLayout(addDocPanelLayout);
        addDocPanelLayout.setHorizontalGroup(
            addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDocPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDocPanelLayout.createSequentialGroup()
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addDocPanelLayout.createSequentialGroup()
                                .addComponent(debtorBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(payee, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(addDocPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(discription, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(38, 38, 38))
                    .addGroup(addDocPanelLayout.createSequentialGroup()
                        .addComponent(creditorBtn)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDocPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addDocback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDocPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addContainerGap())
        );
        addDocPanelLayout.setVerticalGroup(
            addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDocPanelLayout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addDocback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addDocPanelLayout.createSequentialGroup()
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(creditorBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(payee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addComponent(debtorBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(discription, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(submitDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        addPeoplePanel.setBackground(new java.awt.Color(204, 204, 204));

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        buttonGroup1.add(employeeBtn);
        employeeBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        employeeBtn.setText("کارمند");

        buttonGroup1.add(clientBtn);
        clientBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        clientBtn.setText("مشتری");

        buttonGroup1.add(partnerBtn);
        partnerBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        partnerBtn.setText("شریک تجاری");

        btnconfirm.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        btnconfirm.setText("ثبت");
        btnconfirm.setPreferredSize(dimension);
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        addcategory.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        addcategory.setText("افزودن دسته بندی جدید");
        addcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcategoryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel7.setText("نام ");

        jLabel9.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel9.setText("کد ملی");

        jLabel10.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel10.setText("شماره تلفن");

        jLabel11.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel11.setText("ایمیل");

        jLabel12.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel12.setText("آدرس");

        addPeopleback.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addPeopleback.setText("بازگشت به داشبورد اصلی");
        addPeopleback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPeoplebackActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(102, 102, 255));
        jLabel33.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("افزودن شخص جدید");

        javax.swing.GroupLayout addPeoplePanelLayout = new javax.swing.GroupLayout(addPeoplePanel);
        addPeoplePanel.setLayout(addPeoplePanelLayout);
        addPeoplePanelLayout.setHorizontalGroup(
            addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPeoplePanelLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPeoplePanelLayout.createSequentialGroup()
                        .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPeoplePanelLayout.createSequentialGroup()
                        .addComponent(addPeopleback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPeoplePanelLayout.createSequentialGroup()
                        .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(addPeoplePanelLayout.createSequentialGroup()
                                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                        .addComponent(AddressField)
                                        .addComponent(phoneField))
                                    .addGroup(addPeoplePanelLayout.createSequentialGroup()
                                        .addComponent(partnerBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(clientBtn)
                                        .addGap(27, 27, 27)
                                        .addComponent(employeeBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(addPeoplePanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel12))))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPeoplePanelLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addContainerGap())))
        );
        addPeoplePanelLayout.setVerticalGroup(
            addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPeoplePanelLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partnerBtn)
                    .addComponent(clientBtn)
                    .addComponent(employeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(addPeoplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPeopleback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "نام", "کد ملی", "شماره تلفن", "ایمیل", "دسته بندی", "آدرس"
            }
        ));
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jTable1);

        tableback.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        tableback.setText("بازگشت به داشبورد اصلی");
        tableback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablebackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(tableback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tableback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jLabel6.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel6.setText("عنوان دسته بندی را وارد کنید");

        confirmCategory.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        confirmCategory.setText("ثبت");
        confirmCategory.setPreferredSize(dimension);
        confirmCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmCategoryActionPerformed(evt);
            }
        });

        addback.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addback.setText("بازگشت به داشبورد اصلی");
        addback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbackActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel40.setText("تلفن");

        jLabel41.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel41.setText("نام");

        jLabel42.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel42.setText("ایمیل");

        jLabel43.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel43.setText("آدرس");

        jLabel44.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel44.setText("کد ملی");

        jLabel34.setBackground(new java.awt.Color(102, 102, 255));
        jLabel34.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("افزودن دسته بنی جدید");

        javax.swing.GroupLayout addCategoryPanelLayout = new javax.swing.GroupLayout(addCategoryPanel);
        addCategoryPanel.setLayout(addCategoryPanelLayout);
        addCategoryPanelLayout.setHorizontalGroup(
            addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCategoryPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(addback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCategoryPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCategoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryFieldَAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCategoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCategoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCategoryPanelLayout.createSequentialGroup()
                        .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addCategoryPanelLayout.createSequentialGroup()
                                .addComponent(categoryFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addCategoryPanelLayout.createSequentialGroup()
                                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(categoryFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(categoryFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        addCategoryPanelLayout.setVerticalGroup(
            addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCategoryPanelLayout.createSequentialGroup()
                .addComponent(jLabel34)
                .addGap(28, 28, 28)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCategoryPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCategoryPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(categoryFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoryFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryFieldَAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        dashboardBtnshowCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnshowCheck.setText("نمایش چک");
        dashboardBtnshowCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnshowCheckActionPerformed(evt);
            }
        });

        addUserBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addUserBtn.setText("افزودن کاربر");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        dashboardBtnshowDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnshowDoc.setText("نمایش سند");
        dashboardBtnshowDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnshowDocActionPerformed(evt);
            }
        });

        dashboardBtnadd.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnadd.setText("افزودن چک");
        dashboardBtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnaddActionPerformed(evt);
            }
        });

        dashboardBtnaddDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnaddDoc.setText("افزودن سند");
        dashboardBtnaddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnaddDocActionPerformed(evt);
            }
        });

        dashboardlabel.setBackground(new java.awt.Color(102, 102, 255));
        dashboardlabel.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardlabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardlabel.setText("داشبورد");

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(dashboardBtnshowDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashboardBtnshowCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardBtnaddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardBtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboardlabel)
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardlabel)
                .addGap(35, 35, 35)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboardBtnshowCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardBtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dashboardBtnshowDoc, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(dashboardBtnaddDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel27.setText("نام طرف حساب");

        payee4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payee4ActionPerformed(evt);
            }
        });

        ShowCheckDocs2.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        ShowCheckDocs2.setText("نمایش چک ها");
        ShowCheckDocs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCheckDocs2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("نمایش چک");

        backshowDoc1.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backshowDoc1.setText("بازگشت به داشبورد اصلی");
        backshowDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backshowDoc1ActionPerformed(evt);
            }
        });

        timeFilter.add(dailyCheck);
        dailyCheck.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        dailyCheck.setForeground(new java.awt.Color(255, 255, 255));
        dailyCheck.setText("روزانه");

        timeFilter.add(weeklyCheck);
        weeklyCheck.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        weeklyCheck.setForeground(new java.awt.Color(255, 255, 255));
        weeklyCheck.setText("هفتگی");

        timeFilter.add(monthlyCheck);
        monthlyCheck.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        monthlyCheck.setForeground(new java.awt.Color(255, 255, 255));
        monthlyCheck.setText("ماهانه");

        jLabel5.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("فیلتر زمان");

        jLabel8.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel8.setText("تاریخ چک");

        Monthscheckshow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد ", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن ", "اسفند" }));
        Monthscheckshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthscheckshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout showCheckpanelLayout = new javax.swing.GroupLayout(showCheckpanel);
        showCheckpanel.setLayout(showCheckpanelLayout);
        showCheckpanelLayout.setHorizontalGroup(
            showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(backshowDoc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowCheckDocs2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(checkYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addComponent(Monthscheckshow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(payee4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dailyCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weeklyCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthlyCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        showCheckpanelLayout.setVerticalGroup(
            showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel28))
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dailyCheck)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weeklyCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyCheck)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(payee4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Monthscheckshow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkDayField)
                            .addComponent(checkYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkMonthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowCheckDocs2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backshowDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );

        checksReport.setFont(new java.awt.Font("B Roya", 0, 14)); // NOI18N
        checksReport.setPreferredSize(new java.awt.Dimension(455, 444));

        checksTable.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        checksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "طرف حساب", "بدهکار", "بستانکار", "تاریخ"
            }
        ));
        jScrollPane3.setViewportView(checksTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("نمایش چک ها");

        backshowCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backshowCheck.setText("بازگشت به داشبورد ");
        backshowCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backshowCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checksReportLayout = new javax.swing.GroupLayout(checksReport);
        checksReport.setLayout(checksReportLayout);
        checksReportLayout.setHorizontalGroup(
            checksReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checksReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(checksReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(checksReportLayout.createSequentialGroup()
                        .addGap(0, 360, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(checksReportLayout.createSequentialGroup()
                .addComponent(backshowCheck)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        checksReportLayout.setVerticalGroup(
            checksReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checksReportLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(backshowCheck)
                .addContainerGap())
        );

        docsReport.setPreferredSize(new java.awt.Dimension(455, 444));

        docsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "طرف حساب", "بستانکار", "بدهکار", "تاریخ"
            }
        ));
        jScrollPane4.setViewportView(docsTable);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("نمایش سند ها");

        backshowCheck1.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backshowCheck1.setText("بازگشت به داشبورد ");
        backshowCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backshowCheck1ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout docsReportLayout = new javax.swing.GroupLayout(docsReport);
        docsReport.setLayout(docsReportLayout);
        docsReportLayout.setHorizontalGroup(
            docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docsReportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(docsReportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(docsReportLayout.createSequentialGroup()
                        .addComponent(backshowCheck1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(docsReportLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        docsReportLayout.setVerticalGroup(
            docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docsReportLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(backshowCheck1))
            .addGroup(docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(docsReportLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addcheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(stateChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(showDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addPeoplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addCategoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(showCheckpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(checksReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(docsReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addcheckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(stateChangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(showDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addPeoplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addCategoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(showCheckpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(checksReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(docsReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleName("frameCheck");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void addcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcategoryActionPerformed

        Landpage(addCategoryPanel);

    }//GEN-LAST:event_addcategoryActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void payeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payeeActionPerformed

    private void payee3CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee3CostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee3CostActionPerformed

    private void payee3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee3ActionPerformed

    private void payee2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee2ActionPerformed

    private void payee2CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee2CostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee2CostActionPerformed

    private void emailfieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldLoginActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed

   System.out.println(emailfieldLogin.getText());
loginLogic = new LoginLogic();       
        if(loginLogic.canEnter(emailfieldLogin.getText(),passwordField.getText())){
             Landpage(dashboard);
        }
       

        //  enterBtn.setBackground(Color.red);
        //}
    }//GEN-LAST:event_enterBtnActionPerformed

    private void dashboardBtnshowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnshowCheckActionPerformed
        Landpage(showCheckpanel);
    }//GEN-LAST:event_dashboardBtnshowCheckActionPerformed

    private void dashboardBtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnaddActionPerformed
        Landpage(addcheckPanel);
 
    }//GEN-LAST:event_dashboardBtnaddActionPerformed

    private void dashboardBtnshowDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnshowDocActionPerformed
        Landpage(showDocPanel);

//showDOcPanel.setVisible(true);
        //dashboard.setVisible(false);
    }//GEN-LAST:event_dashboardBtnshowDocActionPerformed

    private void dashboardBtnaddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnaddDocActionPerformed
        Landpage(addDocPanel);
//        addDocPanel.setVisible(true);
        //      dashboard.setVisible(false);
    }//GEN-LAST:event_dashboardBtnaddDocActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        Landpage(addPeoplePanel);
//        addPeoplePanel.setVisible(true);
//        dashboard.setVisible(false);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void backCheckStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCheckStateActionPerformed
        Landpage(dashboard);
    }//GEN-LAST:event_backCheckStateActionPerformed

    private void addDocbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocbackActionPerformed
        Landpage(dashboard);
//        addDocPanel.setVisible(false);
        //       dashboard.setVisible(true);
    }//GEN-LAST:event_addDocbackActionPerformed

    private void addPeoplebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPeoplebackActionPerformed
        Landpage(dashboard);
        //    addPeoplePanel.setVisible(false);
        //   dashboard.setVisible(true);
    }//GEN-LAST:event_addPeoplebackActionPerformed

    private void tablebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablebackActionPerformed
        Landpage(dashboard);
        //    tablePanel.setVisible(false);
        //    dashboard.setVisible(true);
    }//GEN-LAST:event_tablebackActionPerformed

    private void addCheckBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckBackActionPerformed
        //   addcheckPanel.setVisible(false);
        //   dashboard.setVisible(true);
        Landpage(dashboard);
    }//GEN-LAST:event_addCheckBackActionPerformed

    private void payee4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee4ActionPerformed

    private void ShowCheckDocs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCheckDocs2ActionPerformed
        Landpage(checksReport);
    }//GEN-LAST:event_ShowCheckDocs2ActionPerformed

    private void backshowDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowDoc1ActionPerformed
        Landpage(dashboard);
    }//GEN-LAST:event_backshowDoc1ActionPerformed

    private void registerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCheckActionPerformed
      AddCheckLogic addCheck= new AddCheckLogic();
        String payeeDoc=payee2.getText();
        String discriptionDoc=discriptionText.getText();
        String costDoc =payee2Cost.getText();
        addCheck.passCheckToDatabase(payeeDoc,discriptionDoc, costDoc);
    }//GEN-LAST:event_registerCheckActionPerformed

    private void registerChangeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerChangeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerChangeCheckActionPerformed

    private void payee5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee5ActionPerformed

    private void backshowDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowDocActionPerformed

        Landpage(dashboard);
        //  showDOcPanel.setVisible(false);
    }//GEN-LAST:event_backshowDocActionPerformed

    private void ShowDocsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDocsbtnActionPerformed
        Landpage(docsReport);
    }//GEN-LAST:event_ShowDocsbtnActionPerformed

    private void backshowCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowCheck1ActionPerformed
     Landpage(dashboard);
    }//GEN-LAST:event_backshowCheck1ActionPerformed

    private void backshowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowCheckActionPerformed
       Landpage(dashboard);
    }//GEN-LAST:event_backshowCheckActionPerformed

    private void submitDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDocActionPerformed
      AddDocLogic addDoc= new AddDocLogic();
        String payeeDoc=payee.getText();
        String discriptionDoc=discription.getText();
        String costDoc =cost.getText();
        addDoc.passDocToDatabase(payeeDoc,discriptionDoc, costDoc);
    
       
    }//GEN-LAST:event_submitDocActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
      AddUserLogic addUser= new AddUserLogic();
        String emailfieldUser=emailField.getText();
        String AddressfieldUser=AddressField.getText();
        String UserName=addName.getText();
        String UserId=addId.getText();
        String phone=phoneField.getText();
        
         addUser.passUserTodataBase(emailfieldUser,AddressfieldUser,UserName,UserId,phone);
      //   peopleDocList.addItem(UserName);
        
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void dailyِDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyِDocActionPerformed
      
    }//GEN-LAST:event_dailyِDocActionPerformed

    private void MonthlyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyDocActionPerformed
        Monthscheck.setVisible(true);
    }//GEN-LAST:event_MonthlyDocActionPerformed

    private void MonthscheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthscheckActionPerformed
      String chosenMonth=Monthscheck.getSelectedItem().toString();
    //  System.out.println(chosenMonth);
      
    //  if(chosenMonth.equals("فروردین")){
    //  System.out.println("yay");
     // }
    }//GEN-LAST:event_MonthscheckActionPerformed

    private void MonthscheckshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthscheckshowActionPerformed
      String chosenMonthCh=Monthscheck.getSelectedItem().toString();
    }//GEN-LAST:event_MonthscheckshowActionPerformed

    private void peopleDocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleDocListActionPerformed
               
      
    }//GEN-LAST:event_peopleDocListActionPerformed

    private void addbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbackActionPerformed
        Landpage(dashboard);
        //    addCategoryPanel.setVisible(false);
        //    dashboard.setVisible(true);
    }//GEN-LAST:event_addbackActionPerformed

    private void confirmCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCategoryActionPerformed
        AddUserLogic addUser= new AddUserLogic();
        String emailfieldUserCategory=categoryFieldEmail.getText();
        String AddressfieldUserCategory=categoryFieldَAddress.getText();
        String UserNameCategory=categoryFieldName.getText();
        String UserIdCategory=categoryFieldId.getText();
        String phoneCategory=categoryFieldPhone.getText();
        String category=categoryFieldName.getText();
        addUser.passUserTodataBase(UserIdCategory,UserNameCategory,phoneCategory,AddressfieldUserCategory,category);
        peopleDocList.addItem(categoryFieldName.getText());

    }//GEN-LAST:event_confirmCategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//JFrame frame = new JFrame("Bar Chart");
//
//            Diagram chart = new Diagram();
//
//            chart.addBar(Color.red, 100);
//
//            chart.addBar(Color.green, 8);
//
//            chart.addBar(Color.blue, 54);
//
//            chart.addBar(Color.black, 23);
//
//            frame.getContentPane().add(chart);
//
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            frame.pack();
//
//            frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Landpage(JPanel panel) {
        // LoginError.setVisible(panel==LoginError);
        Monthscheckshow.setVisible(false);
        Monthscheck.setVisible(false);
        LoginPanel.setVisible(panel == LoginPanel);
        dashboard.setVisible(panel == dashboard);
        // System.out.println(panel);
        addcheckPanel.setVisible(panel == addcheckPanel);
        stateChangePanel.setVisible(panel == stateChangePanel);
        showDocPanel.setVisible(panel == showDocPanel);
        addDocPanel.setVisible(panel == addDocPanel);
        addPeoplePanel.setVisible(panel == addPeoplePanel);
        tablePanel.setVisible(panel == tablePanel);
        addCategoryPanel.setVisible(panel == addCategoryPanel);
        showCheckpanel.setVisible(panel == showCheckpanel);
        checksReport.setVisible(panel == checksReport);
        docsReport.setVisible(panel == docsReport);

    }

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
            java.util.logging.Logger.getLogger(DashboardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           System.out.println("validatro "+Validator.emailIsValid("test@gmail.com"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JPanel LoginError;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JRadioButton MonthlyDoc;
    private javax.swing.JComboBox<String> Monthscheck;
    private javax.swing.JComboBox<String> Monthscheckshow;
    private javax.swing.JButton ShowCheckDocs2;
    private javax.swing.JButton ShowDocsbtn;
    private javax.swing.JPanel addCategoryPanel;
    private javax.swing.JButton addCheckBack;
    private javax.swing.JPanel addDocPanel;
    private javax.swing.JButton addDocback;
    private javax.swing.JTextField addId;
    private javax.swing.JTextField addName;
    private javax.swing.JPanel addPeoplePanel;
    private javax.swing.JButton addPeopleback;
    private javax.swing.JButton addUserBtn;
    private javax.swing.JButton addback;
    private javax.swing.JButton addcategory;
    private javax.swing.JPanel addcheckPanel;
    private javax.swing.JButton backCheckState;
    private javax.swing.JButton backshowCheck;
    private javax.swing.JButton backshowCheck1;
    private javax.swing.JButton backshowDoc;
    private javax.swing.JButton backshowDoc1;
    private javax.swing.JButton btnconfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField categoryField;
    private javax.swing.JTextField categoryFieldEmail;
    private javax.swing.JTextField categoryFieldId;
    private javax.swing.JTextField categoryFieldName;
    private javax.swing.JTextField categoryFieldPhone;
    private javax.swing.JTextField categoryFieldَAddress;
    private javax.swing.JTextField checkDayField;
    private javax.swing.JTextField checkMonthField;
    private javax.swing.JTextField checkYearField;
    private javax.swing.JPanel checksReport;
    private javax.swing.JTable checksTable;
    private javax.swing.JRadioButton clientBtn;
    private javax.swing.JButton confirmCategory;
    private javax.swing.JTextField cost;
    private javax.swing.JRadioButton creditorBtn;
    private javax.swing.JRadioButton dailyCheck;
    private javax.swing.JRadioButton dailyِDoc;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton dashboardBtnadd;
    private javax.swing.JButton dashboardBtnaddDoc;
    private javax.swing.JButton dashboardBtnshowCheck;
    private javax.swing.JButton dashboardBtnshowDoc;
    private javax.swing.JLabel dashboardlabel;
    private javax.swing.JRadioButton debtorBtn;
    private javax.swing.JTextField discription;
    private javax.swing.JTextArea discriptionText;
    private javax.swing.JPanel docsReport;
    private javax.swing.JTable docsTable;
    private javax.swing.JTextField emailField;
    protected javax.swing.JTextField emailfieldLogin;
    private javax.swing.JRadioButton employeeBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.JToggleButton isCreditorToggle;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JRadioButton monthlyCheck;
    private javax.swing.JRadioButton partnerBtn;
    private javax.swing.JButton passWordRecovery;
    protected javax.swing.JTextField passwordField;
    private javax.swing.JTextField payee;
    private javax.swing.JTextField payee2;
    private javax.swing.JTextField payee2Cost;
    private javax.swing.JTextField payee3;
    private javax.swing.JTextField payee3Cost;
    private javax.swing.JTextField payee4;
    private javax.swing.JTextField payee5;
    protected javax.swing.JComboBox<String> peopleDocList;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton registerChangeCheck;
    private javax.swing.JButton registerCheck;
    private javax.swing.JPanel showCheckpanel;
    private javax.swing.JPanel showDocPanel;
    private javax.swing.JButton signInbtn;
    private javax.swing.JPanel stateChangePanel;
    private javax.swing.JButton submitDoc;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton tableback;
    private javax.swing.ButtonGroup timeFilter;
    private javax.swing.JRadioButton weeklyCheck;
    private javax.swing.JRadioButton weeklyDoc;
    // End of variables declaration//GEN-END:variables

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
