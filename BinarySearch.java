public class BinarySearch {
    public static void main(String[] args){
        int[] arr= {1,4,5,8,8,9,10};
        int target = 5;
        int result = BinarySearch(arr, target);
        System.out.println(result);


    }
    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target<arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return -1;


    }
    
}
