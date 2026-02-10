package chapter9;

public interface Queue<T> {
    public void enqueue(T data); // adds item to the end of the queue
    public T dequeue() throws Exception; // removes and returns item from the front of the queue
    public T front() throws Exception; // returns item from the front of the queue
    public int size(); // returns the size of the queue
    public boolean isEmpty(); // returns true if queue is empty; else return false

}

