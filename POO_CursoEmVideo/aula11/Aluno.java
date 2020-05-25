package aula11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+this.nome);
    }

    //============================================

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }
    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }
    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}