public class BubbleSort {
	
	void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr= {3,5,2,34,12,6};
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(arr);
		System.out.print(arr);
	}

}
