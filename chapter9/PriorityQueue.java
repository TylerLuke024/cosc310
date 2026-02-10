package chapter9;

import java.util.SortedMap;
import java.util.TreeMap;

public interface PriorityQueue<T> {

    SortedMap<Integer, T> data = new TreeMap<>();

    public void enqueue(int priority, T data); // establishes a priority (lower # = higher priority) and adds item to the end of the queue
    public T dequeue() throws Exception; // removes and returns item from the front of the queue
    public T front() throws Exception; // returns item from the front of the queue
    public int size(); // returns the size of the queue
    public boolean isEmpty(); // returns true if queue is empty; else return false

}

