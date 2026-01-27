package chapter6;

public class ListInsert extends Target {

    public ListInsert(int arr[], java.util.ArrayList<Integer> list, String name) {
        super(arr, list, name);
    }    

    @Override
    public int method(int[] indicesOrnums) {
        int sum = 0;
        for(int i = 0; i < indicesOrnums.length; i++){
            list.add(i, indicesOrnums[i]);
            sum++;
        }
        return sum;
    }

}
