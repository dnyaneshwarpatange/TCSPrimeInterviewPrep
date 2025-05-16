    public class LinearSearch{
        public static void main(String[] args){
            int[] arr = {4,7,8,4,5,9,7,4};
            int etSearch = 8;
            int result = LinearSearch(arr,etSearch);
            System.out.println(result);


        }
        public static int LinearSearch(int[] arr, int etSearch){
            for(int i=0;i<arr.length;i++){
                if (arr[i]==etSearch){
                    return i;
                }
            }
            return -1;

        }
    }