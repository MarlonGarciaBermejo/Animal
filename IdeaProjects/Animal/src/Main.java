import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hyena h1 = new Hyena("Momba");
        Hyena h2 = new Hyena("Dean");

        Lion l1 = new Lion("Seven");
        Lion l2 = new Lion("Elvin");

        ArrayList<Animal> animalKingdom = new ArrayList<>();

        animalKingdom.add(h1);
        animalKingdom.add(h2);
        animalKingdom.add(l1);
        animalKingdom.add(l2);

        for(Animal a : animalKingdom) {
            System.out.println("name:" + a.getName());
            a.eat();
            l1.eat();
            h1.laugh();
            l2.roar();
        }
    }
}