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
    if (preguntasCorrectas<0 || preguntasCorrectas>preguntas){
        System.out.println("Rango de preguntas correctas no valido. ");
    }else{

    }
    Double promedio =((double)preguntasCorrectas/preguntas)*100;
    String nivel;

    if (promedio >= 90) {
        nivel = "Nivel máximo";
    } else if (promedio >= 75) {
        nivel = "Nivel medio";
    } else if (promedio >= 50) {
        nivel = "Nivel regular";
    } else {
        nivel = "Fuera de nivel";
    }

    System.out.printf("El postulante obtuvo un "+promedio+" porciento "+" de respuestas correctas.");
    System.out.println("Nivel: " + nivel);
}
    
}
