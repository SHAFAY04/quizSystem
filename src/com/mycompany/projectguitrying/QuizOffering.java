
package com.mycompany.projectguitrying;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author SHAFAY
 */
public class QuizOffering extends javax.swing.JFrame {

    /**
     * Creates new form QuizOffering
     */
    String teacher;
    String student;
    public QuizOffering(String teacher, String student) {
        this.teacher=teacher;
        this.student=student;
        initComponents();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        HomeSideButtonPanel = new javax.swing.JPanel();
        HomeSideButton = new javax.swing.JButton();
        StartQuizSideButtonPanel = new javax.swing.JPanel();
        StartQuizSideButton = new javax.swing.JButton();
        TeachersSideButtonPanel = new javax.swing.JPanel();
        TeachersSideButton = new javax.swing.JButton();
        StudentsSideButtonPanel = new javax.swing.JPanel();
        StudentsSideButton = new javax.swing.JButton();
        AboutUsSideButtonPanel = new javax.swing.JPanel();
        AboutUsSideButton = new javax.swing.JButton();
        SideBarQuizLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        ExitSideButtonPanel = new javax.swing.JPanel();
        ExitSideButton = new javax.swing.JButton();
        ChooseCourse = new javax.swing.JPanel();
        ChooseCourseHeader = new javax.swing.JPanel();
        ChooseCourseHeaderLabel = new javax.swing.JLabel();
        ChooseCourseBottom = new javax.swing.JPanel();
        ChooseCourseBottomLabel = new javax.swing.JLabel();
        PleaseChooseCourseLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        CourseOfferingNextButton = new javax.swing.JButton();
        PleaseChooseCourseComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(255, 255, 105));
        sidebar.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(0, 0, 0)));

        HomeSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        HomeSideButton.setBackground(new java.awt.Color(255, 204, 0));
        HomeSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        HomeSideButton.setText("HOME");
        HomeSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        HomeSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomeSideButtonPanelLayout = new javax.swing.GroupLayout(HomeSideButtonPanel);
        HomeSideButtonPanel.setLayout(HomeSideButtonPanelLayout);
        HomeSideButtonPanelLayout.setHorizontalGroup(
                HomeSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomeSideButtonPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(HomeSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        HomeSideButtonPanelLayout.setVerticalGroup(
                HomeSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeSideButtonPanelLayout.createSequentialGroup()
                                .addContainerGap(11, Short.MAX_VALUE)
                                .addComponent(HomeSideButton)
                                .addGap(15, 15, 15))
        );

        StartQuizSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        StartQuizSideButton.setBackground(new java.awt.Color(255, 205, 0));
        StartQuizSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        StartQuizSideButton.setText("START QUIZ");
        StartQuizSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        StartQuizSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartQuizSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StartQuizSideButtonPanelLayout = new javax.swing.GroupLayout(StartQuizSideButtonPanel);
        StartQuizSideButtonPanel.setLayout(StartQuizSideButtonPanelLayout);
        StartQuizSideButtonPanelLayout.setHorizontalGroup(
                StartQuizSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StartQuizSideButtonPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(StartQuizSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StartQuizSideButtonPanelLayout.setVerticalGroup(
                StartQuizSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StartQuizSideButtonPanelLayout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(StartQuizSideButton)
                                .addGap(14, 14, 14))
        );

        TeachersSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        TeachersSideButton.setBackground(new java.awt.Color(255, 205, 0));
        TeachersSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        TeachersSideButton.setText("TEACHERS");
        TeachersSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        TeachersSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeachersSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TeachersSideButtonPanelLayout = new javax.swing.GroupLayout(TeachersSideButtonPanel);
        TeachersSideButtonPanel.setLayout(TeachersSideButtonPanelLayout);
        TeachersSideButtonPanelLayout.setHorizontalGroup(
                TeachersSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TeachersSideButtonPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(TeachersSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TeachersSideButtonPanelLayout.setVerticalGroup(
                TeachersSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TeachersSideButtonPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(TeachersSideButton)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        StudentsSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        StudentsSideButton.setBackground(new java.awt.Color(255, 205, 0));
        StudentsSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        StudentsSideButton.setText("STUDENTS");
        StudentsSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        StudentsSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentsSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentsSideButtonPanelLayout = new javax.swing.GroupLayout(StudentsSideButtonPanel);
        StudentsSideButtonPanel.setLayout(StudentsSideButtonPanelLayout);
        StudentsSideButtonPanelLayout.setHorizontalGroup(
                StudentsSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudentsSideButtonPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(StudentsSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StudentsSideButtonPanelLayout.setVerticalGroup(
                StudentsSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StudentsSideButtonPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(StudentsSideButton)
                                .addContainerGap(17, Short.MAX_VALUE))
        );

        AboutUsSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        AboutUsSideButton.setBackground(new java.awt.Color(255, 205, 0));
        AboutUsSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        AboutUsSideButton.setText("ABOUT US");
        AboutUsSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        AboutUsSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AboutUsSideButtonPanelLayout = new javax.swing.GroupLayout(AboutUsSideButtonPanel);
        AboutUsSideButtonPanel.setLayout(AboutUsSideButtonPanelLayout);
        AboutUsSideButtonPanelLayout.setHorizontalGroup(
                AboutUsSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AboutUsSideButtonPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(AboutUsSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AboutUsSideButtonPanelLayout.setVerticalGroup(
                AboutUsSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AboutUsSideButtonPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(AboutUsSideButton)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        SideBarQuizLabel.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        SideBarQuizLabel.setText("QUIZ");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        ExitSideButtonPanel.setBackground(new java.awt.Color(255, 204, 0));


        ExitSideButton.setBackground(new java.awt.Color(255, 205, 0));
        ExitSideButton.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        ExitSideButton.setText("EXIT");
        ExitSideButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        ExitSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitSideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExitSideButtonPanelLayout = new javax.swing.GroupLayout(ExitSideButtonPanel);
        ExitSideButtonPanel.setLayout(ExitSideButtonPanelLayout);
        ExitSideButtonPanelLayout.setHorizontalGroup(
                ExitSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ExitSideButtonPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(ExitSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExitSideButtonPanelLayout.setVerticalGroup(
                ExitSideButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ExitSideButtonPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ExitSideButton)
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
                sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HomeSideButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TeachersSideButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StartQuizSideButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StudentsSideButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                                .addContainerGap(65, Short.MAX_VALUE)
                                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(sidebarLayout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(SideBarQuizLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                        .addComponent(AboutUsSideButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitSideButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
                sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sidebarLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(SideBarQuizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(HomeSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StartQuizSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TeachersSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StudentsSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AboutUsSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitSideButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(171, Short.MAX_VALUE))
        );

        ChooseCourse.setBackground(new java.awt.Color(0, 0, 0));
        ChooseCourse.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 0, 8, 8, new java.awt.Color(0, 0, 0)));
        ChooseCourse.setForeground(new java.awt.Color(255, 255, 255));

        ChooseCourseHeader.setBackground(new java.awt.Color(255, 255, 105));

        ChooseCourseHeaderLabel.setBackground(new java.awt.Color(255, 255, 105));
        ChooseCourseHeaderLabel.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        ChooseCourseHeaderLabel.setText("COURSE OFFERING!");

        javax.swing.GroupLayout ChooseCourseHeaderLayout = new javax.swing.GroupLayout(ChooseCourseHeader);
        ChooseCourseHeader.setLayout(ChooseCourseHeaderLayout);
        ChooseCourseHeaderLayout.setHorizontalGroup(
                ChooseCourseHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChooseCourseHeaderLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ChooseCourseHeaderLabel)
                                .addGap(728, 728, 728))
        );
        ChooseCourseHeaderLayout.setVerticalGroup(
                ChooseCourseHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChooseCourseHeaderLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(ChooseCourseHeaderLabel)
                                .addGap(22, 22, 22))
        );

        ChooseCourseBottom.setBackground(new java.awt.Color(255, 255, 105));

        ChooseCourseBottomLabel.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        ChooseCourseBottomLabel.setText("© QUIZ SYSTEM CREATED BY SHAFAY. ALL RIGHTS RESERVED!");

        javax.swing.GroupLayout ChooseCourseBottomLayout = new javax.swing.GroupLayout(ChooseCourseBottom);
        ChooseCourseBottom.setLayout(ChooseCourseBottomLayout);
        ChooseCourseBottomLayout.setHorizontalGroup(
                ChooseCourseBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChooseCourseBottomLayout.createSequentialGroup()
                                .addGap(383, 383, 383)
                                .addComponent(ChooseCourseBottomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(305, 305, 305))
        );
        ChooseCourseBottomLayout.setVerticalGroup(
                ChooseCourseBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChooseCourseBottomLayout.createSequentialGroup()
                                .addComponent(ChooseCourseBottomLabel)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        PleaseChooseCourseLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        PleaseChooseCourseLabel.setForeground(new java.awt.Color(255, 255, 255));
        PleaseChooseCourseLabel.setText("Please choose a course to offer for quiz:");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        CourseOfferingNextButton.setBackground(new java.awt.Color(255, 204, 0));
        CourseOfferingNextButton.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        CourseOfferingNextButton.setText("NEXT!");
        CourseOfferingNextButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        CourseOfferingNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseOfferingNextButtonActionPerformed(evt);
            }
        });

        PleaseChooseCourseComboBox.setBackground(new java.awt.Color(255, 204, 0));
        PleaseChooseCourseComboBox.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PleaseChooseCourseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Database Management System Theory", "Database Management System Lab", "Object Oriented Programming Theory", "Object Oriented Programming Lab", "Operating System Lab", "Operating System Theory", "Software Design and Architecture" }));

        javax.swing.GroupLayout ChooseCourseLayout = new javax.swing.GroupLayout(ChooseCourse);
        ChooseCourse.setLayout(ChooseCourseLayout);
        ChooseCourseLayout.setHorizontalGroup(
                ChooseCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ChooseCourseHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChooseCourseBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ChooseCourseLayout.createSequentialGroup()
                                .addGroup(ChooseCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ChooseCourseLayout.createSequentialGroup()
                                                .addGap(616, 616, 616)
                                                .addComponent(CourseOfferingNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ChooseCourseLayout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(ChooseCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(PleaseChooseCourseLabel)
                                                        .addComponent(PleaseChooseCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChooseCourseLayout.setVerticalGroup(
                ChooseCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChooseCourseLayout.createSequentialGroup()
                                .addComponent(ChooseCourseHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(PleaseChooseCourseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(PleaseChooseCourseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CourseOfferingNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(ChooseCourseBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ChooseCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 1387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sidebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ChooseCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    private void HomeSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        new homepage().setVisible(true);
        setVisible(false);
    }



    private void StartQuizSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new QuizRegistration().setVisible(true);
        setVisible(false);
    }



    private void TeachersSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
        new TeachersData().setVisible(true);
        setVisible(false);
    }



    private void StudentsSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        new StudentsData().setVisible(true);
        setVisible(false);
    }



    private void AboutUsSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling
        new AboutUs().setVisible(true);
        setVisible(false);
    }



    private void ExitSideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        setVisible(false);
    }



    private void CourseOfferingNextButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here
        SelectedCourse= String.valueOf(PleaseChooseCourseComboBox.getSelectedItem());
        new QuestionBank(teacher,student,SelectedCourse).setVisible(true);
        setVisible(false);

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
            java.util.logging.Logger.getLogger(QuizOffering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizOffering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizOffering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizOffering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify
    String SelectedCourse;
    private javax.swing.JButton AboutUsSideButton;
    private javax.swing.JPanel AboutUsSideButtonPanel;
    private javax.swing.JPanel ChooseCourse;
    private javax.swing.JPanel ChooseCourseBottom;
    private javax.swing.JLabel ChooseCourseBottomLabel;
    private javax.swing.JPanel ChooseCourseHeader;
    private javax.swing.JLabel ChooseCourseHeaderLabel;
    private javax.swing.JButton CourseOfferingNextButton;
    private javax.swing.JButton ExitSideButton;
    private javax.swing.JPanel ExitSideButtonPanel;
    private javax.swing.JButton HomeSideButton;
    private javax.swing.JPanel HomeSideButtonPanel;
    private javax.swing.JComboBox<String> PleaseChooseCourseComboBox;
    private javax.swing.JLabel PleaseChooseCourseLabel;
    private javax.swing.JLabel SideBarQuizLabel;
    private javax.swing.JButton StartQuizSideButton;
    private javax.swing.JPanel StartQuizSideButtonPanel;
    private javax.swing.JButton StudentsSideButton;
    private javax.swing.JPanel StudentsSideButtonPanel;
    private javax.swing.JButton TeachersSideButton;
    private javax.swing.JPanel TeachersSideButtonPanel;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel sidebar;
    // End of variables declaration
}
