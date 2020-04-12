package aula10;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando = !(this.trabalhando);
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }
    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
    /**
     * @return the trabalhando
     */
    public boolean isTrabalhando() {
        return trabalhando;
    }
    /**
     * @param trabalhando the trabalhando to set
     */
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}