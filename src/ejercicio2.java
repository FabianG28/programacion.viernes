import java.util.Scanner;

public class ejercicio2 {public static void main(String[] args) {

    System.out.println("Encuentre el area de un triangulo dados los siguientes datos.");
    Scanner input = new Scanner (System.in); 
    System.out.println("ingrese la base del triangulo: ");
    Double base = input.nextDouble();
    System.out.println("Ingrese la altura del triangulo: "); 
    Double altura =input.nextDouble(); 
    double operacion = (base*altura)/2;
    System.out.println("La base de su triangulo es: " +operacion);
}
    
}
