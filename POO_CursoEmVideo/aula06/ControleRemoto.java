package aula06;

public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Construtor
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(true);
        this.setTocando(false);
    }
    //Getters e seters
    private int getVolume(){
        return this.volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        if (getLigado()) {
            System.out.println("---------- MENU -----------");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i=0; i< this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println("");
        }else{
            System.out.println("Aparelho desligado");
        }
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        if (getLigado()) {
            System.out.println("Fechando menu ...");
        }else{
            System.out.println("Aparelho desligado");
        }
    }

    @Override
    public void maisVolme() {
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Nao consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("Nao consegui pausar");
        }
    }
}