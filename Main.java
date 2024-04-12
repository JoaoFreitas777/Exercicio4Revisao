import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a cor do círculo: ");
        String cor = scanner.nextLine();

        Circulo circulo = new Circulo(raio, cor);
        circulo.exibirCaracteristicas();

        scanner.close();
    }
}