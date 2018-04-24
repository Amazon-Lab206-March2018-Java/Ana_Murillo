import java.util.ArrayList;

public class BasicJava {
    public static void main(String[] args) {
        BasicJava manipulator = new BasicJava();
        int[] arr = { 1, 3, -2, 8, 10 };
        double[] arr2 = { -1, -3, -2, -8.5, -10 };
        // manipulator.print1to255();
        // manipulator.printOdd1To255();
        // manipulator.printSum();
        // manipulator.iterateArr(arr);
        // manipulator.findMax(arr2);
        // manipulator.getAvg(arr);
        // manipulator.arrOddNumbers();
        // manipulator.greaterThanY(arr);
        // manipulator.squareValues(arr);
        // manipulator.eliminateNegative(arr);
        // manipulator.minMaxAvg(arr);
        manipulator.shiftValuesArray(arr);
    }

    public void print1to255() {
        for (int i = 0; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd1To255() {
        for (int i = 1; i <= 255; i = i + 2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void findMax(double[] arr2) {
        double max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println(max);
    }

    public void getAvg(int[] arr) {
        float avg = arr[0];
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;
        System.out.println(avg);
    }

    public void arrOddNumbers() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i = i + 2) {
            myArray.add(i);
        }
        System.out.println(myArray);
    }

    public void greaterThanY(int[] arr) {
        int y = 3;
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    }

    public void squareValues(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int mult = arr[i] * arr[i];
            myArray.add(mult);
        }
        System.out.println(myArray);
    }

    public void eliminateNegative(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                myArray.add(0);
            } else {
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    }

    public void minMaxAvg(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int avg = arr[0];
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        avg /= arr.length;
        myArray.add(max);
        myArray.add(min);
        myArray.add(avg);
        System.out.println(myArray);
    }

    public void shiftValuesArray(int[] arr) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            myArray.add(arr[i]);
        }
        myArray.add(0);
        System.out.println(myArray);
    }
}