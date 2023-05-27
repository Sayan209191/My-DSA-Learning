public class CheckAnArrayIsSorted {
    // check an array is sorted or not 
    public static boolean sorted(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        if(count==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    // by using Recursion
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,9,8};
        System.out.println(isSorted(numbers,0));
        System.out.println(sorted(numbers));
    }
}
