import java.util.*;
public class maxstring 
{
    public static void main(String[] args) 
    {
        String a="ANIMAL";
        int c[]=new int[26];

        for(int i=0;i<a.length();i++)
        {
            c[(int)(a.charAt(i))-65]++;
        }
        System.out.println(Arrays.toString(c));
        int max=0;

        for(int i=0;i<26;i++)
        {
            if(c[i]>max)
            max=c[i];

        }
        System.out.println(max);
        
        
    }
    
}
