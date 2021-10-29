import java.util.Scanner;

class fibo{  
public static void main(String args[])  
{    
 Scanner myObj = new Scanner(System.in);
 System.out.println("Enter value n : ");
 int n = myObj.nextInt();  
 System.out.println("Printing first"+n+"numbers from Fibonacci Series");
 int n1=0,n2=1,n3,i,count=n;    
 System.out.println(n1);  
 System.out.println(n2);
    
 for(i=2;i<count;++i) 
 {    
  n3=n1+n2;    
  System.out.println(n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}}  
