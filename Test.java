import java.util.ArrayList;
import java.util.Collections;
public class Test {
	public static final int SIZE = 10000;
	public static void main(String[] args) {
		ArrayList<Integer> randomList = new ArrayList<>();
		
		
		for(int i = 0; i < SIZE; i++) {
			randomList.add((int)(Math.random() * (SIZE-1))+ 1);
		}
		
		ArrayList<Integer> sortedList = (ArrayList<Integer>)randomList.clone();
		ArrayList<Integer> reversedList = (ArrayList<Integer>)randomList.clone();
		
		int[] randomIterations = new int[8];
		int[] sortedIterations = new int[8];
		int[] reversedIterations = new int[8];
		
		//System.out.println("\nSelection Sort");
		Collections.shuffle(randomList);
		Sort.selectionSort(randomList);
		randomIterations[0] = Sort.iterations[0];
		Sort.iterations[0] = 0;
		Collections.sort(sortedList);
		Sort.selectionSort(sortedList);
		sortedIterations[0] = Sort.iterations[0];
		Sort.iterations[0] = 0;
		Collections.reverse(reversedList);
		Sort.selectionSort(reversedList);
		reversedIterations[0] = Sort.iterations[0];
		
		
		//System.out.println("\nInsertion Sort");
		Collections.shuffle(randomList);
		Sort.insertionSort(randomList);
		randomIterations[1] = Sort.iterations[1];
		Sort.iterations[1] = 0;
		Collections.sort(sortedList);
		Sort.insertionSort(sortedList);
		sortedIterations[1] = Sort.iterations[1];
		Sort.iterations[1] = 0;
		Collections.reverse(reversedList);
		Sort.insertionSort(reversedList);
		reversedIterations[1] = Sort.iterations[1];
		
		
		//System.out.println("\nBubble Sort");
		Collections.shuffle(randomList);
		Sort.bubbleSort(randomList);
		randomIterations[2] = Sort.iterations[2];
		Sort.iterations[2] = 0;
		Collections.sort(sortedList);
		Sort.bubbleSort(sortedList);
		sortedIterations[2] = Sort.iterations[2];
		Sort.iterations[2] = 0;
		Collections.reverse(reversedList);
		Sort.bubbleSort(reversedList);
		reversedIterations[2] = Sort.iterations[2];
		
		//System.out.println("\nMerge Sort");
		Collections.shuffle(randomList);
		Sort.mergeSort(randomList);
		randomIterations[3] = Sort.iterations[3];
		Sort.iterations[3] = 0;
		Collections.sort(sortedList);
		Sort.mergeSort(sortedList);
		sortedIterations[3] = Sort.iterations[3];
		Sort.iterations[3] = 0;
		Sort.mergeSort(reversedList);
		Collections.reverse(reversedList);
		reversedIterations[3] = Sort.iterations[3];
		
		//System.out.println("\nQuick Sort");
		Collections.shuffle(randomList);
		Sort.quickSort(randomList);
		randomIterations[4] = Sort.iterations[4];
		Sort.iterations[4] = 0;
		Collections.sort(sortedList);
		Sort.quickSort(sortedList);
		sortedIterations[4] = Sort.iterations[4];
		Sort.iterations[4] = 0;
		Collections.reverse(reversedList);
		Sort.quickSort(reversedList);
		reversedIterations[4] = Sort.iterations[4];
		
		//System.out.println("\nHeap Sort");
		Collections.shuffle(randomList);
		Sort.heapSort(randomList);
		randomIterations[5] = Sort.iterations[5];
		Sort.iterations[5] = 0;
		Collections.sort(sortedList);
		Sort.heapSort(sortedList);
		sortedIterations[5] = Sort.iterations[5];
		Sort.iterations[5] = 0;
		Collections.reverse(reversedList);
		Sort.heapSort(reversedList);
		reversedIterations[5] = Sort.iterations[5];
		
		//System.out.println("\nBucket Sort");
		Collections.shuffle(randomList);
		Sort.bucketSort(randomList);
		randomIterations[6] = Sort.iterations[6];
		Sort.iterations[6] = 0;
		Collections.sort(sortedList);
		Sort.bucketSort(sortedList);
		sortedIterations[6] = Sort.iterations[6];
		Sort.iterations[6] = 0;
		Sort.bucketSort(reversedList);
		Collections.reverse(reversedList);
		reversedIterations[6] = Sort.iterations[6];
		
		//System.out.println("\nRadix Sort");
		Collections.shuffle(randomList);
		Sort.radixSort(randomList);
		randomIterations[7] = Sort.iterations[7];
		Sort.iterations[7] = 0;
		Collections.sort(sortedList);
		Sort.radixSort(sortedList);
		sortedIterations[7] = Sort.iterations[7];
		Sort.iterations[7] = 0;
		Collections.reverse(reversedList);
		Sort.radixSort(reversedList);
		reversedIterations[7] = Sort.iterations[7];
		
		System.out.println("DataSet Size: " + SIZE);
		System.out.printf("%-30s\t%-10s\t%-10s\t%-10s\n", 
							"Sorting Algorithm" , 
							"Random", "Sorted", "Reversed");
		String[] algorithms = {"Selection Sort" , 
				"Insertion Sort", "Bubble Sort", 
				"Merge Sort", "Quick Sort",
				"Heap Sort", "Bucket Sort", "Radix Sort"};
		
		for(int i = 0; i < Sort.iterations.length; i++) {
			System.out.printf("%-30s\t%-10s\t%-10s\t%-10s\n", algorithms[i], randomIterations[i], sortedIterations[i], reversedIterations[i]); 
		}
		
		//Discussion
		//an iteration seems to happen with every loop/recursion
		//bubble, insertion, and merge are stable sorting algorithms so their iterations seem to vary less
		//on the other hand, selection, quick, and heap aren't stable sorting algorithms so their iterations vary a lot, especially quick sort
		//The iterations for selection, insertion, and bubble tend to be large due to their average time complexity being O(n^2)
		//on the other hand, merge and heap have an average time complexity of O(n log2 n) and their worst time complexity being the same
		//this leads to less iterations
		//for quick sort, in addition to its instability, the best and worst time complexities vary from O(n log2 n) to O(n^2) so the iterations can vary a lot too
		//bucket and radix sort are both stable and great time complexities, so the iterations for those are low
		
	}
}

