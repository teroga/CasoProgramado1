/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Controlador_FRM_Login;


public class FRM_Login extends javax.swing.JFrame {
Controlador_FRM_Login controlador_FRM_Login;
FRM_MenuPrincipal ventanaMenuPrincipal;
FRM_Eleccion frm_eleccion;
    /**
     * Creates new form GUI_MantenimientoLogin
     */
    public FRM_Login(FRM_MenuPrincipal ventanaMenuPrincipal) {
        initComponents();
        controlador_FRM_Login=new Controlador_FRM_Login(frm_eleccion, this);
        agregarEventos();
        this.ventanaMenuPrincipal=ventanaMenuPrincipal;
        setLocation(450,300);
    }
    
    public String [] devolverInformacion(){
        return gUI_InformacionLogin1.devolverInformacion();
    }
    
public void agregarEventos()
{
 this.btn_Login.addActionListener(controlador_FRM_Login);
 this.btn_Registrarse.addActionListener(controlador_FRM_Login);
}

public void hacerLogin(){
    setVisible(true);
    ventanaMenuPrincipal.setVisible(false);
}

public void noHacerLogin(){
    setVisible(false);
    ventanaMenuPrincipal.setVisible(true);
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_InformacionLogin1 = new Vista.GUI_InformacionLogin();
        btn_Login = new javax.swing.JButton();
        btn_Registrarse = new javax.swing.JButton();

        btn_Login.setText("Login");

        btn_Registrarse.setText("Registrarse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gUI_InformacionLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_Registrarse)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gUI_InformacionLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Registrarse))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Registrarse;
    private Vista.GUI_InformacionLogin gUI_InformacionLogin1;
    // End of variables declaration//GEN-END:variables
}
