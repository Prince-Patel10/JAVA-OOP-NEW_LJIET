
class Q_11 {
// Method to add all elements of array

    public static int add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
// Method to find maximum element

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
// Method to search element in array

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // return index
            }
        }
        return -1; // not found
    }
// Main method

    public static void main(String[] args) {
// Declare and initialize array
        int[] arr = {10, 25, 5, 40, 15, 30, 20, 50, 35, 45};
        System.out.println("Addition of array elements: " + add(arr));
        System.out.println("Maximum element of array: " + max(arr));
        int key = 30;
        int index = search(arr, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
