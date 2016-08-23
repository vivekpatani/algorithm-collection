package dump;

import java.util.HashSet;
import java.util.Set;

public class Dump2 {

	public static void main(String[] args) {
		
		args = new String []{"I", "saw", "I", "Came" , "I", "left"};
		
		
		
		Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();
        

        for (String a : args)
            if (!uniques.add(a)) {
            	System.out.println(a);
                dups.add(a);
            }

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
	}

}