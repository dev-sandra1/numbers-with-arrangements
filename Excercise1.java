import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
         Scanner entry = new Scanner(System.in);
         int numbers [] = new int [10];

         for(int i=0; i<numbers.length ; i++){
            System.out.println(" say a number: ");
            numbers[i] = entry.nextInt();
         }

         for(int i=0; i <numbers.length -1 ; i++){

         int num =0;
            if(num <= numbers[i]){
                System.out.println(numbers[i]);
            }
         }
    }
}