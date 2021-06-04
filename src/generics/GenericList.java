/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;

/**
 *
 * @author huynq
 * @param <T>
 */
public class GenericList<T> {

//    private final T[] items = (T[]) new Object[10];

//    public T[] items = (T[]) new Object[10];

    public ArrayList<T> items = new ArrayList<>();

    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

}
