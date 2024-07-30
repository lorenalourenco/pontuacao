public class Vantagem extends Clube{
    private float milhas;

    public Vantagem(String nome, float milhas) {
        super(nome);
        this.milhas = milhas;
    }
    
    @Override
    public float calcularpontos(){
        return milhas * 1.5f;

        /**
         * @return float return the milhas
         */
        public float getMilhas() {
            return milhas;
        }

        /**
         * @param milhas the milhas to set
         */
        public void setMilhas(float milhas) {
            this.milhas = milhas;
        }

    }

}

