public class Sorting {

    //for printing array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //
    public static int[] bubbleSort(int[] arr) {
        //bubble sort -> time complexity = O(n^2)
        //compare pair of values one by one and push back larger values to the end of the array
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap values
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    //selection sort -> time complexity = O(n^2)
    //search smallest element from whole array and swap larger with smaller one so that smaller elements comes to left side and large to left.
    public static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    //insertion sort -> time complexity = O(n^2)
    //separate array into sorted and unsorted part and then take element from unsorted part and compare with sorted part and push smaller value ot leftmost
    public static int[] insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
