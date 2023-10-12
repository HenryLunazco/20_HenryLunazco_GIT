package S11_20_E02;

public class Animal_20 extends SerVivo_20{

    public Animal_20(String name, String raza, int tamaño, String especie, String nombre, int edad) {
        super(especie, nombre, edad);
        this.name = name;
        this.raza = raza;
        this.tamaño = tamaño;
    }
    
    
    
    //Atributos
    String name;
    String raza;
    int tamaño;
    
    //Metódos
    public void acción() {
        System.out.println("Especie: "+especie);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
