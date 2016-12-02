package polimorfizm;

/**
 * Created by Martwq34 on 29.11.2016.
 */
public abstract class Animal extends JavaApplication1 {
    private String name;
    private String weight;
    private String growth;
    private int age;
    private boolean isAlive;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void makeSomeNoise() { // голос
        System.out.println("ANIMAL");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSomeEat() { // накормить
        System.out.println("ням-ням");
    }

    public void makeSomeDrink() { // напоить
        System.out.println("ковть-ковть");
    }

}