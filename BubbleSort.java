public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){  // no of turns = n-2
            for(int j=0;j<n-1-i;j++){     // turns goes to --> n-2-turn
                if(arr[j]>arr[j+1]){
                    // swap the numbers 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    // optimize Bubble Sort
    public static void optimizeBubbleSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){  
            boolean swap=false;
            for(int j=0;j<n-1-i;j++){    
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
    }


    public static void printArr(int arr[]) {  // to print the array 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        optimizeBubbleSort(numbers);
        printArr(numbers);
    }
}
