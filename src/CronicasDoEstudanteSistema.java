import java.time.LocalDate;

public class CronicasDoEstudanteSistema {
    private Chronicle[] chronicles;
    private Booklet[] booklets;
    private int MAXCHRONICLESQUANTITY;
    private int counter;

    public CronicasDoEstudanteSistema(){
        MAXCHRONICLESQUANTITY = 1000;
        counter = 0;
        chronicles = new Chronicle[MAXCHRONICLESQUANTITY];
    }

    public String registerChronicle(String nome, String conteudo, LocalDate data, String autor){
        try{
            Chronicle chronicle = new Chronicle(nome, conteudo, data, autor);
            chronicles[counter] = chronicle;
            chronicle.setPosition(counter);
            counter++;
            return "Crônica cadastrada com sucesso.";
        } catch (Exception e){
            return "Crônica não cadastrada.";
        }
    }

    public String registerChronicle(String nome, String conteudo, LocalDate data){
            Chronicle chronicle = new Chronicle(nome, conteudo, data);
            if (!(checkExistingChronicle(chronicle))){
                try {
                    chronicles[counter] = chronicle;
                } catch (ArrayIndexOutOfBoundsException aioobe) {
                    return "Crônica não cadastrada. Posição inválida." + aioobe;
                }
                chronicle.setPosition(counter);
                counter++;
                return "Crônica de autor anônimo cadastrada com sucesso.";
            }
            return "Crônica já cadastrada. Não é permitido duplicatas.";
    }

    public boolean checkExistingChronicle(Chronicle baseChronicle){
        for (int i = 0; i < counter; i++) {
            if (chronicles[i].equals(baseChronicle)) return true;
        } return false;
    }

    public void creatBooklet(CronicasDoEstudanteSistema system, int[] chronicles){
        Booklet booklet = new Booklet(system, chronicles);
    }

    public String readBooklet(int bookletPosition){
        return formatBookletChronicles(booklets[bookletPosition]);
    }

    private String formatBookletChronicles(Booklet booklet){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < booklet.getChronicles().length; i++) {
            sb.append(booklet.getChronicles()[i].getContent());
            if (i < booklet.getChronicles().length) sb.append("\n");
        }
        return sb.toString();
    }

    public String readChronicle(int position){
        if(chronicles[position] != null){
            chronicles[position].sumsReadingQuantity();
            return chronicles[position].getContent();
        } else {
            return "Crônica não cadastrada.";
        }
    }

    public String showMostReadChronicle(){
        Chronicle mostRead = chronicles[0];
        for (int i = 1; i < counter; i++) {
            if (chronicles[i].getReadingQuantity() > mostRead.getReadingQuantity()){
                mostRead = chronicles[i];
            }
        }
        return mostRead.getContent() + " - lida " + mostRead.getReadingQuantity() + " vezes";
    }

    public void listChronicles(){
        for (int i = 0; i < counter; i++) {
            System.out.println(chronicles[i]);
        }
    }

    public Chronicle[] getChronicles() {
        return this.chronicles;
    }
}
