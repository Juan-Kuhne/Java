package aula08;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(){
        //
    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void Lutar(){
        if (isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            Random alt = new Random();
            int vencedor = alt.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                default:
                    break;
            }
            System.out.println("===========================");
        }else{
            System.out.println("Luta não pode acontecer");
        }
    }

    /**
     * @param desafiado the desafiado to set
     */
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    /**
     * @param desafiante the desafiante to set
     */
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    /**
     * @param rounds the rounds to set
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }/**
     * @param aprovada the aprovada to set
     */
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    /**
     * @return the desafiante
     */
    public Lutador getDesafiante() {
        return desafiante;
    }/**
     * @return the desafiado
     */
    public Lutador getDesafiado() {
        return desafiado;
    }
    /**
     * @return the rounds
     */
    public int getRounds() {
        return rounds;
    }
    /**
     * @return the aprovada
     */
    public boolean isAprovada() {
        return aprovada;
    }
}