public class Area {
    private double base;
    private double altura;

    public Area(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Area(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Area(String base, String altura) {
        this.base = converterParaDouble(base);
        this.altura = converterParaDouble(altura);
    }

    private double converterParaDouble(String valor) {
        try {
            return Double.parseDouble(valor.replace(",", "."));
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido: " + valor + " (assumindo 0.0)");
            return 0.0;
        }
    }

    public double triangulo() {
        return (this.base * this.altura) / 2.0;
    }

    public double quadrado() {
        return this.base * this.altura;
    }

    public void exibirValores() {
        System.out.println("Base: " + this.base + ", Altura: " + this.altura);
    }
}
