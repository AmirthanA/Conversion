import java.io.*;
import java.util.*;
public class TargetNO
{
    
    public static void main(String args[])
    {
        int i,j,b=0;
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int num=sc.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
       {
          
           a[i]=sc.nextInt();

       }
       for(i=0;i<n;i++)
       for(j=i+1;j<n;j++)
       {
           if(a[i]+a[j]==num)
           {
               b=a[i]+a[j];
               
           }
       }
      
      
           System.out.print(b);
           
      
           }
}



