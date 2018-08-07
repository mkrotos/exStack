package com.krotos;

class Main {
    public static void main(String[] args) {

        Stos<Integer> stock = new Stos<>();

        System.out.println(stock.toString());

        stock.pop(123);
        System.out.println(stock.toString());
        stock.pop(2);
        stock.pop(3);
        stock.pop(4);
        stock.pop(5);
        System.out.println(stock.toString());
        // System.out.println(stock.head.toString());
        // System.out.println(stock.head.previous.toString());
        System.out.println(stock.push());
        System.out.println(stock.toString());

    }
}
