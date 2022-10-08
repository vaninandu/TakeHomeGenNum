package com.techfios.takeHome;

public class TakeHome {

	public static int GetMax(int[] values) {
		int max = values [0];//9
		//System.out.println(max);
		for (int i=0;i<values.length;i++)//0<5, 1<5, 2<5, 3<5,4<5
		{
		if (values[i]<max) //9<9,2<9,6<9,8<9,3<9
		{
			max=values[i];//max=2,6,8,3
			}
		//System.out.println(max);
		}
	
	return max;
}
	public static void main(String[] args) {
		int [] trf= {9,2,6,8,3};
		GetMax(trf);
		System.out.println(GetMax(trf));
	}

}