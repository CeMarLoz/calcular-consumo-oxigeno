/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author CesarMatias
 */
public class frmFormulario extends javax.swing.JFrame {

    /**
     * Un sencillo aplicativo para calcular el consumo de oxigeno de acuerdo a
     * ciertos parametros
     *
     * @autor Cesar Martinez
     * @version 1.0
     */
    public frmFormulario() {
        initComponents();

        setTitle("Calcular Consumo Óxigeno - Sanatorio Luz y Vida");
        setLocationRelativeTo(null);
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("o.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lbImage.setIcon(iconoEscalado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        txtlitros = new javax.swing.JTextField();
        txtdesdehora = new javax.swing.JTextField();
        txtdesdeminuto = new javax.swing.JTextField();
        txthastahora = new javax.swing.JTextField();
        txthastaminiuto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        txttotallts = new javax.swing.JTextField();
        txttotalmin = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblmensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        txtlitros.setColumns(5);
        txtlitros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtlitros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlitrosFocusGained(evt);
            }
        });
        txtlitros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlitrosActionPerformed(evt);
            }
        });
        txtlitros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlitrosKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(txtlitros, gridBagConstraints);

        txtdesdehora.setColumns(3);
        txtdesdehora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtdesdehora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdesdehoraFocusGained(evt);
            }
        });
        txtdesdehora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesdehoraActionPerformed(evt);
            }
        });
        txtdesdehora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdesdehoraKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(txtdesdehora, gridBagConstraints);

        txtdesdeminuto.setColumns(3);
        txtdesdeminuto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtdesdeminuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdesdeminutoFocusGained(evt);
            }
        });
        txtdesdeminuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesdeminutoActionPerformed(evt);
            }
        });
        txtdesdeminuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdesdeminutoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        jPanel1.add(txtdesdeminuto, gridBagConstraints);

        txthastahora.setColumns(3);
        txthastahora.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txthastahora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthastahoraFocusGained(evt);
            }
        });
        txthastahora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthastahoraActionPerformed(evt);
            }
        });
        txthastahora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthastahoraKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel1.add(txthastahora, gridBagConstraints);

        txthastaminiuto.setColumns(3);
        txthastaminiuto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txthastaminiuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txthastaminiutoFocusGained(evt);
            }
        });
        txthastaminiuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthastaminiutoActionPerformed(evt);
            }
        });
        txthastaminiuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthastaminiutoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        jPanel1.add(txthastaminiuto, gridBagConstraints);

        jLabel1.setText("Litros:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Desde:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Minuto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Hasta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Hora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Minuto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jLabel8, gridBagConstraints);

        jLabel9.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel10.setText("Total lts:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel11.setText("Resultados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        jPanel1.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel12.setText("Total min:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel12, gridBagConstraints);

        btncalcular.setMnemonic('c');
        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        btncalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btncalcularKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(btncalcular, gridBagConstraints);

        txttotallts.setColumns(6);
        txttotallts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttotallts.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txttotallts.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(txttotallts, gridBagConstraints);

        txttotalmin.setColumns(6);
        txttotalmin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txttotalmin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txttotalmin.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(txttotalmin, gridBagConstraints);

        btnlimpiar.setMnemonic('l');
        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setMnemonic('s');
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 175, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnlimpiar, btnsalir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar)
                    .addComponent(btnsalir)
                    .addComponent(lblmensaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        if (!txtlitros.getText().isEmpty()
                && !txtdesdehora.getText().isEmpty() && !txtdesdeminuto.getText().isEmpty()
                && !txthastahora.getText().isEmpty() && !txthastaminiuto.getText().isEmpty()) {
            NumberFormat formatNumber = NumberFormat.getInstance();
            LocalTime desde = null, hasta = null;

            try {
                desde = LocalTime.of(Integer.parseInt(txtdesdehora.getText()),
                        Integer.parseInt(txtdesdeminuto.getText()));
                hasta = LocalTime.of(Integer.parseInt(txthastahora.getText()),
                        Integer.parseInt(txthastaminiuto.getText()));
            } catch (DateTimeException e) {
                lblmensaje.setText("Hora o Minuto erroneo!");
                return;
            }

            if (desde.isBefore(hasta)) {
                Duration minutos = Duration.between(desde, hasta);
                double litros = (double) (Double.parseDouble(txtlitros.getText()) * minutos.toMinutes());

                txttotalmin.setText(formatNumber.format(minutos.toMinutes()));
                txttotallts.setText(formatNumber.format(litros));
                lblmensaje.setText(null);
            } else {
                txttotalmin.setText(null);
                txttotallts.setText(null);
                lblmensaje.setText("La fecha Desde no puede ser mayor a Hasta!");
            }
        } else {
            txttotalmin.setText(null);
            txttotallts.setText(null);
            lblmensaje.setText("Todos los campos son obligatorios!");
        }
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtlitros.setText(null);
        txtdesdehora.setText(null);
        txtdesdeminuto.setText(null);
        txthastahora.setText(null);
        txthastaminiuto.setText(null);
        txttotalmin.setText(null);
        txttotallts.setText(null);
        lblmensaje.setText(null);
        txtlitros.grabFocus();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txtdesdehoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesdehoraActionPerformed
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_txtdesdehoraActionPerformed

    private void txtdesdeminutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesdeminutoActionPerformed
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_txtdesdeminutoActionPerformed

    private void txthastahoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthastahoraActionPerformed
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_txthastahoraActionPerformed

    private void txthastaminiutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthastaminiutoActionPerformed
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_txthastaminiutoActionPerformed

    private void txtdesdehoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesdehoraKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) { // && evt.getKeyChar() != '\b'
            evt.consume();
        }
    }//GEN-LAST:event_txtdesdehoraKeyTyped

    private void txtdesdeminutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdesdeminutoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdesdeminutoKeyTyped

    private void txthastahoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthastahoraKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txthastahoraKeyTyped

    private void txthastaminiutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthastaminiutoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txthastaminiutoKeyTyped

    private void btncalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncalcularKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btncalcular.doClick();
        }
    }//GEN-LAST:event_btncalcularKeyPressed

    private void txtdesdehoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdesdehoraFocusGained
        ((JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_txtdesdehoraFocusGained

    private void txtdesdeminutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdesdeminutoFocusGained
        ((JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_txtdesdeminutoFocusGained

    private void txthastahoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthastahoraFocusGained
        ((JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_txthastahoraFocusGained

    private void txthastaminiutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txthastaminiutoFocusGained
        ((JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_txthastaminiutoFocusGained

    private void txtlitrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlitrosActionPerformed
        ((Component) evt.getSource()).transferFocus();
    }//GEN-LAST:event_txtlitrosActionPerformed

    private void txtlitrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlitrosFocusGained
        ((JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_txtlitrosFocusGained

    private void txtlitrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlitrosKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }

        if (evt.getKeyChar() == '.' && ((JTextField) evt.getSource()).getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtlitrosKeyTyped

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
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JTextField txtdesdehora;
    private javax.swing.JTextField txtdesdeminuto;
    private javax.swing.JTextField txthastahora;
    private javax.swing.JTextField txthastaminiuto;
    private javax.swing.JTextField txtlitros;
    private javax.swing.JTextField txttotallts;
    private javax.swing.JTextField txttotalmin;
    // End of variables declaration//GEN-END:variables
}
