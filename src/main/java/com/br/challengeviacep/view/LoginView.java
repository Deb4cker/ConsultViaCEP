package com.br.challengeviacep.view;

import java.awt.event.ActionListener;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    public void showView(){
        this.setVisible(true);
    }

    public void addActionBtEntrar(ActionListener action){
        btEntrar.addActionListener(action);
    }

    private void initComponents() {

        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        lbWrongInput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbEmail.setText("Email");

        lbPassword.setText("Senha");

        btEntrar.setText("Entrar");

        lbWrongInput.setForeground(new java.awt.Color(255, 0, 0));
        lbWrongInput.setText("Email ou senha Incorretos!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btEntrar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfEmail)
                                                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                        .addComponent(lbWrongInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btEntrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbWrongInput)
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        pack();
        lbWrongInput.setVisible(false);
    }

    public void setLbWrongInput(boolean visible){
        lbWrongInput.setVisible(visible);
    }
    public String getEmailInput(){
        return tfEmail.getText();
    }

    public String getPasswordInput(){
        return tfEmail.getText();
    }

    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbWrongInput;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfEmail;

}

