package try1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class T1 {
	
	public static void main(String[] args) throws IOException {
		
		List<List<Integer>> list0 = new ArrayList<List<Integer>>();
		List<Integer> sublist0 = new ArrayList<Integer>();
		List<Integer> sublist1 = new ArrayList<Integer>();
		List<Integer> sublist2 = new ArrayList<Integer>();
		List<Integer> sublist3 = new ArrayList<Integer>();
		List<Integer> sublist4 = new ArrayList<Integer>();
		list0.add(sublist0);
		list0.add(sublist1);
		list0.add(sublist2);
		list0.add(sublist3);
		list0.add(sublist4);
		sublist0.add(3);  sublist0.add(1);  sublist0.add(6);
		sublist1.add(100); sublist1.add(200);
		sublist2.add(20); sublist2.add(16); sublist2.add(30); sublist2.add(23); sublist2.add(33);
		sublist3.add(31); sublist3.add(17);
		sublist4.add(8); sublist4.add(29); sublist4.add(190); sublist4.add(55); sublist4.add(86);
		for (List<Integer> a : list0) {
			System.out.println("Sublist size is: " + a.size());
			for (Integer b : a) {
				System.out.print(b + "	");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("Fatherlist size is: " + list0.size());
	}
	
}
