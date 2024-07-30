public class Futebol extends Clube{
    private int vitorias;
    private int empates;
    private int derrotas;

    public Futebol(String nome, int vitorias, int empates, int derrotas){
        super(nome);
        this.derrotas= derrotas;
        this.empates= empates;
        this.vitorias= vitorias;
    }

    @Override
    public float calcularponto() {
        return 0;
    }
    

    /**
     * @return int return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    /**
     * @return int return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    /**
     * @return int return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
