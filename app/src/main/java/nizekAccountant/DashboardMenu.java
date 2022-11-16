package nizekAccountant;

//import testProject.ButtonRounder;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Lenovo
 */
public class DashboardMenu extends javax.swing.JFrame {

    boolean submitDocs = false;
    Dimension dimension = new Dimension(72, 26);
    Dimension Docs = new Dimension(100, 100);
    private LoginLogic loginLogic;
    private AddCheckLogic addCheckLogic;
    private AddDocLogic addDocLogic;
    private AddUserLogic addUserLogic;
    private ShowCheckRepository showCheckLogic;
    private ChangeStateCheckLogic changeStateCheckLogic;
    private ShowDocRepository showDocLogic;
    private GraphicsManager btnmanager;
    //  private ButtonRounder btnRounder;

    /**
     * Creates new form DashboardMenu
     */
    public DashboardMenu() {
        initComponents();
//        jMenuBar1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        boolean selectedType;

        btnmanager = new GraphicsManager(102, 102, 255, dimension);

        //  peopleDocList.addItem("Baran");
        //  peopleDocList.addItem("Sharifi");
        //  System.out.println("FFF: " + (String)peopleDocList.getSelectedItem());
        landPage(LoginPanel);
        disableFilter();
        // filterVisibility();
        addCheckLogic = new AddCheckLogic();
        addDocLogic = new AddDocLogic();

        addUserLogic = new AddUserLogic();
        showCheckLogic = new ShowCheckRepository();
        changeStateCheckLogic = new ChangeStateCheckLogic();
        showDocLogic = new ShowDocRepository();

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
        btnmanager.btnChangeColor(backToLogin);
        btnmanager.btnChangeColor(tarazBtn);
        btnmanager.btnChangeColor(ShowChecksbtn);
        btnmanager.btnChangeColor(dashboardBtnshowCheck1);
//=============changing lables===========================
        //============changing size  the registered buttons ============================
        btnmanager.btnSize(submitDoc);
        btnmanager.btnSize(registerChangeCheck);
        btnmanager.btnSize(btnconfirm);
        btnmanager.btnSize(registerCheck);
        btnmanager.btnSize(confirmCategory);
    }
//==================================================================

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
        filters = new javax.swing.ButtonGroup();
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
        jToggleButton1 = new javax.swing.JToggleButton();
        addcheckPanel = new javax.swing.JPanel();
        registerCheck = new javax.swing.JButton();
        addCheckBack = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        addCheckScroll = new javax.swing.JScrollPane();
        addingCheckPanel = new javax.swing.JPanel();
        discriptionCheck = new javax.swing.JScrollPane();
        discriptionTextAdd = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        payeeCostAdd = new javax.swing.JTextField();
        payeeCheckAdd = new javax.swing.JTextField();
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
        payeeLabel = new javax.swing.JLabel();
        ShowDocsbtn = new javax.swing.JButton();
        backshowDoc = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        dailyِDoc = new javax.swing.JRadioButton();
        weeklyDoc = new javax.swing.JRadioButton();
        MonthlyDoc = new javax.swing.JRadioButton();
        monthsDocList = new javax.swing.JComboBox<>();
        peopleDocList = new javax.swing.JComboBox<>();
        costLabel = new javax.swing.JLabel();
        CostDocList = new javax.swing.JComboBox<>();
        TimeDocRBtn = new javax.swing.JRadioButton();
        payeeDocRBtn = new javax.swing.JRadioButton();
        costDocRBtn = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        DRangeDocsDay = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        DRangeDocsYear = new javax.swing.JTextField();
        DRangeDocsMonth = new javax.swing.JTextField();
        DRangeDocsDay1 = new javax.swing.JTextField();
        DRangeDocsYear1 = new javax.swing.JTextField();
        DRangeDocsMonth1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        addDocPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        addingDocPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        discriptionDocAdd = new javax.swing.JTextField();
        payeeDocAdd = new javax.swing.JTextField();
        costDocAdd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        creditorBtn = new javax.swing.JRadioButton();
        debtorBtn = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        submitDoc = new javax.swing.JButton();
        addDocback = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        groupDocSubmit = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
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
        tarazBtn = new javax.swing.JButton();
        backToLogin = new javax.swing.JButton();
        dashboardBtnshowCheck1 = new javax.swing.JButton();
        showCheckpanel = new javax.swing.JPanel();
        payeeLabelCheck = new javax.swing.JLabel();
        ShowChecksbtn = new javax.swing.JButton();
        backshowDoc1 = new javax.swing.JButton();
        dailyCheckRBtn = new javax.swing.JRadioButton();
        weeklyCheckRBtn = new javax.swing.JRadioButton();
        MonthlyCheckRBtn = new javax.swing.JRadioButton();
        monthscheckList = new javax.swing.JComboBox<>();
        peopleCheckList = new javax.swing.JComboBox<>();
        costLabelCheck = new javax.swing.JLabel();
        costCheckList = new javax.swing.JComboBox<>();
        TimeCheckRBtn = new javax.swing.JRadioButton();
        payeeCheckRBtn = new javax.swing.JRadioButton();
        costCheckRBtn = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        DRangeChecksDay = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        DRangeChecksYear = new javax.swing.JTextField();
        DRangeChecksMonth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DRangeDocsDay2 = new javax.swing.JTextField();
        DRangeDocsYear2 = new javax.swing.JTextField();
        DRangeDocsMonth2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
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

