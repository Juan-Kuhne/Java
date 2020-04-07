package aula07;

class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    public void apresentar(){
        System.out.println("-----------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("Categoria: "+ getCategoria());
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }
    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }
    /**
     * @return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }/**
     * @return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }
    /**
     * @return the empates
     */
    public int getEmpates() {
        return empates;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    /**
     * @param categoria the categoria to set
     */
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }
    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    /**
     * @param empates the empates to set
     */
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}