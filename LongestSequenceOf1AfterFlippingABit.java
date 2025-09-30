public class LongestSequenceOf1AfterFlippingABit {
    public static int method(String s){
        int maxLen = 0;
        int zeroCount = 0; 
        int left = 0;    

        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '0') zeroCount++;

           
            while(zeroCount > 1){
                if(s.charAt(left) == '0') zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String args[]){
        System.out.println(method("10100101010011111010010101010")); // 6
        System.out.println(method("1101110111")); // 7
        System.out.println(method("11111")); // 5
        System.out.println(method("0000")); // 1
    }
}
