public class ShiftArray {

    // A method to shift all the items of "arr" to the right 
	// by "shift" number of places (with wraparound).
	// Example: {3, 4, 5, 6} with a shift of 1 becomes {6, 3, 4, 5} 
	public static int[] shiftBy(int[] arr, int shift) {

		// If shift is larger than the array, this expression
		// finds an equivalent shift amount. If shift is less
		// than the size of the array, this expression leaves
		// shift unchanged:
		shift = shift % arr.length;

		int[] newArray = new int[arr.length];

		for(int i = arr.length - 2; i >= 0; i--){
			//int index = (i+shift) % arr.length;
			newArray[i + 1] = arr[i];
			newArray[0] = arr[arr.length - 1];
		}

		arr = newArray;
		return arr;
	}


	public static void main(String[] args) {
		try{
			int[] a = {3, 4, 5, 6};
			int shiftAmount = Integer.valueOf(args[0]);
			if(shiftAmount < 0){
				System.out.println("Sorry, shift about must be positive.");
				return;
			}
			a = shiftBy(a, shiftAmount);
			for(int i : a){
				System.out.print(i + " ");
			}
		}catch(Exception e){
			System.out.println("Please rerun the program with proper command line arguments: " + e.getMessage());
		}
	}

}