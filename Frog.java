package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Frog extends Animal {
    Frog() {
        setName("Лягушка");
    }

    public void makeSomeNoise() {
        System.out.println("ква-ква");
    }

    public void makeSomeEat() {
        System.out.println("лягушку накормили");
    }

    public void makeSomeDrink() {
        System.out.println("лягушку напоили");
    }
}
