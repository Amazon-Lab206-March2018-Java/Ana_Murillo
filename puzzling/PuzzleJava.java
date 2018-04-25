import java.util.*;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava creator = new PuzzleJava();
        // creator.printSum();
        // creator.printLetter();
        // creator.arrAlphabetPrintFirstandLast();
        // creator.randomNumber55to100();
        // creator.randomNumber55to100Sorted();
        // creator.RandString();
        creator.RandStringArray();
    }

    public ArrayList<Integer> printSum() {
        int sum = 0;
        int[] arr1 = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            if (arr1[i] > 10) {
                myArray.add(arr1[i]);
            }
        }
        System.out.println(sum);
        System.out.println(myArray);
        return myArray;
    }

    public ArrayList<String> printLetter() {
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        ArrayList<String> myArray = new ArrayList<String>();
        Collections.shuffle(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].length() > 5) {
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
        return myArray;
    }

    public void arrAlphabetPrintFirstandLast() {

        String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        // ArrayList<String> myArray = new ArrayList<String>();
        Collections.shuffle(Arrays.asList(arr));
        if (arr[0] == "a" || arr[0] == "e" || arr[0] == "i" || arr[0] == "o" || arr[0] == "u") {
            System.out.println("the first value is a vowel: " + arr[0]);
        } else {
            System.out.println("First letter: " + arr[0]);
        }
        System.out.println("Last letter: " + arr[arr.length - 1]);
    }

    public ArrayList<Integer> randomNumber55to100() {
        Random random = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(45) + 56;
            myArray.add(number);
        }
        System.out.println(myArray);
        return myArray;
    }

    public ArrayList<Integer> randomNumber55to100Sorted() {
        Random random = new Random();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(45) + 56;
            myArray.add(number);
            Collections.sort(myArray);
        }
        System.out.println(myArray);
        System.out.println("This is the min: " + myArray.get(0));
        System.out.println("This is the max: " + myArray.get(9));
        return myArray;
    }

    public void RandString() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            s += alphabet.charAt(random.nextInt(26));
        }
        System.out.println(s);
    }

    public void RandStringArray() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        ArrayList<String> myArray = new ArrayList<String>();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                s += alphabet.charAt(random.nextInt(26));
            }
            myArray.add(s);
            s = "";
        }
        System.out.println(myArray);
    }
}