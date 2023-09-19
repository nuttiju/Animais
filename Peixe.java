public class Peixe extends Animal {
    protected String barbatana;
    protected String cauda;

    public Peixe(){
    }

    public Peixe(String barbatana, String cauda){
        super();
        this.barbatana = barbatana;
        this.cauda = cauda;
    }

    public String getBarbatana() {
        return barbatana;
    }
    public void setBarbatana(String barbatana) {
        this.barbatana = barbatana;
    }
    public String getCauda() {
        return cauda;
    }
    public void setCauda(String cauda) {
        this.cauda = cauda;
    }
}   
