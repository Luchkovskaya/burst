package com.burst.utils.collections;

/**
 * Created by alona.luchkovska on 2018-02-03.
 */
public interface BurstList<E> {

    E get(int index);

    void add(E element);

    void remove(E element);

    void removeAll(E element);

    boolean contains(E element);

    int size();
}
