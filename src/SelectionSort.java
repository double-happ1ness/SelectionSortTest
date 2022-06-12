
public class SelectionSort {

    public static void sort(Comparable[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j].compareTo(arr[min_idx]) < 0) {
//                    min_idx = j;
//                }
//            }
//
//            if (min_idx != i) {
//                Comparable temp = arr[i];
//                arr[i] = arr[min_idx];
//                arr[min_idx] = temp;
//            }
//        }

        Comparable temp;
        Integer size = ArrayUtility.getNumberOfObjects(arr);
        for (Integer first = 0; first < size - 1; first++) {
            for (Integer current = first + 1; current < size; current++) {
                if (arr[current].compareTo(arr[first]) < 0) {
                    temp = arr[first];
                    arr[first] = arr[current];
                    arr[current] = temp;
                }
            }
        }
    }
}
