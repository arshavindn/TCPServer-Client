/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import main.Client;
import main.Helper;

/**
 *
 * @author mozart
 */
public class ClientWindow extends javax.swing.JFrame {

    /**
     * Creates new form Bla
     */
    public ClientWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jobSelectGroup = new javax.swing.ButtonGroup();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        serverNameLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0));
        serverNameField = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0));
        portLabel = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0));
        portField = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(10, 0));
        connectBtn = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 15));
        jLayeredPane4 = new javax.swing.JLayeredPane();
        strProcessRBtn = new javax.swing.JRadioButton();
        exprCalRBtn = new javax.swing.JRadioButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        inputLabel = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(10, 0));
        inputField = new javax.swing.JTextField();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0));
        sendBtn = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        jLayeredPane1 = new javax.swing.JLayeredPane();
        resultLabel = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 0), new java.awt.Dimension(12, 0));
        jScrollPane2 = new javax.swing.JScrollPane();
        answerList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 312));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLayeredPane5.setLayout(new javax.swing.BoxLayout(jLayeredPane5, javax.swing.BoxLayout.LINE_AXIS));

        serverNameLabel.setText("Server");
        jLayeredPane5.add(serverNameLabel);
        jLayeredPane5.add(filler1);

        serverNameField.setMaximumSize(new java.awt.Dimension(200, 27));
        serverNameField.setMinimumSize(new java.awt.Dimension(150, 27));
        jLayeredPane5.add(serverNameField);
        jLayeredPane5.add(filler2);

        portLabel.setText("Port");
        jLayeredPane5.add(portLabel);
        jLayeredPane5.add(filler3);

        portField.setMaximumSize(new java.awt.Dimension(80, 27));
        portField.setMinimumSize(new java.awt.Dimension(80, 27));
        jLayeredPane5.add(portField);
        jLayeredPane5.add(filler4);

        connectBtn.setText("Connect");
        connectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBtnActionPerformed(evt);
            }
        });
        jLayeredPane5.add(connectBtn);

        getContentPane().add(jLayeredPane5);
        getContentPane().add(filler5);

        jLayeredPane4.setLayout(new javax.swing.BoxLayout(jLayeredPane4, javax.swing.BoxLayout.LINE_AXIS));

        jobSelectGroup.add(strProcessRBtn);
        strProcessRBtn.setSelected(true);
        strProcessRBtn.setText("Xử lý chuỗi");
        jLayeredPane4.add(strProcessRBtn);

        jobSelectGroup.add(exprCalRBtn);
        exprCalRBtn.setText("Tính biểu thức");
        jLayeredPane4.add(exprCalRBtn);

        getContentPane().add(jLayeredPane4);

        jInternalFrame1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ((javax.swing.plaf.basic.BasicInternalFrameUI)jInternalFrame1.getUI()).setNorthPane(null);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new javax.swing.BoxLayout(jInternalFrame1.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jInternalFrame3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ((javax.swing.plaf.basic.BasicInternalFrameUI)jInternalFrame3.getUI()).setNorthPane(null);
        jInternalFrame3.setVisible(true);
        jInternalFrame3.getContentPane().setLayout(new javax.swing.BoxLayout(jInternalFrame3.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLayeredPane3.setLayout(new javax.swing.BoxLayout(jLayeredPane3, javax.swing.BoxLayout.Y_AXIS));

        jLayeredPane2.setMaximumSize(new java.awt.Dimension(2147483647, 27));
        jLayeredPane2.setLayout(new javax.swing.BoxLayout(jLayeredPane2, javax.swing.BoxLayout.LINE_AXIS));

        inputLabel.setText("Input:");
        jLayeredPane2.add(inputLabel);
        jLayeredPane2.add(filler6);

        inputField.setMinimumSize(new java.awt.Dimension(60, 27));
        inputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputFieldKeyPressed(evt);
            }
        });
        jLayeredPane2.add(inputField);
        jLayeredPane2.add(filler7);

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });
        jLayeredPane2.add(sendBtn);

        jLayeredPane3.add(jLayeredPane2);
        jLayeredPane3.add(filler8);

        jLayeredPane1.setLayout(new javax.swing.BoxLayout(jLayeredPane1, javax.swing.BoxLayout.LINE_AXIS));

        resultLabel.setText("Result:");
        jLayeredPane1.add(resultLabel);
        resultLabel.getAccessibleContext().setAccessibleName("Result");

        jLayeredPane1.add(filler9);

        jScrollPane2.setMaximumSize(null);
        jScrollPane2.setMinimumSize(null);
        jScrollPane2.setPreferredSize(null);

        answerList.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        answerListModel = new DefaultListModel<String>();
        answerList.setModel(answerListModel);
        answerList.setMaximumSize(null);
        answerList.setMinimumSize(null);
        answerList.setPreferredSize(null);
        jScrollPane2.setViewportView(answerList);

        jLayeredPane1.add(jScrollPane2);

        jLayeredPane3.add(jLayeredPane1);

        jInternalFrame3.getContentPane().add(jLayeredPane3);

        jInternalFrame1.getContentPane().add(jInternalFrame3);

        getContentPane().add(jInternalFrame1);

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        sendToServer();
    }//GEN-LAST:event_sendBtnActionPerformed

    private void connectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectBtnActionPerformed
        try {
            String serverName = serverNameField.getText();
            String port_str = portField.getText();
            if ("".equals(serverName) || "".equals(port_str)) {
                JOptionPane.showMessageDialog(this, "Server and Port can't be empty", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int port = Integer.parseInt(port_str);
                client = new Client(answerListModel);
                // http://stackoverflow.com/questions/6546193/how-to-catch-an-exception-from-a-thread
                Thread.UncaughtExceptionHandler h = (Thread th, Throwable ex) -> {
                    JOptionPane.showMessageDialog(null, "Server is down. Reconnect later.", "Info", JOptionPane.ERROR_MESSAGE);
                    connectBtn.setEnabled(true);
                    serverNameField.setEnabled(true);
                    portField.setEnabled(true);
                };
                client.setUncaughtExceptionHandler(h);
                client.connectToServer(serverName, port);
                client.start();
                connectBtn.setEnabled(false);
                serverNameField.setEnabled(false);
                portField.setEnabled(false);
            }
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(this, "Unknown server", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Can't connect to server", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(ClientWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Port must be a number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_connectBtnActionPerformed

    private void inputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && inputField.isFocusOwner()) {
            sendToServer();
        }
    }//GEN-LAST:event_inputFieldKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientWindow().setVisible(true);
        });
    }

    private Client client;
    private DefaultListModel<String> answerListModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> answerList;
    private javax.swing.JButton connectBtn;
    private javax.swing.JRadioButton exprCalRBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jobSelectGroup;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JTextField serverNameField;
    private javax.swing.JLabel serverNameLabel;
    private javax.swing.JRadioButton strProcessRBtn;
    // End of variables declaration//GEN-END:variables

    private void sendToServer() {
        try {
            int job = 1;
            if (strProcessRBtn.isSelected()) {
                job = 1;
            } else if (exprCalRBtn.isSelected()) {
                job = 2;
            }
            System.out.println(job);
            String strToSend = inputField.getText();
            if ("".equals(strToSend)) {
                JOptionPane.showMessageDialog(this, "Please enter something", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (job == 2 && !Helper.isMathExpr(strToSend)) {
                JOptionPane.showMessageDialog(this, "Invalid math expression", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                List<String> data = new ArrayList<>();
                data.add(String.valueOf(job));
                data.add(strToSend);
                client.sendDataObject(data);
                inputField.setText("");
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            Logger.getLogger(ClientWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "You haven't connect to any server yet", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
