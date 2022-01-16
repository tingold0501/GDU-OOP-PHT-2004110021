package com.tinph2004110021.buoi2;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student std = new Student(1, "Phạm Huỳnh Tín", "Nam", "K14DCPM02", 21, 7.5);
        Student std1 = new Student(2, "Phạm Huỳnh Tín", "Nam", "K14DCPM02", 21, 7.5);
        Student std2 = new Student(3, "Phạm Huỳnh Tín", "Nam", "K14DCPM02", 21, 7.5);
        std.showSv();
        std1.showSv();
        std2.showSv();
    }
}
