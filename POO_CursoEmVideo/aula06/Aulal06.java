package aula06;

public class Aulal06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolme();
        //c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}