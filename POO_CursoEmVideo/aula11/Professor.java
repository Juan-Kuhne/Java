package aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public void receberAumento(){}

    //===============================================

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }
    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }
    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
}