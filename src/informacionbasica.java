import java.util.Scanner;

public class informacionbasica {public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);
System.out.print("ingrese su nombre: ");
String Nombre = input .nextLine();
System.out.print("ingrese su edad: ");
int Edad = input .nextInt(); 
System.out.print(" ingrese su estatura: ");
float Estatura = input .nextFloat(); 

System.out.println("hola " + Nombre + " tienes " + Edad + " años, y mides " + Estatura + " metros, esa es tu información. ");
input.close();
}
    
}
