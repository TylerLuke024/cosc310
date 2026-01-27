package chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class ArrayVsArrayListLab {

    protected static int listRandomAccess(int indicies[], ArrayList<Integer> list) {
        
        int result = 0;
        for(int i = 0; i < indicies.length; i++){
            result += list.get(indicies[i]);
        }
        return result;
    }
    

    public static void main(String[] args) throws IOException{

        int arr[] = DataLoader.loadArray("C:\\cosc310\\numbers.txt");
        ArrayList<Integer> list = DataLoader.loadArrayList("C:\\cosc310\\numbers.txt");
        Random r = new Random();
        int indicies[] = new int[100_000];
        for(int i = 0; i < indicies.length; i++){
            indicies[i] = r.nextInt(arr.length);
        }
        
        PrintWriter fileout = new PrintWriter(new File("results.csv"));
        Target tests[] = new Target[8];
        double testAverages[] = new double[8];

        // you need to compare the results of the array version of the test
        // with the arraylist version of the test
        tests[0] = new ArrayRandom(arr, new ArrayList<>(list), "array,random_access");
        tests[1] = new ListRandom(arr, new ArrayList<>(list), "arraylist,random_access");
        tests[2] = new ArrayAppend(arr, new ArrayList<>(list), "array,append");
        tests[3] = new ListAppend(arr, new ArrayList<>(list), "arraylist,append");
        tests[4] = new ArrayInsert(arr, new ArrayList<>(list), "array,insert");
        tests[5] = new ListInsert(arr, new ArrayList<>(list), "arraylist,insert");
        tests[6] = new ArrayRemove(arr, new ArrayList<>(list), "array,remove");
        tests[7] = new ListRemove(arr, new ArrayList<>(list), "arraylist,remove");

        
        
        for (int i = 0; i < tests.length; i++) {
            Target target = tests[i];
            if (target != null) {
            testAverages[i] = target.runTests(indicies);
            target.writeResults(fileout);
            }
        }

        // output all of the results
        for(int i = 0; i < tests.length;i += 2){
            if(testAverages[i]<testAverages[i+1]){
                System.out.println(tests[i].name + " wins with a time of " + testAverages[i]);
            } else {
                System.out.println(tests[i+1].name + " wins with a time of " + testAverages[i+1]);
            }
        }

        

        fileout.close();
                    
    }
}
