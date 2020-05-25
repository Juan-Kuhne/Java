package aula11;

 public abstract class Pessoa{
    protected String nome;
    protected int idade;
    protected char sexo;

    public final void fazerAniversario(){
        this.idade++;
    }
    //================================================

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados => "+"nome:"+this.nome+" idade:"+this.idade+" sexo:"+this.sexo;
    }
}