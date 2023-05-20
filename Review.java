import java.util.ArrayList;


public class Review {


    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 16));
    }

    public boolean in1To10(int n, boolean outsideMode) {
        return (outsideMode)? (n <= 1 || n >= 10): (n >= 1 && n <= 10);
    }

    //checks if it should be in or out of bounds of 1-10 and
    // returns true or false dependent on the state it should be in

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }
    // the answer int we are looking for is 1 or 0 so we return true if it is either

    public int luckySum(int a, int b, int c) {
        ArrayList list = new ArrayList();

        list.add(a);
        list.add(b);
        list.add(c);

        int sum = 0;

        for(int i=0; i< list.size(); i++) {
            int num = (int) list.get(i);
            if(num == 13) break;
            sum += num;
        }
        return sum;
    }
    // asked to add all numbers unless it is 13, and then it doesn't add the numbers that follow.
    //So I created a list, so I could just break with a for loop

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public static int round10(int num) {
        int round = Math.round(num/10)*10;
        round = num % 10 >= 5? round + 10: round;
        return round;
    }

    //I used modulo to check if its remainder after 10 was 5 or more, therefore rounding up or down.

    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;
    }
    // checks whether each number is equal to 6 or if the sum or product of the two integers is 6

    public boolean makeBricks(int small, int big, int goal) {
        boolean check = false;
        for(int i=0; i<=big; i++ ){
            for(int j=0; j<=small; j++){
                if(goal == j + (5*i)) return true;
            }
        }
        return check;
    }
    //runs through all possibilities to find a match for the correct number of bricks

    public int makeChocolate(int small, int big, int goal) {
        int check = -1;
        for (int i=0; i<=small; i++){
            for(int j=0; j<=big; j++){
                if(i + (j*5) == goal) return i;
            }
        }
        return check;
    }
//similar to the one above but returning the number of small used to return the method

    public String alarmClock(int day, boolean vacation) {
        return vacation ? (day == 0 || day == 6 ? "off" : "10:00") : (day == 0 || day == 6 ? "10:00" : "7:00");
    }
    // Checks it is a weekend or a vacation and sets the alarm accordingly

}
