package com.sap.gfg.hackerearth.array;

public class TwoDArrayDSProblem {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		arr[0][0] = -9;
		arr[0][1] = -9;
		arr[0][2] = -9;
		arr[0][3] = 1;
		arr[0][4] = 1;
		arr[0][5] = 1;
		arr[1][0] = 0;
		arr[1][1] = -9;
		arr[1][2] = 0;
		arr[1][3] = 4;
		arr[1][4] = 3;
		arr[1][5] = 2;
		arr[2][0] = -9;
		arr[2][1] = -9;
		arr[2][2] = -9;
		arr[2][3] = 1;
		arr[2][4] = 2;
		arr[2][5] = 3;
		arr[3][0] = 0;
		arr[3][1] = 0;
		arr[3][2] = 8;
		arr[3][3] = 6;
		arr[3][4] = 6;
		arr[3][5] = 0;
		arr[4][0] = 0;
		arr[4][1] = 0;
		arr[4][2] = 0;
		arr[4][3] = -2;
		arr[4][4] = 0;
		arr[4][5] = 0;
		arr[5][0] = 0;
		arr[5][1] = 0;
		arr[5][2] = 1;
		arr[5][3] = 2;
		arr[5][4] = 4;
		arr[5][5] = 0;
		int val = hourglassSum(arr);
		System.out.println("--" + val);
	}

	static int hourglassSum(int[][] arr) {
		int sum = 0;
		int max = -1;
		int[][] sumArr = new int[6][6];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int firstRow = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				int secondRow = arr[i + 1][j + 1];
				int thirdRow = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				sum = firstRow + secondRow + thirdRow;
				System.out.println(sum);
				if(max < sum) {
					max = sum;
				}
				sumArr[i][j] = sum;
			}
		}
		
		return max;

	}
	
	// Complete the hourglassSum function below.
	// another approach.
    static int hourglassSum1(int[][] arr) {
        int h_i ,h_j,sum=0;
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                int hourSum = hourSum(1,0,2,arr);
                if(hourSum>sum)
                sum = hourSum;
            }
        }
    return sum;
    }
    
    static int hourSum(int i, int j, int n, int[][] arr){
        int sum = 0;
        int r_n =i+2;
        int c_n =j+2;
        for (int row = i; row <=r_n ; row++) {
        for (int column = j; column <= c_n; column++) {
            if (row == i+1  && column == c_n-1) {
                sum += arr[row][column];
                continue;
            } else if(row == i+1 && column != c_n-1)
            	continue;
            else {
            	sum += arr[row][column];
            }
        }
        continue;
    }
    return sum;
    }
}
