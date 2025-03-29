import java.util.Scanner;

public class matrices3 {public static void main(String[] args) {

Scanner input = new Scanner (System.in);
String[] nombres = new String [3];
for (int i = 0 ; i < 3 ; i ++){
    System.out.print("Ingrese el nombre en la posición [" + i + "]: ");
    nombres [i] = input.nextLine();
}

System.out.println("Los nombres ingresados son:");
for (int i = 0; i < 3; i++) {
    System.out.println("Posición [" + i + "]: " + nombres[i]);
}

}

}
