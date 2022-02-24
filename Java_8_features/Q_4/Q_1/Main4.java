package java_features;

import java.util.*;
import java.util.stream.Collectors;
public class Main4 {
        public static void main(String[] args)
        {
        	List<Integer> numbers=Arrays.asList(1,7,2,9,8,6,4,12,10,13,17);
        	List<Integer> even=numbers.stream().filter(num1-> num1%2==0).collect(Collectors.toList());
        	
        	System.out.println("Even numbers in list are : "+even);
        }
}
