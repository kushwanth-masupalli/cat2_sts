public class LeadersInAnArray {
    public static int method(int [] nums){
        int max = nums[nums.length-1];
        int count = 1;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] > max){
                count++;
                max = nums[i];  
            } else {
                max = Math.max(max, nums[i]);
            }
        }
        return count;
    }

    public static void main(String args[]){
        int [] arr = {4, 3, 1};
        System.out.println(method(arr));
    }
}
