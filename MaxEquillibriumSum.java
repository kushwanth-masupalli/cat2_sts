public class MaxEquillibriumSum {
    public static int method(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] pre = new int[arr.length];
        int[] suff = new int[arr.length];
        pre[0] = arr[0];
        int n = arr.length;
        suff[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }
        if(pre[n-1]==suff[n-1]){
            max = Math.max(max,pre[n-1]);
        }
        for(int i=n-2;i>=0;i--){
            suff[i] = arr[i]+suff[i+1];
            if(suff[i]==pre[i]){
                 max = Math.max(max,pre[i]);
            }
        }
        return max;
    }

    public static void main(String args[]){
        int [] arr = {-2, 5, 3, 1, 2, 6, -4, 2};
        System.out.println(method(arr));
    }
}
