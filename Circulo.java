public class Circulo {
    private double raio;
    private String cor;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirCaracteristicas() {
        System.out.println("Círculo com raio " + raio + " e cor " + cor);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
