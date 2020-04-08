package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int paginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = paginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String detalhes() {
        return "Livro{" + "\ntitulo="+titulo+"\nautor="+autor+"\ntotPaginas="+totPaginas+"\npagAtual="+pagAtual+"\naberto="+aberto+"\nleitor="+leitor.getNome()+"\nidade="+leitor.getIdade()+"\nsexo="+leitor.getSexo()+'}';
    }

    //=========================================================

    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar() {
        this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        }else{
            this.pagAtual = p;
        }
    }
    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

    //=========================================================
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }
    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * @return the totPaginas
     */
    public int getTotPaginas() {
        return totPaginas;
    }
    /**
     * @param totPaginas the totPaginas to set
     */
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    /**
     * @return the pagAtual
     */
    public int getPagAtual() {
        return pagAtual;
    }
    /**
     * @param pagAtual the pagAtual to set
     */
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    /**
     * @return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }
    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}