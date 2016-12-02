package polimorfizm;

import java.util.Scanner;

/**
 * Created by Martwq34 on 29.11.2016.
 * Сделать симулятор зоопарка: базовый класс Animal, 7-10 наследников (разные зверушки), действия – накормить и напоить.
 */
public class JavaApplication1 {
    public static void main(String[] args) {
        Animal ar[] = new Animal[10];
        ar[0] = new Cat();
        ar[1] = new Dog();
        ar[2] = new Begemot();
        ar[3] = new Enot();
        ar[4] = new Pig();
        ar[5] = new Frog();
        ar[6] = new Sparrow();
        for (int i = 0; i < 6; i++) {
            System.out.println((i) + ": " + ar[i].getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите животное: ");
        int a = sc.nextInt();
        System.out.println("\nВыбран: " + ar[a].getName());
        ar[a].makeSomeNoise();
        ar[a].makeSomeEat();
        ar[a].makeSomeDrink();

        ar[a] = new Cat();
        System.out.println("\nИ тут прибегает: " + ar[a].getName());
        ar[a].makeSomeNoise();
    }


}

