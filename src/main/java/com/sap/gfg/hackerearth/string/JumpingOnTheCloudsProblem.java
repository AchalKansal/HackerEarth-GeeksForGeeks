package com.sap.gfg.hackerearth.string;

/**
 * Emma is playing a new mobile game that starts with consecutively numbered
 * clouds. Some of the clouds are thunderheads and others are cumulus. She can
 * jump on any cumulus cloud having a number that is equal to the number of the
 * current cloud plus 1 or 2. She must avoid the thunderheads. Determine the
 * minimum number of jumps it will take Emma to jump from her starting position
 * to the last cloud. It is always possible to win the game.
 * 
 * For each game, Emma will get an array of clouds numbered 0 if they are safe
 * or 1 if they must be avoided. For example, c = [0,1,0,0,0,1,0] if they must
 * be avoided. For example, 0....6 . The number on each cloud is its index in
 * the list so she must avoid the clouds at indexes 1 and 5 . She could follow
 * the following two paths: 0-> 2-> 4 -> 6 or 0->2->3->4->6. The first path
 * takes 3 jumps while the second takes 4 .
 * 
 * function Description
 * 
 * Complete the jumpingOnClouds function in the editor below. It should return
 * the minimum number of jumps required, as an integer.
 * 
 * jumpingOnClouds has the following parameter(s):
 * 
 * c: an array of binary integers
 * 
 * Input Format
 * 
 * The first line contains an integer n, the total number of clouds. The second
 * line contains space-separated binary integers describing clouds c[i] where
 * 0<= i <n.
 * 
 * Sample input: 7
 * 
 * 
 * 0 0 1 0 0 1 0
 * 
 * Sample Output : 4
 *
 */

public class JumpingOnTheCloudsProblem {
	public static void main(String[] args) {
		int[] c = new int[7];
		c[0] = 0;
		c[1] = 0;
		c[2] = 1;
		c[3] = 0;
		c[4] = 0;
		c[5] = 1;
		c[6] = 0;
		int jumps = jumpingOnClouds(c);
		System.out.println("jumps: " + jumps);
	}

	static int jumpingOnClouds(int[] c) {
		int jumps = -1;
		for (int i = 0; i < c.length; i++, jumps++) {
			if (i < c.length - 2 && c[i + 2] == 0)
				i++;
		}
		return jumps;
	}
}
