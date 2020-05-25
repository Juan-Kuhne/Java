package aula11;

public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolda de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado");
    }

    //============================================

    /**
     * @return the bolsa
     */
    public double getBolsa() {
        return bolsa;
    }
    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}