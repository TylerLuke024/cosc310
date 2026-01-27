package chapter6;

public class ListAppend extends Target {

    public ListAppend(int arr[], java.util.ArrayList<Integer> list, String name) {
        super(arr, list, name);
    }    

    @Override
    public int method(int[] indicesOrnums) {
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            result++;
        }
        return result;
    }

}
