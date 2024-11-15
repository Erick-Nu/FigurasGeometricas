public class FigurasGeometricas {
    String tipo;
    public FigurasGeometricas() {
    }
    public FigurasGeometricas(String tipo) {
        this.tipo = tipo;
    }
    //getters
    public String getTipo() {
        return tipo;
    }
    // setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Method
    public void mostrarDatos() {
        System.out.println("Datos generales");
    }

}
