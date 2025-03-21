import java.util.Scanner;

public class ejercicioProgramacion7 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese el numero que desea evaluar: ");
    int numero = input.nextInt();
    if (numero<=0){
        System.out.println("Numero incorrecto, debe ser positivo.");
    }else if (numero<10){
        System.out.println("El numero que ingresó tiene una cifra. "+numero);
    }else if (numero<100){
        System.out.println("El numero que ingresó tiene dos cifras. " +numero);
    }else if (numero<1000){
        System.out.println("El numero que ingresó tiene tres cifras. " +numero);
    }else if (numero>1000){
        System.out.println("Numero incorrecto, debe tener minimo 3 cifras. ");
    }else{

    }
}
    
}
