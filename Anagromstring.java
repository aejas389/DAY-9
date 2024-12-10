import java.util.*;
public class Anagromstring {
 public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    int c1[]=new int[256];
    int c2[]=new int[256];
    for(int i=0;i<s1.length();i++)
    {
        c1[s1.charAt(i)]++;
    }
    System.out.println(Arrays.toString(c1));
 }   
}
