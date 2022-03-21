package com.tinph2004110021.suabaikttuan6buoi11;

import com.tinph2004110021.buoi6.Animal;
import com.tinph2004110021.buoi6.Cat;

public class KhongDaHinhMang extends Animal {
    public static void main(String[] args) {
        // đang lưu mãng mèo với remote mèo
        Cat cat[] = new Cat[5];
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat[1] = cat2;
        cat[2] = cat3;
        cat[1] = new Cat();
        for (Cat cat4 : cat) {
            cat4.eat();
        }
        
    }
}