        jToggleButton1.setText("barans new feature");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addComponent(passWordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signInbtn)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addContainerGap())))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jToggleButton1))
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
                .addContainerGap(89, Short.MAX_VALUE))
        );

        registerCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        registerCheck.setText("ثبت");
        registerCheck.setPreferredSize(dimension);
        registerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerCheckActionPerformed(evt);
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

        discriptionTextAdd.setColumns(20);
        discriptionTextAdd.setRows(5);
        discriptionCheck.setViewportView(discriptionTextAdd);

        jLabel17.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel17.setText("طرف حساب");

        jLabel18.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel18.setText("مبلغ");

        jLabel19.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel19.setText("توضیحات");

        payeeCostAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeCostAddActionPerformed(evt);
            }
        });

        payeeCheckAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeCheckAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addingCheckPanelLayout = new javax.swing.GroupLayout(addingCheckPanel);
        addingCheckPanel.setLayout(addingCheckPanelLayout);
        addingCheckPanelLayout.setHorizontalGroup(
            addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addingCheckPanelLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addingCheckPanelLayout.createSequentialGroup()
                        .addComponent(payeeCheckAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(addingCheckPanelLayout.createSequentialGroup()
                        .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(discriptionCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payeeCostAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addingCheckPanelLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(8, 8, 8)))))
                .addGap(19, 19, 19))
        );
        addingCheckPanelLayout.setVerticalGroup(
            addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingCheckPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingCheckPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(payeeCheckAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addingCheckPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)))
                .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(payeeCostAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addingCheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(addingCheckPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(58, 58, 58))
                    .addComponent(discriptionCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        addCheckScroll.setViewportView(addingCheckPanel);

        javax.swing.GroupLayout addcheckPanelLayout = new javax.swing.GroupLayout(addcheckPanel);
        addcheckPanel.setLayout(addcheckPanelLayout);
        addcheckPanelLayout.setHorizontalGroup(
            addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcheckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addcheckPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcheckPanelLayout.createSequentialGroup()
                                .addComponent(addCheckBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addcheckPanelLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addContainerGap())))
                    .addComponent(addCheckScroll, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        addcheckPanelLayout.setVerticalGroup(
            addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcheckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCheckScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(addcheckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCheckBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addContainerGap(190, Short.MAX_VALUE))
        );

        payeeLabel.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        payeeLabel.setText("طرف حساب");

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
        jLabel31.setText("نمایش سند");

        timeFilter.add(dailyِDoc);
        dailyِDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        dailyِDoc.setText("روزانه");
        dailyِDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyِDocActionPerformed(evt);
            }
        });

        timeFilter.add(weeklyDoc);
        weeklyDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        weeklyDoc.setText("هفتگی");

        timeFilter.add(MonthlyDoc);
        MonthlyDoc.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        MonthlyDoc.setText("ماهانه");
        MonthlyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyDocActionPerformed(evt);
            }
        });

        monthsDocList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        monthsDocList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد ", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن ", "اسفند" }));
        monthsDocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsDocListActionPerformed(evt);
            }
        });

        peopleDocList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        peopleDocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleDocListActionPerformed(evt);
            }
        });

        costLabel.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        costLabel.setText("قیمت");

        CostDocList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        CostDocList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostDocListActionPerformed(evt);
            }
        });

        filters.add(TimeDocRBtn);
        TimeDocRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        TimeDocRBtn.setText("فیلتر زمان");
        TimeDocRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeDocRBtnActionPerformed(evt);
            }
        });

        filters.add(payeeDocRBtn);
        payeeDocRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        payeeDocRBtn.setText("طرف حساب");
        payeeDocRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeDocRBtnActionPerformed(evt);
            }
        });

        filters.add(costDocRBtn);
        costDocRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        costDocRBtn.setText("فیلتر قیمت");
        costDocRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costDocRBtnActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel36.setText("فیلترها");

        jLabel23.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel23.setText("بازه ی زمانی مورد نظر را وارد کنید");

        jLabel8.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel8.setText("از تاریخ");

        jLabel27.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel27.setText("تا تاریخ");

        javax.swing.GroupLayout showDocPanelLayout = new javax.swing.GroupLayout(showDocPanel);
        showDocPanel.setLayout(showDocPanelLayout);
        showDocPanelLayout.setHorizontalGroup(
            showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDocPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(MonthlyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weeklyDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dailyِDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeDocRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(payeeDocRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(monthsDocList, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costDocRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showDocPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(payeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(CostDocList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(peopleDocList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
            .addGroup(showDocPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addComponent(backshowDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ShowDocsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(DRangeDocsYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DRangeDocsMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DRangeDocsDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showDocPanelLayout.createSequentialGroup()
                                .addComponent(DRangeDocsYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DRangeDocsMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DRangeDocsDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        showDocPanelLayout.setVerticalGroup(
            showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showDocPanelLayout.createSequentialGroup()
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel31))
                    .addGroup(showDocPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(payeeDocRBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimeDocRBtn)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dailyِDoc)
                            .addComponent(weeklyDoc)
                            .addComponent(MonthlyDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costDocRBtn)
                            .addComponent(monthsDocList, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeLabel)
                    .addComponent(costLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peopleDocList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CostDocList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DRangeDocsDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsMonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(showDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backshowDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowDocsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        addDocPanel.setBackground(new java.awt.Color(204, 204, 255));
        addDocPanel.setForeground(new java.awt.Color(204, 204, 204));

        jScrollPane5.setBackground(new java.awt.Color(204, 255, 153));

        addingDocPanel.setBackground(new java.awt.Color(204, 153, 255));
        addingDocPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel15.setText("مبلغ");

        jLabel16.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel16.setText("توضیحات");

        payeeDocAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeDocAddActionPerformed(evt);
            }
        });

        costDocAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costDocAddActionPerformed(evt);
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

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("______________________________________________________________________________________________________________________________");

        javax.swing.GroupLayout addingDocPanelLayout = new javax.swing.GroupLayout(addingDocPanel);
        addingDocPanel.setLayout(addingDocPanelLayout);
        addingDocPanelLayout.setHorizontalGroup(
            addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingDocPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addingDocPanelLayout.createSequentialGroup()
                        .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditorBtn)
                            .addComponent(debtorBtn))
                        .addGap(65, 65, 65)
                        .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(payeeDocAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(costDocAdd)))
                    .addComponent(discriptionDocAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16))
                    .addComponent(jLabel13))
                .addGap(21, 21, 21))
            .addGroup(addingDocPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addingDocPanelLayout.setVerticalGroup(
            addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingDocPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeDocAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(creditorBtn))
                .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addingDocPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(costDocAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addingDocPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(debtorBtn)))
                .addGap(18, 18, 18)
                .addGroup(addingDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discriptionDocAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addContainerGap(408, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(addingDocPanel);

        submitDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        submitDoc.setText("ثبت");
        submitDoc.setPreferredSize(dimension);
        submitDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitDocActionPerformed(evt);
            }
        });

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

        groupDocSubmit.setText("+ ");
        groupDocSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupDocSubmitActionPerformed(evt);
            }
        });

        jLabel38.setText("numberOfdocs");

        javax.swing.GroupLayout addDocPanelLayout = new javax.swing.GroupLayout(addDocPanel);
        addDocPanel.setLayout(addDocPanelLayout);
        addDocPanelLayout.setHorizontalGroup(
            addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDocPanelLayout.createSequentialGroup()
                .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDocPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32))
                    .addGroup(addDocPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(addDocback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groupDocSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDocPanelLayout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        addDocPanelLayout.setVerticalGroup(
            addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDocPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(addDocPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDocback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupDocSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(32, 32, 32))
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
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(clientBtn);
        clientBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        clientBtn.setText("مشتری");
        clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(partnerBtn);
        partnerBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        partnerBtn.setText("شریک تجاری");
        partnerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnerBtnActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(tableback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(129, 129, 129)
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
                .addGap(0, 141, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(addCategoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        dashboardBtnshowCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnshowCheck.setText("نمایش چک");
        dashboardBtnshowCheck.setPreferredSize(new java.awt.Dimension(103, 26));
        dashboardBtnshowCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnshowCheckActionPerformed(evt);
            }
        });

        addUserBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        addUserBtn.setText("افزودن کاربر");
        addUserBtn.setPreferredSize(new java.awt.Dimension(103, 26));
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        dashboardBtnshowDoc.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnshowDoc.setText("نمایش سند");
        dashboardBtnshowDoc.setPreferredSize(new java.awt.Dimension(103, 26));
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
        dashboardBtnaddDoc.setPreferredSize(new java.awt.Dimension(103, 26));
        dashboardBtnaddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnaddDocActionPerformed(evt);
            }
        });

        dashboardlabel.setBackground(new java.awt.Color(102, 102, 255));
        dashboardlabel.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardlabel.setForeground(new java.awt.Color(255, 255, 255));
        dashboardlabel.setText("داشبورد");

        tarazBtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        tarazBtn.setText("نمودار تراز");
        tarazBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarazBtnActionPerformed(evt);
            }
        });

        backToLogin.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        backToLogin.setText("بازگشت به صفحه ورود");
        backToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginActionPerformed(evt);
            }
        });

        dashboardBtnshowCheck1.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        dashboardBtnshowCheck1.setText("تغییر وضعیت چک");
        dashboardBtnshowCheck1.setMaximumSize(new java.awt.Dimension(140, 109));
        dashboardBtnshowCheck1.setPreferredSize(new java.awt.Dimension(103, 26));
        dashboardBtnshowCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardBtnshowCheck1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addComponent(backToLogin)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dashboardBtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtnaddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dashboardBtnshowDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtnshowCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarazBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dashboardlabel))
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addComponent(dashboardBtnshowCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dashboardLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dashboardlabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(tarazBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dashboardBtnshowCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashboardBtnshowCheck1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardBtnshowDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardBtnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardBtnaddDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        payeeLabelCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        payeeLabelCheck.setText("طرف حساب");

        ShowChecksbtn.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        ShowChecksbtn.setText("نمایش چک ها");
        ShowChecksbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowChecksbtnActionPerformed(evt);
            }
        });

        backshowDoc1.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        backshowDoc1.setText("بازگشت به داشبورد اصلی");
        backshowDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backshowDoc1ActionPerformed(evt);
            }
        });

        timeFilter.add(dailyCheckRBtn);
        dailyCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        dailyCheckRBtn.setText("روزانه");
        dailyCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyCheckRBtnActionPerformed(evt);
            }
        });

        timeFilter.add(weeklyCheckRBtn);
        weeklyCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        weeklyCheckRBtn.setText("هفتگی");
        weeklyCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyCheckRBtnActionPerformed(evt);
            }
        });

        timeFilter.add(MonthlyCheckRBtn);
        MonthlyCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        MonthlyCheckRBtn.setText("ماهانه");
        MonthlyCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyCheckRBtnActionPerformed(evt);
            }
        });

        monthscheckList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        monthscheckList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد ", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن ", "اسفند" }));
        monthscheckList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthscheckListActionPerformed(evt);
            }
        });

        peopleCheckList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        peopleCheckList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleCheckListActionPerformed(evt);
            }
        });

        costLabelCheck.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        costLabelCheck.setText("قیمت");

        costCheckList.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        costCheckList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costCheckListActionPerformed(evt);
            }
        });

        filters.add(TimeCheckRBtn);
        TimeCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        TimeCheckRBtn.setText("فیلتر زمان");
        TimeCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeCheckRBtnActionPerformed(evt);
            }
        });

        filters.add(payeeCheckRBtn);
        payeeCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        payeeCheckRBtn.setText("طرف حساب");
        payeeCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payeeCheckRBtnActionPerformed(evt);
            }
        });

        filters.add(costCheckRBtn);
        costCheckRBtn.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        costCheckRBtn.setText("فیلتر قیمت");
        costCheckRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costCheckRBtnActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel37.setText("فیلترها");

        jLabel24.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel24.setText("بازه ی زمانی مورد نظر را وارد کنید");

        jLabel5.setFont(new java.awt.Font("B Roya", 1, 18)); // NOI18N
        jLabel5.setText("نمایش چک ها");

        jLabel28.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel28.setText("از تاریخ");

        jLabel35.setFont(new java.awt.Font("B Roya", 1, 14)); // NOI18N
        jLabel35.setText("تا تاریخ");

        javax.swing.GroupLayout showCheckpanelLayout = new javax.swing.GroupLayout(showCheckpanel);
        showCheckpanel.setLayout(showCheckpanelLayout);
        showCheckpanelLayout.setHorizontalGroup(
            showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addComponent(MonthlyCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(weeklyCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dailyCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimeCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(payeeCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addComponent(monthscheckList, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(costCheckRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addComponent(costLabelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(payeeLabelCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addComponent(costCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(peopleCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40))
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showCheckpanelLayout.createSequentialGroup()
                                .addComponent(DRangeDocsYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DRangeDocsMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DRangeDocsDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(showCheckpanelLayout.createSequentialGroup()
                                .addComponent(DRangeChecksYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DRangeChecksMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DRangeChecksDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backshowDoc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(showCheckpanelLayout.createSequentialGroup()
                        .addComponent(ShowChecksbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, showCheckpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        showCheckpanelLayout.setVerticalGroup(
            showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showCheckpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(payeeCheckRBtn)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeCheckRBtn)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyCheckRBtn)
                    .addComponent(weeklyCheckRBtn)
                    .addComponent(MonthlyCheckRBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costCheckRBtn)
                    .addComponent(monthscheckList, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payeeLabelCheck)
                    .addComponent(costLabelCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peopleCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeChecksDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeChecksYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeChecksMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DRangeDocsDay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DRangeDocsMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(showCheckpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backshowDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowChecksbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backshowCheck)
                .addContainerGap())
        );

        docsReport.setPreferredSize(new java.awt.Dimension(455, 444));

        docsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "طرف حساب", "بدهکار", "بستانکار", "تاریخ", "مبلغ", "توضیحات"
            }
        ));
        docsTable.setToolTipText("");
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
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(docsReportLayout.createSequentialGroup()
                        .addComponent(backshowCheck1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        docsReportLayout.setVerticalGroup(
            docsReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, docsReportLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backshowCheck1)
                .addContainerGap())
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
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(showDocPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 54, Short.MAX_VALUE)))
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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addCategoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(showCheckpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(95, Short.MAX_VALUE)))
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
                .addContainerGap(105, Short.MAX_VALUE))
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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
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

        landPage(addCategoryPanel);

    }//GEN-LAST:event_addcategoryActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void costDocAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costDocAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costDocAddActionPerformed

    private void payeeDocAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeDocAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payeeDocAddActionPerformed

    private void payee3CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee3CostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee3CostActionPerformed

    private void payee3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payee3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payee3ActionPerformed

    private void payeeCheckAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeCheckAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payeeCheckAddActionPerformed

    private void payeeCostAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeCostAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payeeCostAddActionPerformed

    private void emailfieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldLoginActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed

        System.out.println(emailfieldLogin.getText());
        loginLogic = new LoginLogic();
        if (loginLogic.canEnter(emailfieldLogin.getText(), passwordField.getText())) {
            landPage(dashboard);
        }

        //  enterBtn.setBackground(Color.red);
        //}
    }//GEN-LAST:event_enterBtnActionPerformed

    private void dashboardBtnshowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnshowCheckActionPerformed
        landPage(showCheckpanel);
    }//GEN-LAST:event_dashboardBtnshowCheckActionPerformed

    private void dashboardBtnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnaddActionPerformed
        landPage(addcheckPanel);

    }//GEN-LAST:event_dashboardBtnaddActionPerformed

    private void dashboardBtnshowDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnshowDocActionPerformed
        landPage(showDocPanel);

//showDOcPanel.setVisible(true);
        //dashboard.setVisible(false);
    }//GEN-LAST:event_dashboardBtnshowDocActionPerformed

    private void dashboardBtnaddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnaddDocActionPerformed
        landPage(addDocPanel);
