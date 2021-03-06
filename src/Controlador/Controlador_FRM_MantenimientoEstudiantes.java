/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoEstudiantes;
import Modelo.ConexionBD;
import Modelo.MetodosEstudiantes;
import Modelo.Metodos_XML_Estudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener{
    
    String fuente="";
    
    public MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    ArchivoEstudiantes archivo;
    ConexionBD conexion;
    Metodos_XML_Estudiantes metodosXML;
    
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes=mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
        mantenimientoEstudiantes.estadoInicial();
        this.conexion=conexion;
        metodosXML = new Metodos_XML_Estudiantes(mantenimientoEstudiantes);
       
       
        archivo=new ArchivoEstudiantes();
        
        if(archivo.cargarArchivoEstudiantes()){
        metodos.setArray(archivo.devolverInformacionDeEstudiantes());
     }
     else
     {
         archivo.crearArchivoEstudiantes();
     }
    }
    
    public void establecerFuente(String eleccion){
        fuente=eleccion;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            if(fuente.equals("Archivos")){
                     buscar(); 
                System.out.println("Dentro del If archivos"+fuente);
            }//Archivos
            
            if(fuente.equals("BD")){
                if(conexion.consultarEstudiantes(mantenimientoEstudiantes.devolverCedula())){
                    mantenimientoEstudiantes.mostrarInformacion(conexion.getArregloInformacion());
                    mantenimientoEstudiantes.habilitarTexto();
                    mantenimientoEstudiantes.habilitarBotones();
                }
                else{
                    mantenimientoEstudiantes.habilitarBotones();
                    mantenimientoEstudiantes.habilitarTexto();
                }
            }//FIN BD
            
            //XML
            if(fuente.equals("XML")){
                if(metodosXML.consultarInformacionDelXml(mantenimientoEstudiantes.devolverCedula())){
                    mantenimientoEstudiantes.mostrarInformacionXML(metodosXML.getArregloInformacion());
                    mantenimientoEstudiantes.habilitarTexto();
                    mantenimientoEstudiantes.habilitarBotones();
                    mantenimientoEstudiantes.mostrarMensaje("Información encontrada con la cédula: "+mantenimientoEstudiantes.devolverCedula());
                }
                else{
                    mantenimientoEstudiantes.mostrarMensaje("No se encontró información con la cédula: "+mantenimientoEstudiantes.devolverCedula());
                    mantenimientoEstudiantes.habilitarBotones();
                    mantenimientoEstudiantes.habilitarTexto();
                }
            }//FIN XML
 
        }
        
       
        if(e.getActionCommand().equals("Agregar"))
        {
            
            //ARCHIVOS
            if(fuente.equals("Archivos")){
            metodos.agregarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            archivo.crearArchivoEstudiantes();
            for(int contador=0; contador<metodos.getTamano();contador++){
               archivo.ingresarInformacionEstudiantes(metodos.get(contador));
               mantenimientoEstudiantes.estadoInicial();
               mantenimientoEstudiantes.habilitarBuscar();
               mantenimientoEstudiantes.habilitarCedula();
           }
            metodos.mostrarInformacion();
            mantenimientoEstudiantes.limpiarInterfaz();
            mantenimientoEstudiantes.estadoInicial();
            }//FIN ARCHIVOS
            
            //BASES DE DATOS
            if(fuente.equals("BD")){
                conexion.registrarEstudiante(mantenimientoEstudiantes.devolverInformacion());
                
            }//FIN BD
            
            //XML
            if(fuente.equals("XML")){
                metodosXML.guardarEnXML(mantenimientoEstudiantes.devolverInformacion());
                mantenimientoEstudiantes.mostrarMensaje("Información agregada.");
            }
            
        }
        
        if(e.getActionCommand().equals("Modificar"))
        {
            //ARCHIVOS
            if(fuente.equals("Archivos")){
           metodos.modificarEstudiante(mantenimientoEstudiantes.devolverInformacion());
           metodos.mensaje("Los datos han sido modificados exitosamente");
            }//ARCHIVOS
            
            //BD
            if(fuente.equals("BD")){
                conexion.actualizarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            }//FIN BD
            
            //XML
            if(fuente.equals("XML")){
                metodosXML.modificarInformacionDelXml(mantenimientoEstudiantes.devolverInformacion());
                mantenimientoEstudiantes.mostrarMensaje("Info modificada");
            }
            
            mantenimientoEstudiantes.habilitarBuscar();
            mantenimientoEstudiantes.habilitarCedula();
            mantenimientoEstudiantes.estadoInicial();
            mantenimientoEstudiantes.limpiarInterfaz();
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            //ARCHIVOS
            if(fuente.equals("Archivos")){
            metodos.eliminarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mensaje("El estudiante ha sido eliminado exitosamente");
            }
            //ARCHIVOS
            
            //BD
            if(fuente.equals("BD")){
                conexion.eliminarEstudiante(mantenimientoEstudiantes.devolverCedula());
            }//
            
            //XML
            if(fuente.equals("XML")){
                metodosXML.eliminarInformacionDelXml(mantenimientoEstudiantes.devolverCedula());
                mantenimientoEstudiantes.mostrarMensaje("Info eliminada");
            }//XML
            
            mantenimientoEstudiantes.estadoInicial();
            mantenimientoEstudiantes.limpiarInterfaz();
            mantenimientoEstudiantes.habilitarCedula();
            mantenimientoEstudiantes.habilitarBuscar();
            mantenimientoEstudiantes.limpiarInterfaz();
        }
    
    }
    public void buscar()
    {
            if(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()))
            {
                mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
                mantenimientoEstudiantes.deshabilitarCedula();
                mantenimientoEstudiantes.deshabilitarBuscar();
                mantenimientoEstudiantes.habilitarTexto();
                mantenimientoEstudiantes.habilitarBotones();
                mantenimientoEstudiantes.deshabilitarAgregar();
                
                
            }
            else
            {
                metodos.mensaje("El estudiante consultado no se encontró");
                mantenimientoEstudiantes.habilitarBotones();
                mantenimientoEstudiantes.deshabilitarCedula();
                mantenimientoEstudiantes.habilitarTexto();
                mantenimientoEstudiantes.deshabilitarCedula();
                mantenimientoEstudiantes.deshabilitarBuscar();
                mantenimientoEstudiantes.habilitarAgregar();
            }
    }
    
    public void guardarArchivo(){
        archivo.crearArchivoEstudiantes();
        for(int contador=0; contador<metodos.getTamano();contador++){
            archivo.ingresarInformacionEstudiantes(metodos.get(contador));
        }
    }
    
       
    
}
