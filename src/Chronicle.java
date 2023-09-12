import java.time.LocalDate;
import java.util.Objects;

public class Chronicle {
    private String nome;
    private String author;
    private String content;
    private LocalDate date;
    private int readingQuantity;
    private int position;

    public Chronicle(String nome, String content, LocalDate date, String author){
        try {
            this.nome = nome;
            this.content = content;
            this.date = date;
            this.author = author;
            this.readingQuantity = 0;
        } catch (Exception e){
            System.out.println("Input inválido. Crônica não criada");
        }
    }

    public Chronicle(String nome, String content, LocalDate date){
        try {
            this.nome = nome;
            this.content = content;
            this.date = date;
            this.author = "Anônimo";
            this.readingQuantity = 0;
        } catch (Exception e){
            System.out.println("Input inválido. Crônica não criada");
        }
    }

    public void setPosition(int position){
        this.position = position;
    }

    public String getAutor() {
        return author;
    }

    public int getReadingQuantity() {
        return this.readingQuantity;
    }

    public String getContent() {
        return this.content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return this.nome;
    }
    public void sumsReadingQuantity(){
        this.readingQuantity++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chronicle chronicle = (Chronicle) o;
        return Objects.equals(getName(), chronicle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cronica #").append(position + 1).append("\n").append(nome).append("\nData: ").append(date).append("\nAutor: ").append(author).append("\n").append("a");
        return sb.toString();
    }
}
