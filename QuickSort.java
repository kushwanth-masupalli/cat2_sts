public class QuickSort {
    public static void quicksort(int [] arr, int l, int h ){
         if(l<h){
             int p = partition(arr,l,h);
             quicksort(arr,l,p-1);
             quicksort(arr,p+1,h);
         }
    
        }
    private static int partition(int[] arr, int l, int h) {
         int  pivot = arr[h];
         int i = l;
         int j = h-1;
         while(i<=j){
              while(i<=j && arr[i]<pivot){
                i++;
              }
              while(i<=j && arr[j]>pivot){
                j--;
              }
              if(i<=j){
                 int temp = arr[i];
                 arr[i]  = arr[j];
                 arr[j] = temp;
                 i++;
                 j--;
              }
         }
         int temp = arr[i];
         arr[i] = arr[h];
         arr[h] = temp;

         return i;
    }


    public static void main(String args[]){
        int [] arr = {9,87,6,5,42,213};
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        for(int i : arr){
        System.out.print(i+" ");
    }
}

}

