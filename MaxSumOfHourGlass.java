public class MaxSumOfHourGlass {
     static int method(int [] [] arr){
        
        int rows = arr.length;
        int cols = arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<rows-2;i++){
            for(int j=0;j<cols-2;j++){
                 int sum = arr[i][j]+
                 arr[i][j+1]+
                 arr[i][j+2]+
                 arr[i+1][j+1]+
                 arr[i+2][j]+
                 arr[i+2][j+1]+
                 arr[i+2][j+2];
                 max = Math.max(sum,max);
            }
        }
        return max;
        
     }

     public static void main(String args[]){
          int [][] arr = {
            {1, 1, 1, 0, 0},
            {0, 1, 0, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println(method(arr));
     }
}
