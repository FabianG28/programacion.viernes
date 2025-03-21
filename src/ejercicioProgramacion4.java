import java.util.Scanner;

public class ejercicioProgramacion4 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);

    System.out.println("Ingrese su sueldo: ");
    int sueldo = input.nextInt(); 
    if (sueldo<0){
        System.out.println("no puede ingresar numeros negativos. ");
        System.exit(0);
    }else{
        System.out.println("continue por favor. ");
    }
    if (sueldo>3000){
        System.out.println("Le informamos que debido a que su sueldo es mayor a 3000 USD, usted debe pagar impuestos. ");
    } else {
        System.out.println("Que tenga buen dia, le deseamos desde hacienda :) ");
    }
}
    
}
