package chapter9;

import my.util.DLinkedList;
import java.util.EmptyStackException;

public class ListStack<T> implements Stack<T> {

    DLinkedList<T> data = new DLinkedList<>();

    /****
    * designate the "end" of the ArrayList as the top of the stack
    * @param d - one piece of data we want to add to the stack 
    * 
    */
    
    @Override
    public void push(T d) {
        data.add(d);
    }
    
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.removeLast().getData();
    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data.get(data.size() - 1).getData();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "ArrayStack [data=" + data + ", top()= EMPTY" + ", size()=" + size() + "]";
        } else {
            return "ArrayStack [data=" + data + ", top()=" + top() + ", size()=" + size() + "]";
        }
    }


    

}


    

