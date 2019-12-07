package sample;

import java.lang.reflect.Array;

public class SimpleStack<T> implements Stack<T> {

    private T[] tab;
    private int vector;
    private int capacity;



    public SimpleStack(Class<T> tClass, int capacity) {
        vector=0;
        this.capacity=capacity;
        tab =  (T[]) Array.newInstance(tClass.getClass(), capacity);
    }

    @Override
    public boolean push(T obj) {
        tab[vector]=obj;
        if(tab[vector].equals(obj)){
            vector++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public T peek() {
        T temp = tab[vector];
        tab[vector]=null;
        vector--;
        return temp;
    }

    @Override
    public T poop() {
        return tab[vector];
    }

    @Override
    public int getVector() {
        return this.vector;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }
}
