package Inpu;
import java.util.Scanner;
public class Input{

  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    	
        System.out.print("Melvin's Candy Machine \n"  );
        System.out.print("1. Candies \n");
        System.out.print("2. Chips \n");
        System.out.print("3. Gums \n");
        System.out.print("4. Cokies \n");
        
        
        int a = input.nextInt();
        if (a ==1) {
        System.out.print("You have selected Candies. Here are the items available: \n");
          System.out.print("1. Max - P2 \n");
          System.out.print("2. Snow Bear - P2 \n");
          System.out.print("3. X.O. - P2 \n");
          int b = input.nextInt();
          
          if (b==1) {
            System.out.print("How Many Max Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Max Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          
          }
          else if (b==2){
            System.out.print("How Many Snow Bear Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Snow Bear Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many  X.O. Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " X.O. Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a== 2) {
          System.out.print("You have selected Chips. Here are the items available: \n");
          System.out.print("1. Piatos - P15 \n ");
          System.out.print("2. Oishi - P10 \n");
          System.out.print("3. Rinbee- P8 \n");
          
          int b = input.nextInt();
          
          if (b==1) {
            System.out.print("How Many Piatos do you want? \n");
            int c = input.nextInt();
            int d = c * 15;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Piatos \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          
          }
          else if (b==2){
            System.out.print("How Many Oishi do you want? \n");
            int c = input.nextInt();
            int d = c * 10;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Oishi  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many  Rinbee  do you want? \n");
            int c = input.nextInt();
            int d = c * 8;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Rinbee \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a== 3) {
          System.out.print("You have selected Gums. Here are the items available: \n");
          System.out.print("1. Yukie - P1 \n ");
          System.out.print("2. Icool - P2 \n");
          System.out.print("3. VFresh - P2 \n");
          
          int b = input.nextInt();
          
          if (b==1) {
            System.out.print("How Many Yukie do you want? \n");
            int c = input.nextInt();
            int d = c * 1;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Yukie \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          
          }
          else if (b==2){
            System.out.print("How Many ICool do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " ICool  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many  VFresh  do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " VFresh \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a== 4) {
            System.out.print("You have selected Cookies. Here are the items available: \n");
          System.out.print("1. Cream O - P9  \n ");
          System.out.print("2. Chocolate Chip - P18 \n");
          System.out.print("3. Chips Delight - P13 \n");
          
          int b = input.nextInt();
          
          if (b==1) {
            System.out.print("How Many Cream O do you want? \n");
            int c = input.nextInt();
            int d = c * 9;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Cream O \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if (b==2){
            System.out.print("How Many Chocolate Chip do you want? \n");
            int c = input.nextInt();
            int d = c * 18;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Chocolate Chip  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many  Chips Delight  do you want? \n");
            int c = input.nextInt();
            int d = c * 13;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Chips Delight \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else {
          System.out.print(" Wrong input please select from the following");
        }
        input.close();
  }
}