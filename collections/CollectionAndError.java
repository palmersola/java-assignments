package collections;


import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class CollectionAndError {
    static int total;
    static int average;

    public static void main(String[] args) {
        List<Integer> numbList = new ArrayList<Integer>();

        numbList.add(345);
        numbList.add(82);
        numbList.add(456);
        numbList.add(456);
        numbList.add(45);
        numbList.add(1922);

        Set<Integer> numSet = new HashSet<>();

        numSet.addAll(numbList);
        System.out.println("The sum is: " + sum(numSet));
        average(numSet);
        System.out.println(numSet);
    }

    private static int sum(Set<Integer> numSet) {
        total = 0;
        try {
            for (int num : numSet) total += num;
            return total;
        } catch (Exception e){
            System.out.println("Couldn't calculate sum");
            return 0;
        }
    }

    private static void average(Set<Integer> numSet) {
        total = 0;
        try {
            average = sum(numSet) / numSet.size();
            System.out.println("The average of the set is: " + average);
        } catch (Exception e) {
            System.out.println("Couldn't calculate average of set");
        }
    }
}
