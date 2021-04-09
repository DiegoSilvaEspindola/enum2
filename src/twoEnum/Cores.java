package twoEnum;

public enum Cores {
    VERDE("Verde"), AMARELO("Amarelo"), AZUL("Azul");

    private String texto;
    Cores(String texto){
        this.texto = texto;
    }
    public String getTexto(){
        return texto;
    }
}
