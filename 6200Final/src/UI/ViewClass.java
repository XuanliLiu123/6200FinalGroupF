/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DaysCare.Organization.Classroom;
import DaysCare.Organization.Group;
import DaysCare.Person.Student;
import DaysCare.Person.Teacher;
import DaysCare.SingletonAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JANFAN
 */
public class ViewClass extends javax.swing.JPanel {

    /**
     * Creates new form ViewClass
     */
    JPanel workArea;
    SingletonAdmin admin;
    Classroom classroom;
    Group group;
    public ViewClass() {
        initComponents();
    }

    ViewClass(JPanel workArea, SingletonAdmin admin, Classroom classroom) {
        initComponents();
        this.workArea=workArea;
        this.admin=admin;
        this.classroom=classroom;
        
        for(Group g:classroom.getGourpList()){
            
            cbGroup.addItem(g.toString());
        }
        populate(classroom.getGourpList().get(0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnViewStudent = new javax.swing.JButton();
        cbGroup = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        btnViewTeacher = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblStudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student name", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblStudentList);

        jLabel1.setText("View Class");

        btnViewStudent.setText("View Student");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        cbGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGroupActionPerformed(evt);
            }
        });

        jLabel2.setText("Teacher's Name:");

        lblTeacher.setText("Null");

        btnViewTeacher.setText("View Teacher");
        btnViewTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTeacherActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnViewTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(lblTeacher)
                    .addComponent(btnViewTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGroupActionPerformed
        // TODO add your handling code here:
        int num=Integer.parseInt(cbGroup.getSelectedItem().toString());
        for(Group g:classroom.getGourpList()){
            if(g.getGourpNum()==num){
                populate(g);
            }
        }
    }//GEN-LAST:event_cbGroupActionPerformed

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        int selectedRowIndex = tblStudentList.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Classroom");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblStudentList.getModel();
        Student s = (Student) model.getValueAt(selectedRowIndex, 0);

        ViewStudent vs = new ViewStudent(workArea, admin, s);
        workArea.add("ViewStudent", vs);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnViewTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTeacherActionPerformed
        // TODO add your handling code here:
        Teacher teacher=this.group.getTeacher();
        ViewTeacher vs = new ViewTeacher(workArea, admin, teacher);
        workArea.add("ViewTeacher", vs);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewTeacherActionPerformed
private void backAction() {
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton btnViewTeacher;
    private javax.swing.JComboBox<String> cbGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JTable tblStudentList;
    // End of variables declaration//GEN-END:variables

    private void populate(Group group) {
        DefaultTableModel model = (DefaultTableModel) tblStudentList.getModel();
        model.setRowCount(0);
        this.group=group;
        lblTeacher.setText(group.getTeacher().toString());
        for (Student s : group.getStudentList()) {
            Object[] row = new Object[2];
            row[0] = s;
            row[1] = "uncomplete";
            model.addRow(row);
        }
    }
}
