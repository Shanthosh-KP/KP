import java.util.*;
public class Num{

     public static void main(String []args) {
    	 int num[] = {65, 120, 98, 75, 115};
         Arrays.sort(num);
         int n = num.length;
         for(int i=0;i<n;i++)
         {
        	 System.out.println(num[i]);
         }
     }
}
