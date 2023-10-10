package S11_20;

public class Estudiante_20 extends Persona_20{

    public Estudiante_20(String carrera, int NOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.NOrden = NOrden;
        this.ciclo = ciclo;
    }
    
    //Atributos
    String carrera;
    int NOrden;
    int ciclo;
    
    //Metodos

    public Estudiante_20(String nombre, int edad) {
        super(nombre, edad);
    }
    
}
