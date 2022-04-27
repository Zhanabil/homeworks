package task.four.basics;

import java.util.List;
import java.util.ArrayList;

public class Discriminant {

    static List<Double> resultArr = new ArrayList<Double>();

    public static List<Double> function(int a, int b, int c) {

        double D = b*b - 4*a*c;

        if(D < 0) {
            return resultArr;
        } else if(D == 0) {
            resultArr.add((double)(-b/2*a));
        } else {
            resultArr.add((-b - Math.sqrt(D))/(2*a));
            resultArr.add((-b + Math.sqrt(D))/(2*a));
        }

        return resultArr;
    }

    public static void main(String args[]) {

        System.out.print(function(1, 5, 4));
    }
}
