package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Dog extends Animal {
    Dog() {
        setName("Собачка");
    }

    public void makeSomeNoise() {
        System.out.println("гав-гав");
    }

    public void makeSomeEat() {
        System.out.println("собачку накормили");
    }

    public void makeSomeDrink() {
        System.out.println("собачку напоили");
    }
}
