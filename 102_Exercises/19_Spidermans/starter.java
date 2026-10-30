/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman def = new Spiderman();
		
		
		Spiderman TM = new Spiderman("Tobey Maguire");
		System.out.println(TM.getAct());
		System.out.println(TM.setAge(49));
		System.out.println(TM.setEvil("dihhwood"));
		System.out.println();
		
		Spiderman AG = new Spiderman("Andrew Garfield", 40);
		System.out.println(AG.getAct());
		System.out.println(AG.getAge());
		System.out.println(AG.setEvil("chudington the chuddest"));
		System.out.println();
		
		Spiderman TH = new Spiderman("Tom Holland", 27);
		System.out.println(TH.getAct());
		System.out.println(TH.getAge());
		System.out.println(TH.setEvil("blobby"));
		System.out.println();

		Spiderman MM = new Spiderman("Miles Morales", 15, "Kingpin");
		System.out.println(MM.getAct());
		System.out.println(MM.getAge());
		System.out.println(MM.getEvil());
		
	}
}
