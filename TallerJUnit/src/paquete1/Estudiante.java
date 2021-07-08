
package paquete1;

public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;
    
    
    public void establecerNombresEstudiante(String n){
        nombresEstudiante = n;
    }
    
    public void establecerApellidosEstudiante(String n){
        apellidosEstudiante = n;
    }
    
    public void establecerIdentificacionEstudiante(String n){
        identificacionEstudiante = n;
    }
    
    public void establecerEdadEstudiante(int n){
        edadEstudiante = n;
    }
    
    public String obtenerNombreEstudiante(){
        return nombresEstudiante;
    }
    
    public String obtenerApellidosEstudiante(){
        return apellidosEstudiante;
    }
    
    public int obtenerEdadEstudiante(){
        return edadEstudiante;
    }

}
