package task.one.arrays;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

/* Задача 1. Сравнить массивы
Создайте функцию compareArrays(arr1, arr2), которая с помощью функции высшего порядка будет
сравнивать значения двух массивов.
Если массивы имеют одинаковые значения на одинаковых индексах, compareArrays должна выдавать true (иначе false).*/
       /* compareArrays([8, 9], [6]) // false, разные значения
        compareArrays([8, 9, 5, 4], [8, 9, 5, 4, 8, 3, 5]) // false, разные значения
        compareArrays([9, 2, 4, 8, 2], [9, 2, 4]) // false, разные значения
        compareArrays([1, 2, 3], [2, 3, 1]) // false, разные индексы, хотя и одинаковые значения
        compareArrays([8, 1, 2], [8, 1, 2]) // true*/
public class Task_one {

    public static void addArrays(int[] arr1, int[] arr2) {

        List<Integer> arrFirstList = new ArrayList<>();

        for(int i=0; i<arr1.length; i++) {
            arrFirstList.add(arr1[i]);
        }

        List<Integer> arrSecondList = new ArrayList<>();

        for(int i=0; i<arr2.length; i++) {
            arrSecondList.add(arr2[i]);
        }

        ArrayClassCompare obj = new ArrayClassCompare();

        System.out.println(obj.compareArrays(arrFirstList, arrSecondList));
    }

    public static void main(String args[]) {

        addArrays(new int[]{8, 9}, new int[]{6}); // false

        addArrays(new int[]{8, 9, 5, 4}, new int[]{8, 9, 5, 4, 8, 3, 5}); // false

        addArrays(new int[]{9, 2, 4, 8, 2}, new int[]{9, 2, 4}); // false

        addArrays(new int[]{1, 2, 3}, new int[]{2, 3, 1}); // false

        addArrays(new int[]{8, 1, 2}, new int[]{8, 1, 2}); // true

    }

    private static class ArrayClassCompare {
        // Проверка на сравнение
        public boolean compareArrays(List<?> arrFirst, List<?> arrSecond) {

            // Проверка на соотвествие индексов и значений массивов
            if(arrFirst.size() < arrSecond.size()) {
                if(arrFirst.containsAll(arrSecond)) {
                    for(int i=0; i<arrSecond.size(); i++) {
                        if(arrSecond.get(i).equals(arrFirst.get(i))) {
                            return true;
                        }
                    }
                }
            } else {
                if(arrSecond.containsAll(arrFirst)) {
                    for(int i=0; i<arrFirst.size(); i++) {
                        if(arrFirst.get(i).equals(arrSecond.get(i))) {
                            return true;
                        }
                    }
                }
            }

            return false;
        }
    }
}
