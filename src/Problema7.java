import java.util.Scanner;

public class Problema7 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("ingrese el primer numero :");
    int inicio = input.nextInt();
    System.out.println("ingrese el segundo numero :");
    int fin = input.nextInt(); 
    if (inicio<1 || fin<inicio) {System.out.println(" rango no valido. ");
    input.close();
    return;
    }
    System.out.println("El primer numero es: " + inicio + " el segundo numero es:" + fin);

    int contadorPrimos = 0;

    for ( int i = inicio; i <= fin ; i ++) {

        if (i<=1) {
            continue;
        }

        if (i == 2) {
            contadorPrimos+=1;
            System.out.println(i);
        }

        if (i%2 == 1) {
            contadorPrimos+=1;
            System.out.println(i);
        }

    }
System.out.println(" hay " +contadorPrimos+ " en total. ");    
}

}
