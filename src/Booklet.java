public class Booklet {
    private Chronicle[] chronicles;
    private int MAXCHRONICLES;

    public Booklet(CronicasDoEstudanteSistema sistema, int[] booksPositioning){
        MAXCHRONICLES = 3;
        chronicles = new Chronicle[MAXCHRONICLES];
        if(addChronicle(sistema, booksPositioning)) System.out.println("Booklet successfully created.");
        else System.out.println("Error creating booklet");
    }

    private boolean addChronicle(CronicasDoEstudanteSistema sistema, int[] booksPositioning){
        for (int i = 0; i < booksPositioning.length; i++) {
            try{
                chronicles[i] = sistema.getChronicles()[booksPositioning[i]];
            } catch (Exception e){
                return false;
            }
        } return true;
    }

    public Chronicle[] getChronicles() {
        return this.chronicles;
    }
}
