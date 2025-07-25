import java.util.Scanner;

public class RotateArrayWithKPos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to insert in array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter K value:");
        int k = sc.nextInt();

        String shift;
        System.out.println("Enter Right or left shift");
        shift=sc.next();

        rotate(nums,k,shift);
        System.out.println("Array after rotating by " + k + " positions:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void rotate(int[]nums,int k,String shift)
    {
        k=k% nums.length;

        if(shift=="right"){
            //Right Shift by k
            reverse(nums,0, nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k, nums.length-1);

        }
        else {
            //Left Shift by k
            reverse(nums,0,k-1);
            reverse(nums,k, nums.length-1);
            reverse(nums,0, nums.length-1);

        }
    }

    public  static  void reverse(int nums[],int start,int end){
        while (start<end)
        {
//            int temp=nums[start];
//            nums[start++]=nums[end];
//            nums[end--]=temp;

            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;

            start++;
            end--;
        }

    }

}
