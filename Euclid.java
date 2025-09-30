public class Euclid {      
    public static int euclid(int a, int b) {          
        if (a == 0) {             
            return b;          
        }          
        return euclid(b % a, a);   // swap 'a' and 'b' properly      
    }       

    public static void main(String args[]) {          
        System.out.println(euclid(10, 10));  // Output: 10
        System.out.println(euclid(27, 15));  // Output: 3
        System.out.println(euclid(100, 80)); // Output: 20
    } 
}
