/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoEstudiantes;
import Modelo.ArchivoEstudiantes;
import javax.swing.JOptionPane;


public class FRM_MantenimientoEstudiantes extends javax.swing.JFrame {

    public Controlador_FRM_MantenimientoEstudiantes controlador_FRM_MantenimientoEstudiantes;
    ArchivoEstudiantes archivo;
    
    public FRM_MantenimientoEstudiantes() {
        initComponents();
        setVisible(false);
        agregarEvento();
        controlador_FRM_MantenimientoEstudiantes=new Controlador_FRM_MantenimientoEstudiantes(this);
        gUI_Botones1.agregarEventos(controlador_FRM_MantenimientoEstudiantes);
        archivo=new ArchivoEstudiantes();

    }
    public String[] devolverInformacion()
    {
        return this.gUI_InformacionEstudiantes2.devolverInformacion();
    }
    
    public String devolverCedula()
    {
        return this.gUI_InformacionEstudiantes2.devolverCedula();
    
    }
    public void mostrarMensaje(String mensaje)
    {
        JOptionPane.showMessageDialog(null,mensaje);
    }
 
    public void mostrarInformacion(String arreglo[])
    {
        this.gUI_InformacionEstudiantes2.mostrarInformacion(arreglo);
    }
    
    public void mostrarInformacionXML(String arreglo[])
    {
        this.gUI_InformacionEstudiantes2.mostrarInformacionXML(arreglo);
    }
    
    public void agregarEvento(){
        this.ConsultaRapidaEstudiante.addActionListener(controlador_FRM_MantenimientoEstudiantes);
    }
    
    public void establecerFuente(String eleccion){
        controlador_FRM_MantenimientoEstudiantes.establecerFuente(eleccion);
    }
    
    
    public void estadoInicial()
    {
        this.gUI_Botones1.estadoInicial();
        this.gUI_InformacionEstudiantes2.estadoInicial();
    }
    
    public void habilitarBotones(){
        this.gUI_Botones1.habilitarBotones();
    }
    
    public void habilitarAgregar(){
        this.gUI_Botones1.habilitarAgregar();
    }
    
    public void habilitarTexto(){
        this.gUI_InformacionEstudiantes2.habilitarTexto();
    }
    
    public void deshabilitarBuscar(){
        this.gUI_Botones1.deshabilitarBuscar();
    }
        
    public void habilitarBuscar(){
        this.gUI_Botones1.habilitarBuscar();
    }
    
    public void deshabilitarAgregar(){
        this.gUI_Botones1.deshabilitarAgregar();
    }
    
    public void limpiarInterfaz(){
        this.gUI_InformacionEstudiantes2.limpiarInterfaz();
    }
    
    public void deshabilitarCedula(){
        this.gUI_InformacionEstudiantes2.deshablitarCedula();
    }
    
    public void limpiarInterfazParaModificar(){
        this.gUI_InformacionEstudiantes2.limpiarInterfazParaModificar();
    }
    
     public void habilitarCedula(){
        this.gUI_InformacionEstudiantes2.habilitarCedula();
    }
     
     
    /* public void llamarBuscar(){
         controladorAutomoviles.buscar();
     }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        jButton1 = new javax.swing.JButton();
        ConsultaRapidaEstudiante = new javax.swing.JButton();
        gUI_InformacionEstudiantes2 = new Vista.GUI_InformacionEstudiantes();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/switch3.png"))); // NOI18N

        ConsultaRapidaEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        ConsultaRapidaEstudiante.setActionCommand("ConsultaRapidaEstudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gUI_InformacionEstudiantes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConsultaRapidaEstudiante)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gUI_InformacionEstudiantes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ConsultaRapidaEstudiante)
                        .addGap(64, 64, 64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gUI_Botones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
      archivo.devolverInformacionDeEstudiantes();
      archivo.crearArchivoEstudiantes();
      controlador_FRM_MantenimientoEstudiantes.guardarArchivo();
    }//GEN-LAST:event_formComponentHidden

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaRapidaEstudiante;
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionEstudiantes gUI_InformacionEstudiantes2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}