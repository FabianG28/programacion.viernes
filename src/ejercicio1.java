import java.util.Scanner;

public class ejercicio1 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Diseñe un algoritmo que realice el proceso de aprobación de préstamo bancario.");
    System.out.println("ingrese su nombre: ");
    String name = input.nextLine();
    System.out.println("¿Cuantos ingresos tiene mensualmente?: "); 
    int total = 0;
    int totalIngresos = input.nextInt();
    for (int i = 1 ; i <= totalIngresos; i++){
        System.out.print("Ingrese el valor del ingreso #" + i + ": ");
        int ingreso = input.nextInt();
        total += ingreso;
        

    }
    System.out.println("El total de ingresos del mes es: " + total);
        

    System.out.println("¿Cuenta usted con historial crediticio?, Conteste (true) si sí lo tiene y (false) si no.");
    boolean historialCrediticio = input.nextBoolean();

    if (historialCrediticio==true) {
        System.out.println("Cuenta usted con historial crediticio.");
    } else {
        System.out.println("Su crédito es denegado debido a que no tiene historial crediticio.");
        System.exit(0);
    }

    if (total<3000000) {
        System.out.println("su credito es denegado debido a que no cuenta con el total de ingresos necesarios.");
        System.exit(0);
    
    } else {
        System.out.println("cuenta usted con los ingresos necesarios para proseguir con su evaluación de aceptación del credito.");
    }

    System.out.println("¿tiene usted deudas actuales?, conteste (true) si sí y (false) si no. ");
    boolean deuda = input.nextBoolean();

    if (deuda==true) {
        System.out.println("digite su deuda total: ");
        int deudaTotal = input.nextInt();
        if (deudaTotal > total*0.30) {System.out.println("Su credito es denegado debido a que cuenta con una deuda superior al 30% de sus ingresos totales");
        System.exit(0);

        } else {System.out.println("Estimado " +name+ " su credito se encuentra aprobado al usted contar con los siguientes ingresos. " +total+ " y al no tener una deuda mayor al 30% de sus ingresos");

        }
        
    } else {System.out.println("Estimado " +name+ " su credito se encuentra aprobado al usted contar con los siguientes ingresos. " +total+ " y al no tener una deuda mayor al 30% de sus ingresos");

    }

    input.close();
}
    
}
