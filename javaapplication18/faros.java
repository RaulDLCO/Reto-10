package javaapplication18;

public class faros {
    private String marca;
    private String tipo;
    
    public faros(){
    }
    
    public faros(String marca, String tipo){
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
