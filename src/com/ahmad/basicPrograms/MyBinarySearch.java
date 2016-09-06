package com.ahmad.basicPrograms;

public class MyBinarySearch {
	public int binarySearch(int[] inputArr, int key) {
        
        int start = 1;
        System.out.println(start%10);
        int end = inputArr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
		return -1;
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
		

	}

}
