package FigurasOf2D;

public class Triangulo {
    double base;
    double altura;
    public Triangulo() {
    }
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Methods
    public void calcularArea(){
        System.out.println("El area del FigurasOf2D.Triangulo");
    }
    public void calcularPerimetro() {
        System.out.println("El perimetro del FigurasOf2D.Triangulo");
    }
    public void mostrarDatosTriangulo(){
        System.out.println("Datos FigurasOf2D.Triangulo");
    }
}
