import arifmetic.SimpleMath;
import wildAnimal.WildAnimal;

public class Main {

    public static void main(String[] args) {

    Animal animal = new Animal();
    animal.catSay();
    animal.dogSay();
        animal.dogSay();

    Math math = new Math();
        System.out.println(math.add(5,2));
        System.out.println(math.subtraction(10,5));

    WildAnimal wildAnimal = new WildAnimal();
    wildAnimal.tigerSay();

    SimpleMath simpleMath = new SimpleMath();
        System.out.println(simpleMath.divide(15,3));
        System.out.println(simpleMath.multiplication(3,4));
    }
}
