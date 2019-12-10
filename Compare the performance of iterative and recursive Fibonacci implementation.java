package compare;
import java.util.Scanner;
public class Compare {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the last element of Fibonacci sequence: ");
int n = sc.nextInt();
long start = System.currentTimeMillis();
System.out.printf("Fibonacci sequence Iteration= %d \n", n, fibI(n));
System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
start = System.currentTimeMillis();
System.out.printf("Fibonacci sequence Recursion = %d \n", n, fibR(n));
System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
}
static int fibI(int n) {
int x = 0, y = 1, z = 1;
for (int i = 0; i < n; i++) {
x = y;
y = z;
z = x + y;
}
return x;
}
static int fibR(int n) {
if ((n == 1) || (n == 0)) {
return n;
}
return fibR(n - 1) + fibR(n - 2);
}
}
