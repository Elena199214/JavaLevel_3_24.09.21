package Homework1.BoxFruit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit>{

    List<T> fruitBox;

    public Box() {
        this.fruitBox = new ArrayList<>();
    }

    //метод добавления фруктов
    public void addFruit(int number, T fruit) {
        for (int i = 0; i < number; i++) {
            fruitBox.add(fruit);
        }
    }


    public List<T> getFruitBox() {
        return fruitBox;
    }

    public float getWeightBox() {
        if (fruitBox.size() == 0) {
            return 0.0f;
        }else{
            return fruitBox.size() * fruitBox.get(0).getWeight();
        }
    }

    // сравнить коробки: true вес равен
    public boolean compare(Box<?> anotherBox) {
        return this.getWeightBox() == anotherBox.getWeightBox();
    }
    // пересыпать фрукты из текущей коробки в другую коробку
    public void addAnotherBox(Box<T> anotherBox) {
        anotherBox.getFruitBox().addAll(fruitBox);
        this.fruitBox.clear(); // освободить содержание текущей коробки
    }


}

