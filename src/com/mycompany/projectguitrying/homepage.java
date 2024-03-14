
package com.mycompany.projectguitrying;


public class homepage extends javax.swing.JFrame {

    
    public homepage() {
        initComponents();
        

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        QuizChooseCourseButtonGroup = new javax.swing.ButtonGroup();
        Tf1CorrectOptionButtonGroup = new javax.swing.ButtonGroup();
        Tf2CorrectOptionButtonGroup = new javax.swing.ButtonGroup();
        Tf3CorrectOptionButtonGroup = new javax.swing.ButtonGroup();
        QuizTopicChooseButtonGroup = new javax.swing.ButtonGroup();
        clicktostart = new javax.swing.JPanel();
        StartQuizHomeButton = new javax.swing.JButton();
        ClickToStartBottom = new javax.swing.JPanel();
        ClickToStartBottomLabel = new javax.swing.JLabel();
        ClickToStartHeader = new javax.swing.JPanel();
        ClickToStartHeaderLabel = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(50, 0));
        setSize(new java.awt.Dimension(0, 0));

        clicktostart.setBackground(new java.awt.Color(0, 0, 0));
        clicktostart.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 0, 8, 8, new java.awt.Color(0, 0, 0)));

        StartQuizHomeButton.setBackground(new java.awt.Color(255, 205, 0));
        StartQuizHomeButton.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        StartQuizHomeButton.setText("CLICK HERE TO START QUIZ");
        StartQuizHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartQuizHomeButtonActionPerformed(evt);
            }
        });

        ClickToStartBottom.setBackground(new java.awt.Color(255, 255, 105));

        ClickToStartBottomLabel.setFont(new java.awt.Font("Tw Cen MT", 2, 24)); // NOI18N
        ClickToStartBottomLabel.setText("© QUIZ SYSTEM CREATED BY SHAFAY. ALL RIGHTS RESERVED!");

        javax.swing.GroupLayout ClickToStartBottomLayout = new javax.swing.GroupLayout(ClickToStartBottom);
        ClickToStartBottom.setLayout(ClickToStartBottomLayout);
        ClickToStartBottomLayout.setHorizontalGroup(
            ClickToStartBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClickToStartBottomLayout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(ClickToStartBottomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        ClickToStartBottomLayout.setVerticalGroup(
            ClickToStartBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClickToStartBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClickToStartBottomLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClickToStartHeader.setBackground(new java.awt.Color(255, 255, 105));

        ClickToStartHeaderLabel.setBackground(new java.awt.Color(255, 255, 105));
        ClickToStartHeaderLabel.setFont(new java.awt.Font("Tw Cen MT", 3, 36)); // NOI18N
        ClickToStartHeaderLabel.setText("QUIZ!");

        javax.swing.GroupLayout ClickToStartHeaderLayout = new javax.swing.GroupLayout(ClickToStartHeader);
        ClickToStartHeader.setLayout(ClickToStartHeaderLayout);
        ClickToStartHeaderLayout.setHorizontalGroup(
            ClickToStartHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClickToStartHeaderLayout.createSequentialGroup()
                .addGap(679, 679, 679)
                .addComponent(ClickToStartHeaderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClickToStartHeaderLayout.setVerticalGroup(
            ClickToStartHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClickToStartHeaderLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ClickToStartHeaderLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout clicktostartLayout = new javax.swing.GroupLayout(clicktostart);
        clicktostart.setLayout(clicktostartLayout);
        clicktostartLayout.setHorizontalGroup(
            clicktostartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clicktostartLayout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(StartQuizHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ClickToStartBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ClickToStartHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clicktostartLayout.setVerticalGroup(
            clicktostartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clicktostartLayout.createSequentialGroup()
                .addComponent(ClickToStartHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(364, 364, 364)
                .addComponent(StartQuizHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClickToStartBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(clicktostart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clicktostart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeSideButtonActionPerformed
        // TODO add your handling code here:
        new homepage().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_HomeSideButtonActionPerformed


    private void StartQuizSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartQuizSideButtonActionPerformed
        // TODO add your handling code here:
        new QuizRegistration().setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_StartQuizSideButtonActionPerformed


    private void StudentsSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentsSideButtonActionPerformed
        // TODO add your handling code here:
        new StudentsData().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_StudentsSideButtonActionPerformed


    private void AboutUsSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsSideButtonActionPerformed
        // TODO add your handling
        new AboutUs().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_AboutUsSideButtonActionPerformed


    private void TeachersSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeachersSideButtonActionPerformed
        // TODO add your handling code here
        new TeachersData().setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_TeachersSideButtonActionPerformed


    private void ExitSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitSideButtonActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
    }//GEN-LAST:event_ExitSideButtonActionPerformed


    private void StartQuizHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartQuizHomeButtonActionPerformed
        // TODO add your handling
        new QuizRegistration().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_StartQuizHomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton AboutUsSideButton;
    private javax.swing.JPanel AboutUsSideButtonPanel;
    private javax.swing.JPanel ClickToStartBottom;
    private javax.swing.JLabel ClickToStartBottomLabel;
    private javax.swing.JPanel ClickToStartHeader;
    private javax.swing.JLabel ClickToStartHeaderLabel;
    private javax.swing.JButton ExitSideButton;
    private javax.swing.JPanel ExitSideButtonPanel;
    private javax.swing.JButton HomeSideButton;
    private javax.swing.JPanel HomeSideButtonPanel;
    private javax.swing.ButtonGroup QuizChooseCourseButtonGroup;
    private javax.swing.ButtonGroup QuizTopicChooseButtonGroup;
    private javax.swing.JLabel SideBarQuizLabel;
    private javax.swing.JButton StartQuizHomeButton;
    private javax.swing.JButton StartQuizSideButton;
    private javax.swing.JPanel StartQuizSideButtonPanel;
    private javax.swing.JButton StudentsSideButton;
    private javax.swing.JPanel StudentsSideButtonPanel;
    private javax.swing.JButton TeachersSideButton;
    private javax.swing.JPanel TeachersSideButtonPanel;
    private javax.swing.ButtonGroup Tf1CorrectOptionButtonGroup;
    private javax.swing.ButtonGroup Tf2CorrectOptionButtonGroup;
    private javax.swing.ButtonGroup Tf3CorrectOptionButtonGroup;
    private javax.swing.JPanel clicktostart;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
