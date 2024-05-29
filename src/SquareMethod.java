import java.util.ArrayList;
import java.util.Scanner;
public class SquareMethod {
    public static void square ( ArrayList <Integer> numbers ){
        System.out.println("Square of the numbers that are in the arrayList :");
        for (int i=0;i < numbers.size();i++) {
            int result = i * i;
            System.out.print(result +" ");
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        ArrayList <Integer> numbers=new ArrayList <>();
        //int [] numbers=new int[5]
        System.out.println("Enter the Elements to store in arrayList :");
        //for (int i=0;i <l;i++){
           // numbers[i]=sc.nextInt();
            while (true){
                int input =sc.nextInt();
                if (input < 0 ){
                    break;
                }
                numbers.add(sc.nextInt());
            }
        square(numbers);
        }
    }

