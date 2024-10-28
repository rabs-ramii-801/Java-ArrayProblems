import java.util.*;

public class ArrayProblems {

    // 1.function to print the given Array
    public static void traverseArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 2.function to find the sum of total elements present in the given Array
    public static int sumOfArray(int[] arr) {
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 3.Function to find largest and smallest elements in the given Array
    public static ArrayList<Integer> largestSmallestElements(int[] arr) {

        int size = arr.length;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            maxValue = Integer.max(maxValue, arr[i]);
            minValue = Integer.min(minValue, arr[i]);
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(minValue);
        result.add(maxValue);
        return result;
    }

    // 4.function to find the all repeating elements in the array
    public static ArrayList<Integer> repeatingElements(int[] arr) {
        int size = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < size; i++) {
            if (set.contains(arr[i]) && !result.contains(arr[i])) {
                result.add(arr[i]);
            }
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }
        }
        return result;
    }

    // 5.function to find all the non-repeating elements in array
    public static ArrayList<Integer> nonRepeatingElements(int[] arr) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (int element : arr) {
            if (map.get(element) == 1) {
                result.add(element);
            }
        }
        return result;

    }

    // 6.function to reverse the given array
    public static ArrayList<Integer> reverseArray(int[] arr) {
        int size = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = size - 1; i >= 0; i--) {
            result.add(arr[i]);
        }
        return result;

    }

    // 7. function to the find the frequency of the each element of the given array
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer element : arr) {
            result.put(element, result.getOrDefault(element, 0) + 1);
        }
        return result;
    }

    // 8.function to find the elements at the even and odd places
    public static ArrayList<ArrayList<Integer>> elementsAtEvenOdd(int[] arr) {
        int size = arr.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                even.add(arr[i - 1]);
            } else {
                odd.add(arr[i - 1]);
            }
        }
        result.add(even);
        result.add(odd);
        return result;
    }

    // 9.function to search for a key
    public static boolean searchKey(int[] arr, int key) {
        for (Integer element : arr) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

    // 10.function to remove duplicates from the unsorted array
    public static HashSet<Integer> removeDuplicate(int[] arr) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer element : arr) {
            result.add(element);
        }
        return result;
    }

    public static void main(String[] args) {
        // this is main class
        Scanner sc = new Scanner(System.in);

        // taking inout for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // declaring array of the inputted size n
        int[] arr = new int[n];

        // taking input for the array
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // closing Scanner class object here
        sc.close();

        // ---printing the inputted array here----
        System.out.print("Your inputted Array is: ");
        traverseArray(arr);

        // ---finding sum of the elements of the array----
        int sum = sumOfArray(arr);
        System.out.println("sum of all elements of the array is: " + sum);

        // ---finding largest element in the array---
        ArrayList<Integer> result = largestSmallestElements(arr);
        System.out.println("Smallest element in the array is: " + result.get(0));
        System.out.println("Largest element in the array is: " + result.get(1));

        // ---finding al l the repeating elements in the array
        ArrayList<Integer> resultr = repeatingElements(arr);
        System.out.print("All Repeating elements in the given array are: ");
        for (Integer number : resultr) {
            System.out.print(number + " ");
        }

        // ---finding all non-repeating elements in the array
        System.out.print("\nAll non-repeating elements in the array are: ");
        ArrayList<Integer> result2 = nonRepeatingElements(arr);
        for (Integer number : result2) {
            System.out.print(number + " ");
        }

        // ---finding reverse of the array
        System.out.print("\nReverse of the given array is: ");
        ArrayList<Integer> result3 = reverseArray(arr);
        for (Integer number : result3) {
            System.out.print(number + " ");
        }

        // ---- counting frequency of each element of the array
        System.out.print("\nFrequency of each element in the array is: ");
        HashMap<Integer, Integer> map = countFrequency(arr);
        for (Integer key : map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " ");
        }

        // ---printing array elements which are at even and odd places
        ArrayList<ArrayList<Integer>> result4 = elementsAtEvenOdd(arr);
        ArrayList<Integer> even = result4.get(0);
        ArrayList<Integer> odd = result4.get(1);
        System.out.print("\nElements at even places are: ");
        for (Integer elements : even) {
            System.out.print(elements + " ");
        }
        System.out.print("\nElements at odd places are: ");
        for (Integer elements : odd) {
            System.out.print(elements + " ");
        }

        // ---searching for the key in the array
        boolean result5 = searchKey(arr, 6);
        if (result5) {
            System.out.print("\nKey found");
        } else {
            System.out.print("\nKey not found");
        }

        // ---Removing all duplicates from the array
        System.out.print("\nArray after removing all duplicate elements are: ");
        HashSet<Integer> result6 = removeDuplicate(arr);
        for (Integer element : result6) {
            System.out.print(element + " ");
        }

    }
}
