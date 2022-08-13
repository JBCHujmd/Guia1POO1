import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        try (//Se capturan los numeros
        Scanner reader = new Scanner(System.in)) {
            int numero1, numero2;
                System.out.println("Digite el primer numero: ");
                numero1 = reader.nextInt();
                System.out.println("Digite el segundo numero: ");
                numero2 = reader.nextInt();
            //Condicional 
            if (numero1%numero2 == 0)
                System.out.println(numero1 + " es divisible por " + numero2);
            else
                System.out.println(numero1 + " No es divisible por " + numero2);
        }
    }
}