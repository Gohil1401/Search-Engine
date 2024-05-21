//package websearchengine;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Hashtable;
//import java.util.Map;
//
//public class SortPages {
//	private static final int CUTOFF = 3;
//	
//	// Collections Sort for ranking of the pages
//	public static void rankWebPages(Hashtable<?, Integer> files, int numberOfFiles) {
//
//		ArrayList<Map.Entry<?, Integer>> fileList = new ArrayList<Map.Entry<?, Integer>>(files.entrySet());
//		
//		Comparator<Map.Entry<?, Integer>> compareByOccurence=
//				(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2)->o1.getValue().compareTo(o2.getValue());
//		//List in Descending Order of Rank
//		Collections.sort(fileList, compareByOccurence.reversed());		
//				
//	    System.out.println("\nRanked URLs are:\n");
//		int srno=1;
//		for(int i=0;i<fileList.size();i++)
//		{
//			if(fileList.get(i).getKey()!=null) {
//				System.out.println("(" + srno + ") " + fileList.get(i).getKey() + " - Occurence of Word: "+ fileList.get(i).getValue());
//				srno++;
//			}
//		}
//	}
//	
//	/**
//     * Quicksort algorithm.
//     * @param a an array of Comparable items.
//     */
//    public static <AnyType extends Comparable<? super AnyType>>
//    void quicksort( AnyType [ ] a )
//    {
//    	if(a.length>1)
//    	{
//        quicksort( a, 0, a.length - 1 );
//    	}
//        System.out.println("\nSorted URLs are:\n");
//        int srno=1;
//		for( int i = 0; i < a.length; i++ )
//		{
//			System.out.println("(" + srno + ") " + a[i]);
//			srno++;
//		}
//    }
//    
//    /**
//     * Internal quicksort method that makes recursive calls.
//     * @param a an array of Comparable items.
//     * @param left the left-most index of the subarray.
//     * @param right the right-most index of the subarray.
//     */
//    private static <AnyType extends Comparable<? super AnyType>>
//    void quicksort( AnyType [ ] a, int left, int right )
//    {
//        if( left + CUTOFF <= right )
//        {
//            AnyType pivot = median3( a, left, right );
//
//                // Begin partitioning
//            int i = left, j = right - 1;
//            for( ; ; )
//            {
//                while( a[ ++i ].compareTo( pivot ) < 0 ) { }
//                while( a[ --j ].compareTo( pivot ) > 0 ) { }
//                if( i < j )
//                    swapReferences( a, i, j );
//                else
//                    break;
//            }
//
//            swapReferences( a, i, right - 1 );   // Restore pivot
//
//            quicksort( a, left, i - 1 );    // Sort small elements
//            quicksort( a, i + 1, right );   // Sort large elements
//        }
//        else  // Do an insertion sort on the subarray
//            insertionSort( a, left, right );
//    }
//    
//    /**
//     * Return median of left, center, and right.
//     * Order these and hide the pivot.
//     */
//    private static <AnyType extends Comparable<? super AnyType>>
//    AnyType median3( AnyType [ ] a, int left, int right )
//    {
//        int center = ( left + right ) / 2;
//        if( a[ center ].compareTo( a[ left ] ) < 0 )
//            swapReferences( a, left, center );
//        if( a[ right ].compareTo( a[ left ] ) < 0 )
//            swapReferences( a, left, right );
//        if( a[ right ].compareTo( a[ center ] ) < 0 )
//            swapReferences( a, center, right );
//
//            // Place pivot at position right - 1
//        swapReferences( a, center, right - 1 );
//        return a[ right - 1 ];
//    }
//    
//    /**
//     * Method to swap to elements in an array.
//     * @param a an array of objects.
//     * @param index1 the index of the first object.
//     * @param index2 the index of the second object.
//     */
//    public static <AnyType> void swapReferences( AnyType [ ] a, int index1, int index2 )
//    {
//        AnyType tmp = a[ index1 ];
//        a[ index1 ] = a[ index2 ];
//        a[ index2 ] = tmp;
//    }
//
//    /**
//     * Internal insertion sort routine for subarrays
//     * that is used by quicksort.
//     * @param a an array of Comparable items.
//     * @param left the left-most index of the subarray.
//     * @param right the right-most index of the subarray.
//     */
//    private static <AnyType extends Comparable<? super AnyType>>
//    void insertionSort( AnyType [ ] a, int left, int right )
//    {
//        for( int p = left + 1; p <= right; p++ )
//        {
//            AnyType tmp = a[ p ];
//            int j;
//
//            for( j = p; j > left && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
//                a[ j ] = a[ j - 1 ];
//            a[ j ] = tmp;
//        }
//    }
//
package websearchengine;

import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.Hashtable;
import java.util.Map;
public class SortPages {
	private static final int CUTOFF = 3;
	
