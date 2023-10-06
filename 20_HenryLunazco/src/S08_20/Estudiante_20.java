package S08_20;
//Principal
public class Estudiante_20 {
    
    // Atributos
    String nombre;
    String apellido;
    int edad;
    
    //Metodo
    public void Datos() {
        nombre = "Henry";
        apellido = "Lunazco";
        edad = 18;
        System.out.println("Soy "+nombre+ " "+apellido+" y tengo "+edad+" años");
    }
    
    public String Name() {
        return nombre;
    }
    
    public int Edad() {
        return edad;
    }
}

