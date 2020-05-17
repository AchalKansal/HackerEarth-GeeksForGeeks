package com.sap.gfg.hackerearth;

public class CountingValleysProblem {
	public static void main(String[] args) {
		String steps = "UDDDUDUU";
		int count = 0;
        int altitude = 0;
		for(char c : steps.toCharArray()) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }
		System.out.println(count);
	}
}
