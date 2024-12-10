import java.util.*;
public class capital 
{
    public static void main(String[] args) 
    {
        String a="AEJAS";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[(int)(a.charAt(i)) -65]++;
        }
        System.out.println(Arrays.toString(c));
        String a1="devara";
        int c1[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[(int)(a.charAt(i))-65]++;
        }
    
        System.out.println("Arrays to string"+  (a1));
    }
}
    
    

