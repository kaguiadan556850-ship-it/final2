package final_;

public class ERSimulator {
    public static void main(String[] args) {
        ERQueue er = new ERQueue();
        er.arrive("Franciene Candare", 1, "Head injury - NOW UNCONSCIOUS ", "23:52");
        er.arrive("Cindie Diva", 2, " fracture - leg", "23:50");
        er.arrive("Khiana Enoc", 2, " asthma attack", "23:56");
        er.arrive("Malou Ella", 3, "Fractured arm", "23:48");
        er.arrive("Daryll Luntayao", 4, "Fractured ankle", "23:49");

       er.displayQueue();
       er.treatNext();
       
    }
}
