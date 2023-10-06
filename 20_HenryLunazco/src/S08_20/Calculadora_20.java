package S08_20;
//Principal

import java.util.Scanner;

public class Calculadora_20 {
    
    //Atributos
    int a ;
    int b ;
    
    // Método
    public void Datos() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Por favor ingrese un número");
        a = obj.nextInt();
        b = obj.nextInt();
    }
    
    public void Sumar() {
        int sum = a + b;
        System.out.println("La suma es de: "+sum);
    }

    public void Restar() {
        int res = a - b ;
        System.out.println("La resta es de: "+res);
    }

    public void Multiplicar() {
        int mul = a * b ;
        System.out.println("La multiplicación es de: "+mul);
    }
    
    public void Division() {
        int div = a / b ;
        System.out.println("La división es de: "+div);
    }
}