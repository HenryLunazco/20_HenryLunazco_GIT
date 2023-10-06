package S08_20;

public class Main_S08_20 {
    //Principal
    public static void main(String[] args) {
        Calculadora_20 cal = new Calculadora_20();
        cal.a = 20;
        cal.b = 5;
        cal.Datos();
        cal.Multiplicar();
        cal.Division();
        cal.Restar();
        cal.Sumar();
        
        Estudiante_20 est = new Estudiante_20();
        est.Datos();
        System.out.println(est.Name());
        System.out.println(est.Edad());
        
        String a = "Hello";
        String b = "world";
        System.out.println(a +" "+ b);
    }
    
}
