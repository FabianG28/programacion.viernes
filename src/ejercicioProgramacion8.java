import java.util.Scanner;

public class ejercicioProgramacion8 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Cuantas preguntas tiene el test?: ");
    int preguntas = input.nextInt();
    if (preguntas<=0){
        System.out.println("Rango de preguntas incorrecto. ");
    }else{

    }
    System.out.println("Cuantas preguntas contestó correctamente?: ");
    int preguntasCorrectas = input.nextInt();
    if (preguntasCorrectas<0){
        System.out.println("Rango de preguntas correctas no valido. ");
    }else{

    }
    float promedio =(preguntasCorrectas/preguntas)*100;

    System.out.println(+promedio);


}
    
}
