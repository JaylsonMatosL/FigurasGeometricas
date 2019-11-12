package figurageometrica;

public final class Circulo extends FiguraGeometrica {
    private double pi = 3.14;
    private double raio;
    private double area;
    private double periemtro;
    
     public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        this.setArea(2*raio*pi);
        return this.getArea();
    }
    @Override
    public double calcularPerimetro() {
        this.setPerimetro(2*pi*raio);
        return this.getPerimetro();
    }
}
