package chapter6;

import java.util.ArrayList;

public class ArrayInsert extends Target{

    public ArrayInsert(int arr[], ArrayList<Integer> list, String name){
        super(arr, list, name);
    }

    // insert new items at the beggining or arr
    @Override
    public int method(int[] indiciesOrnums) {
        int sum = 0;
        int largerarray[] = new int[indiciesOrnums.length + arr.length];
        for(int i = 0; i < indiciesOrnums.length; i++){
            largerarray[i] = indiciesOrnums[i];
            sum += largerarray[i];
        }
        for(int i = 0; i < arr.length; i++){
            largerarray[i + indiciesOrnums.length] = arr[i];
            sum += arr[i];
        }
        return sum;
    }

}
