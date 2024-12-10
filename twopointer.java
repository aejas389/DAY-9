import java.util.*;
public class twopointer
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        char b[]=a.toCharArray();
        int n=b.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            char temp= b[1];
            b[1]=b[h];
            b[h]=temp;
            l++;
            h--;
        }
        String res= new String(b);
        System.out.println(res);
    

    }
    
}
