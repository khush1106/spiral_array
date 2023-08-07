//spiral array and correct syntax of formatted output
import java.util.*;
class spiral
{
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter dimensions");
      int n;
      n=sc.nextInt();
      int count=0,m=1,g=n,r=n-1,p=n-1,q=n-1,co=1,ch=n-1,c=0,i,j,s=0;
      int a[][]=new int[n][n];
     ab: while(count != n*n)
      {
       for(i=c;i<g;i++)
       {
        a[s][i]=m;
        m++;count++;
        if(count==(n*n))
        break ab;
       }
       for(j=co;j<r;j++)
       {
        a[j][p]=m;
        m++;count++;
        if(count==(n*n))
        break ab;
       }
       for(i=ch;i>c;i--)
       {
        a[q][i]=m;
        m++;count++;
        if(count==(n*n))
        break ab;
       }
       for(j=ch;j>c;j--)
       {
        a[j][s]=m;
        m++;count++;
        if(count==(n*n))
        break ab;
       }
       s++;c++;co++;p--;q--;g--;r--;ch--;
      }
      for(int y=0;y<n;y++)
      {
        for(int z=0;z<n;z++)
        {
            System.out.printf("%5d",a[y][z]);
        }
        System.out.println();
      }
    }
}