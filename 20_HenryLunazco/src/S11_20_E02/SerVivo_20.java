package S11_20_E02;

public class SerVivo_20 {
    
    
    
    //Atributos
    String especie;
    String nombre;
    int edad;
    
    //Metódos
    public void acción() {
        System.out.println("Especie: "+especie);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

    public SerVivo_20(String especie, String nombre, int edad) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
}
