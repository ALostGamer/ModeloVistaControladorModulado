/*Paquete de Trabajo*/
package Pantallas;

//Importaciones necesarias
import javax.swing.table.DefaultTableModel;

import Beans.Persona;
import Beans.Empleado;
import Beans.Jubilado;

import Logica.LogicaPersona;
import Logica.LogicaEmpleado;
import Logica.LogicaJubilado;

/**
 * Clase Principal
 * @author mario
 */
public class BaseDatos extends javax.swing.JFrame {

    public BaseDatos() {
        logica_ps = new LogicaPersona(); //Inicializacion LogicaPersona
        logica_pl = new LogicaEmpleado(); //Inicializacion LogicaEmpleado
        logica_jb = new LogicaJubilado(); //Inicializacion LogicaJubilado
        initComponents();
        
        /**
         * DefaultTableModel
         */
        RellenarTablaPersona(logica_ps);
        RellenarTablaEmpleado(logica_pl);
        RellenarTablaJubilado(logica_jb);
        /*DefaultTableModel*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlta = new javax.swing.JButton();
        btnModifica = new javax.swing.JButton();
        jTabbedPaneBBDD = new javax.swing.JTabbedPane();
        PantallaPersona = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatosPersona = new javax.swing.JTable();
        PantallaEmpleado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDatosEmpleado = new javax.swing.JTable();
        PantallaJubilado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableDatosJubilado = new javax.swing.JTable();

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

        jTabbedPaneBBDD.addTab("Persona", PantallaPersona);

        TableDatosEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Salario", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableDatosEmpleado);
        if (TableDatosEmpleado.getColumnModel().getColumnCount() > 0) {
            TableDatosEmpleado.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout PantallaEmpleadoLayout = new javax.swing.GroupLayout(PantallaEmpleado);
        PantallaEmpleado.setLayout(PantallaEmpleadoLayout);
        PantallaEmpleadoLayout.setHorizontalGroup(
            PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        PantallaEmpleadoLayout.setVerticalGroup(
            PantallaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneBBDD.addTab("Empleado", PantallaEmpleado);

        TableDatosJubilado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Pension", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TableDatosJubilado);
        if (TableDatosJubilado.getColumnModel().getColumnCount() > 0) {
            TableDatosJubilado.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout PantallaJubiladoLayout = new javax.swing.GroupLayout(PantallaJubilado);
        PantallaJubilado.setLayout(PantallaJubiladoLayout);
        PantallaJubiladoLayout.setHorizontalGroup(
            PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        PantallaJubiladoLayout.setVerticalGroup(
            PantallaJubiladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaJubiladoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneBBDD.addTab("Jubilado", PantallaJubilado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModifica))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPaneBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneBBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnModifica))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        this.dispose(); //Cerrar Ventana
        
        form = new Formulario(this, true, logica_ps, logica_pl, logica_jb); //Inicializacion JDialog
        form.setVisible(true); //Abrir JDialog
        
        RellenarTablaPersona(logica_ps); //Llamada a metodo
        RellenarTablaEmpleado(logica_pl); //Llamada a metodo
        RellenarTablaJubilado(logica_jb); //Llamada a metodo
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        switch (jTabbedPaneBBDD.getSelectedIndex()) {
            case 0:
            ps = logica_ps.getPersona(TableDatosPersona.getSelectedRow()); //Inicializacion Persona
                forum = new Formulario2(this, true, ps, logica_ps); //Abrir JDialog
                break;
            case 1:
            pl = logica_pl.getEmpleado(TableDatosEmpleado.getSelectedRow()); //Inicializacion Empleado
                forum = new Formulario2(this, true, pl, logica_pl); //Abrir JDialog
                break;
            case 2:
            jb = logica_jb.getJubilado(TableDatosJubilado.getSelectedRow()); //Inicializacion Jubilado
                forum = new Formulario2(this, true, jb, logica_jb); //Abrir JDialog
                break;
            default:
        }
        
        this.dispose(); //Cerrar Ventana
        
        forum.setVisible(true); //Abrir JDialog
        
        
        switch (jTabbedPaneBBDD.getSelectedIndex()) {
            case 0:
        ModificarTablaPersona(logica_ps); //Llamada a metodo
                break;
            case 1:
        ModificarTablaEmpleado(logica_pl); //Llamada a metodo
                break;
            case 2:
        ModificarTablaJubilado(logica_jb); //Llamada a metodo
                break;
            default:
        }
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
    
    
    private void RellenarTablaEmpleado(LogicaEmpleado logic) {  
        this.logica_pl = logic; //Transferencia de LogicaEmpleado
        
        /**
         * DefaultTableModel
         */
        modeloTablaEmpleado = new DefaultTableModel();
        modeloTablaEmpleado.addColumn("NOMBRE");
        modeloTablaEmpleado.addColumn("EDAD");
        modeloTablaEmpleado.addColumn("SALARIO");
        modeloTablaEmpleado.addColumn("CIUDAD");
        /*DefaultTableModel*/    
        
        for (Empleado empleado : logica_pl.getListadoEmpleados()) {
            modeloTablaEmpleado.addRow(empleado.toArrayString(empleado.getNombre(), empleado.getEdad(), empleado.getSalario(), empleado.getCiudad())); //Implementacion de variables
        }
        TableDatosEmpleado.setModel(modeloTablaEmpleado); //Actualizar Base de Datos
    }
    
