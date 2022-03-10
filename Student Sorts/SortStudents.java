public class SortStudents {
    
    // bubble sort
    public static void bubbleSort(StudentInfo[] array)
    {
      StudentInfo temp;
      boolean sorted;

      do {
          sorted = true;
          
          for(int i = 0; i < array.length - 1; i++) {
              
              if(array[i].getID() > array[i + 1].getID()) {
                  
                  temp = array[i];
                  array[i] = array[i + 1];
                  array[i + 1] = temp;

                  sorted = false;
              }
          }
      } while(!sorted);
    }//bubbleSort()

    // selection sort
    public static void selectionSort(StudentInfo[] array) {
      for(int nn = 0; nn < array.length - 1; nn++) {
        int minIdx = nn;
        for(int jj = nn + 1; jj < array.length; jj++) {
          if(array[jj].getID() < array[minIdx].getID())
            minIdx = jj;
        }
        StudentInfo temp = array[minIdx];
        array[minIdx] = array[nn];
        array[nn] = temp;
      }
    }// selectionSort()

    // insertion sort
    public static void insertionSort(StudentInfo[] array) {
      for(int nn = 1; nn < array.length; nn++){
        int ii = nn;
        StudentInfo temp = array[ii];

        while((ii > 0) && (array[ii - 1].getID() > temp.getID())) {
          array[ii] = array[ii - 1];
          ii = ii - 1;
        }
        array[ii] = temp;
      }
    }// insertionSort()
}
