public class Merge_Sort{
    public static void PrintArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){

        // base case

        if(si>=ei){
            return;
        }

        // Kaam

        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // Right part
        merge(arr, si,mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei){

        // left(0,3) = 4 right(4, 6) = 3 =>6-0+1 = 7
        int temp[] = new int[ei-si+1];
        int i = si;  // iterator of 1st sorted part
        int j = mid+1; // iterator of second sorted part
        int k =0; // iterator for temp arr

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // for Rigthover elements of 2nd sorted part
        while(i <= ei){
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for(k=0, i=si;k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}