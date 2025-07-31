/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;
import Climatizacion.*;
import Radio.*;

public class Radio_AC_CAFrm extends javax.swing.JInternalFrame {
    private radio radio;
    private climatizacion climatizacion;
    
    public Radio_AC_CAFrm() {
        initComponents();
        radio = new radio();
        climatizacion = new climatizacion();
        btnFM.setEnabled(false);
        btnAM.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1ActivarRadio = new javax.swing.JButton();
        btnActivarBlue = new javax.swing.JButton();
        btnCalefaccion = new javax.swing.JButton();
        barraControl = new javax.swing.JSlider();
        jblfrecuencia = new javax.swing.JLabel();
        jbltemperatura = new javax.swing.JLabel();
        jblestadoRadio = new javax.swing.JLabel();
        btnActivarAC = new javax.swing.JButton();
        btnAM = new javax.swing.JButton();
        btnFM = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btn1ActivarRadio.setText("activar Radio");
        btn1ActivarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActivarRadioActionPerformed(evt);
            }
        });

        btnActivarBlue.setText("avtivar bluetooth");
        btnActivarBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarBlueActionPerformed(evt);
            }
        });

        btnCalefaccion.setText("Activar Calefaccion");
        btnCalefaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalefaccionActionPerformed(evt);
            }
        });

        barraControl.setMajorTickSpacing(2);
        barraControl.setMaximum(28);
        barraControl.setMinimum(16);
        barraControl.setPaintLabels(true);
        barraControl.setPaintTicks(true);
        barraControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barraControl.setValueIsAdjusting(true);
        barraControl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraControlStateChanged(evt);
            }
        });

        jblfrecuencia.setText("Frecuencia-");

        jbltemperatura.setText("temperartura-");

        jblestadoRadio.setText("radio- Desactivada");

        btnActivarAC.setText("Activar AC");
        btnActivarAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarACActionPerformed(evt);
            }
        });

        btnAM.setText("AM");
        btnAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAMActionPerformed(evt);
            }
        });

        btnFM.setText("FM");
        btnFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1ActivarRadio)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnActivarBlue)
                                    .addGap(50, 50, 50))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAM)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFM)
                                    .addGap(86, 86, 86))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(barraControl, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalefaccion)
                                .addGap(16, 16, 16)
                                .addComponent(btnActivarAC))
                            .addComponent(jbltemperatura)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblfrecuencia)
                            .addComponent(jblestadoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1ActivarRadio)
                    .addComponent(btnCalefaccion)
                    .addComponent(btnActivarAC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barraControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbltemperatura))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnActivarBlue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAM)
                            .addComponent(btnFM))))
                .addGap(18, 18, 18)
                .addComponent(jblfrecuencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblestadoRadio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActivarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActivarRadioActionPerformed
        radio.encender();
        if (btn1ActivarRadio.getText().equals("Encender radio")) {
            jblfrecuencia.setText("Frecuencia- "+ radio.getFrecuencia());
            btn1ActivarRadio.setText("Apagar radio");
            jblestadoRadio.setText("radio- Activado");
            btnAM.setEnabled(true);
            btnFM.setEnabled(true);
        } else {
            btn1ActivarRadio.setText("Encender radio");
            jblestadoRadio.setText("radio- Desactivado");
            jblfrecuencia.setText("Frecuencia-");
            btnAM.setEnabled(false);
            btnFM.setEnabled(false);
        }
    }//GEN-LAST:event_btn1ActivarRadioActionPerformed

    private void btnCalefaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalefaccionActionPerformed
        climatizacion.encender();
        if (btnCalefaccion.getText().equals("Calefaccion Activada")) {
            btnCalefaccion.setText("Calefaccion Desactivada");
            btnActivarAC.setEnabled(false);
            btnActivarAC.setText("AC Activada");
        } else {
            btnCalefaccion.setText("Calefaccion Activada");
            btnActivarAC.setEnabled(true);
            
            
        }
    }//GEN-LAST:event_btnCalefaccionActionPerformed

    private void btnActivarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarACActionPerformed
        climatizacion.encender();
        if (btnActivarAC.getText().equals("AC Activado")) {
            btnCalefaccion.setEnabled(false);
            btnActivarAC.setText("AC Desactivado");
            btnCalefaccion.setText("Calefaccion Activada");
        } else {
            btnActivarAC.setText("AC Activado");
            btnCalefaccion.setEnabled(true);
        }
    }//GEN-LAST:event_btnActivarACActionPerformed

    private void btnActivarBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarBlueActionPerformed
        radio.encender();
        if (btnActivarBlue.getText().equals("Bluetooth Activado")) {
            btnActivarBlue.setText("Bluetooth Desactivado");
        } else {
            btnActivarBlue.setText("Bluetooth Activado");
        }
    }//GEN-LAST:event_btnActivarBlueActionPerformed

    private void barraControlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraControlStateChanged
       jbltemperatura.setText("temperatura- "+barraControl.getValue()+"°C");
    }//GEN-LAST:event_barraControlStateChanged

    private void btnAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAMActionPerformed
        radio.encender();
        jblfrecuencia.setText("Frecuencia- "+radio.cambiarFrecuencia(RadioModo.FM));
    }//GEN-LAST:event_btnAMActionPerformed

    private void btnFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMActionPerformed
        radio.encender();
        jblfrecuencia.setText("Frecuencia- "+radio.cambiarFrecuencia(RadioModo.AM));
    }//GEN-LAST:event_btnFMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider barraControl;
    private javax.swing.JButton btn1ActivarRadio;
    private javax.swing.JButton btnAM;
    private javax.swing.JButton btnActivarAC;
    private javax.swing.JButton btnActivarBlue;
    private javax.swing.JButton btnCalefaccion;
    private javax.swing.JButton btnFM;
    private javax.swing.JLabel jblestadoRadio;
    private javax.swing.JLabel jblfrecuencia;
    private javax.swing.JLabel jbltemperatura;
    // End of variables declaration//GEN-END:variables
}
