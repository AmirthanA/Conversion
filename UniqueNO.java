import java.io.*;
import java.util.*;
public class UniqueNO
{
    
    public static void main(String args[])
    {
        int i,count=0;
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
       {
          
           a[i]=sc.nextInt();
           count=count^a[i];
       }
      
      
           System.out.println(count);
      
           }
}


