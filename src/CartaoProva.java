public class CartaoProva implements Pontuacao{
    private int acertos;
    private int erros;

     @Override
     public float calcularponto(){
        return (acertos*2) - erros;
     }

    /**
     * @return int return the acertos
     */
    public int getAcertos() {
        return acertos;
    }

    /**
     * @param acertos the acertos to set
     */
    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    /**
     * @return int return the erros
     */
    public int getErros() {
        return erros;
    }

    /**
     * @param erros the erros to set
     */
    public void setErros(int erros) {
        this.erros = erros;
    }

}