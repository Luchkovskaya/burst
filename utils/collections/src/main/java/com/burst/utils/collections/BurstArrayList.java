package com.burst.utils.collections;

/**
 * Created by alona.luchkovska on 2018-02-03.
 */
public class BurstArrayList<E> implements BurstList<E> {

    private Object[] array = new Object[10];
    private int size = 0;

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void add(E element) {
        array[size++] = element;
    }

    @Override
    public void remove(E element) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                array[i] = null;
                size--;
                return;
            }
        }
    }

    @Override
    public void removeAll(E element) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                array[i] = null;
                size--;
            }
        }
    }

    @Override
    public boolean contains(E element) {
        for (Object elem : array) {
            if (element.equals(elem)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}
