public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;
    private int LIMITECRONICAS;
    private int contador;

    public CronicasDoEstudanteSistema(){
        LIMITECRONICAS = 1000;
        contador = 0;
        cronicas = new Cronica[LIMITECRONICAS];
    }

    public String registraCronica(String nome, String conteudo, String autor){
        try{
            Cronica cronica = new Cronica(nome, conteudo, autor);
            cronicas[contador] = cronica;
            contador++;
            return "Crônica cadastrada com sucesso.";
        } catch (Exception e){
            return "Crônica não cadastrada.";
        }
    }

    public String registraCronica(String nome, String conteudo){
        try{
            Cronica cronica = new Cronica(nome, conteudo);
            cronicas[contador] = cronica;
            contador++;
            return "Crônica de autor anônimo cadastrada com sucesso.";
        } catch (Exception e){
            return "Crônica não cadastrada.";
        }
    }

    public String lerCronica(int posicao){
        if(cronicas[posicao] != null){
            cronicas[posicao].incrementaQuantidadeLeituras();
            return cronicas[posicao].getConteudo();
        } else {
            return "Crônica não cadastrada.";
        }
    }

    public String exibirCronicaMaisLida(){
        Cronica maisLida = cronicas[0];
        for (int i = 1; i < cronicas.length; i++) {
            if (cronicas[i].getQuantidadeDeLeituras() > maisLida.getQuantidadeDeLeituras()){
                maisLida = cronicas[i];
            }
        }
        return maisLida.getConteudo();
    }
}
