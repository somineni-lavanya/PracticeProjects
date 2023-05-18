package pack;

import java.util.Arrays;

public class QuickSort {

	
		
		    
		    public static void quickSort(int[] array) {
		        quickSort(array, 0, array.length - 1);
		    }
		    
		    public static void quickSort(int[] array, int low, int high) {
		        if (low < high) {
		            int partitionIndex = partition(array, low, high);
		            quickSort(array, low, partitionIndex - 1);
		            quickSort(array, partitionIndex + 1, high);
		        }
		    }
		    
		    public static int partition(int[] array, int low, int high) {
		        int pivot = array[high];
		        int i = low - 1;
		        
		        for (int j = low; j < high; j++) {
		            if (array[j] <= pivot) {
		                i++;
		                swap(array, i, j);
		            }
		        }
		        
		        swap(array, i + 1, high);
		        return i + 1;
		    }
		    
		    public static void swap(int[] array, int i, int j) {
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		    }
		    
		    public static void main(String[] args) {
		        int[] array = {19, 5, 1, 13, 8, 4, 12, 7, 6};
		        
		        System.out.println("Original array: " + Arrays.toString(array));
		        quickSort(array);
		        System.out.println("Sorted array: " + Arrays.toString(array));
		    }
		


	}


