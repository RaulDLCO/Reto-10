package javaapplication18;

public class llanta {
    private int rodada;
    private String marca;
    private String tipo;
    
    public llanta(){
    }
        
    public llanta(int rodada, String marca, String tipo) {
        this.rodada = rodada;
        this.marca = marca;
        this.tipo = tipo;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
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
