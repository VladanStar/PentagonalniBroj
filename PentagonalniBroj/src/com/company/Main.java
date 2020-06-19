package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i <= 100; i++) {
            System.out.println(pentagonalniBroj(i));


        }
    }

    // metoda koja vraca pentagolalni broj na osnovu prosledjenog broja
    public static int pentagonalniBroj(int i) {
        int resenje = (i * (3 * i) - 1) / 2;
        return resenje;
    }

}