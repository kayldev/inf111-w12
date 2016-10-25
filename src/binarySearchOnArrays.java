
public class binarySearchOnArrays {

	/**
	 * @param args
	 */

	/*
	 * ==READ ME==
	 * You are given a sorted array of integers (in increasing order) and
	 * a target. Your task is to find the index of the target in the given
	 * array in O(lgn). A function prototype has been provided, just fill
	 * out the body.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9},
				x = 5,
				y = 2,
				z = 10;

		int indexOfX = searchViaBinary(a, 0, a.length, x);
		System.out.println("binary search finds target " + x + " at index " + indexOfX + " which should equal 4 ");

		int indexOfY = searchViaBinary(a, 0, a.length, y);
		System.out.println("binary search finds target " + y + " at index " + indexOfY + " which should equal 1 ");

		int indexOfZ = searchViaBinary(a, 0, a.length, z);
		System.out.println("binary search finds target " + z + " at index " + indexOfZ + " which should equal -1 ");

	}

	/***
	 * @param array, lower bound, upper bound, target
	 * @return index of target value
	 */
	public static int searchViaBinary(int[] arr, int lowerBound, int upperBound, int target){
		//If the array is empty or the lowerBound is above the upperBound, return -1
		if (arr.length == 0 || lowerBound > upperBound){
			return -1;
		}
		while (lowerBound < upperBound) {
			int mid = (lowerBound + upperBound / 2) - 1;
			//If target is below the curr low value
			if(arr[mid] > target)
				return searchViaBinary(arr, lowerBound, mid-1, target);
			//If target is above the curr low value
			else if(arr[mid] < target)
				return searchViaBinary(arr, mid + 1, upperBound, target);
			//If target is curr value
			else
				return mid;
		}
	}
}
