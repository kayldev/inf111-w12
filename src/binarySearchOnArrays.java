
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
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9}, //array to store key values
					x = 5,													//x,y,z are keys to be searched in the array
					y = 2,
					z = 10,
					w	=	0,
					m = 7;

		//calling function for searching value 'x' in array 'a'
		int indexOfX = searchViaBinary(a, 0, a.length, x);
		//printing result of the function call
		System.out.println("binary search finds target " + x + " at index " + indexOfX + " which should equal 4 ");

		//same procedure for 'y' and 'z'

		int indexOfY = searchViaBinary(a, 0, a.length, y);
		System.out.println("binary search finds target " + y + " at index " + indexOfY + " which should equal 1 ");

		int indexOfZ = searchViaBinary(a, 0, a.length, z);
		System.out.println("binary search finds target " + z + " at index " + indexOfZ + " which should equal -1 ");

		int indexOfW = searchViaBinary(a, 0, a.length, w);
		System.out.println("binary search finds target " + w + " at index " + indexOfW + " which should equal -1 ");

		int indexOfM = searchViaBinary(a, 0, a.length, m);
		System.out.println("binary search finds target " + m + " at index " + indexOfM + " which should equal 6 ");

	}
	/*
		A static function to implement binary search procedure on the given array
		Input Parameters:
		1.Array on which binary search is to be performed
		2.Starting index w=value from which searching is to be started
		3.Last index upto which searching is to be performed
		4.Integer value to be searched in the given array
		Return type:integer
		Return Value:
		Either -1 if the target value is not present in the index
		or index of target if the value is present in the given array
	*/


	public static int searchViaBinary(int[] arr, int lowerBound, int upperBound, int target){
    /*
		Checking:
			 if the array passed is empty or not
												or
			if the the starting index if smaller than last index
			Returning -1 as it is invalid condition
		*/
		if (arr.length == 0 || lowerBound > upperBound){
			return -1;
		}


		int mid = (low + high) / 2;			//calculating the middle index of the array to be searched
		/*
			comparing if the value at middle index of the array is greater than,less than or equal to the target value
		*/
		if(arr[mid]>target)
			return searchViaBinary(arr, lowerBound, mid-1, target); //Recursive call of function o the left half of the given array
		else if(arr[mid] < target)
			return searchViaBinary(arr, mid + 1, upperBound, target);	//Recursive call of function o the right half of the given array
		else
			return mid; //Value at middle index of given array is equal to the target then return mid(index of the target)
		}
	}
}
