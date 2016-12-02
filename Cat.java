package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Cat extends Animal {
    Cat() {
        setName("Котик");
    }

    public void makeSomeNoise() {
        System.out.println("мяу-мяу");
    }

    public void makeSomeEat() {
        System.out.println("котика напоили");
    }

    public void makeSomeDrink() {
        System.out.println("котика накормили");
    }
}
