public class LogicalOperations {


    public void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
    }
    public void arrayAccess(int[] arr, int num) {
        try {
            System.out.println(arr[num]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }
    public  void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}