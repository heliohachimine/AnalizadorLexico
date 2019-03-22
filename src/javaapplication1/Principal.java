/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author helio
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldEntrada = new javax.swing.JTextArea();
        avaliarButton = new javax.swing.JButton();
        abrirButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLinhas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPalavras = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIdentificadores = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldInteiros = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAllChar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCaracteres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSimbolos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analisador Léxico - Hélio,Luiz Fernando e Marília");

        jTextFieldEntrada.setEditable(false);
        jTextFieldEntrada.setColumns(20);
        jTextFieldEntrada.setRows(5);
        jTextFieldEntrada.setEnabled(false);
        jScrollPane2.setViewportView(jTextFieldEntrada);

        avaliarButton.setText("Avaliar");
        avaliarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        abrirButton.setText("Abrir");
        abrirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Estatística:");

        jLabel2.setText("Número de linhas:");

        jTextFieldLinhas.setEditable(false);
        jTextFieldLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLinhasActionPerformed(evt);
            }
        });

        jLabel3.setText("Número de palavras:");

        jTextFieldPalavras.setEditable(false);

        jLabel4.setText("Número de identificadores:");

        jTextFieldIdentificadores.setEditable(false);

        jLabel5.setText("Número de reais e inteiros:");

        jTextFieldInteiros.setEditable(false);

        jLabel7.setText("Número de caracteres com espaço:");

        jTextFieldAllChar.setEditable(false);
        jTextFieldAllChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAllCharActionPerformed(evt);
            }
        });

        jLabel8.setText("Número de caracteres sem espaço:");

        jTextFieldCaracteres.setEditable(false);

        jLabel9.setText("Número de operadores:");

        jTextFieldSimbolos.setEditable(false);

        jLabel10.setText("Identificadores encontrados:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abrirButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avaliarButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldIdentificadores)
                            .addComponent(jTextFieldInteiros)
                            .addComponent(jTextFieldSimbolos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldAllChar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCaracteres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrirButton)
                    .addComponent(avaliarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldAllChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldPalavras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldIdentificadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextFieldInteiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextFieldSimbolos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        String[] textoSeparado = this.separar(jTextFieldEntrada.getText());
        jTextArea1.setText("");
        ArrayList<Indentificador> identificadores = null;
        String[] inteiros;
        String[] reais;
        String[] operadores;
        int tipo;
        for (int i = 0; i < textoSeparado.length; i++) {
            //System.out.println(textoSeparado[i]);
        }
        this.verifica(jTextFieldEntrada.getText());

    }//GEN-LAST:event_avaliarButtonActionPerformed

    private void abrirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirButtonActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int resultado = fc.showOpenDialog(this);
            if (resultado == JFileChooser.CANCEL_OPTION) {
                System.exit(1);
            }
            File fileName = fc.getSelectedFile();
            FileReader input = null;
            try {
                input = new FileReader(fileName);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader bufRead = new BufferedReader(input);
            String linha = null;
            linha = (String) bufRead.readLine();
            jTextFieldEntrada.setText("");
            while (linha != null) {
                jTextFieldEntrada.append("\n" + linha);
                linha = bufRead.readLine();
            }
            bufRead.close();
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_abrirButtonActionPerformed

    private void jTextFieldLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLinhasActionPerformed

    private void jTextFieldAllCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAllCharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAllCharActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }

    public String[] separar(String texto) {
        String[] textoSeparado = texto.split("\\s|\n");
//        System.out.println(Arrays.toString(textoSeparado));
        return textoSeparado;
    }

    public void verifica(String arquivo) {
        ArrayList<Indentificador> identificadores = new ArrayList<Indentificador>();
        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] simbolos = {'+', '-', '*', '/', '>', '<', '='};
        int estado = 0;
        char letra;
        //indicadores de que tipo de caracter
        boolean isLetter;
        boolean isNumber;
        boolean isSymbol;
        //Letra que começa a palavra
        char inicial = ' ';
        //Palavra reconhecida
        String palavra = "";
        //numero de numeros reconhecidos
        int reais = 0;
        //numero de simbolos reconhecidos
        int simbs = 0;
        //numero de caracteres sem espaço
        int caracteres = 0;
        //numero de caracteres com espaço
        int allChar = 0;
        //numero de linhas
        int linhas = 0;
        //numero de palavras
        int palavras = 0;
        int indentificadores = 0;
        for (int i = 0; i < arquivo.length(); i++) {
            letra = arquivo.charAt(i);
//            System.out.println("Letra = "+ letra);
            allChar++;
            //32 numero da tabela ascii de caracteres não imprimiveis
            if (letra > 32) {
                caracteres++;
            }
            //10 numero para \n
            if (letra == 10) {
                linhas++;
            }

            switch (estado) {
                case 0:
                    isLetter = false;
                    for (int aux = 0; aux < letras.length; aux++) {
                        if (letra == letras[aux]) {
                            //System.out.println("Achou uma letra");
                            isLetter = true;
                        }
                    }
                    isNumber = false;
                    for (int aux = 0; aux < numeros.length; aux++) {
                        if (letra == numeros[aux]) {
                            //System.out.println("Achou um numero");
                            isNumber = true;
                        }
                    }
                    isSymbol = false;
                    for (int aux = 0; aux < simbolos.length; aux++) {
                        if (letra == simbolos[aux]) {
                            //System.out.println("Achou um simbolo");
                            isSymbol = true;
                        }
                    }

                    if (isLetter) {
                        //Letra que a palavra começa
                        inicial = letra;
                        palavra = palavra + letra;
                        palavras++;
                        estado = 1;
                    } else if (isNumber) {
                        reais++;
                        estado = 2;
                    } else if (isSymbol) {
                        simbs++;
                        estado = 3;
                    } else {
                        estado = 0;
                    }
                    break;

                case 1:
                    if (letra == ' ' || letra == '\n') {

                        Indentificador id = new Indentificador(palavra);
                        if (!identificadores.contains(id)) {
                            System.out.println("NOVO IDENTIFICADOR: " + id.getNome());
                            jTextArea1.setText(jTextArea1.getText() + id.getNome() + "\n");

                            identificadores.add(id);
                            indentificadores++;
                        }

                        palavra = "";
                        estado = 0;

                    } else {
                        palavra = palavra + letra;
                        estado = 1;
                    }

                    break;

                case 2:
                    isNumber = false;
                    for (int aux = 0; aux < numeros.length; aux++) {
                        if (letra == numeros[aux]) {
                            isNumber = true;
                        }
                    }
                    if (isNumber) {

                        estado = 2;
                    } else if (letra == '.' || letra == ',') {
//                        reais--;
//                        reais++;
                        estado = 5;
                    } else if (letra == ' ' || letra == '\n') {
                        estado = 0;
                    } else {
                        estado = 4;
                    }
                    break;

                case 3:
                    if (letra == ' ' || letra == '\n') {
                        estado = 0;
                    } else {
                        estado = 4;
                    }
                    break;

                case 5:
                    isNumber = false;
                    for (int aux = 0; aux < numeros.length; aux++) {
                        if (letra == numeros[aux]) {
                            isNumber = true;
                        }
                    }
                    if (isNumber) {
                        estado = 5;
                    } else if (letra == ' ' || letra == '\n') {
                        estado = 0;
                    } else {
                        estado = 4;
                    }

            }

        }
        jTextFieldLinhas.setText("" + linhas);
        jTextFieldCaracteres.setText("" + caracteres);
        jTextFieldAllChar.setText("" + allChar);
        jTextFieldInteiros.setText("" + reais);
        jTextFieldSimbolos.setText("" + simbs);
        jTextFieldPalavras.setText("" + palavras);
        jTextFieldIdentificadores.setText("" + indentificadores);
        System.out.println("linhas: " + linhas);
        System.out.println("caracteres sem espaço: " + caracteres);
        System.out.println("caracteres com espaço: " + allChar);
        System.out.println("palavras: " + palavras);
        System.out.println("inteiros: " + reais);
        System.out.println("reais: " + reais);
        System.out.println("simbolos: " + simbs);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirButton;
    private javax.swing.JButton avaliarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAllChar;
    private javax.swing.JTextField jTextFieldCaracteres;
    private javax.swing.JTextArea jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldIdentificadores;
    private javax.swing.JTextField jTextFieldInteiros;
    private javax.swing.JTextField jTextFieldLinhas;
    private javax.swing.JTextField jTextFieldPalavras;
    private javax.swing.JTextField jTextFieldSimbolos;
    // End of variables declaration//GEN-END:variables
}
