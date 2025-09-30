public class WeightesSubString {
    public static  boolean method(String s, int x){
        
        char prev = s.charAt(0);
        int sum = prev-'a'+1;
           if(sum == x) return true;
        for(int i =1;i<s.length();i++){
            if(prev==s.charAt(i)){
                sum+=prev-'a'+1;
            }
            else{
                prev = s.charAt(i); 
                sum = prev-'a'+1;
            } 

            
            if(sum==x){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String args[]){
         System.out.println(method("aaabbc",123));
    }
}
