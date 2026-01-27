package chapter6;

import java.util.ArrayList;

public class ArrayAppend extends Target{

    public ArrayAppend(int arr[], ArrayList<Integer> list, String name){
        super(arr, list, name);
    }

    @Override
    public int method(int[] indiciesOrnums) {
        int result = 0;
        int largerarr[] = java.util.Arrays.copyOf(arr, arr.length+indiciesOrnums.length);
        for(int i = 0; i < indiciesOrnums.length; i++){
            result++;
            largerarr[arr.length + i] = indiciesOrnums[i];
        }
        return result;
    }
    



}
