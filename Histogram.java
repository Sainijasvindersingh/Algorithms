package Histogram;
public class Histogram { static public int image[][]={
{1,3,5,7,9,3,4,4,5,6}, {1,3,5,7,9,3,4,4,5,6},
{1,3,5,7,9,3,4,4,5,6}, {1,3,5,20,25,24,33,5,6,4},
{1,3,5,20,35,24,32,5,6,4}, {1,3,5,20,28,34,23,5,6,4},
{1,3,5,21,25,27,23,5,6,4}, {1,3,5,7,9,3,4,4,5,6},
{1,3,5,7,9,3,4,4,5,6}, {1,3,5,7,9,3,4,4,5,6}, };
public static void main(String args[])
{ { int c1 = 0; int c2 = 0; int c3 = 0;
long start = System.currentTimeMillis();
for(int i = 0; i < 10; i++) {
for (int j = 0; j <10; j++)
{ if(image[i][j] == 1) c1++;
if(image[i][j] == 3) c2++;
if(image[i][j] == 4) c3++; } }
System.out.println("1 :" + c1);
System.out.println("2 :" + c2);
System.out.println("3 :" + c3);
System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
}
CountingSort ob = new CountingSort();
char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
'r', 'g', 'e', 'e', 'k', 's'
};
ob.sort(arr);
long start = System.currentTimeMillis();
System.out.print("Sorted character array is: ");
for (int i=0; i<arr.length; ++i)
System.out.print(arr[i]);
System.out.printf(" Time: %d ms\n", System.currentTimeMillis() - start);
}
}
class CountingSort
{
void sort(char arr[])
{
int n = arr.length;
// The output character array that will have sorted array
char output[] = new char[n];
// Create a count array to store count of indiviual
// characters and initialize count array as 0
int count[] = new int[256];
for (int i=0; i<256; ++i)
count[i] = 0;
// store count of each character
for (int i=0; i<n; ++i)
++count[arr[i]];
// Change count[i] so that count[i] now contains actual
// position of this character in output array
for (int i=1; i<=255; ++i)
count[i] += count[i-1];
// Build the output character array
// To make it stable we are operating in reverse order.
for (int i = n-1; i>=0; i--)
{
output[count[arr[i]]-1] = arr[i];
--count[arr[i]];
}
// Copy the output array to arr, so that arr now
// contains sorted characters
for (int i = 0; i<n; ++i)
arr[i] = output[i];
}
}