//        addDocPanel.setVisible(true);
        //      dashboard.setVisible(false);
    }//GEN-LAST:event_dashboardBtnaddDocActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        landPage(addPeoplePanel);
//        addPeoplePanel.setVisible(true);
//        dashboard.setVisible(false);
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void backCheckStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCheckStateActionPerformed
        landPage(dashboard);
    }//GEN-LAST:event_backCheckStateActionPerformed

    private void addDocbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocbackActionPerformed
        landPage(dashboard);
//        addDocPanel.setVisible(false);
        //       dashboard.setVisible(true);
    }//GEN-LAST:event_addDocbackActionPerformed

    private void addbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbackActionPerformed
        landPage(dashboard);
        //    addCategoryPanel.setVisible(false);
        //    dashboard.setVisible(true);
    }//GEN-LAST:event_addbackActionPerformed

    private void addPeoplebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPeoplebackActionPerformed
        landPage(dashboard);
        //    addPeoplePanel.setVisible(false);
        //   dashboard.setVisible(true);
    }//GEN-LAST:event_addPeoplebackActionPerformed

    private void tablebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablebackActionPerformed
        landPage(dashboard);
        //    tablePanel.setVisible(false);
        //    dashboard.setVisible(true);
    }//GEN-LAST:event_tablebackActionPerformed

    private void addCheckBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCheckBackActionPerformed
        //   addcheckPanel.setVisible(false);
        //   dashboard.setVisible(true);
        landPage(dashboard);
    }//GEN-LAST:event_addCheckBackActionPerformed

    private void confirmCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmCategoryActionPerformed
        AddUserLogic addUser = new AddUserLogic();
        String emailfieldUser = emailField.getText();
        String AddressfieldUser = AddressField.getText();
        String UserName = addName.getText();
        String UserId = addId.getText();
        String phone = phoneField.getText();

