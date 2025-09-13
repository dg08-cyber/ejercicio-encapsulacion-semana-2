package figuras;

public interface Figura {
    default double calcularArea() {
        return 0;
    }

    default double calcularPerimetro() {
        return 0;
    }
}

