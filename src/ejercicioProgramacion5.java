import java.util.Scanner;

public class ejercicioProgramacion5 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);

    System.out.println("Ingrese el primer numero (el segundo debe ser diferente): ");
    int numeroUno = input.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int numeroDos = input.nextInt(); 

    if (numeroUno == numeroDos){
        System.out.println("Los dos numeros son iguales, repita por favor. ");
        System.exit(0);
    }else{
        System.out.println("Continue por favor. ");
    }

    if (numeroUno>numeroDos){
        System.out.println("El primer numero" +numeroUno+ " es mayor que el segundo " +numeroDos);
    }else{
        System.out.println("El segundo numero " +numeroDos+ " es mayor que el primero " +numeroUno);
    }
}
    
}
