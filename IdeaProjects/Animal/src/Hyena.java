public class Hyena extends Animal {  //ärver från Animal class.

 public Hyena(String name) {
     super(name);

 }
 public void laugh() {
     System.out.println(this.getName() + ": hahahaha!");
 }
}
