

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 7));
    }
    public static int binarySearch(int arr[], int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (arr[mid] == x){
                return mid;
            }else if (arr[mid]>x){
                right = mid - 1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }

//    public static int binarySearch2(int arr[], int left, int high, int x) {
//        if (left <= high) {
//            int mid = left + (high - 1) / 2;
//            if (arr[mid] == x) {
//                return x;
//            }
//            if (arr[mid] < x) {
//                return binarySearch2(arr, mid + 1, high, x);
//            } else {
//                return binarySearch2(arr, left, mid - 1, x);
//            }
//        }
//        return -1;
//    }
}
