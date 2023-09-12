public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;
    private int LIMITECRONICAS;

    public CronicasDoEstudanteSistema(){
        LIMITECRONICAS = 1000;
        cronicas = new Cronica[LIMITECRONICAS];
    }

    public String registraCronica(String nome, String conteudo, String autor){
        try{
            Cronica cronica = new Cronica(nome, conteudo, autor);
            return "Crônica cadastrada com sucesso.";
        } catch (Exception e){
            return "Crônica não cadastrada.";
        }
    }

    public String registraCronica(String nome, String conteudo){
        try{
            Cronica cronica = new Cronica(nome, conteudo);
            return "Crônica de autor anônimo cadastrada com sucesso.";
        } catch (Exception e){
            return "Crônica não cadastrada.";
        }
    }

    public int pesquisaCronica(String nome){
        for (int i = 0; i < cronicas.length; i++) {
            if(nome.equals(cronicas[i].getNome())){
                return i;
            }
        } return 0;
    }

    public String leCronica(String nome){
        int posicao = pesquisaCronica(nome);
        if(posicao > 0){
            return cronicas[posicao].toString();
        } else{
            return "Crônica não cadastrada.";
        }
    }
}
