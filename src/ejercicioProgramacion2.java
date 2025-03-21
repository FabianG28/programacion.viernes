import java.util.Scanner;

public class ejercicioProgramacion2 {public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese la primera nota: ");
    float notaUno = input.nextFloat();
    if (notaUno>5.0 || notaUno<0.0) {
        System.out.println("Error en la primera nota.");
        System.exit(0);
    }else{

    }
    System.out.println("Ingrese la segunda nota: ");
    float notaDos = input.nextFloat();
    if (notaDos>5.0 || notaDos<0.0) {
        System.out.println("Error en la segunda nota.");
        System.exit(0);
    }else{

    }
    System.out.println("Ingrese la tercera nota: "); 
    float notaTres = input.nextFloat();
    if (notaTres>5.0 || notaTres<0.0) {
        System.out.println("Error en la tercera nota.");
        System.exit(0);
    }else{

    } 
    float promedio = (notaUno+notaDos+notaTres/3);

    if (promedio>=7.0) {
        System.out.println("Su promedio es " +promedio+ " y usted se encuentra promocionado.");
    } else {
        System.out.println("Su promedio es " +promedio+ " y usted no se encuentra promocionado.");
    }
}
    
}
