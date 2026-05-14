class Utility {
    // Generic method — <T> before return type declares the type parameter
    //        ↓ declares T    ↓ return type    ↓ parameter

    public static <T> void printArray(T[] arr){
        System.out.print("[");
        for(T item : arr){
            System.out.print(item + " ");
        }
        System.out.println("]");
    }
    public static <T> T getFirst(T[] arr){
        return arr[0];
    }
    public static <T> void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class Generic_Method {
    public static void main(String[] args){
        Integer[] nums = {1,2,3,4,5};
        String[] names = {"Alice","Bob","Charlie"};
        Double[] marks = {9.1,8.5,7.8};

        Utility.printArray(nums);
        Utility.printArray(names);
        Utility.printArray(marks);

        System.out.println(Utility.getFirst(names));

        Utility.swap(nums,0,4);
        Utility.printArray(nums);
    }
}
