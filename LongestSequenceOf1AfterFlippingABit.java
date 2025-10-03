public class LongestSequenceOf1AfterFlippingABit {
    public static int method(String s){
        int maxlen = 0;
        int left = 0;
        int zcount = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zcount++;
            }
            while(zcount>1){
                if(s.charAt(left)=='0') zcount--;
                left++;
            }
            maxlen = Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }

    public static void main(String args[]){
        System.out.println(method("10100101010011111010010101010")); // 6
        System.out.println(method("1101110111")); // 7
        System.out.println(method("11111")); // 5
        System.out.println(method("0000")); // 1
    }
}
