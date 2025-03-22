import java.util.Scanner;

public class ejercicioProgramacion9 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);

    System.out.println("Ingrese la primera nota: ");
    float notaUno = input.nextFloat();
    if (notaUno> 10.0 || notaUno< 0.0) {
        System.out.println("Error en la primera nota. ");
        System.exit(0);
    }else{
        System.out.println("Continue por favor. ");
    }
    System.out.println("Ingrese la segunda nota: ");
    float notaDos = input.nextFloat();
    if (notaDos> 10.0 || notaDos< 0.0) {
        System.out.println("Error en la segunda nota. ");
        System.exit(0);
    }else{
        System.out.println("Continue por favor. ");
    }
    System.out.println("Ingrese la tercera nota: ");
    float notaTres = input.nextFloat();
    if (notaTres> 10.0 || notaTres< 0.0) {
        System.out.println("Error en la tercera nota. ");
        System.exit(0);
    }else{
        System.out.println("Continue por favor. ");
    }

    float promedio = (notaUno+notaDos+notaTres/3);
    if (promedio>= 7.0) {
        System.out.println("Usted se encuentra promocionado ya que obtuvo un promedio de " +promedio+".");
    }else if (promedio>= 4.0 && promedio<= 7.0) {
        System.out.println("Usted se encuentra en un rendimiento regular ya que obtuvo un promedio de " +promedio+".");
    }else if (promedio< 4.0) {
        System.out.println("Usted se encuentra reprobado ya que obtuvo un promedio de " +promedio+ ".");
    }
}
    
}
