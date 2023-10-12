package S11_20_E02;

public class Planta_20 {
    //Atributos
    String nombre;
    String tipo;
    int edad;
    
    //Metódos
    public void Tamaño() {
        edad= 4;
        System.out.println("La planta tiene: " + edad + " años.");
    }
    
    public void Crecer() {
        System.out.println("La planta está creciendo");
    }
    
    public void Datos() {
        System.out.println("Nombre de la planta: " + nombre);
        System.out.println("Tipo de planta: " + tipo);
        System.out.println("Edad de la planta: " + edad + " años.");
    }
    
}
