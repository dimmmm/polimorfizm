package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Begemot extends Animal {
    Begemot(){
        setName("Бегемотик");
    }
    public void makeSomeNoise() {
        System.out.println("BUU-BUU");
    }
    public void makeSomeEat() {
        System.out.println("бегемотика накормили");
    }
    public void makeSomeDrink() {
        System.out.println("бегемотика напоили");
    }
}
