public class Figuras3D {
    double lado;
    int nlados;
    public Figuras3D() {
    }
    public Figuras3D(double lado, int nlados) {
        this.lado = lado;
        this.nlados = nlados;
    }
    // getters
    public double getLado() {
        return lado;
    }
    public int getNlados() {
        return nlados;
    }
    //setters
    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setNlados(int nlados) {
        this.nlados = nlados;
    }
    // Methods
    public void calcularArea(){
        System.out.println("El area 3D");
    }
    public void calcularPerimetro(){
        System.out.println("El perimetro 3D");
    }
    public void mostrarDatos(){
        System.out.println("Datos 3D");
    }
}

