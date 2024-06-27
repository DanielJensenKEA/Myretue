import java.util.ArrayList;

public class AntHill {
    private ArrayList<Ant> list;

    public AntHill() {
        list = new ArrayList<>();
    }

    public void addToAntHill(Ant a) {
        list.add(a);
    }

    public Ant findFastestAnt() {
        //Går i stå her. Bliver fortalt at koden "ser rigtig ud", men står forkert.

        Ant b;
        for (Ant a : list) {
         b = list.getFirst();
         if (a.gettopSpeed() > b.gettopSpeed()) {
             b = a;
             return b;
         }
        }
        return null;
    }


}
