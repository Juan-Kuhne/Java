package aula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade++;
    }
    /**
     * @return the nome
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
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pessoa: " + "nome="+this.nome + ", idade="+this.idade + ", sexo="+this.sexo;
    }
}