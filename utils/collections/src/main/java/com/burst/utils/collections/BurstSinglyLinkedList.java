package com.burst.utils.collections;

/**
 * Created by alona.luchkovska on 2018-02-03.
 */
public class BurstSinglyLinkedList<E> implements BurstList<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    @Override
    public E get(int index) {
        Node<E> current = first;

        for (int i = 0; i < index; i++) {
            current = current.link;
        }

        return current.element;
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (first != null && last != null) {
            last.link = newNode;
        } else {
            first = newNode;
        }

        last = newNode;

        size++;
    }

    @Override
    public void remove(E element) {
        if (size == 0) {
            return;
        }

        Node<E> previous = null;
        Node<E> current = first;
        Node<E> next = first.link;

        while (!element.equals(current.element)) {
            previous = current;
            current = current.link;
            next = current.link;
        }

        if (previous == null) {
            first = next;
        } else {
            previous.link = next;
        }

        size--;
    }

    @Override
    public void removeAll(E element) {

    }


    @Override
    public boolean contains(E element) {
        Node<E> current = first;
        while (current.link != null) {
            if (element.equals(current.element)) {
                return true;
            }
            current = current.link;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node<E> {
        Node<E> link;
        E element;

        Node(E element) {
            this.element = element;
        }
    }
}
