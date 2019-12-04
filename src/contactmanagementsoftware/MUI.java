/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author ritz619
 */
public class MUI extends javax.swing.JFrame {

    /**
     * Creates new form MUI
     */
    private MUI mg;
    private ArrayList<ArrayList<Acquaintances>> a;
    private ArrayList<ArrayList<Acquaintances>> temp;
    private int x;
    private int num;
    private boolean flag;
    private boolean dflag;
    private String op;
    private String str;
//    private ArrayList<JTextComponent> acquaintanceFormComponent = new ArrayList<>();
    
    public void setMg(MUI mg) {
        this.mg = mg;
    }

    public void setA(ArrayList<ArrayList<Acquaintances>> a) {
        this.a = a;
    }
    
    public void setDescription(){
        nameField.setText("");
        mobileField.setText("");
        emailField.setText("");
        otherInformationField1.setText("");
        otherInformationField2.setText("");
        otherInformationField3.setText("");
        if(!dflag){
            nameField.setEditable(true);
            mobileField.setEditable(true);
            emailField.setEditable(true);
            otherInformationField1.setEditable(true);
            otherInformationField2.setEditable(true);
            otherInformationField3.setEditable(true);
        }
        if(flag)
            op = "Add";
        else
            op = "Edit";
        if(!flag){
            jButtonConfirmDetails.setText("Save");
            Acquaintances e = a.get(x).get(num);            
            nameField.setText(e.getName());
            mobileField.setText(e.getMobileNo());
            emailField.setText(e.getEmail());
            switch(x){
                case 0:
                    PersonalFriends perF = (PersonalFriends)e;
                    otherInformationField1.setText(perF.getEvents());
                    otherInformationField2.setText(perF.getAContext());
                    otherInformationField3.setText(perF.getADate());
                    break;
                case 1:
                    Relatives rel = (Relatives)e;
                    otherInformationField1.setText(rel.getBDate());
                    otherInformationField2.setText(rel.getLDate());
                    break;
                case 2:
                    ProfessionalFriends proF = (ProfessionalFriends)e;
                    otherInformationField1.setText(proF.getCommonInterests());
                    break;
                case 3:
                    CasualAcquaintances ca = (CasualAcquaintances)e;
                    otherInformationField1.setText(ca.getWhenWhere());
                    otherInformationField2.setVisible(true);
                    otherInformationField3.setVisible(true);
                    otherInformationField2.setText(ca.getCircumstances());
                    otherInformationField3.setText(ca.getOtherInfo());
                    break;
                default:
                    break;
            }
        }
        jButtonConfirmDetails.setVisible(true);
        jButtonCancleDetails.setVisible(true);
        if(flag)
            jButtonConfirmDetails.setText("Add");
        switch(x){
            case 0:
                otherInformationField2.setVisible(true);
                otherInformationField3.setVisible(true);
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Personal Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                jLabelOtherInformation1.setText("Specific Events:");
                jLabel8OtherInformation2.setText("First Acquaintance Context:");
                jLabelOtherInformation3.setVisible(true);
                jLabelDetailsTableTitle.setVisible(true);
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                jScrollPane5.setVisible(true);
                jScrollPane4.setVisible(true);
                jLabelOtherInformation3.setText("<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
                break;
            case 1:
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Relatives Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16))); 
                jLabelOtherInformation1.setText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>");
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                otherInformationField2.setVisible(true);
                jLabel8OtherInformation2.setText("<html>Last Date met:<br> (dd/mm/yyyy)</html>");
                jLabelOtherInformation3.setVisible(false);
                otherInformationField3.setVisible(false);
                jScrollPane4.setVisible(true);
                jScrollPane5.setVisible(false);
                break;
            case 2:
                jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, op + " Professional Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16))); 
                jLabelOtherInformation1.setText("Common Interests: ");
                jLabelOtherInformation1.setVisible(true);
                jLabel8OtherInformation2.setVisible(false);
                otherInformationField2.setVisible(false);
                jScrollPane4.setVisible(false);
                jLabelOtherInformation3.setVisible(false);
                otherInformationField3.setVisible(false);
                jScrollPane5.setVisible(false);
                break;
            case 3:
                jScrollPane5.setVisible(true);
                jScrollPane4.setVisible(true);
                otherInformationField2.setVisible(true);
                otherInformationField3.setVisible(true);
                jLabelOtherInformation1.setVisible(true);
                jLabel8OtherInformation2.setVisible(true);
                jLabelOtherInformation3.setVisible(true);
                jLabelOtherInformation1.setText("First meeting time & location:");
                jLabel8OtherInformation2.setText("First meeting CIrcumstances:");
                jLabelOtherInformation3.setText("Other useful information:");
                break;
            default:
                break;
        }
        if(dflag){
            nameField.setEditable(false);
            mobileField.setEditable(false);
            emailField.setEditable(false);
            otherInformationField1.setEditable(false);
            otherInformationField2.setEditable(false);
            otherInformationField3.setEditable(false);
            jButtonConfirmDetails.setText("Back to main menu");
            jButtonCancleDetails.setVisible(false);
            jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Display Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
        }
    }
    
    public MUI() {
        initComponents();
        String[] columnNames = {"S.No", "Name", "Mobile"," Email"};
        DefaultTableModel model = new DefaultTableModel(null, columnNames);
        jXTableDetialsDisplay.setModel(model);
        setUpTableData();
    }

    public final void setUpTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) jXTableDetialsDisplay.getModel();
        tableModel.setRowCount(0);
        ArrayList<Acquaintances> list;
        try{        
            list = a.get(jListAcquaintancesCatagory.getSelectedIndex());
        }
        catch(Exception e){
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] data = new String[4];
            data[0] = Integer.toString(i+1);
            data[1] = list.get(i).getName();
            data[2] = list.get(i).getMobileNo();
            data[3] = list.get(i).getEmail();
            tableModel.addRow(data);
        }
        jXTableDetialsDisplay.setModel(tableModel);
        tableModel.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMainPage = new javax.swing.JPanel();
        jLabelSystemName = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAcquaintancesCatagory = new javax.swing.JList();
        jScrollPaneDetailsDisplay = new javax.swing.JScrollPane();
        jXTableDetialsDisplay = new org.jdesktop.swingx.JXTable();
        jLabelSelectCategoryTitle = new javax.swing.JLabel();
        jLabelDetailsTableTitle = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jButtonViewFullDetail = new javax.swing.JButton();
        jButtonReadFromFile = new javax.swing.JButton();
        jButtonSaveAsFile = new javax.swing.JButton();
        jPanelSearchResult = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextPane();
        jButtonBackToMainMenu = new javax.swing.JButton();
        jPanelDetailsForm = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelMobile = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelOtherInformation1 = new javax.swing.JLabel();
        jLabel8OtherInformation2 = new javax.swing.JLabel();
        jLabelOtherInformation3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        otherInformationField2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        otherInformationField3 = new javax.swing.JTextArea();
        jButtonConfirmDetails = new javax.swing.JButton();
        mobileField = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        otherInformationField1 = new javax.swing.JTextArea();
        jButtonCancleDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabelSystemName.setFont(new java.awt.Font("Ubuntu Medium", 0, 20)); // NOI18N
        jLabelSystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSystemName.setText("<html><u>Contact Management System</u></html>");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jListAcquaintancesCatagory.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Personal Friends", "Relatives", "Professional Friends", "Casual Acquaintances" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListAcquaintancesCatagory.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListAcquaintancesCatagoryValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListAcquaintancesCatagory);

        jXTableDetialsDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "S.No", "Name", "Mobile No", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneDetailsDisplay.setViewportView(jXTableDetialsDisplay);

        jLabelSelectCategoryTitle.setFont(new java.awt.Font("Ubuntu Medium", 0, 17)); // NOI18N
        jLabelSelectCategoryTitle.setText("Select Category:");

        jLabelDetailsTableTitle.setFont(new java.awt.Font("Ubuntu Medium", 0, 17)); // NOI18N
        jLabelDetailsTableTitle.setText("Details:");

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonViewFullDetail.setText("View full detail");
        jButtonViewFullDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewFullDetailActionPerformed(evt);
            }
        });

        jButtonReadFromFile.setText("Read from file");
        jButtonReadFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadFromFileActionPerformed(evt);
            }
        });

        jButtonSaveAsFile.setText("Save as file");
        jButtonSaveAsFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveAsFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainPageLayout = new javax.swing.GroupLayout(jPanelMainPage);
        jPanelMainPage.setLayout(jPanelMainPageLayout);
        jPanelMainPageLayout.setHorizontalGroup(
            jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainPageLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelMainPageLayout.createSequentialGroup()
                                .addComponent(jButtonViewFullDetail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonReadFromFile))
                            .addGroup(jPanelMainPageLayout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainPageLayout.createSequentialGroup()
                                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainPageLayout.createSequentialGroup()
                                .addComponent(jButtonSaveAsFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addComponent(jLabelSystemName)
                    .addGroup(jPanelMainPageLayout.createSequentialGroup()
                        .addComponent(jLabelSelectCategoryTitle)
                        .addGap(59, 59, 59)
                        .addComponent(jLabelDetailsTableTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMainPageLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneDetailsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelMainPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAdd, jButtonDelete, jButtonEdit, jButtonExit, jButtonReadFromFile, jButtonSaveAsFile, jButtonSearch, jButtonViewFullDetail});

        jPanelMainPageLayout.setVerticalGroup(
            jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSystemName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonDelete)
                        .addComponent(jButtonAdd))
                    .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSearch)
                        .addComponent(jButtonEdit)))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExit)
                        .addComponent(jButtonSaveAsFile))
                    .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonViewFullDetail)
                        .addComponent(jButtonReadFromFile)))
                .addGap(49, 49, 49)
                .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelectCategoryTitle)
                    .addComponent(jLabelDetailsTableTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(jScrollPaneDetailsDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanelMainPage, "card2");

        details.setEditable(false);
        jScrollPane3.setViewportView(details);

        jButtonBackToMainMenu.setText("Back to main menu");
        jButtonBackToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackToMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchResultLayout = new javax.swing.GroupLayout(jPanelSearchResult);
        jPanelSearchResult.setLayout(jPanelSearchResultLayout);
        jPanelSearchResultLayout.setHorizontalGroup(
            jPanelSearchResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelSearchResultLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jButtonBackToMainMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchResultLayout.setVerticalGroup(
            jPanelSearchResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBackToMainMenu)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanelSearchResult, "card3");

        jPanelDetailsForm.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Casual Acquaintance Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16))); // NOI18N

        jLabelName.setText("Name:");

        jLabelMobile.setText("Mobile No:");

        jLabelEmail.setText("Email:");

        jLabelOtherInformation1.setText("First meeting time & location:");

        jLabel8OtherInformation2.setText("First meeting CIrcumstances:");

        jLabelOtherInformation3.setText("Other useful information:");

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        otherInformationField2.setColumns(20);
        otherInformationField2.setRows(5);
        otherInformationField2.setAutoscrolls(false);
        jScrollPane4.setViewportView(otherInformationField2);

        otherInformationField3.setColumns(20);
        otherInformationField3.setRows(5);
        jScrollPane5.setViewportView(otherInformationField3);

        jButtonConfirmDetails.setText("Add");
        jButtonConfirmDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmDetailsActionPerformed(evt);
            }
        });

        otherInformationField1.setColumns(20);
        otherInformationField1.setRows(5);
        jScrollPane6.setViewportView(otherInformationField1);

        jButtonCancleDetails.setText("Cancel");
        jButtonCancleDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancleDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDetailsFormLayout = new javax.swing.GroupLayout(jPanelDetailsForm);
        jPanelDetailsForm.setLayout(jPanelDetailsFormLayout);
        jPanelDetailsFormLayout.setHorizontalGroup(
            jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDetailsFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOtherInformation3)
                    .addComponent(jLabel8OtherInformation2)
                    .addComponent(jLabelOtherInformation1)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelMobile)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDetailsFormLayout.createSequentialGroup()
                        .addComponent(jButtonConfirmDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancleDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addGap(132, 132, 132)))
                .addContainerGap())
        );
        jPanelDetailsFormLayout.setVerticalGroup(
            jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelMobile)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOtherInformation1)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDetailsFormLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel8OtherInformation2))
                    .addGroup(jPanelDetailsFormLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOtherInformation3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDetailsFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmDetails)
                    .addComponent(jButtonCancleDetails))
                .addGap(3, 3, 3))
        );

        getContentPane().add(jPanelDetailsForm, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        int index = jListAcquaintancesCatagory.getSelectedIndex();
        if(index<0){
            JOptionPane.showMessageDialog(mg, "Select a category!");
            return;
        }
        jPanelMainPage.setVisible(false);
        jPanelDetailsForm.setVisible(true);
        x = index;
        flag = true;
        dflag = false;
        setDescription();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListAcquaintancesCatagory.getSelectedIndex();
        if(index<0){
            JOptionPane.showMessageDialog(mg, "Select a category!");
            return;
        }
        int tindex = jXTableDetialsDisplay.getSelectedRow();
        if(tindex < 0){
            JOptionPane.showMessageDialog(mg, "Select an entry!");
            return;
        }
        int n = JOptionPane.showConfirmDialog(
            mg,
            "Are you sure you want to delete this?",
            "Confirm",
            JOptionPane.YES_NO_OPTION);
        if(n==0){
            a.get(index).remove(tindex);
            JOptionPane.showMessageDialog(mg, "Successfully Deleted");
            mg.setUpTableData();
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String s = (String)JOptionPane.showInputDialog(
            mg,
            "Enter name: ",
            "Input",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            "");
        if(s==null)
            return;
        jPanelMainPage.setVisible(false);
        jPanelSearchResult.setVisible(true);
        str = s;
        details.setContentType( "text/html" );
        runn();
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jListAcquaintancesCatagoryValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListAcquaintancesCatagoryValueChanged
        setUpTableData();
    }//GEN-LAST:event_jListAcquaintancesCatagoryValueChanged

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        int index = jListAcquaintancesCatagory.getSelectedIndex();
        if(index<0){
            JOptionPane.showMessageDialog(mg, "Select a category!");
            return;
        }
        int tindex = jXTableDetialsDisplay.getSelectedRow();
        if(tindex < 0){
            JOptionPane.showMessageDialog(mg, "Select an entry!");
            return;
        }
        num = tindex;
        flag = false;
        dflag = false;
        x = index;
        setDescription();
        jPanelMainPage.setVisible(false);
        jPanelDetailsForm.setVisible(true);
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonViewFullDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewFullDetailActionPerformed
        int index = jListAcquaintancesCatagory.getSelectedIndex();
        if(index<0){
            JOptionPane.showMessageDialog(mg, "Select a category!");
            return;
        }
        int tindex = jXTableDetialsDisplay.getSelectedRow();
        if(tindex < 0){
            JOptionPane.showMessageDialog(mg, "Select an entry!");
            return;
        }
        num = tindex;
        flag = false;
        x = index;
        jPanelMainPage.setVisible(false);
        jPanelDetailsForm.setVisible(true);
        dflag = true;
        setDescription();
    }//GEN-LAST:event_jButtonViewFullDetailActionPerformed

    public void runn(){
        String s = "<html> <b>Search results:</b><br>Found!<br><br>Acquaintance Details: <br>";
        int j = 0;
        for(int i = 0; i < a.get(0).size(); i++){
            if(a.get(0).get(i).getName().matches(str)){
                j++;
                PersonalFriends perF = (PersonalFriends)a.get(0).get(i);
                if(j==1){
                    s = s.concat("<br>I. Personal Friends<br>");
                }
                s = s.concat(j + ". Name: " + perF.getName() + "<br>");
                s = s.concat("Mobile No: " + perF.getMobileNo() + "<br>");
                s = s.concat("Email: " + perF.getEmail() + "<br>");
                s = s.concat("Specific events: " + perF.getEvents() + "<br>");
                s = s.concat("First Acquaintance context: " + perF.getAContext() + "<br>");
                s = s.concat("First Acquaintance date: " + perF.getADate() + "<br>");
            }
        }
        j = 0;
        for(int i = 0; i < a.get(1).size(); i++){
            if(a.get(1).get(i).getName().matches(str)){
                j++;
                Relatives rel = (Relatives)a.get(1).get(i);
                if(j==1){
                    s = s.concat("<br>II. Relatives<br>");
                }
                s = s.concat(j + ". Name: " + rel.getName() + "<br>");
                s = s.concat("Mobile No: " + rel.getMobileNo() + "<br>");
                s = s.concat("Email: " + rel.getEmail() + "<br>");
                s = s.concat("Relatives Birthday: " + rel.getBDate() + "<br>");
                s = s.concat("Last met date: " + rel.getLDate() + "<br>");
            }
        }
        j = 0;
        for(int i = 0; i < a.get(2).size(); i++){
            if(a.get(2).get(i).getName().matches(str)){
                j++;
                ProfessionalFriends proF = (ProfessionalFriends)a.get(2).get(i);
                if(j==1){
                    s = s.concat("<br>III. Professional Friends<br>");
                }
                s = s.concat(j + ". Name: " + proF.getName() + "<br>");
                s = s.concat("Mobile No: " + proF.getMobileNo() + "<br>");
                s = s.concat("Email: " + proF.getEmail() + "<br>");
                s = s.concat("Common Interests: " + proF.getCommonInterests() + "<br>");
            }
        }
        j = 0;
        for(int i = 0; i < a.get(3).size(); i++){
            if(a.get(3).get(i).getName().matches(str)){
                j++;
                CasualAcquaintances ca = (CasualAcquaintances)a.get(3).get(i);
                if(j==1){
                    s = s.concat("<br>IV. Casual Acquaintances<br>");
                }
                s = s.concat(j + ". Name: " + ca.getName() + "<br>");
                s = s.concat("Mobile No: " + ca.getMobileNo() + "<br>");
                s = s.concat("Email: " + ca.getEmail() + "<br>");
                s = s.concat("First met location & time: " + ca.getWhenWhere() + "<br>");
                s = s.concat("First met circumstances: " + ca.getCircumstances() + "<br>");
                s = s.concat("Other useful information: " + ca.getOtherInfo() + "<br>");
            }
        }
        if(s.matches("<html> <b>Search results:</b><br>Found!<br><br>Acquaintance Details: <br>")){
            s  = "<html>No result found</html>";
        }
        else{
            s = s.concat("</html>");
        }
        details.setText(s);
    }
    
    private void jButtonReadFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadFromFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                temp = (ArrayList<ArrayList<Acquaintances>>)SerializationUtil.deserialize(selectedFile);
            }
            catch (ClassNotFoundException | IOException e) {
                JOptionPane.showMessageDialog(mg, "Error");
                return;
            }
        }
        else{
            return;
        }
        try{
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < temp.get(i).size(); j++){
                    a.get(i).add(temp.get(i).get(j));
                }
            }
        }
        catch(Exception e){

        }
        mg.setUpTableData();
    }//GEN-LAST:event_jButtonReadFromFileActionPerformed

    private void jButtonSaveAsFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveAsFileActionPerformed
        String s = (String)JOptionPane.showInputDialog(
            mg,
            "Enter file name: (*.ser)",
            "Input",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            "output.ser");
        if(s==null)
        return;
        if(!s.endsWith(".ser")){
            JOptionPane.showMessageDialog(mg, "File name should end with .ser");
            return;
        }
        File[] fileList = (new File(".")).listFiles((File pathname) -> pathname.getName().endsWith(".ser"));
        boolean flag = false;
        for(File f : fileList){
            if(f.getName().matches(s)){
                flag = true;
            }
        }
        if(flag){
            int q = JOptionPane.showConfirmDialog(mg, s + " already exists:\nAre you sure you want to overwrite?");
            if(q!=0)
            return;
        }
        try {
            SerializationUtil.serialize(a, s);
        } catch (IOException e) {
            return;
        }
        JOptionPane.showMessageDialog(mg, s + " saved successfully");
    }//GEN-LAST:event_jButtonSaveAsFileActionPerformed

    private void jButtonBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToMainMenuActionPerformed
        jPanelSearchResult.setVisible(false);
        jPanelMainPage.setVisible(true);
    }//GEN-LAST:event_jButtonBackToMainMenuActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

        public boolean MobileNoChecker(String str){
        int x;
        if(str.isEmpty() || str.length() < 6 || str.length() > 15)
            return false;
        for(int j = 0 ; j < str.length() ; j++)
        {
            x = (int)str.charAt(j);
            if( x < 48 || x > 57 )
            return false;    
        }
        return true;
    }
    
    public boolean validDate(String Date){
        String pattern = "[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(Date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(!m.find()){
            JOptionPane.showMessageDialog(mg, "Enter a valid date");
            return false;
        }
        else
            return true;
    }
        
    private void jButtonConfirmDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmDetailsActionPerformed
        dflag = true;
        String Name = nameField.getText();
        if(Name.isEmpty()){
            JOptionPane.showMessageDialog(mg, "Enter a name");
            return;
        }
        String Mobile = mobileField.getText();
        if(!MobileNoChecker(Mobile)){
            JOptionPane.showMessageDialog(mg, "Enter a valid mobile number (6-15 digits)");
            return;
        }
        String Email = emailField.getText();
        if(!Email.contains("@")){
            JOptionPane.showMessageDialog(mg, "Enter a valid email");
            return;
        }
        String One,Two,Three;
        switch(x){
            case 0: //perF
                One = otherInformationField1.getText();
                if(One.isEmpty() || One.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Two = otherInformationField2.getText();
                if(Two.isEmpty() || Two.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Three = otherInformationField3.getText();
                if(!validDate(Three)){
                    return;
                }
                if(Three.isEmpty() || Three.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                PersonalFriends perF;
                if(flag)
                    perF = new PersonalFriends();
                else
                    perF = (PersonalFriends)a.get(x).get(num);
                perF.setName(Name);
                perF.setMobileNo(Mobile);
                perF.setEmail(Email);
                perF.setEvents(One);
                perF.setAContext(Two);
                perF.setADate(Three);
                if(flag)
                    a.get(x).add(perF);
                    //this.a.get(x).add(perF);
                break;
            case 1: //rel
                One = otherInformationField1.getText();
                if(One.isEmpty() || One.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if(!validDate(One)){
                    return;
                }
                Two = otherInformationField2.getText();
                if(Two.isEmpty() || Two.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                if(!validDate(Two)){
                    return;
                }
                Relatives rel;
                if(flag)
                    rel = new Relatives();
                else
                    rel = (Relatives)a.get(x).get(num);
                rel.setName(Name);
                rel.setMobileNo(Mobile);
                rel.setEmail(Email);
                rel.setBDate(One);
                rel.setLDate(Two);
                if(flag)
                    a.get(x).add(rel);
                break;
            case 2: //proF
                One = otherInformationField1.getText();
                if(One.isEmpty() || One.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                ProfessionalFriends proF;
                if(flag)
                    proF = new ProfessionalFriends();
                else
                    proF = (ProfessionalFriends)a.get(x).get(num);
                proF.setName(Name);
                proF.setMobileNo(Mobile);
                proF.setEmail(Email);
                proF.setCommonInterests(One);
                if(flag)
                    a.get(x).add(proF);
                break;
                case 3: //ca
                One = otherInformationField1.getText();
                if(One.isEmpty() || One.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Two = otherInformationField2.getText();
                if(Two.isEmpty() || Two.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                Three = otherInformationField3.getText();
                if(Three.isEmpty() || Three.length() > 300){
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return;
                }
                CasualAcquaintances ca;
                if(flag)
                    ca = new CasualAcquaintances();
                else
                    ca = (CasualAcquaintances)a.get(x).get(num);
                ca.setName(Name);
                ca.setMobileNo(Mobile);
                ca.setEmail(Email);
                ca.setWhenWhere(One);
                ca.setCircumstances(Two);
                ca.setOtherInfo(Three);
                if(flag)
                    a.get(x).add(ca);
                break;
            default:
                break;
        }
        jPanelMainPage.setVisible(true);
        jPanelDetailsForm.setVisible(false);
        mg.setUpTableData();
    }//GEN-LAST:event_jButtonConfirmDetailsActionPerformed

    private void jButtonCancleDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancleDetailsActionPerformed
        jPanelMainPage.setVisible(true);
        jPanelDetailsForm.setVisible(false);
    }//GEN-LAST:event_jButtonCancleDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(MUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane details;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBackToMainMenu;
    private javax.swing.JButton jButtonCancleDetails;
    private javax.swing.JButton jButtonConfirmDetails;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReadFromFile;
    private javax.swing.JButton jButtonSaveAsFile;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonViewFullDetail;
    private javax.swing.JLabel jLabel8OtherInformation2;
    private javax.swing.JLabel jLabelDetailsTableTitle;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelMobile;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelOtherInformation1;
    private javax.swing.JLabel jLabelOtherInformation3;
    private javax.swing.JLabel jLabelSelectCategoryTitle;
    private javax.swing.JLabel jLabelSystemName;
    private javax.swing.JList jListAcquaintancesCatagory;
    private javax.swing.JPanel jPanelDetailsForm;
    private javax.swing.JPanel jPanelMainPage;
    private javax.swing.JPanel jPanelSearchResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPaneDetailsDisplay;
    private org.jdesktop.swingx.JXTable jXTableDetialsDisplay;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextArea otherInformationField1;
    private javax.swing.JTextArea otherInformationField2;
    private javax.swing.JTextArea otherInformationField3;
    // End of variables declaration//GEN-END:variables
}