//        addUser.passUserTodataBase(emailfieldUser, AddressfieldUser, UserName, UserId, phone);
        peopleDocList.addItem(categoryFieldName.getText());


    }//GEN-LAST:event_confirmCategoryActionPerformed

    private void registerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerCheckActionPerformed
        String payeeDoc = payeeCheckAdd.getText();
        String discriptionDoc = discriptionTextAdd.getText();
        String costDoc = payeeCostAdd.getText();
        if (addCheckLogic.canSubmitCheck(payeeDoc, costDoc, discriptionDoc)) {
            addCheckLogic.passCheckToDatabase(payeeDoc, costDoc, discriptionDoc);
        } else {
            JOptionPane.showMessageDialog(addDocPanel, "فیلد  های سند را صحیح وارد کنید",
                    "اطلاعات نامعتبر", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_registerCheckActionPerformed

    private void registerChangeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerChangeCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerChangeCheckActionPerformed

    private void backshowCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowCheck1ActionPerformed
        landPage(dashboard);
    }//GEN-LAST:event_backshowCheck1ActionPerformed

    private void backshowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowCheckActionPerformed
        landPage(dashboard);
    }//GEN-LAST:event_backshowCheckActionPerformed

    private void submitDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitDocActionPerformed
        String addPayeeDoc = payeeDocAdd.getText();
        String addCostDoc = costDocAdd.getText();
        String addDiscriptionDoc = discriptionDocAdd.getText();
        if (addDocLogic.canSubmitDoc(addPayeeDoc, addCostDoc, addDiscriptionDoc)) {
            addDocLogic.passDocToDatabase(addPayeeDoc, addCostDoc, addDiscriptionDoc);

        } else {
            JOptionPane.showMessageDialog(addDocPanel, "فیلد  های سند را صحیح وارد کنید",
                    "اطلاعات نامعتبر", JOptionPane.ERROR_MESSAGE);

        }
        //   addDocLogic.groupedSubmit(submitDoc);


    }//GEN-LAST:event_submitDocActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        AddUserLogic addUser = new AddUserLogic();
        String type = "";
        String emailfieldUser = emailField.getText();
        String addressfieldUser = AddressField.getText();
        String userName = addName.getText();
        String userId = addId.getText();
        String phone = phoneField.getText();
        if (employeeBtn.isSelected()) {
            type = "employee";
        } else if (partnerBtn.isSelected()) {
            type = "partner";
        } else if (clientBtn.isSelected()) {
            type = "client";
        }
