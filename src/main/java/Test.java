import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class Test{
    public static void main(String[]args){
        int n[] = {1,2,6,5,2,1};
        Set<Integer> se = new HashSet<>();
        Set<Integer> se1 = new HashSet<>();

        for(int num:n){
            if(!se.add(num))
            {
                se1.add(num);
            }
        }
        System.out.println(se1);

    }
}