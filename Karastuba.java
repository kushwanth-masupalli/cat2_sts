public class Karastuba {
    public static int kara(int x, int y) {
        if (x < 10 || y < 10) {
            return x * y;
        }

        int m = Math.max(String.valueOf(x).length(),String.valueOf(y).length());
        int mh = m/2;
        int pow10 = (int) Math.pow(10,mh);
        int a = x/pow10;
        int b = x%pow10;
        int c = y/pow10;
        int d = y%pow10;

        int ac = kara(a,c);
        int bd = kara(b,d);
        int abcd = kara(a+b,c+d);
        int result = ac * (int) Math.pow(10,mh*2)+(abcd-ac-bd)*pow10+bd ;
        return result;
    }

    public static void main(String args[]){
         System.out.println(kara(13,3));
    }
}