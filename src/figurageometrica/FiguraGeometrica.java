package figurageometrica;


public abstract class FiguraGeometrica {
     private double Area;
     private double perimetro;
     
    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    
}
