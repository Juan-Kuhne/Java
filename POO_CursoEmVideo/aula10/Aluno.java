package aula10;

public class Aluno extends Pessoa{
    private int matr;
    private String Curso;

    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
    }

    /**
     * @return the matr
     */
    public int getMatr() {
        return matr;
    }
    /**
     * @param matr the matr to set
     */
    public void setMatr(int matr) {
        this.matr = matr;
    }
    /**
     * @return the curso
     */
    public String getCurso() {
        return Curso;
    }
    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        Curso = curso;
    }
}