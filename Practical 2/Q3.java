import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] city = {"Ahmedabad", "Surat", "Gandhinagar", "Naranpura", "Rajkot"};
        System.out.println("Enter numbers from 0 to 4");
        int n = sc.nextInt();

        try {
            System.out.println("City = "+city[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            if(n<0 || n>4)
            {
                System.out.println(e);
            }
        }
    }
}