	// Collections Sort for ranking of the pages
	public static void rankWebPages(Hashtable<?, Integer> files, int numberOfFiles) {

		ArrayList<Map.Entry<?, Integer>> fileList = new ArrayList<Map.Entry<?, Integer>>(files.entrySet());
		
		Comparator<Map.Entry<?, Integer>> compareByOccurence=
				(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2)->o1.getValue().compareTo(o2.getValue());
		//List in Descending Order of Rank
		Collections.sort(fileList, compareByOccurence.reversed());		
				
	    System.out.println("\nRanked URLs are:\n");
		int srno=1;
		for(int i=0;i<fileList.size();i++)
		{
			System.out.println(fileList.get(i));
			if(fileList.get(i).getKey()!=null) {
				System.out.println("(" + srno + ") " + fileList.get(i).getKey() + " - Occurence of Word: "+ fileList.get(i).getValue());
				srno++;
			}
		}
	}
	
	/**
     * Quicksort algorithm.
     * @param a an array of Comparable items.
     */
	
	public static <AnyType extends Comparable<? super AnyType>> //heapsort code
    void heapsort(AnyType[] a) {
        int n = a.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            swapReferences(a, 0, i);

            // call max heapify on the reduced heap
            heapify(a, i, 0);
        }

        System.out.println("\nSorted URLs are:\n");
        int srno = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println("(" + srno + ") " + a[i]);
            srno = srno + 1;
        }
	}
        
//    public static <AnyType extends Comparable<? super AnyType>> //quicksort code
//    void quicksort( AnyType [ ] a )
//    {
//    	if(a.length>1)
//    	{
//        quicksort( a, 0, a.length - 1 );
//    	}
//        System.out.println("\nSorted URLs are:\n");
//        int srno=1;
//		for( int i = 0; i < a.length; i++ )
//		{
//			System.out.println("(" + srno + ") " + a[i]);
//			srno++;
//		}
//    }
    
    /**
     * Internal quicksort method that makes recursive calls.
     * @param a an array of Comparable items.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
//    private static <AnyType extends Comparable<? super AnyType>> //quicksort code
//    void quicksort( AnyType [ ] a, int left, int right )
//    {
//        if( left + CUTOFF <= right )
//        {
//            AnyType pivot = median3( a, left, right );
//
//                // Begin partitioning
//            int i = left, j = right - 1;
//            for( ; ; )
//            {
//                while( a[ ++i ].compareTo( pivot ) < 0 ) { }
//                while( a[ --j ].compareTo( pivot ) > 0 ) { }
//                if( i < j )
//                    swapReferences( a, i, j );
//                else
//                    break;
//            }
//
//            swapReferences( a, i, right - 1 );   // Restore pivot
//
//            quicksort( a, left, i - 1 );    // Sort small elements
//            quicksort( a, i + 1, right );   // Sort large elements
//        }
//        else  // Do an insertion sort on the subarray
//            insertionSort( a, left, right );
//    }
        
        private static <AnyType extends Comparable<? super AnyType>> //Heapsort code
        void heapify(AnyType[] a, int n, int i) {
            int largest = i; // Initialize largest as root
            int left = 2 * i + 1; // left = 2*i + 1
            int right = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (left < n && a[left].compareTo(a[largest]) > 0) {
                largest = left;
            }

            // If right child is larger than largest so far
            if (right < n && a[right].compareTo(a[largest]) > 0) {
                largest = right;
            }

            // If largest is not root
            if (largest != i) {
                swapReferences(a, i, largest);

                // Recursively heapify the affected sub-tree
                heapify(a, n, largest);
            }
        }
    
    /**
     * Return median of left, center, and right.
     * Order these and hide the pivot.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    AnyType median3( AnyType [ ] a, int left, int right )
    {
        int center = ( left + right ) / 2;
        if( a[ center ].compareTo( a[ left ] ) < 0 )
            swapReferences( a, left, center );
        if( a[ right ].compareTo( a[ left ] ) < 0 )
            swapReferences( a, left, right );
        if( a[ right ].compareTo( a[ center ] ) < 0 )
            swapReferences( a, center, right );

            // Place pivot at position right - 1
        swapReferences( a, center, right - 1 );
        return a[ right - 1 ];
    }
    
    /**
     * Method to swap to elements in an array.
     * @param a an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    public static <AnyType> void swapReferences( AnyType [ ] a, int index1, int index2 )
    {
        AnyType tmp = a[ index1 ];
        a[ index1 ] = a[ index2 ];
        a[ index2 ] = tmp;
    }

    /**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     * @param a an array of Comparable items.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static <AnyType extends Comparable<? super AnyType>>
    void insertionSort( AnyType [ ] a, int left, int right )
    {
        for( int p = left + 1; p <= right; p++ )
        {
            AnyType tmp = a[ p ];
            int j;

            for( j = p; j > left && tmp.compareTo( a[ j - 1 ] ) < 0; j-- )
                a[ j ] = a[ j - 1 ];
            a[ j ] = tmp;
        }
    }

   
}

//}
