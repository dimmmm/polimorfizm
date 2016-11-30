package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public class Enot extends Animal {
    Enot(){
        setName("Енот");
    }
    public void makeSomeNoise() {
        System.out.println("Внимание, енот ворует еду!");
    }
    public void makeSomeEat() {
        System.out.println("енота накормили");
    }
    public void makeSomeDrink() {
        System.out.println("енота напоили");
    }
}
