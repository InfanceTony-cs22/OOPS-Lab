public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Element found, return its index
            }
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4, 6, 2};
        int target = 4;
        
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
