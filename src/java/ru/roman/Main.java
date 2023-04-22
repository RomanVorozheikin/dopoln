package ru.roman;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 30) {
            i++;
            System.out.print(i+": ");
            if (i % 3 == 0&&i%5==0) {
                System.out.println("ping pong");
            }else if (i%5==0){
                System.out.println("pong");
            }else if(i%3==0) {
                System.out.println("ping");
            }else {
                System.out.println();
            }
        }
    }
}