    private void ModificarTablaEmpleado(LogicaEmpleado logic) {
        this.logica_pl = logic; //Transferencia de LogicaEmpleado
        pl = logica_pl.getEmpleado(TableDatosEmpleado.getSelectedRow()); //Transferencia de Empleado        
        
        modeloTablaEmpleado.setValueAt(pl.getNombre(), TableDatosEmpleado.getSelectedRow(), 0); //Implementacion de variables, primer columna (Base de Datos)
        modeloTablaEmpleado.setValueAt(pl.getEdad(), TableDatosEmpleado.getSelectedRow(), 1); //Implementacion de variables, segunda columna (Base de Datos)
        modeloTablaEmpleado.setValueAt(pl.getSalario(), TableDatosEmpleado.getSelectedRow(), 2); //Implementacion de variables, tercera columna (Base de Datos)
        modeloTablaEmpleado.setValueAt(pl.getCiudad(), TableDatosEmpleado.getSelectedRow(), 3); //Implementacion de variables, cuarta columna (Base de Datos)
        
        TableDatosEmpleado.setModel(modeloTablaEmpleado); //Actualizar Base de Datos
    }
    
    
    private void RellenarTablaJubilado(LogicaJubilado logic) {  
        this.logica_jb = logic; //Transferencia de LogicaJubilado
        
        /**
         * DefaultTableModel
         */
        modeloTablaJubilado = new DefaultTableModel();
        modeloTablaJubilado.addColumn("NOMBRE");
        modeloTablaJubilado.addColumn("EDAD");
        modeloTablaJubilado.addColumn("PENSION");
        modeloTablaJubilado.addColumn("SEXO");
        /*DefaultTableModel*/   
        
        for (Jubilado jubilado : logica_jb.getListadoJubilados()) {
            modeloTablaJubilado.addRow(jubilado.toArrayString(jubilado.getNombre(), jubilado.getEdad(), jubilado.getPension(), jubilado.getSexo())); //Implementacion de variables
        }
        TableDatosJubilado.setModel(modeloTablaJubilado); //Actualizar Base de Datos
    }
    
    private void ModificarTablaJubilado(LogicaJubilado logic) {
        this.logica_jb = logic; //Transferencia de LogicaJubilado
        jb = logica_jb.getJubilado(TableDatosJubilado.getSelectedRow()); //Transferencia de Jubilado        
        
        modeloTablaJubilado.setValueAt(jb.getNombre(), TableDatosJubilado.getSelectedRow(), 0); //Implementacion de variables, primer columna (Base de Datos)
        modeloTablaJubilado.setValueAt(jb.getEdad(), TableDatosJubilado.getSelectedRow(), 1); //Implementacion de variables, segunda columna (Base de Datos)
        modeloTablaJubilado.setValueAt(jb.getPension(), TableDatosJubilado.getSelectedRow(), 2); //Implementacion de variables, tercera columna (Base de Datos)
        modeloTablaJubilado.setValueAt(jb.getSexo(), TableDatosJubilado.getSelectedRow(), 3); //Implementacion de variables, cuarta columna (Base de Datos)
        
        TableDatosJubilado.setModel(modeloTablaJubilado); //Actualizar Base de Datos
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
    DefaultTableModel modeloTablaEmpleado; //DefaultTableModel
    DefaultTableModel modeloTablaJubilado; //DefaultTableModel
    
    Formulario form; //JDialog
    Formulario2 forum; //JDialog
    
    Persona ps; //Objeto Persona
    Empleado pl; //Objeto Empleado
    Jubilado jb; //Objeto Jubilado
    
    LogicaPersona logica_ps; //Objeto LogicaPersona
    LogicaEmpleado logica_pl; //Objeto LogicaEmpleado
    LogicaJubilado logica_jb; //Objeto LogicaJubilado
    /*Fin de MisVariables*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PantallaEmpleado;
    private javax.swing.JPanel PantallaJubilado;
    private javax.swing.JPanel PantallaPersona;
    private javax.swing.JTable TableDatosEmpleado;
    private javax.swing.JTable TableDatosJubilado;
    private javax.swing.JTable TableDatosPersona;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnModifica;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneBBDD;
    // End of variables declaration//GEN-END:variables
}
