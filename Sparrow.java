package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Sparrow extends Animal {
    Sparrow(){
        setName("Воробушек");
    }
    public void makeSomeNoise() {
        System.out.println("чирик-чирик");
    }
    public void makeSomeEat() {
        System.out.println("воробушка накормили");
    }
    public void makeSomeDrink() {
        System.out.println("воробушка напоили");
    }
}
