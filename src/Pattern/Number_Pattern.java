
	public static void main(String[] args) {
****************************************************************************		
		  for(int i =1;i<5;i++)
			{
				for (int j = 1; j <= i; j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
       
        	for(int i=5;i>0;i--) {
        		for(int j=1;j<=i;j++) {
        			System.out.print(j+" ");
        		}}}  
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
***************************************************************************************
for(int i=5;i>0;i--)
{
	for (int j =i; j>0; j--) {
		System.out.print(j+" ");
	}
	System.out.println();
}

for(int i=2;i<5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j+" ");
	}
	System.out.println();}}}
//5 4 3 2 1 
//4 3 2 1 
//3 2 1 
//2 1 
//1 
//1 2 
//1 2 3 
//1 2 3 4 
*********************************************************************************
int counter =1;

for(int i =1;i<=5;i++)
	{
		for (int j = 1; j <= i; j++) {
			System.out.print(counter+" ");
			counter++;
		}
		System.out.println();}
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

******************************************************
int n =5;

for(int i =1;i<=n;i++)
	{
	  int counter =i;
		for (int j = 1; j <= i; j++) {
			System.out.print(counter+" ");
			counter = counter+n-j;
		}
		System.out.println();}
//1 
//2 6 
//3 7 10 
//4 8 11 13 
//5 9 12 14 15 
************************************************************************************
int n =5;
for(int i =1;i<=n;i++)
	{
		for (int j = 1; j <= i; j++) {
			System.out.print(j+" ");
		}
		
		for (int j = i-1; j>=1; j--) {
			System.out.print(j+" ");
			}
		System.out.println();}}}
//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
*******************************************************************************
int n =5;
for(int i =1;i<=n;i++)
	{
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		
		for (int j = i; j<=n; j++) {
			System.out.print(j+" ");
			}
		System.out.println();}
	
   for(int i= n-1;i>=1;i--){
         for (int j = 1; j < i; j++) {
	              System.out.print(" ");}

             for (int j = i; j <= n; j++) {
	                 System.out.print(j + " ");
}
System.out.println();
}}}
//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
//4 5 
//5 
//4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5 
******************************************************
		int rows = 6; // Number of Rows we want to print
		//Printing the pattern
		for (int i = 1; i <= rows; i++)
		{
		for (int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
		for (int j = i; j <= rows; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();}}}
		
1 2 3 4 5 6 
2 3 4 5 6 
 3 4 5 6 
  4 5 6 
   5 6 
    6 
***************************************************************		
// using recursion
			static void printSpace(int space)
			{
				// base case
				if (space == 0)
					return;
				System.out.print(" ");

				// recursively calling printSpace()
				printSpace(space - 1);
			}

			// function to print asterisks
			static void printStar(int asterisk)
			{
				// base case
				if (asterisk == 0)
					return;
				System.out.print();

				// recursively calling printStar()
				printStar(asterisk - 1);
			}

			// function to print the pattern
			static void pattern(int n, int num)
			{
				// base case
				if (n == 0)
					return;
				printSpace(n - 1);
				printStar(num - n + 1);
				System.out.println("");

				// recursively calling pattern()
				pattern(n - 1, num);
			}

			// Driver code
			public static void main(String[] args)
			{
				int n = 5;
				pattern(n, n);
			}
			   * 
			   * * 
			  * * * 
			 * * * * 
			* * * * * 
*************************************************************************
	  public static void main(String[] args) {
	    char last = 'E', alphabet = 'A';

	    for (int i = 1; i <= (last - 'A' + 1); ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(alphabet + " ");
	      }
	      ++alphabet;

	      System.out.println();
	    }
	  }
	}
			   A
			   B B
			   C C C
			   D D D D
			   E E E E E
			   
********************************************************************
		  public static void main(String[] args) {
		    int rows = 5, k = 0;

		    for (int i = 1; i <= rows; ++i, k = 0) {
		      for (int space = 1; space <= rows - i; ++space) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();}}}
	
			        *
			      * * *
			    * * * * *
			  * * * * * * *
			* * * * * * * * *	
*****************************************************************************	
	 public static void main(String[] args) {
	    int rows = 4, number = 1;

	    for(int i = 1; i <= rows; i++) {

	      for(int j = 1; j <= i; j++) {
	        System.out.print(number + " ");
	        ++number;
	      }

	      System.out.println();}}
			        1 
			        2 3 
			        4 5 6 
			        7 8 9 10 
**************************************************************************
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 5 6 5 4 3 2 1 
1 2 3 4 5 6 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
*/

private static void printPattern4(int rows) {
// for loop for the rows
for (int i = 1; i <= rows; i++) {
// white spaces in the front of the numbers
int numberOfWhiteSpaces = (rows-i)*2;

//print leading white spaces
printString(" ", numberOfWhiteSpaces);

//print numbers
for(int x=1; x0; j--) {
System.out.print(j+" ");
}

//move to next line
System.out.println("");
}
}
************************************************
9 9 9 9 9 9 9 9 9 
8 8 8 8 8 8 8 8 
 7 7 7 7 7 7 7 
  6 6 6 6 6 6 
   5 5 5 5 5 
    4 4 4 4 
     3 3 3 
      2 2 
       1 
	 */
private static void printPattern7(int rows) {
	// for loop for the rows
	for (int i = rows; i >= 1; i--) {
		// white spaces in the front of the numbers
		int numberOfWhiteSpaces = rows - i;

		//print leading white spaces
		printString(" ", numberOfWhiteSpaces);

		//print character
		printString(i+" ", i);

		//move to next line
		System.out.println("");
	}
}
*******************************************************
import java.util.Scanner;  
public class DiamondPattern  
{  
public static void main(String args[])  
{  
int row, i, j, space = 1;  
System.out.print("Enter the number of rows you want to print: ");  
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
space = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}       *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *
**************************************************************
public static void main(String[] args)  
{  
int i, j, rows;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows you want to print: ");  
rows = sc.nextInt();          
for (i= 0; i<= rows-1; i++)  
{  
for (j=0; j<=i; j++)   
{  
System.out.print("*"+ " ");  
}   
System.out.println("");   
}   
for (i=rows-1; i>=0; i--)  
{  
for(j=0; j <= i-1;j++)  
{  
System.out.print("*"+ " ");  
}  
System.out.println("");  }}}
 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*******************************************************
public static void main(String args[])  
{  
int row, i, j, space = 1;  
System.out.print("Enter the number of rows you want to print: ");  
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print(i);  
}  
System.out.println("");  
}  
space = 1;  
for (j = 1; j<= row - 1; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print(" ");  
}  
space++;  
for (i = 1; i<= 2 * (row - j) - 1; i++)  
{  
System.out.print(i);  
}  
System.out.println("");  }}}  
    1
   123
  12345
 1234567
123456789
 1234567
  12345
   123
    1
 *********************************************************************
 public static void main(String[] args)  
 {  
 int i, j, k, rows=9;  
 for (i=1; i<= rows ; i++)  
 {  
 for (j = i; j < rows ; j++)   
 {  
 System.out.print(" ");  
 }     
 for (k = 1; k <= (2*i -1) ;k++)   
 {  
 if(k==1 || i == rows || k==(2*i-1))   
 {  
 System.out.print("*");  
 }  
 else   
 {  
 System.out.print(" ");  
 }  
 }  
 System.out.println("");}}}  
           *
         *    *     Trigle
        *      *
       * *  *  *
       
 **************************************************