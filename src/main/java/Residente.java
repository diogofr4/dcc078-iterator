public class Residente {
    public String nome;
    public boolean contraiuCovid;

    public Residente(String nome, boolean contraiuCovid) {
        this.nome = nome;
        this.contraiuCovid = contraiuCovid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean contraiuCovid() {
        return contraiuCovid;
    }

    public void setContraiuCovid(boolean contraiuCovid) {
        this.contraiuCovid = contraiuCovid;
    }
}
