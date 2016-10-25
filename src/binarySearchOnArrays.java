
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
	 *
	 *
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

		/**
		* Binary search is an algorithm by which a key can be searched in an ordered 
		* list of integers by progressively narrowing the search area with every call.
		* 
		* @param arr An array of integers arranged in an increasing order
		* @param lowerBound The lower bound of the search index, i.e start of the search area
		* @param upperBound The upper bound of the search index, i.e end of the search area
		* @param target The element being searched for in arr
		* Example : 
		* searchViaBinary([1, 2, 3, 9], 0, 4, 1)
		* searchViaBinary([1, 2, 3, 9], 0, 1, 1) 
		* @returns 0, i.e the location of key to caller 
		* searchViaBinary([1, 2, 3, 9], 0, 4, 1) @returns 0 to caller, here Line#25
		*/

	public static int searchViaBinary(int[] arr, int lowerBound, int upperBound, int target){
		if (arr.length == 0 || lowerBound > upperBound){
			return -1;
		}

		/*
		 * Work with your partner and add code here! This is a sample interview question
		 * that Google, Facebook, etc. will ask
		 */
		int mid = (low + high) / 2;
		if(arr[mid]>target)
			return searchViaBinary(arr, lowerBound, mid-1, target);
		else if(arr[mid] < target)
			return searchViaBinary(arr, mid + 1, upperBound, target);
		else
			return mid;
		}
	}
}
