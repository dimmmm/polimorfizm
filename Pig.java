package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Pig extends Animal {
    Pig() {
        setName("Свинка");
    }

    public void makeSomeNoise() {
        System.out.println("хрю-хрю");
    }

    public void makeSomeEat() {
        System.out.println("свинку напоили");
    }

    public void makeSomeDrink() {
        System.out.println("свинку накормили");
    }
}
