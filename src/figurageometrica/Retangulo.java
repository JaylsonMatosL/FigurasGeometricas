package figurageometrica;

public class Retangulo extends FiguraGeometrica {
    private double altura;
    private double largura;
    
    @Override
    public double calcularArea() {
        this.setArea(altura+largura);
        return this.getArea();
    }
    @Override
    public double calcularPerimetro() {
        this.setPerimetro(altura+altura+largura+largura);
        return this.getPerimetro();
}

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
    
