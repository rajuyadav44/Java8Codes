package org.yadav.raju;

import java.util.Arrays;
import java.util.List;

public class StreamTutorial1 {

	public static void main(String[] args) {
		
		List<String> alist=Arrays.asList("a1","a2","a3","b1","b2","b3","c1","c2");
		alist.stream().findFirst().ifPresent(System.out::println);//prints a1
		alist.stream().filter(s->s.startsWith("c")).sorted().forEach(System.out::println);

	}

}