//  refactor id to nationalId
        //     addUser.passUserTodataBase(userId, userName, phone, addressfieldUser, type);
        peopleDocList.addItem(userName);

    }//GEN-LAST:event_btnconfirmActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        employeeBtn.isSelected();
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientBtnActionPerformed
        clientBtn.isSelected();
    }//GEN-LAST:event_clientBtnActionPerformed

    private void partnerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnerBtnActionPerformed
        partnerBtn.isSelected();
    }//GEN-LAST:event_partnerBtnActionPerformed

    private void costCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costCheckRBtnActionPerformed
        filterVisibelity(costCheckRBtn);
    }//GEN-LAST:event_costCheckRBtnActionPerformed

    private void payeeCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeCheckRBtnActionPerformed
        filterVisibelity(payeeCheckRBtn);
    }//GEN-LAST:event_payeeCheckRBtnActionPerformed

    private void TimeCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeCheckRBtnActionPerformed
        filterVisibelity(TimeCheckRBtn);
    }//GEN-LAST:event_TimeCheckRBtnActionPerformed

    private void costCheckListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costCheckListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costCheckListActionPerformed

    private void peopleCheckListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleCheckListActionPerformed

    }//GEN-LAST:event_peopleCheckListActionPerformed

    private void monthscheckListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthscheckListActionPerformed
        String chosenMonthCh = monthscheckList.getSelectedItem().toString();
    }//GEN-LAST:event_monthscheckListActionPerformed

    private void MonthlyCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyCheckRBtnActionPerformed
        filterVisibelity(MonthlyCheckRBtn);
    }//GEN-LAST:event_MonthlyCheckRBtnActionPerformed

    private void weeklyCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeklyCheckRBtnActionPerformed
        weeklyCheckRBtn.isSelected();
    }//GEN-LAST:event_weeklyCheckRBtnActionPerformed

    private void dailyCheckRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyCheckRBtnActionPerformed
        dailyCheckRBtn.isSelected();
    }//GEN-LAST:event_dailyCheckRBtnActionPerformed

    private void backshowDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowDoc1ActionPerformed
        landPage(dashboard);
    }//GEN-LAST:event_backshowDoc1ActionPerformed

    private void ShowChecksbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowChecksbtnActionPerformed
        landPage(checksReport);
    }//GEN-LAST:event_ShowChecksbtnActionPerformed

    private void costDocRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costDocRBtnActionPerformed
        filterVisibelity(costDocRBtn);
    }//GEN-LAST:event_costDocRBtnActionPerformed

    private void payeeDocRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payeeDocRBtnActionPerformed
        filterVisibelity(payeeDocRBtn);
    }//GEN-LAST:event_payeeDocRBtnActionPerformed

    private void TimeDocRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeDocRBtnActionPerformed
        filterVisibelity(TimeDocRBtn);
    }//GEN-LAST:event_TimeDocRBtnActionPerformed

    private void CostDocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostDocListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostDocListActionPerformed

    private void peopleDocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleDocListActionPerformed
        //get the selected item
    }//GEN-LAST:event_peopleDocListActionPerformed

    private void monthsDocListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsDocListActionPerformed
        String chosenMonth = monthsDocList.getSelectedItem().toString();
        //  System.out.println(chosenMonth);
        //  if(chosenMonth.equals("فروردین")){
        //  System.out.println("yay");
        // }
    }//GEN-LAST:event_monthsDocListActionPerformed

    private void MonthlyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyDocActionPerformed
        filterVisibelity(MonthlyDoc);

    }//GEN-LAST:event_MonthlyDocActionPerformed

    private void dailyِDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyِDocActionPerformed

    }//GEN-LAST:event_dailyِDocActionPerformed

    private void backshowDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backshowDocActionPerformed

        landPage(dashboard);
        //  showDOcPanel.setVisible(false);
    }//GEN-LAST:event_backshowDocActionPerformed

    private void ShowDocsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDocsbtnActionPerformed
        landPage(docsReport);
        String filterDateRange = DRangeDocsDay.getText();
    }//GEN-LAST:event_ShowDocsbtnActionPerformed

    private void tarazBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarazBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarazBtnActionPerformed

    private void backToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginActionPerformed
        landPage(LoginPanel);
    }//GEN-LAST:event_backToLoginActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

