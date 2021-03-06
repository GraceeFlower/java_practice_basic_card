package com.thoughtworks;

import java.util.Scanner;
import java.util.Set;

public class App {

  public static void main(String[] args) {
    Card cards = new Card();
    CardMachine machine = new CardMachine(cards);
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您想抽取的卡片数：");
    int numOfCard = sc.nextInt();
    while (numOfCard > 52 || numOfCard < 1) {
      System.out.println("不在范围(1~52)内哦～请重新输入：");
      numOfCard = sc.nextInt();
    }
    Set<String> cardMap = machine.drawCard(numOfCard);

    System.out.println("请查收您的卡片:) ");
    System.out.println(String.join(" ", cardMap));
  }
}