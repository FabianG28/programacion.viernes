import java.util.Arrays;

public class matrices4 {public static void main(String[] args) {
    
    int [] numeros = {10,20,30,40,50,60};
    for (int i = 0; i < numeros.length / 2; i++){
        int temp = numeros [i];
        numeros[i] = numeros[numeros.length - 1 - i];
        numeros[numeros.length - 1 - i]= temp;

    }

    System.out.println("Arrays invertido: " +Arrays.toString(numeros));
}
    
}
