package in.ranjan.bean;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	

	public static void main(String[] args) {
		int[]a= {10,20,30,40,10,20};
		 Set<Integer>set1=new HashSet<>();
		for(int i:a) {
			set1.add(i);
		}
		System.out.println(set1);
		 String s="raja";
		 System.out.println(s.length());
		 Map<Character,Integer>map=new HashMap<>();
		 for(char c:s.toCharArray()) {
			 map.put(c,map.getOrDefault(c,0)+1);
		 }
		 Character firstNonRepeatChar=null;
		 for(char c:s.toCharArray()) {
			 if(map.get(c)==1) {
				 firstNonRepeatChar=c;
				 break;
			 }
		 }
		 if(firstNonRepeatChar!=null) {
			 System.out.println("first non-repeating character="+firstNonRepeatChar);
		 }else {
			 System.out.println("No non-repeating character found in the string.");
		 }
		 Set<Character>set=new HashSet<>();
		 for(char c:s.toCharArray()) {
			 boolean add = set.add(c);
		 }
		 System.out.println(set);
		 System.out.println(set.size());
	}

}
