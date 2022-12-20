/*Paquete de Trabajo*/
package Pantallas;

//Importaciones necesarias
import Beans.Empleado;
import Beans.Jubilado;
import Beans.Persona;

import Logica.LogicaEmpleado;
import Logica.LogicaJubilado;
import Logica.LogicaPersona;

/**
 * Clase Secundaria
 * @author mario
 */
public class Formulario2 extends javax.swing.JDialog {

    public Formulario2(java.awt.Frame parent, boolean modal, Persona persona, LogicaPersona logicP) {
        super(parent, modal);
        initComponents();
        data = (BaseDatos) parent; //Inicializacion JFrame
        
        this.logica_ps = logicP; //Transferencia de LogicaPersona
        this.ps = persona; //Transferencia de Persona
        
        txtNombrePersona.setText(ps.getNombre()); //Campo texto dibujado
        txtEdadPersona.setText(Integer.toString(ps.getEdad())); //Campo texto dibujado
        
        /**
         * JTabbedPane
         */
        jTabbedPaneModificaDatos.setSelectedIndex(0);
        jTabbedPaneModificaDatos.setEnabledAt(0, true);
        jTabbedPaneModificaDatos.setEnabledAt(1, false);
        jTabbedPaneModificaDatos.setEnabledAt(2, false);
        /*JTabbedPane*/
    }
    public Formulario2(java.awt.Frame parent, boolean modal, Empleado empleado, LogicaEmpleado logicE) {
        super(parent, modal);
        initComponents();
        data = (BaseDatos) parent; //Inicializacion JFrame
        
        
        this.logica_pl = logicE; //Transferencia de LogicaEmpleado
        this.pl = empleado; //Transferencia de Empleado
        
        txtNombreEmpleado.setText(pl.getNombre()); //Campo texto dibujado
        txtEdadEmpleado.setText(Integer.toString(pl.getEdad())); //Campo texto dibujado
        txtSalarioEmpleado.setText(Float.toString(pl.getSalario())); //Campo texto dibujado
        txtCiudadEmpleado.setText(pl.getCiudad()); //Campo texto dibujado
        
        /**
         * JTabbedPane
         */
        jTabbedPaneModificaDatos.setSelectedIndex(1);
        jTabbedPaneModificaDatos.setEnabledAt(0, false);
        jTabbedPaneModificaDatos.setEnabledAt(1, true);
        jTabbedPaneModificaDatos.setEnabledAt(2, false);
        /*JTabbedPane*/
    }
    public Formulario2(java.awt.Frame parent, boolean modal, Jubilado jubilado, LogicaJubilado logicJ) {
        super(parent, modal);
        initComponents();
        data = (BaseDatos) parent; //Inicializacion JFrame
        
        
        this.logica_jb = logicJ; //Transferencia de LogicaJubilado
        this.jb = jubilado; //Transferencia de Jubilado
        
        txtNombreJubilado.setText(jb.getNombre()); //Campo texto dibujado
        txtEdadJubilado.setText(Integer.toString(jb.getEdad())); //Campo texto dibujado
        txtPensionJubilado.setText(Float.toString(jb.getPension())); //Campo texto dibujado
        txtSexoJubilado.setText(jb.getSexo()); //Campo texto dibujado
        
        /**
         * JTabbedPane
         */
        jTabbedPaneModificaDatos.setSelectedIndex(2);
        jTabbedPaneModificaDatos.setEnabledAt(0, false);
        jTabbedPaneModificaDatos.setEnabledAt(1, false);
        jTabbedPaneModificaDatos.setEnabledAt(2, true);
        /*JTabbedPane*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        jTabbedPaneModificaDatos = new javax.swing.JTabbedPane();
        PantallaPersona = new javax.swing.JPanel();
        lblNombrePersona = new javax.swing.JLabel();
        txtNombrePersona = new javax.swing.JTextField();
        lblEdadPersona = new javax.swing.JLabel();
        txtEdadPersona = new javax.swing.JTextField();
        PantallaEmpleado = new javax.swing.JPanel();
        lblNombreEmpleado = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        lblEdadEmpleado = new javax.swing.JLabel();
        txtEdadEmpleado = new javax.swing.JTextField();
        lblSalarioEmpleado = new javax.swing.JLabel();
        txtSalarioEmpleado = new javax.swing.JTextField();
        lblCiudadEmpleado = new javax.swing.JLabel();
        txtCiudadEmpleado = new javax.swing.JTextField();
        PantallaJubilado = new javax.swing.JPanel();
        lblNombreJubilado = new javax.swing.JLabel();
        txtNombreJubilado = new javax.swing.JTextField();
        lblEdadJubilado = new javax.swing.JLabel();
        txtEdadJubilado = new javax.swing.JTextField();
        lblPensionJubilado = new javax.swing.JLabel();
        txtPensionJubilado = new javax.swing.JTextField();
        lblSexoJubilado = new javax.swing.JLabel();
        txtSexoJubilado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnInicio.setText("BASE DE DATOS");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        lblNombrePersona.setText("Nombre:");

        lblEdadPersona.setText("Edad:");

        javax.swing.GroupLayout PantallaPersonaLayout = new javax.swing.GroupLayout(PantallaPersona);
        PantallaPersona.setLayout(PantallaPersonaLayout);
        PantallaPersonaLayout.setHorizontalGroup(
            PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEdadPersona)
                    .addComponent(lblNombrePersona))
                .addGap(35, 35, 35)
                .addGroup(PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadPersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PantallaPersonaLayout.setVerticalGroup(
            PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePersona)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadPersona)
                    .addComponent(txtEdadPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jTabbedPaneModificaDatos.addTab("Persona", PantallaPersona);

        lblNombreEmpleado.setText("Nombre:");

        lblEdadEmpleado.setText("Edad:");

        lblSalarioEmpleado.setText("Salario:");

        lblCiudadEmpleado.setText("Ciudad:");

        javax.swing.GroupLayout PantallaEmpleadoLayout = new javax.swing.GroupLayout(PantallaEmpleado);
        PantallaEmpleado.setLayout(PantallaEmpleadoLayout);
        PantallaEmpleadoLayout.setHorizontalGroup(
            PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                        .addComponent(lblEdadEmpleado)
                        .addGap(35, 35, 35)
                        .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                            .addComponent(lblNombreEmpleado)
                            .addGap(35, 35, 35)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCiudadEmpleado)
                                .addComponent(lblSalarioEmpleado))
                            .addGap(35, 35, 35)
                            .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCiudadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PantallaEmpleadoLayout.setVerticalGroup(
            PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEmpleado)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEmpleado)
                    .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalarioEmpleado)
                    .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudadEmpleado)
                    .addComponent(txtCiudadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPaneModificaDatos.addTab("Empleado", PantallaEmpleado);

        lblNombreJubilado.setText("Nombre:");

        lblEdadJubilado.setText("Edad:");

        lblPensionJubilado.setText("Pension:");

        lblSexoJubilado.setText("Sexo:");

        javax.swing.GroupLayout PantallaJubiladoLayout = new javax.swing.GroupLayout(PantallaJubilado);
        PantallaJubilado.setLayout(PantallaJubiladoLayout);
        PantallaJubiladoLayout.setHorizontalGroup(
            PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                        .addComponent(lblEdadJubilado)
                        .addGap(35, 35, 35)
                        .addComponent(txtEdadJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                        .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSexoJubilado)
                            .addComponent(lblPensionJubilado))
                        .addGap(35, 35, 35)
                        .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSexoJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPensionJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                        .addComponent(lblNombreJubilado)
                        .addGap(35, 35, 35)
                        .addComponent(txtNombreJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        PantallaJubiladoLayout.setVerticalGroup(
            PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreJubilado)
                    .addComponent(txtNombreJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadJubilado)
                    .addComponent(txtEdadJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPensionJubilado)
                    .addComponent(txtPensionJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoJubilado)
                    .addComponent(txtSexoJubilado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPaneModificaDatos.addTab("Jubilado", PantallaJubilado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneModificaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneModificaDatos)
                .addGap(18, 18, 18)
                .addComponent(btnInicio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        try {
            
            switch (jTabbedPaneModificaDatos.getSelectedIndex()) {
                case 0:
                    ps.setNombre(txtNombrePersona.getText()); //Recogida de dato
                    ps.setEdad(Integer.parseInt(txtEdadPersona.getText())); //Recogida de dato

                    logica_ps.setPersona(ps); //Llamada al metodo
                    break;
                case 1:
                    pl.setNombre(txtNombreEmpleado.getText()); //Recogida de dato
                    pl.setEdad(Integer.parseInt(txtEdadEmpleado.getText())); //Recogida de dato
                    pl.setSalario(Float.parseFloat(txtSalarioEmpleado.getText())); //Recogida de dato
                    pl.setCiudad(txtCiudadEmpleado.getText()); //Recogida de dato

                    logica_pl.setEmpleado(pl); //Llamada al metodo
                    break;
                case 2:
                    jb.setNombre(txtNombreJubilado.getText()); //Recogida de dato
                    jb.setEdad(Integer.parseInt(txtEdadJubilado.getText())); //Recogida de dato
                    jb.setPension(Float.parseFloat(txtPensionJubilado.getText())); //Recogida de dato
                    jb.setSexo(txtSexoJubilado.getText()); //Recogida de dato

                    logica_jb.setJubilado(jb); //Llamada al metodo
                    break;
                default:
            }

            txtNombrePersona.setText(""); //Campo texto vacio
            txtEdadPersona.setText(""); //Campo texto vacio

            txtNombreEmpleado.setText(""); //Campo texto vacio
            txtEdadEmpleado.setText(""); //Campo texto vacio
            txtSalarioEmpleado.setText(""); //Campo texto vacio
            txtCiudadEmpleado.setText(""); //Campo texto vacio

            txtNombreJubilado.setText(""); //Campo texto vacio
            txtEdadJubilado.setText(""); //Campo texto vacio
            txtPensionJubilado.setText(""); //Campo texto vacio
            txtSexoJubilado.setText(""); //Campo texto vacio

        } catch (Exception eo) {}
        
        this.dispose(); //Cerrar Ventana
        data.setVisible(true); //Abrir JFrame
    }//GEN-LAST:event_btnInicioActionPerformed

    /*Inicio de MisVariables*/
    BaseDatos data; //JFrame
    
    Persona ps; //Objeto Persona
    Empleado pl; //Objeto Empleado
    Jubilado jb; //Objeto Jubilado
    
    LogicaPersona logica_ps; //Objeto LogicaPersona
    LogicaEmpleado logica_pl; //Objeto LogicaEmpleado
    LogicaJubilado logica_jb; //Objeto LogicJubilado
    /*Fin de MisVariables*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaEmpleado;
    private javax.swing.JPanel PantallaJubilado;
    private javax.swing.JPanel PantallaPersona;
    private javax.swing.JButton btnInicio;
    private javax.swing.JTabbedPane jTabbedPaneModificaDatos;
    private javax.swing.JLabel lblCiudadEmpleado;
    private javax.swing.JLabel lblEdadEmpleado;
    private javax.swing.JLabel lblEdadJubilado;
    private javax.swing.JLabel lblEdadPersona;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombreJubilado;
    private javax.swing.JLabel lblNombrePersona;
    private javax.swing.JLabel lblPensionJubilado;
    private javax.swing.JLabel lblSalarioEmpleado;
    private javax.swing.JLabel lblSexoJubilado;
    private javax.swing.JTextField txtCiudadEmpleado;
    private javax.swing.JTextField txtEdadEmpleado;
    private javax.swing.JTextField txtEdadJubilado;
    private javax.swing.JTextField txtEdadPersona;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreJubilado;
    private javax.swing.JTextField txtNombrePersona;
    private javax.swing.JTextField txtPensionJubilado;
    private javax.swing.JTextField txtSalarioEmpleado;
    private javax.swing.JTextField txtSexoJubilado;
    // End of variables declaration//GEN-END:variables
}
