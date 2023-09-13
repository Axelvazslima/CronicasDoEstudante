public class Booklet {
    private Chronicle[] chronicles;
    private int MAXCHRONICLES;

    public Booklet(CronicasDoEstudanteSistema sistema, int[] booksPositioning){
        MAXCHRONICLES = 3;
        chronicles = new Chronicle[MAXCHRONICLES];
        try {
            addChronicle(sistema, booksPositioning);
        } catch (Exception e){
            System.out.println("Error creating booklet");
        }
    }

    private void addChronicle(CronicasDoEstudanteSistema sistema, int[] booksPositioning){
        for (int i = 0; i < booksPositioning.length; i++) {
            chronicles[i] = sistema.getChronicles()[booksPositioning[i]];
        }
    }

    public Chronicle[] getChronicles() {
        return this.chronicles;
    }
}
