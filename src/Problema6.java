import java.util.Scanner;

public class Problema6 {public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese la hora en formato HH.MM (24 horas): ");
    String entrada = input.nextLine();
    input.close();

    if(entrada.length()!=5||entrada.charAt(2)!=':'){
    System.out.println("Formato incorrecto");
    return;
    }

    char h1 = entrada.charAt(0);
    char h2 = entrada.charAt(1);
    char m1 = entrada.charAt(3);
    char m2 = entrada.charAt(4);

    int horas = (h1 -'0') * 10 + (h2-'0') ;
    int minutos = (m1 -'0') * 10 + (m2 - '0') ; 
    System.out.println(horas + ":" + minutos);

    if (minutos == 0){
    System.out.println("son las " + horas + ":" + minutos + m2 + " en punto.");
    return;
    }

    if ( 0 > horas || horas > 23 || 0 > minutos || minutos > 59){
    System.out.println("Formato incorrecto");
    return;
    }

    int hora12 = (horas%12==0)?12:
    horas%12;
    System.out.println("La hora es " + hora12 + " " + minutos);
}

} 