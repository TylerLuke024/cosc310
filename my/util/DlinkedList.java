package my.util;

// linked lists are a list that serves as a way of distributing data

public class DlinkedList<T> {

    private DNode<T> head;
    private DNode<T> tail;

    public DLinkedList() {

    }
    
    public void addAfter(DNode<T> node, T data) {
            size++;
        }
    public void add(T data) {
        DNode<T> newNode = new DNode<>(tail, null, data);
        size++;
        if(size == 1) {
            head = newnode;
        }
        else{
            tail.setNext(newnode);
            newnode.setPrev(tail);
        }
        tail = newnode;
    }

}
