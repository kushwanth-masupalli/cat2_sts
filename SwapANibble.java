import java.util.Scanner;

public class SwapANibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-255): ");
        int x = sc.nextInt();

        if (x < 0 || x > 255) {
            System.out.println("Number must be between 0 and 255!");
            return;
        }

        int swapped = ((x & 0b00001111) << 4) | ((x & 0b11110000) >> 4);

        String originalBinary = String.format("%8s", Integer.toBinaryString(x)).replace(' ', '0');
        String swappedBinary = String.format("%8s", Integer.toBinaryString(swapped)).replace(' ', '0');

        System.out.println("Original: " + originalBinary);
        System.out.println("Swapped:  " + swappedBinary);
        System.out.println("Decimal value after swap: " + swapped);
    }
}
