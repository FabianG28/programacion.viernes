import java.util.Scanner;
public class ejercicio3 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese la temperatura en celcius y determine cual seria el valor de esta temperatura en farenheit. ");
    double celsius = input.nextDouble ();
    double farenheit = (celsius * 9 / 5) + 32;
    System.out.println("la temperatura celsius de :" +celsius+"°"+". En grados Farenheit es: " +farenheit+"°"); 
}
}
