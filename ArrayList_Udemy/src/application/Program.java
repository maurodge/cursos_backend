package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Pedro");
		list.add(1, "Bob");
		
		System.out.println(list.size());
		
		list.remove(0);
		
		// ver os outros comendos no arraylist capgemini
		
		for (String x : list) {
			System.out.println(x);
		}

	}

}
