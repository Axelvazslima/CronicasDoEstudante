import java.util.Objects;

public class Cronica {
    private String nome;
    private String autor;
    private String conteudo;
    private int quantidadeDeLeituras;

    public Cronica(String nome, String conteudo, String autor){
        this.nome = nome;
        this.conteudo = conteudo;
        this.autor = autor;
        quantidadeDeLeituras = 0;
    }

    public Cronica(String nome, String conteudo){
        this.nome = nome;
        this.conteudo = conteudo;
        this.autor = "Anônimo";
        quantidadeDeLeituras = 0;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeDeLeituras() {
        return this.quantidadeDeLeituras;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNome() {
        return this.nome;
    }
    public void incrementaQuantidadeLeituras(){
        this.quantidadeDeLeituras++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cronica cronica = (Cronica) o;
        return Objects.equals(getNome(), cronica.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString(){
        
    }
}
