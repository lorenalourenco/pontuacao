public abstract class Clube implements Pontuacao{
    private String nome;
    
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clube(String nome){
        this.nome = nome;
    }

}
