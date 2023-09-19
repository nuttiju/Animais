public class Mamifero extends Animal {
    protected String alimento;

    public Mamifero(){
    }
    
    public Mamifero(String alimento){
        super();
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    } 
}
