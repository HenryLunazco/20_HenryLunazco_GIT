package S11_20_E02;

public class Main_S11_20_E02 {

    public static void main(String[] args) {
        
        Animal_20 obj = new Animal_20("Tigre", "Felino", 2, "Animal", "Tigre", 4);
        obj.acción();
        
        Planta_20 obj2 =new Planta_20();
        obj2.edad=50;
        obj2.nombre="Durazno";
        obj2.tipo="Frutal";
        obj2.Crecer();
        obj2.Datos();
        obj2.Tamaño();
    }
    
}
