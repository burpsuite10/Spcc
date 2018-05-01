import java.io.*;
import java.util.*;

class pass1a
{
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int n,i,j,lc=-4;
  int match;
  System.out.print("Enter the no. of lines: ");
  n=sc.nextInt();
  String a[][]=new String[n+1][4];
  System.out.println("Enter your code:");
  a[0][0]="Label";
  a[0][1]="Opcode";
  a[0][2]="op1";
  a[0][3]="op2";
  for( i=1 ; i<=n ; i++)  
{
   for( j=0; j<4 ; j++)
     a[i][j]=sc.next();
  }
 System.out.println("\nToken Table:");
  for( i=0 ; i<=n ; i++) 
 {
   for( j=0 ; j<4 ; j++)
    System.out.print("\t"+a[i][j]);
    System.out.println();
  }
 }
}    

