package Homework1.BoxFruit;

import java.util.ArrayList;
import java.util.List;

/**
 * * 3. Большая задача:
 *  * a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 *  * b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта,
 *  * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 *  * c. Для хранения фруктов внутри коробки можете использовать ArrayList;
 *  * d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта
 *  * (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
 *  * e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую
 *  * подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками
 *  * мы можем сравнивать с коробками с апельсинами);
 *  * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов,
 *  * нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую
 *  * перекидываются объекты, которые были в этой коробке;
 *  * g. Не забываем про метод добавления фрукта в коробку.
 */
public class FruitsApp {
    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();
        box1.addFruit(15,new Apple());
        box2.addFruit(5,new Apple());
        box3.addFruit(10,new Orange());
        box4.addFruit(5,new Orange());

        System.out.println(box1.getWeightBox());
        System.out.println(box2.getWeightBox());
        System.out.println(box3.getWeightBox());
        System.out.println(box4.getWeightBox());

        System.out.println("Проверка равенства коробок "+ box1.compare(box3));
        box3.addAnotherBox(box4);
        System.out.println("Вес третьей коробки после того как из нее пересыпали апельсины: "+box3.getWeightBox());
        System.out.println("Вес четвертой коробки стал: "+box4.getWeightBox());

    }
}