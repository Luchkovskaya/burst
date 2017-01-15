package com.burst.utils.collections;

/**
 * @author alona.luchkovska on 2017-01-15.
 */
public class BurstLinkedList<E> {
    private Node<E> last;

    public void add(E entity) {
        this.last = new Node<>(last, entity);
    }

    public long size() {
        return 0;
    }

    private static final class Node<E> {
        private Node previous;
        private E value;

        public Node(Node previous, E value) {
            this.previous = previous;
            this.value = value;
        }
    }
}
