/*Paquete de Trabajo*/
package Pantallas;

//Importaciones necesarias
import javax.swing.table.DefaultTableModel;
import Beans.Persona;
import Logica.LogicaPersona;

/**
 * Clase Principal
 * @author mario
 */
public class BaseDatos extends javax.swing.JFrame {

    public BaseDatos() {
        logica_ps = new LogicaPersona(); //Inicializacion LogicaPersona
        initComponents();
        
        /**
         * DefaultTableModel
         */
        RellenarTablaPersona(logica_ps);
        /*DefaultTableModel*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlta = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        PantallaPersona = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatosPersona = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnModifica.setText("MOD");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        TableDatosPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableDatosPersona);
        if (TableDatosPersona.getColumnModel().getColumnCount() > 0) {
            TableDatosPersona.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout PantallaPersonaLayout = new javax.swing.GroupLayout(PantallaPersona);
        PantallaPersona.setLayout(PantallaPersonaLayout);
        PantallaPersonaLayout.setHorizontalGroup(
            PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        PantallaPersonaLayout.setVerticalGroup(
            PantallaPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(btnModifica)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PantallaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModifica))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PantallaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        this.dispose(); //Cerrar Ventana
        
        form = new Formulario(this, true, logica_ps); //Inicializacion JDialog
        form.setVisible(true); //Abrir JDialog
        
        RellenarTablaPersona(logica_ps); //Llamada a metodo
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
    
        ps = logica_ps.getPersona(TableDatosPersona.getSelectedRow()); //Inicializacion Persona
            forum = new Formulario2(this, true, ps, logica_ps); //Abrir JDialog

        
        
        this.dispose(); //Cerrar Ventana
        
        forum.setVisible(true); //Abrir JDialog
        
        ModificarTablaPersona(logica_ps); //Llamada a metodo
    }//GEN-LAST:event_btnModificaActionPerformed

    /*Base de Datos*/
    private void RellenarTablaPersona(LogicaPersona logic) {  
        this.logica_ps = logic; //Transferencia de LogicaPersona
        
        /**
         * DefaultTableModel
         */
        modeloTablaPersona = new DefaultTableModel();
        modeloTablaPersona.addColumn("NOMBRE");
        modeloTablaPersona.addColumn("EDAD");
        /*DefaultTableModel*/        
        
        for (Persona persona : logica_ps.getListadoPersonas()) {
            modeloTablaPersona.addRow(persona.toArrayString(persona.getNombre(), persona.getEdad())); //Implementacion de variables
        }
        TableDatosPersona.setModel(modeloTablaPersona); //Actualizar Base de Datos
    }
    
    private void ModificarTablaPersona(LogicaPersona logic) {
        this.logica_ps = logic; //Transferencia de LogicaPersona
        ps = logica_ps.getPersona(TableDatosPersona.getSelectedRow()); //Transferencia de Persona      
        
        modeloTablaPersona.setValueAt(ps.getNombre(), TableDatosPersona.getSelectedRow(), 0); //Implementacion de variables, primer columna (Base de Datos)
        modeloTablaPersona.setValueAt(ps.getEdad(), TableDatosPersona.getSelectedRow(), 1); //Implementacion de variables, segunda columna (Base de Datos)
        
        TableDatosPersona.setModel(modeloTablaPersona); //Actualizar Base de Datos
    }
    /*Base de Datos*/

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDatos().setVisible(true);
            }
        });
    }

    /*Inicio de MisVariables*/
    DefaultTableModel modeloTablaPersona; //DefaultTableModel
    
    Formulario form; //JDialog
    Formulario2 forum; //JDialog
    
    Persona ps; //Objeto Persona
    
    LogicaPersona logica_ps; //Objeto LogicaPersona
    /*Fin de MisVariables*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaPersona;
    private javax.swing.JTable TableDatosPersona;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnModifica;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
