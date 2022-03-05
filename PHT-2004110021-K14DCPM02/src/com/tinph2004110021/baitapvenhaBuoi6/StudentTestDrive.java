package com.tinph2004110021.baitapvenhaBuoi6;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Phạm Huỳnh Tín", 7, 8);
        Student student2 = new Student(2, "Bạn Thân Nhất", 8, 8);
        Student student3 = new Student();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        student3.nhapThongTinSinhVien();
        System.out.println(student3.toString());
    }
}
