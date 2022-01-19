package com.tinph2004110021.buoi4;

public class GuessGame {
    Player p1, p2, p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessp1, guessp2, guessp3 = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random()* 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while(true){
            System.out.println("Number to guess is " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player One Guess " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player Two Guess " + guessp2);
            guessp3 = p2.number;
            System.out.println("Player Three Guess " + guessp3);
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player One Got It Right" + p1isRight);
                System.out.println("Player Two Got It Right" + p2isRight);
                System.out.println("Player Three Got It Right" + p3isRight);
                System.out.println("Game Over");
                break;
            }
            else{
                System.out.println("Players will Have To Try Again");
            }
        }
    }
}
