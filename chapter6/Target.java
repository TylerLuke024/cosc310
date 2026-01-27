package chapter6;

import java.io.PrintWriter;
import java.util.ArrayList;

abstract public class Target {
    public static final int TRIALS = 5; // constant and can be accessed by any class (static)

    protected int arr[];
    protected ArrayList<Integer> list; // can be accessed by this class and subclasses
    String name; //must be in this format: array,random_access
    private long results[] = new long[TRIALS]; // private can only be accessed within the bounds of the curley braces (in one class)

    public Target(int arr[], ArrayList<Integer> list, String name){
        this.arr = arr;
        this.list = list;
        this.name = name;
    }
    
    // method under test
    // indiciesOrnums is being used for two different purposes
    abstract public int method(int indiciesOrnums[]);


    public double runTests(int indiciesOrnums[]){
        long total = 0;
        for(int i = 0; i < TRIALS; i++){
            long start = System.nanoTime();
            int result = method(indiciesOrnums);
            long end = System.nanoTime();
            long elapsed = end - start;
            results[i] = elapsed;
        }
        double avg = total / (double) TRIALS;
        return avg;
    }

    // calculates the average time across all results
    // as well as outputs the individual results to the output stream
    public void writeResults(PrintWriter out){
        long total = 0;
        for(int i = 0; i < TRIALS; i++){
            out.printf("%s,%d,%.2f\n", name, i+1, results[i] / 1_000.0);
        }
    }

}
