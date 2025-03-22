import java.util.Scanner;

public class ejercicioProgramacion10 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);

    System.out.println("Cual es el salario del operario?: ");
    int salario = input.nextInt();
    System.out.println("Cuantos años de antiguedad tiene el operario?: ");
    int añosAntiguedad = input.nextInt();
    if (salario< 500 && añosAntiguedad >=10) {
        System.out.println("Señor operario, debido a su antiguedad en la empresa, su sueldo aumentará un 20%, por ende, su nuevo sueldo es de " +salario*1.20);
    } else if (salario< 500 && añosAntiguedad <10) {
        System.out.println("Señor operario, debido a su salario y a su antiguedad en la empresa, su sueldo aumentará un 5%, por ende, su nuevo sueldo es de "+salario*0.5);
    } 

}
    
}
