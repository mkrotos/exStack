package com.krotos;

class Stos<T> {

    Item<T> head = null;
    Item<T> stock;

    public void pop(T obj) {
        stock = new Item<>();
        stock.value = obj;
        stock.previous = head;
        head = stock;
    }

    public T push() {

        T out = head.value;
        head = stock.previous;
        stock = stock.previous;

        return out;
    }

    public void clear() {
        stock = null;
        head = null;
    }

    public String toString() {
        String a;
        String b;
        if (head == null) {
            return null;
        }
        if (head.value != null) {
            a = head.value.toString();
        } else {
            a = "null";
        }
        if (head.previous != null) {
            b = head.previous.toString();
        } else {
            b = "null";
        }
        return a + ", prev: " + b;
    }

    class Item<T> {
        T value;
        Item<T> previous;

        public String toString() {
            return value.toString();
        }
    }

}
