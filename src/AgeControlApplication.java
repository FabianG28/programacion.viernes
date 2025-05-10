import java.util.Scanner;

public class AgeControlApplication {
    public static void main(String[] args) {

//        and &&
//        not equal !=

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de control de edad");
        System.out.println("Ingresa tu edad: ");
        int age = scanner.nextInt();
        if(age>18 && age <50){
            System.out.println("Eres un adulto");
        }
        else if(age>13 && age<18){
            System.out.println("Eres un adolecente");
        }
        else if(age>50 && age<100){
            System.out.println("Eres mas viejo que la panela");
        }

    }
}