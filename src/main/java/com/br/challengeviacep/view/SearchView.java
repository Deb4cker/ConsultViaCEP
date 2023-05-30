package com.br.challengeviacep.view;

import java.awt.*;
import java.awt.event.ActionListener;

public class SearchView extends javax.swing.JFrame {
    public SearchView() {
        initComponents();
    }

    public void showView(){
        this.setVisible(true);
    }

    public String getInputValue(){
        return tfInput.getText();
    }

    public void setLbCep(String text){
        lbCep.setText(text);
    }

    public void setLbLocation(String city, String state){
        lbLocationUf.setText(city + " - " + state);
    }

    public void setLbBairro(String text) {
        lbBairro.setText("Bairro: " + text);
    }

    public void setLbComplemento(String text) {
        lbComplemento.setText("Complemento: " + text);
    }

    public void setLbDDD(String text) {
        lbDDD.setText("DDD: " + text);
    }

    public void setLbGIA(String text) {
        lbGIA.setText("GIA: " + text);
    }

    public void setLbIBGE(String text) {
        lbIBGE.setText("IBGE: " + text);
    }

    public void setLbLogradouro(String text) {
        lbLogradouro.setText("Logradouro: " + text);
    }

    public void setLbSIAFI(String text) {
        lbSIAFI.setText("SIAFI: " + text);
    }

    public void setLbResponseTime(long milliseconds){
        lbResponseTime.setText("Returned in: " + milliseconds + " ms");
    }
    public void setinvalidInput(boolean visible){
        lbInvalidInput.setVisible(visible);
    }

    public void setUniqueCep(boolean visible){
        lbUniqueCep.setVisible(visible);
    }

    public void setNotFound(boolean visible){
        lbNotFound.setVisible(visible);
    }
    public void addActionbtSearch(ActionListener action){
        btSearch.addActionListener(action);
    }

    public void resetResultLabels(){
        lbCep.setText("");
        lbLocationUf.setText("");
        lbBairro.setText("");
        lbComplemento.setText("");
        lbDDD.setText("");
        lbLogradouro.setText("");
        lbIBGE.setText("");
        lbSIAFI.setText("");
        lbGIA.setText("");
        lbResponseTime.setText("");
    }
    private void initComponents() {

        header = new javax.swing.JPanel();
        lbDigiteUmCep = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        tfInput = new javax.swing.JTextField();
        lbConsultaViaCep = new javax.swing.JLabel();
        lbInvalidInput = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        lbLocationUf = new javax.swing.JLabel();
        lbDDD = new javax.swing.JLabel();
        lbIBGE = new javax.swing.JLabel();
        lbSIAFI = new javax.swing.JLabel();
        lbLogradouro = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbGIA = new javax.swing.JLabel();
        lbUniqueCep = new javax.swing.JLabel();
        lbNotFound = new javax.swing.JLabel();
        lbResponseTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDigiteUmCep.setText("Digite um CEP:");
        lbDigiteUmCep.setForeground(Color.WHITE);

        btSearch.setText("Pesquisar");
        btSearch.setBackground(new java.awt.Color(54, 54, 54));
        btSearch.setForeground(Color.WHITE);

        lbConsultaViaCep.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbConsultaViaCep.setText("Consulta ViaCEP");
        lbConsultaViaCep.setForeground(Color.WHITE);

        lbInvalidInput.setForeground(new java.awt.Color(199, 83, 83));
        lbInvalidInput.setText("Digite um CEP válido!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(header);
        header.setLayout(jPanel1Layout);
        header.setBackground(new java.awt.Color(54, 54, 54));
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btSearch)
                                                .addGap(85, 85, 85)
                                                .addComponent(lbInvalidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(tfInput)
                                                        .addComponent(lbDigiteUmCep, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbConsultaViaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(lbDigiteUmCep, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbConsultaViaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btSearch)
                                        .addComponent(lbInvalidInput))
                                .addGap(36, 36, 36))
        );

        lbCep.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbCep.setForeground(Color.WHITE);
        lbCep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCep.setText("");

        lbLocationUf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbLocationUf.setForeground(Color.WHITE);

        lbDDD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDDD.setForeground(Color.WHITE);

        lbIBGE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIBGE.setForeground(Color.WHITE);

        lbSIAFI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSIAFI.setForeground(Color.WHITE);

        lbLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLogradouro.setForeground(Color.WHITE);

        lbBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBairro.setForeground(Color.WHITE);

        lbComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbComplemento.setForeground(Color.WHITE);

        lbGIA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGIA.setForeground(Color.WHITE);

        lbUniqueCep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbUniqueCep.setForeground(new java.awt.Color(199, 83, 83));
        lbUniqueCep.setText("CEP ÚNICO");

        lbNotFound.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNotFound.setForeground(Color.WHITE);
        lbNotFound.setText("Nenhum Resultado encontrado!");

        lbResponseTime.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbResponseTime.setForeground(Color.ORANGE);
        lbResponseTime.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        getContentPane().setBackground(Color.darkGray);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbLocationUf, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lbNotFound))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbIBGE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbSIAFI, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                                                        .addComponent(lbGIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbDDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(147, 147, 147)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lbUniqueCep)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(lbBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(lbComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                                                .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(33, 33, 33))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbResponseTime)
                                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbCep, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbUniqueCep)))
                                        .addComponent(lbLocationUf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbIBGE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbSIAFI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16)
                                                .addComponent(lbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbGIA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(lbNotFound)
                                .addGap(139, 139, 139)
                                .addComponent(lbResponseTime)
                                .addContainerGap())
        );

        pack();
        lbInvalidInput.setVisible(false);
        lbNotFound.setVisible(false);
        lbUniqueCep.setVisible(false);
    }
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel lbDigiteUmCep;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbConsultaViaCep;
    private javax.swing.JLabel lbDDD;
    private javax.swing.JLabel lbGIA;
    private javax.swing.JLabel lbIBGE;
    private javax.swing.JLabel lbInvalidInput;
    private javax.swing.JLabel lbLocationUf;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbNotFound;
    private javax.swing.JLabel lbSIAFI;
    private javax.swing.JLabel lbUniqueCep;
    private javax.swing.JTextField tfInput;
    private javax.swing.JLabel lbResponseTime;
}
