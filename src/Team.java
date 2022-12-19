import java.util.*;
public class Team
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0,s=0;
        int n=sc.nextInt();
        int[] a = new int[3];
        int[] b = new int[1001];

      for (int i=0;i<n;i++) {
              for(int j=0;j<=2;j++)
              {
                  a[j]=sc.nextInt();
                  s=a[0]+a[1]+a[2];
              }
              b[i]=s;
              if(b[i]>=2)
                  count++;
          }

      System.out.print(count);
    }
}
