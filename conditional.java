import java.util.*;

public class conditional {
    public static void main(String[] args){
        // task1
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        if(nums > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        //task2
        int nums1 = sc.nextInt();
        if (nums1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        //task3
        int nums2 = sc.nextInt();
        int nums3 = sc.nextInt();
        if (nums2 == nums3){
            System.out.println("Equal");
        }
        else if (nums2 > nums3){
            System.out.println("nums2 is greater than nums3");
        }
        else{
            System.out.println("nums3 is greater than nums2");
        }
        //task3
        int nums4 = sc.nextInt();
        switch (nums4){
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("bonjour");
            break;
            default:
            System.out.println("invalid");
        }
    }
}
    