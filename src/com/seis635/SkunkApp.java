package com.seis635;

import java.util.Random;

public class SkunkApp {
    public SkunkApp(){
        this.rand  = new Random();
    }
    private Random rand;
	public static void main(String[] args) {

        System.out.println("player1");
        System.out.println("dice 1");
        System.out.println(new SkunkApp().rollDie());
        System.out.println("dice 2");
        System.out.println(new SkunkApp().rollDie());

        {


    System.out.println("player2");
    System.out.println("dice 1");
    System.out.println(new SkunkApp().rollDie());
    System.out.println("dice 2");
    System.out.println(new SkunkApp().rollDie());

}}
public int rollDie() {
    int die = this.rand.nextInt(6) + 1;
    return die;
}


}