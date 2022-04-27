package task.one.arrays;

import java.util.List;
import java.util.ArrayList;

public class Task_two {

    static int[] resultArr;

    public static void advancedFilter(int[] arr) {

        List<Integer> arrList = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            arrList.add(arr[i]);
        }

        List<Integer> resultList = new ArrayList<>();

        for(int x: arrList) {
            if(x > 0) {
                resultList.add(x);
            }
        }

        resultArr = new int[resultList.size()];

        for(int i=0; i<resultList.size(); i++) {
            int res = resultList.get(i) * 10;
            resultArr[i] = res;
            System.out.print(resultArr[i] + " ");
        }

    }

    public static void main(String args[]) {

        int[] arr = {-1, 6, -9, 3};

        advancedFilter(arr);
    }
}
