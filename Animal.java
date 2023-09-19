public class Animal {
    protected String nome;
    protected int comprimento;
    protected int numPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;

    public Animal(){
        super();
    }

    public Animal(String nome, int comprimento, int numPatas, String cor, String ambiente, double velocidade){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    public int getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor; 
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
