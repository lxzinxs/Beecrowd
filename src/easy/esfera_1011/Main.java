package easy.esfera_1011;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159;
        double raio = teclado.nextDouble();

        double resultado = ((4.0/3) * pi * (raio * raio * raio));

        System.out.printf("VOLUME = %.3f%n", resultado);
    }
}