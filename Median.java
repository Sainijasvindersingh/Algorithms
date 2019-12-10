import java.util.Scanner;
public class Median {
   public static void main(String[] args) {
       int list[] = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter five integers");
       for (int i = 0; i < list.length; i++) {
           list[i] = Integer.parseInt(sc.next());
       }       
       for (int i = 0; i < list.length - 1; i++) {
           for (int j = i + 1; j < list.length; j++) {
               if (list[i] > list[j]) {
                   int temp = list[i];
                   list[i] = list[j];
                   list[j] = temp;
               }
           }
       }       
       double median;
       double sum = 0;
       for (int i = 0; i < list.length; i++) {
           sum = sum + list[i];
       }
       median = list[5 / 2];
       System.out.println("Median is : " + median);
   }
}

