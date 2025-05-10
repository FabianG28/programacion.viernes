import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema del banco");
        System.out.println("Nuestras operaciones:");
        System.out.println("Ingresa 1 para salir del sistema");
        System.out.println("Ingresa 2 para hacer una transferencia");
        System.out.println("Ingresa 3 para obtener tu dinero");

        int operation = scanner.nextInt();

        if(operation == 1){
            System.out.println("Saliendo del sistema...");
        }
        else if(operation == 2){
            System.out.println("Ingresa tu monto: ");
            int balance = scanner.nextInt();
            System.out.println("Ingresa cuanto dinero quieres transferir: ");
            int transfer_amount = scanner.nextInt();
            System.out.println("Tu nuevo balance" + (balance-transfer_amount));
        }
        else if(operation == 3){
            System.out.println("Ingresa tu balance: ");
            int balance = scanner.nextInt();
            System.out.println("Ingrese cuanto dinero quiere retirar: ");
            int get_amount = scanner.nextInt();
            System.out.println("Tu nuevo balance es: " + (balance - get_amount));


        }
        else{
            System.out.println("Operacion invalida.");
        }



    }
}
