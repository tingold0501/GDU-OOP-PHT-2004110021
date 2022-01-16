package com.tinph2004110021.buoi1;

import java.util.Scanner;

public class Account{
    Scanner sc = new Scanner(System.in);
    int account_number = 12345, account_balance = 0, money = 0;
    public int getAccount_number() {
        return account_number;
    }
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
    public int getAccount_balance() {
        return account_balance;
    }
    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }
    public Account(int account_number, int account_balance) {
        this.account_number = account_number;
        this.account_balance = account_balance;
    }
    public void show(){
        System.out.println("==================ACCOUNT================");
        System.out.printf("%-20S %-20S\n", "account number", "account balance");
        System.out.printf("%-20d %-20d\n", this.getAccount_number(), this.getAccount_balance());
    }
    public void withdraw(){
        System.out.println("Nhập Vào Số Tiền Cần Rút:");
        money = sc.nextInt();
        money -= account_balance;

    }
    public void deposit(){
        System.out.println("Nhập Vào Số Tiền Muốn Nạp:");
        money = sc.nextInt();
        money += account_balance;
    }
}
