package com.tinph2004110021.buoi1;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    int employee_id, autoID_Employee = 1;
    String name_Employee, address_Employee;
    public Employee( String name_Employee, String address_Employee) {
        this.employee_id = autoID_Employee++;
        this.name_Employee = name_Employee;
        this.address_Employee = address_Employee;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getName_Employee() {
        return name_Employee;
    }
    public void setName_Employee(String name_Employee) {
        this.name_Employee = name_Employee;
    }
    public String getAddress_Employee() {
        return address_Employee;
    }
    public void setAddress_Employee(String address_Employee) {
        this.address_Employee = address_Employee;
    }
    public void show(){
        System.out.println("====================EMPLOYEE================");
        System.out.printf("%-20S %-20S %-20S\n", "employee id", "employee name", "address employee");
        System.out.printf("%-20d %-20S %-20S\n", this.employee_id, this.name_Employee, this.address_Employee);
    }
    public void inputEmployee(){
        System.out.println("Nhập Tên Employee:");
        name_Employee = sc.nextLine();
        System.out.println("Nhập Địa Chỉ Employee:");
        address_Employee = sc.nextLine();
    }
}
