public class MaxProductSubArray {
      public static int  method(int [] arr){
          int max = arr[0];
          int min = arr[0];
          int result = arr[0];
          for(int i=1;i<arr.length;i++){
                int curr = arr[i];
                if(curr<0){
                    int temp = max;
                    max = min;
                    min = temp;
                }

                max = Math.max(curr,max* curr);
                min = Math.min(curr,min*curr);
                result = Math.max(max,result);

          }
          return result;
      }

      public static void main(String args[]){
            int [] arr= {2,3,-2,4};
            System.out.println(method(arr));
      }
}
