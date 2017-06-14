package datastructure.sort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	
	public static void insertionSort(int[] array) {
		int j;
		
		for (int p = 1; p < array.length; p++) {
			int tem = array[p];
			for (j = p; j > 0 && tem-array[j-1] < 0; j--) {
				array[j] = array[j-1];
			}
			array[j] = tem;
			System.out.println("第"+ p + "趟排序后的数组为" + Arrays.toString(array));
		}
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = rand.nextInt(100);
		}
		System.out.println("初始化一个10位的数组： " + Arrays.toString(array));
		
		InsertionSort.insertionSort(array);
		System.out.println("排序后的数组为： " + Arrays.toString(array));
	}
}
