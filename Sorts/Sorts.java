/** 
** Software Technology 152
** Class to hold various static sort methods.
*/

class Sorts
{
    // bubble sort
    public static void bubbleSort(int[] A)
    {
      int temp;
      boolean sorted;

      do {
          sorted = true;
          
          for(int i = 0; i < A.length - 1; i++) {
              
              if(A[i] > A[i + 1]) {
                  
                  temp = A[i];
                  A[i] = A[i + 1];
                  A[i + 1] = temp;

                  sorted = false;
              }
          }
      } while(!sorted);
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A) {
      for(int nn = 0; nn < A.length - 1; nn++) {
        int minIdx = nn;
        for(int jj = nn + 1; jj < A.length; jj++) {
          if(A[jj] < A[minIdx])
            minIdx = jj;
        }
        int temp = A[minIdx];
        A[minIdx] = A[nn];
        A[nn] = temp;
      }
    }// selectionSort()

    // insertion sort
    public static void insertionSort(int[] A) {
      for(int nn = 1; nn < A.length; nn++){
        int ii = nn;
        int temp = A[ii];

        while((ii > 0) && (A[ii - 1] > temp)) {
          A[ii] = A[ii - 1];
          ii = ii - 1;
        }
        A[ii] = temp;
      }
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts calss
