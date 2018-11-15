import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Nov 14 16:04:01 EET 2018
 */



/**
 * @author andreas
 */
public class EpifaniaCafe.java extends JFrame {
    public EpifaniaCafe.java() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - andreas
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - andreas
    // JFormDesigner - End of variables declaration  //GEN-END:variables

public class EpifaniaCafe extends JFrame {
    public EpifaniaCafe() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - andreas
        scrollPane2 = new JScrollPane();
        textPane1 = new JTextPane();
        scrollPane3 = new JScrollPane();
        textPane2 = new JTextPane();
        scrollPane4 = new JScrollPane();
        textPane3 = new JTextPane();
        textField1 = new JTextField();
        textField3 = new JTextField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        scrollPane1 = new JScrollPane();
        textPane4 = new JTextPane();
        textField2 = new JTextField();
        scrollPane5 = new JScrollPane();
        textPane5 = new JTextPane();
        textField4 = new JTextField();
        scrollPane6 = new JScrollPane();
        textPane6 = new JTextPane();
        textField5 = new JTextField();
        scrollPane7 = new JScrollPane();
        textArea1 = new JTextArea();
        textField6 = new JTextField();
        scrollPane8 = new JScrollPane();
        textArea2 = new JTextArea();
        textField7 = new JTextField();
        scrollPane9 = new JScrollPane();
        textPane7 = new JTextPane();
        textField8 = new JTextField();

        //======== this ========
        setTitle("ORDERS");
        Container contentPane = getContentPane();

        //======== scrollPane2 ========
        {

            //---- textPane1 ----
            textPane1.setText("Order:");
            scrollPane2.setViewportView(textPane1);
        }

        //======== scrollPane3 ========
        {

            //---- textPane2 ----
            textPane2.setText("Customer:");
            scrollPane3.setViewportView(textPane2);
        }

        //======== scrollPane4 ========
        {

            //---- textPane3 ----
            textPane3.setText("Daily Profit:");
            scrollPane4.setViewportView(textPane3);
        }

        //---- radioButton1 ----
        radioButton1.setText("ACCEPT ORDER");

        //---- radioButton2 ----
        radioButton2.setText("REJECT ORDER");

        //======== scrollPane1 ========
        {

            //---- textPane4 ----
            textPane4.setText("Name:");
            scrollPane1.setViewportView(textPane4);
        }

        //======== scrollPane5 ========
        {

            //---- textPane5 ----
            textPane5.setText("Surname:");
            scrollPane5.setViewportView(textPane5);
        }

        //======== scrollPane6 ========
        {

            //---- textPane6 ----
            textPane6.setText("Phone Num:");
            scrollPane6.setViewportView(textPane6);
        }

        //======== scrollPane7 ========
        {

            //---- textArea1 ----
            textArea1.setText("Email:");
            scrollPane7.setViewportView(textArea1);
        }

        //======== scrollPane8 ========
        {

            //---- textArea2 ----
            textArea2.setText("Member Cart");
            scrollPane8.setViewportView(textArea2);
        }

        //======== scrollPane9 ========
        {

            //---- textPane7 ----
            textPane7.setText("Address:");
            scrollPane9.setViewportView(textPane7);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                    .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addComponent(radioButton2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(264, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(scrollPane7)
                                .addComponent(scrollPane6)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollPane5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textField5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(87, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(scrollPane9, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField8)))
                            .addContainerGap(208, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textField3, GroupLayout.Alignment.LEADING)
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(radioButton1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioButton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                    .addGap(68, 68, 68))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - andreas
    private JScrollPane scrollPane2;
    private JTextPane textPane1;
    private JScrollPane scrollPane3;
    private JTextPane textPane2;
    private JScrollPane scrollPane4;
    private JTextPane textPane3;
    private JTextField textField1;
    private JTextField textField3;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JScrollPane scrollPane1;
    private JTextPane textPane4;
    private JTextField textField2;
    private JScrollPane scrollPane5;
    private JTextPane textPane5;
    private JTextField textField4;
    private JScrollPane scrollPane6;
    private JTextPane textPane6;
    private JTextField textField5;
    private JScrollPane scrollPane7;
    private JTextArea textArea1;
    private JTextField textField6;
    private JScrollPane scrollPane8;
    private JTextArea textArea2;
    private JTextField textField7;
    private JScrollPane scrollPane9;
    private JTextPane textPane7;
    private JTextField textField8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
}
