
public class Debug {
    public static void main(String[] args) {
        int[] goodArray = {1,2,3,4,5};
        int[] emptyArray = {};
        System.out.println(calculateAverage(goodArray));
            //Did not encounter errors, I set the result to double from the beginning to avoid issues.
        //System.out.println(calculateAverage(emptyArray));
            //Returns error because the array is empty
        //System.out.println(goodArray[5]);
            //Out of bounds because the index doesn't exist
    }

    public static double calculateAverage(int[] list) {
        if (list == null || list.length == 0) {//Checks for an empty or null array before execution
            throw new IllegalArgumentException("Array can't be empty or null.");//Logs error
        }

        double result = 0;
        for (int item : list) {
            result += item;
        }
        // Logic Error: was returning result before dividing by the length to extract the average. This has been fixed.
        return result / list.length;
    }
}
// I used the deubugger at lines 10 and 16 to check the errors. It was helpful because it told me the exact issues I was dealing with.
//The issue on line 10 was an out-of-bounds error due to the index not existing in that array.
// The issue on line 16 was a Null Pointer Exception because the array passed through did not have any values inside
// it, and the debugger let me know by telling me the length of the array was zero.
// I then commented out these lines of code to allow my code to function properly.


