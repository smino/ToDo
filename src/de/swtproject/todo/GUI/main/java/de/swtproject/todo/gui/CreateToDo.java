package de.swtproject.todo.GUI.main.java.de.swtproject.todo.gui;

import com.toedter.calendar.JDateChooser;
import de.swtproject.todo.GUI.main.java.de.swtproject.todo.core.IntervalType;
import de.swtproject.todo.GUI.main.java.de.swtproject.todo.core.ToDo;
import de.swtproject.todo.GUI.main.java.de.swtproject.todo.core.database.DatabaseManager;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.sql.SQLException;


public class CreateToDo extends javax.swing.JDialog {

    protected Mainsite mainsite;

    // Variables declaration - do not modify
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel createToDoLabel;
    private JDateChooser dateToStartButton;
    private JDateChooser deadlineButton;
    private javax.swing.JPanel descriptionPanel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox<String> intervalComboBox;
    private javax.swing.JPanel intervalPanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel milestonePanel;
    private javax.swing.JComboBox<String> milestonesOptionsComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JLabel todoCreateLabel;
    // End of variables declaration



    public CreateToDo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        mainpanel = new javax.swing.JPanel();
        createToDoLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        dateToStartButton = new JDateChooser();
        deadlineButton = new JDateChooser();
        submitButton = new javax.swing.JButton();
        titlePanel = new javax.swing.JPanel();
        titleTextField = new javax.swing.JTextField();
        descriptionPanel = new javax.swing.JPanel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        milestonePanel = new javax.swing.JPanel();
        milestonesOptionsComboBox = new javax.swing.JComboBox<>();
        intervalPanel = new javax.swing.JPanel();
        intervalComboBox = new javax.swing.JComboBox<>();
        todoCreateLabel = new javax.swing.JLabel();

        setTitle("Create ToDo");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, mainsite.fontsize));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, mainsite.fontsize));
        submitButton.setText("Submit");
        submitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titlePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null), "Title*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, mainsite.fontsize) ));

        titleTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleTextField)
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        descriptionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder
                (new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color
                        (102, 102, 102), null, null),
                        "Description" , javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Tahoma", 1, mainsite.fontsize) ));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        javax.swing.GroupLayout descriptionPanelLayout = new javax.swing.GroupLayout(descriptionPanel);
        descriptionPanel.setLayout(descriptionPanelLayout);
        descriptionPanelLayout.setHorizontalGroup(
                descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descriptionScrollPane)
        );
        descriptionPanelLayout.setVerticalGroup(
                descriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descriptionScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                                228, Short.MAX_VALUE)
        );

        milestonePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                null, new java.awt.Color(102, 102, 102), null, null),
                "Milestone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font
                        ("Tahoma", 1, mainsite.fontsize) ));

        milestonesOptionsComboBox.setFont(new java.awt.Font("Tahoma", 1, mainsite.fontsize));
        milestonesOptionsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothing Selected" }));
        milestonesOptionsComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                null, new java.awt.Color(102, 102, 102), null, null));

        javax.swing.GroupLayout milestonePanelLayout = new javax.swing.GroupLayout(milestonePanel);
        milestonePanel.setLayout(milestonePanelLayout);
        milestonePanelLayout.setHorizontalGroup(
                milestonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(milestonesOptionsComboBox, 0, 315, Short.MAX_VALUE)
        );
        milestonePanelLayout.setVerticalGroup(
                milestonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(milestonesOptionsComboBox, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        intervalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder
                (javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102),
                        null, null), "Interval", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, mainsite.fontsize) ));

        intervalComboBox.setFont(new java.awt.Font("Tahoma", 1, mainsite.fontsize));
        intervalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nothing Selected" }));
        intervalComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                null, new java.awt.Color(102, 102, 102), null, null));

        javax.swing.GroupLayout intervalPanelLayout = new javax.swing.GroupLayout(intervalPanel);
        intervalPanel.setLayout(intervalPanelLayout);
        intervalPanelLayout.setHorizontalGroup(
                intervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(intervalComboBox, 0, 298, Short.MAX_VALUE)
        );
        intervalPanelLayout.setVerticalGroup(
                intervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(intervalComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        dateToStartButton.setBorder(javax.swing.BorderFactory.createTitledBorder
                (new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                        null, new java.awt.Color(102, 102, 102),
                        null, null), "Date to Start", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, mainsite.fontsize) ));


        deadlineButton.setBorder(javax.swing.BorderFactory.createTitledBorder
                (new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                null, new java.awt.Color(102, 102, 102),
                                null, null), "Deadline", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, mainsite.fontsize) ));


        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
                mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(createToDoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(mainpanelLayout.createSequentialGroup()
                                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(milestonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(7, 7, 7)
                                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(intervalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deadlineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dateToStartButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(24, Short.MAX_VALUE))))
        );
        mainpanelLayout.setVerticalGroup(
                mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(createToDoLabel)
                                .addGap(38, 38, 38)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateToStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(descriptionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(mainpanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(deadlineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(milestonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(intervalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(todoCreateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(todoCreateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        for(IntervalType intervalType : IntervalType.values()){
            intervalComboBox.addItem(
                    String.format("%s%s", intervalType.toString().substring(0,1), intervalType.toString().substring(1).toLowerCase())
            );
        }


        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (dateToStartButton.getDate().before(deadlineButton.getDate())) {
                ToDo todo = ToDo.create(titleTextField.getText());

                todo.setDescription(descriptionTextArea.getText());
                todo.setInterval(IntervalType.valueOf(intervalComboBox.getSelectedItem().toString().toUpperCase()));
                todo.setStart(dateToStartButton.getDate());
                todo.setDeadline(deadlineButton.getDate());

                DatabaseManager.storeToDo(todo);
            } else {
                JDialog diag = new JDialog();
                diag.setTitle("FEHLER!");

                diag.setVisible(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.dispose();
    }
}