/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] yes = new int[20];
		yes[0] = (int) (Math.random()*(10-1) + 1);
		yes[1] = (int) (Math.random()*(10-1) + 1);
		yes[2] = (int) (Math.random()*(10-1) + 1);
		yes[3] = (int) (Math.random()*(10-1) + 1);
		yes[4] = (int) (Math.random()*(10-1) + 1);
		yes[5] = (int) (Math.random()*(10-1) + 1);
		yes[6] = (int) (Math.random()*(10-1) + 1);
		yes[7] = (int) (Math.random()*(10-1) + 1);
		yes[8] = (int) (Math.random()*(10-1) + 1);
		yes[9] = (int) (Math.random()*(10-1) + 1);
		yes[10] = (int) (Math.random()*(10-1) + 1);
		yes[11] = (int) (Math.random()*(10-1) + 1);
		yes[12] = (int) (Math.random()*(10-1) + 1);
		yes[13] = (int) (Math.random()*(10-1) + 1);
		yes[14] = (int) (Math.random()*(10-1) + 1);
		yes[15] = (int) (Math.random()*(10-1) + 1);
		yes[16] = (int) (Math.random()*(10-1) + 1);
		yes[17] = (int) (Math.random()*(10-1) + 1);
		yes[18] = (int) (Math.random()*(10-1) + 1);
		yes[19] = (int) (Math.random()*(10-1) + 1);

		int z = (int) (Math.random()*(10-1) + 1);
		for(int x = 0; x < 20; x++){
			if(yes[x] == z){
				System.out.println("index "+ yes[x] + " is a duplicate of " + z);
			}
			if (yes[x] == yes[x-1] && (yes[x] == z && yes[x-1] == z) && yes[x-1] < 0){
				System.out.println("index " + yes[x] + " and index " + yes[x-1] + "are two duplicates of " + z + " in a row ");
			}
		}


	}
}
