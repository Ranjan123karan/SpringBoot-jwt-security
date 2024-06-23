package in.ranjan.bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	
	public static void main(String[] args) {
	 String s="karan";
	 
	 List<String> sorted = Arrays.stream(s.split("")).sorted().collect(Collectors.toList());
	 System.out.println(sorted);
//	 char[] charArray = s.toCharArray();
		
		//1.Java Program to count occurance of each character in a string
	 Map<String, Long> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	 System.out.println(collect2);
    
    //2.Java program to find duplicate element from a given string?
    
    List<Entry<String, Long>> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1)
    .collect(Collectors.toList());
    System.out.println(collect);
    
    //3.Java program to find unique element from a given string?
    List<Entry<String, Long>> collect1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1)
    	    .collect(Collectors.toList());
    	    System.out.println(collect1);
    	    
    	    //4.Java program to find first non-repeat element from a given string?
    	   
    	 Entry<String, Long> entry = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).findFirst().get();
    	 System.out.println(entry);
    	    Map<Character,Integer>charCount=new HashMap();
//    	    for(char c:s.toCharArray()) {
//    	    	charCount.put(c,charCount.getOrDefault(c,0)+1);
//    	    }
//    	    Character firstNonRepeating=null;
//    	    for(char c:s.toCharArray()) {
//    	    	if(charCount.get(c)==1) {
//    	    		firstNonRepeating=c;
//    	    		break;
//    	    	}
//    	    }
//    	    if (firstNonRepeating != null) {
//                System.out.println("First non-repeating character: " + firstNonRepeating);
//            } else {
//                System.out.println("No non-repeating character found in the string.");
//            }
    	  for(char c:s.toCharArray()) {
    		  charCount.put(c,charCount.getOrDefault(c,0)+1);
    	  }
    	  Character firstNonRepeat=null;
    	  for(char c:s.toCharArray()) {
    		  if(charCount.get(c)==1) {
    			  firstNonRepeat=c;
    			  break;
    		  }
    			  	  
    	  }
    	    if(firstNonRepeat!=null) {
    	        System.out.println("First non-repeating character: " + firstNonRepeat);
    	    }
    	    else {
              System.out.println("No non-repeating character found in the string.");
          }
    	    //5.Java program to find longest String from a given array?
	        String[] strArray={"java","techie","springboot","microservices"};
	       String string = Arrays.stream(strArray).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
	       System.out.println(string);
	}
	

}
