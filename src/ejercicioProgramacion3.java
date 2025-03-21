import java.util.Scanner; 

public class ejercicioProgramacion3 {public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Ingrese el numero que desee (tiene que ser de uno o dos digitos como máximo): ");
    int numeroUno = input.nextInt();
    if (numeroUno>99 || numeroUno<0){
        System.out.println("Cantidad de digitos incorrecta. ");
        System.exit(0);
    }else{
        System.out.println("El numero que ingresó fue " +numeroUno);
    }
}
    
}
