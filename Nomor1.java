import java.util.Scanner;

public class Nomor1 {

    public static String inp(int N){
        if (N % 3 == 0 && N % 5 ==0){
            return "FizzBuzz";
        } else if (N  % 3 == 0){
            return"Fizz";
        } else if (N % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(N);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        System.out.println(inp(N));
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
