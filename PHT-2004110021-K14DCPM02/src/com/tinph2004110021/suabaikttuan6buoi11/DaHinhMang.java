package com.tinph2004110021.suabaikttuan6buoi11;

import com.tinph2004110021.buoi3.Dog;
import com.tinph2004110021.buoi6.Animal;
import com.tinph2004110021.buoi6.Cat;

public class DaHinhMang {
    public static void main(String[] args) {
        // Tạo danh sách mãng với lớp cha
        Animal animal[] = new Animal[4];
        Cat cat = new Cat();
        Cat cat2 = new Cat();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        animal[0] = cat;
        animal[1] = cat2;
        // animal[2] = dog;
        // animal[3] = dog2;
        for (Animal animal2 : animal) {
            animal2.eat();
        }
    }

}
