import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Nov 14 16:31:39 EET 2018
 */



/**
 * @author andreas
 */
public class DeliveryForm extends JFrame {
    public DeliveryForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - andreas
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();
        textField1 = new JTextField();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        textField2 = new JTextField();
        scrollPane3 = new JScrollPane();
        textArea2 = new JTextArea();
        textField3 = new JTextField();
        scrollPane4 = new JScrollPane();
        textPane2 = new JTextPane();
        textField4 = new JTextField();
        scrollPane5 = new JScrollPane();
        textPane3 = new JTextPane();
        checkBox1 = new JCheckBox();
        scrollPane6 = new JScrollPane();
        textPane4 = new JTextPane();
        textField5 = new JTextField();

        //======== this ========
        setTitle("DELIVERY");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- textPane1 ----
            textPane1.setText("Name:");
            scrollPane1.setViewportView(textPane1);
        }

        //======== scrollPane2 ========
        {

            //---- textArea1 ----
            textArea1.setText("Surname:");
            scrollPane2.setViewportView(textArea1);
        }

        //======== scrollPane3 ========
        {

            //---- textArea2 ----
            textArea2.setText("Email:");
            scrollPane3.setViewportView(textArea2);
        }

        //======== scrollPane4 ========
        {

            //---- textPane2 ----
            textPane2.setText("Address:");
            scrollPane4.setViewportView(textPane2);
        }

        //======== scrollPane5 ========
        {

            //---- textPane3 ----
            textPane3.setText("Member Cart:");
            scrollPane5.setViewportView(textPane3);
        }

        //---- checkBox1 ----
        checkBox1.setText("If you have one");

        //======== scrollPane6 ========
        {

            //---- textPane4 ----
            textPane4.setText("Phone Num:");
            scrollPane6.setViewportView(textPane4);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scrollPane6, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(scrollPane5, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(scrollPane4, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(scrollPane3, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                .addComponent(textField2))
                            .addGap(138, 138, 138))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(62, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(scrollPane2)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkBox1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollPane6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(36, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - andreas
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    private JTextField textField1;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JTextField textField2;
    private JScrollPane scrollPane3;
    private JTextArea textArea2;
    private JTextField textField3;
    private JScrollPane scrollPane4;
    private JTextPane textPane2;
    private JTextField textField4;
    private JScrollPane scrollPane5;
    private JTextPane textPane3;
    private JCheckBox checkBox1;
    private JScrollPane scrollPane6;
    private JTextPane textPane4;
    private JTextField textField5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
