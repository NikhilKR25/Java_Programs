package logical_programs;

public class BinarySearchArray {

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 11};

        int key = 9;

        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
//        Find the middle element.
        while (low <= high) {

            int mid = low + (high - low) / 2;
//        check key value is grater or less , Repeat until the element is found or the search space becomes empty.
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}