public class MaxAverage {
    public static double solve(int num[],int row,int col,int k){
        System.out.println(row+" "+col);
        double max=0;
        for(int i=row;i<col;i++){
           max += num[i];
        }
        max=max/k;
        System.out.println(max);
       return max;

    }
    public static double slideValue(int[] nums,int row,int col,int k){
        if(col - row < k){
            return -Integer.MIN_VALUE;
        } else if (col-row>k) {
            return Math.max(slideValue(nums,row+1,col,k),slideValue(nums,row,col-1,k));
        } else {

            return Math.max(Math.max(solve(nums,row,col,k),slideValue(nums,row+1,col,k)),slideValue(nums,row,col-1,k));
        }
    }
    public static double findMaxAverage(int[] nums, int k) {

        return slideValue(nums,0,nums.length,k);
    }
    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(findMaxAverage(arr,1));
    }

}