//GraphicsManager.darkmode();

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void groupDocSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupDocSubmitActionPerformed
        addDocLogic.groupedSubmit(submitDoc);
    }//GEN-LAST:event_groupDocSubmitActionPerformed

    private void dashboardBtnshowCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardBtnshowCheck1ActionPerformed
        landPage(stateChangePanel);
    }//GEN-LAST:event_dashboardBtnshowCheck1ActionPerformed
    public void filterVisibelity(JRadioButton Rbtn) {
        costCheckList.setEnabled(costCheckRBtn.isSelected());
        peopleCheckList.setEnabled(payeeCheckRBtn.isSelected());
        monthscheckList.setEnabled(MonthlyCheckRBtn.isSelected());
        costLabelCheck.setEnabled(costCheckRBtn.isSelected());
        payeeLabelCheck.setEnabled(payeeCheckRBtn.isSelected());
        weeklyCheckRBtn.setEnabled(TimeCheckRBtn.isSelected());
        dailyCheckRBtn.setEnabled(TimeCheckRBtn.isSelected());
        MonthlyCheckRBtn.setEnabled(TimeCheckRBtn.isSelected());

        //======docs visiblity=========================
        payeeLabel.setEnabled(payeeDocRBtn.isSelected());
        costLabel.setEnabled(costDocRBtn.isSelected());
        peopleDocList.setEnabled(payeeDocRBtn.isSelected());
        CostDocList.setEnabled(costDocRBtn.isSelected());
        dailyِDoc.setEnabled(TimeDocRBtn.isSelected());
        weeklyDoc.setEnabled(TimeDocRBtn.isSelected());
        MonthlyDoc.setEnabled(TimeDocRBtn.isSelected());
        monthsDocList.setEnabled(MonthlyDoc.isSelected());
        // monthsDocList.setEnabled(MonthlyDoc.isSelected() && TimeCheckRBtn.isSelected());
        //  monthscheckList.setEnabled(TimeCheckRBtn.isSelected());
        //==============conflict of monthComboBox enablity ========================
        if (payeeDocRBtn.isSelected() || costDocRBtn.isSelected()) {
            monthsDocList.setEnabled(false);
        }
        if (payeeCheckRBtn.isSelected() || costCheckRBtn.isSelected()) {
            monthscheckList.setEnabled(false);

        }
    }

    public void disableFilter() {
        monthsDocList.setEnabled(TimeDocRBtn.isSelected() && MonthlyDoc.isSelected());
        weeklyCheckRBtn.setEnabled(false);
        dailyCheckRBtn.setEnabled(false);
        MonthlyCheckRBtn.setEnabled(false);
        monthscheckList.setEnabled(false);
        dailyِDoc.setEnabled(false);
        weeklyDoc.setEnabled(false);
        MonthlyDoc.setEnabled(false);
        peopleDocList.setEnabled(false);
        CostDocList.setEnabled(false);
        peopleCheckList.setEnabled(false);
        costCheckList.setEnabled(false);

    }

    public void landPage(JPanel panel) {
//        Monthscheckshow.setVisible(false);
        LoginPanel.setVisible(panel == LoginPanel);
        dashboard.setVisible(panel == dashboard);
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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    protected javax.swing.JComboBox<String> CostDocList;
    private javax.swing.JTextField DRangeChecksDay;
    private javax.swing.JTextField DRangeChecksMonth;
    private javax.swing.JTextField DRangeChecksYear;
    private javax.swing.JTextField DRangeDocsDay;
    private javax.swing.JTextField DRangeDocsDay1;
    private javax.swing.JTextField DRangeDocsDay2;
    private javax.swing.JTextField DRangeDocsMonth;
    private javax.swing.JTextField DRangeDocsMonth1;
    private javax.swing.JTextField DRangeDocsMonth2;
    private javax.swing.JTextField DRangeDocsYear;
    private javax.swing.JTextField DRangeDocsYear1;
    private javax.swing.JTextField DRangeDocsYear2;
    private javax.swing.JPanel LoginError;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JRadioButton MonthlyCheckRBtn;
    private javax.swing.JRadioButton MonthlyDoc;
    private javax.swing.JButton ShowChecksbtn;
    private javax.swing.JButton ShowDocsbtn;
    private javax.swing.JRadioButton TimeCheckRBtn;
    private javax.swing.JRadioButton TimeDocRBtn;
    private javax.swing.JPanel addCategoryPanel;
    private javax.swing.JButton addCheckBack;
    private javax.swing.JScrollPane addCheckScroll;
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
    private javax.swing.JPanel addingCheckPanel;
    private javax.swing.JPanel addingDocPanel;
    private javax.swing.JButton backCheckState;
    private javax.swing.JButton backToLogin;
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
    private javax.swing.JPanel checksReport;
    private javax.swing.JTable checksTable;
    private javax.swing.JRadioButton clientBtn;
    private javax.swing.JButton confirmCategory;
    protected javax.swing.JComboBox<String> costCheckList;
    private javax.swing.JRadioButton costCheckRBtn;
    private javax.swing.JTextField costDocAdd;
    private javax.swing.JRadioButton costDocRBtn;
    private javax.swing.JLabel costLabel;
    private javax.swing.JLabel costLabelCheck;
    private javax.swing.JRadioButton creditorBtn;
    private javax.swing.JRadioButton dailyCheckRBtn;
    private javax.swing.JRadioButton dailyِDoc;
    private javax.swing.JPanel dashboard;
    private javax.swing.JButton dashboardBtnadd;
    private javax.swing.JButton dashboardBtnaddDoc;
    private javax.swing.JButton dashboardBtnshowCheck;
    private javax.swing.JButton dashboardBtnshowCheck1;
    private javax.swing.JButton dashboardBtnshowDoc;
    private javax.swing.JLabel dashboardlabel;
    private javax.swing.JRadioButton debtorBtn;
    private javax.swing.JScrollPane discriptionCheck;
    private javax.swing.JTextField discriptionDocAdd;
    private javax.swing.JTextArea discriptionTextAdd;
    private javax.swing.JPanel docsReport;
    private javax.swing.JTable docsTable;
    private javax.swing.JTextField emailField;
    protected javax.swing.JTextField emailfieldLogin;
    private javax.swing.JRadioButton employeeBtn;
    private javax.swing.JButton enterBtn;
    private javax.swing.ButtonGroup filters;
    private javax.swing.JButton groupDocSubmit;
    private javax.swing.JToggleButton isCreditorToggle;
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
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JComboBox<String> monthsDocList;
    private javax.swing.JComboBox<String> monthscheckList;
    private javax.swing.JRadioButton partnerBtn;
    private javax.swing.JButton passWordRecovery;
    protected javax.swing.JTextField passwordField;
    private javax.swing.JTextField payee3;
    private javax.swing.JTextField payee3Cost;
    private javax.swing.JTextField payeeCheckAdd;
    private javax.swing.JRadioButton payeeCheckRBtn;
    private javax.swing.JTextField payeeCostAdd;
    private javax.swing.JTextField payeeDocAdd;
    private javax.swing.JRadioButton payeeDocRBtn;
    private javax.swing.JLabel payeeLabel;
    private javax.swing.JLabel payeeLabelCheck;
    protected javax.swing.JComboBox<String> peopleCheckList;
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
    private javax.swing.JButton tarazBtn;
    private javax.swing.ButtonGroup timeFilter;
    private javax.swing.JRadioButton weeklyCheckRBtn;
    private javax.swing.JRadioButton weeklyDoc;
    // End of variables declaration//GEN-END:variables

    void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
