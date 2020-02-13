package com.thoughtworks;

import java.util.HashSet;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Card cards = new Card();
    CardMachine machine = new CardMachine(cards);
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您想抽取的卡片数：");
    int numOfCard = sc.nextInt();
    HashSet<String> cardMap = new HashSet<>();

    while (numOfCard != cardMap.size()) {
      cardMap.add(machine.drawCard());
    }

    System.out.println("请查收您的卡片:) ");
    System.out.println(String.join(" ", cardMap));
  }
}