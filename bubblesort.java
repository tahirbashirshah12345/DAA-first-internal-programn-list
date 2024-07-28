import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={4,3,5,2,1};

        System.out.println("The original array is " + Arrays.toString(arr));

        long start=System.nanoTime();
        bubble(arr);
        long end=System.nanoTime();

        System.out.println("the sorted array is " + Arrays.toString(arr));
        System.out.println("time taken by bubble sort is " + (end-start) + " ns");
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){


            //for each steop max ele will come at the last respective index

            for(int j=1;j<arr.length-i;j++){
                //swap if the ele is smaller then the previous one
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }

        }
    }

}
