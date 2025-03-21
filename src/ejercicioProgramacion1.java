import java.util.Scanner;

public class ejercicioProgramacion1 {public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese el primer numero: ");
    Float numeroUno = input.nextFloat();
    System.out.println("Ingrese el segundo numero: ");
    float numeroDos = input.nextFloat();
    int multiplicacion =(int) (numeroUno*numeroDos);
    int suma =(int) (numeroUno+numeroDos);
    int diferencia =(int) (numeroUno-numeroDos);
    Double division =(double) (numeroUno/numeroDos);
    if (numeroUno>numeroDos){
        System.out.println("La suma de ambos numeros es " +suma+ " y la diferencia de ambos numeros es " +diferencia);
    }
    else {

    }
    if (numeroDos>numeroUno){
        System.out.println("El producto de ambos numeros es " +multiplicacion+ " y la división de ambos numeros es " +division);

    }
    else {

    }

}    
}