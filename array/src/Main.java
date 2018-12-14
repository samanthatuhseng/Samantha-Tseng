import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int [4];
         int pos = 0;
        while(in.hasNextInt()){
            nums[pos] = in.nextInt();
            pos++;
        }


        if((nums[0]== 8|| nums[0] == 9)&&(nums[3] == 8 || nums[3] == 9)&&(nums[1] == nums[2])) {
            System.out.println("ignore");
            }

        else {
            System.out.println("answer");
        }

    }
}
