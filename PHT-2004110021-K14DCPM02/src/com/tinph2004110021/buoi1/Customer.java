package com.tinph2004110021.buoi1;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    int customer_id;
    String name, address;
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Customer(int customer_id, String name, String address) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
    }
    public void show(){
        System.out.println("====================CUSTOMER================");
        System.out.printf("%-20S %-20S %-20S\n", "customer id", "customer name", "address customer");
        System.out.printf("%-20d %-20S %-20S\n", this.getCustomer_id(), this.getName(), this.getAddress());
    }
    public void inputCustomer(){
        System.out.println("Nhập ID Customer:");
        customer_id = sc.nextInt();
        System.out.println("Nhập Tên Customer:");
        name = sc.nextLine();
        System.out.println("Nhập Địa Chỉ Customer:");
        address = sc.nextLine();
    }
}
