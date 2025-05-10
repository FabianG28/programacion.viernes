public class ejercicioUnoCambioDeValor { public static void main(String[] args) {
    
            int valor = 10;
        switchValor(valor);
        System.out.println("Valor después de cambiarValor: " + valor);
    }

    public static void switchValor (int valor) {
        valor = 20;
    }
}

