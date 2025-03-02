public class MoneyExtraction {public static void main(String[] args) {
    int cantidadInicial = 1000;
    int retiroSemanal = 200;
    int semanasMes = 4;
    int retiroTotal = (retiroSemanal*4);
    int sobranteDinero = (cantidadInicial - (semanasMes * retiroSemanal));
    System.out.println("Al mes se retiró un total de:" + retiroTotal);
    System.out.println("En su cuenta sobró un total de:" + sobranteDinero);
}
    
}
