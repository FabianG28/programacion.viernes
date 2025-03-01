import java.util.Scanner;

public class ClothesShop {public static void main(String[] args) {
    double precioCamiseta = 25; 
    double precioPantalon = 30;
    double descuento = 0.15;
    double precioCamisetaDescuento = precioCamiseta - (precioCamiseta * descuento);
    double precioPantalonDescuento = precioPantalon - (precioPantalon * descuento); 
    double descuentoAdicional = 0.05; 
    double precioSegundaCamiseta = precioCamisetaDescuento - (precioCamisetaDescuento * descuentoAdicional);
    Double precioTotal = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamiseta;
    System.out.println("Precio de la cmiseta con decuento del 15%:$" + precioCamisetaDescuento);
    System.out.println("precio del pantalon con descuento del 15%:$" + precioPantalonDescuento);
    System.out.println("precio de la segunda camiseta con descuento adicional del 5%:$" + precioSegundaCamiseta);
    System.out.println("precio total de ambas prendas :$" + precioTotal);
}
    
}
