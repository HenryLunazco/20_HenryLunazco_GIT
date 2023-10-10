package S11_20_E01;

public class Futbolista_20 extends Persona_20{

    public Futbolista_20(String Apodo, String Posicion, String Equipo, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.Apodo = Apodo;
        this.Posicion = Posicion;
        this.Equipo = Equipo;
    }
    
    //Atributos
    String Apodo;
    String Posicion;
    String Equipo;
    
    //Metodos
    public Futbolista_20(String Nombre, int Edad) {
        super(Nombre, Edad);
    }
    
    public void Carrera(){
        
    }
    
    public void TiempoExperiencia(){
        
    }
}
