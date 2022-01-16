package com.tinph2004110021.buoi1;

public class MainTestDrive {
    public static void main(String[] args) {
        Account ac = new Account(12345, 1000);
        ac.show();
        ac.withdraw();
        ac.show();
        Employee el = new Employee("Phạm Huỳnh Tín", "Phú Quốc Kiên Giang");
        Employee el1 = new Employee("Phạm Huỳnh Tín", "Phú Quốc Kiên Giang");
        el.show();
        el1.show();
    }
}
