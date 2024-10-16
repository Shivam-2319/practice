public class patterns {
    public static void main(String[] args){
        //pattern 4
        int nums = 4;
        for (int i = 1;i<=nums;i++){
            for (int j=1;j<=nums;j++){
                if (j<=nums-i){
                System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern 5
        int num_row = 4;
        for (int i =1;i<=num_row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern 6
        int nums1=5;
        for(int i=0;i<=nums1-1;i++){
            for(int j=1;j<=nums1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern 7
        int nums_entry= 5;
        int number = 1;
        for(int i=1;i<=nums_entry;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println();
        //pattern 8
        int nums_row = 4;
        for(int i=1;i<=nums_row;i++){
            for(int j =1;j<=i;j++){
                int sum = i+j;
                if (sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println(

        );
        //pattern palindromic
        int n = 5;
        for (int i =1;i<=n;i++){
            int check = i;
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if (check == 1){
                    System.out.print(check+" ");
                    break;
                }
                else{
                System.out.print(check+" ");
                check--;
                }
               
            }
            for (int j =1 ; j<=i;j++){
                if (j == 1){
                    continue;
                }
                else{
                    System.out.print(j+" ");
                }
            }
            for (int j=1;j<n-i;j++){
                System.out.print(" ");
            }
        System.out.println();
        }
        System.out.println();
        //pattern diamond
        int diamond = 5;
        for (int i =1;i<=diamond;i++){
            for (int j=1;j<=diamond-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=diamond-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i =diamond;i>=1;i--){
            for (int j=1;j<=diamond-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for (int j=1;j<=diamond-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //satyasir_question
        int query = 5;
        for (int i =1;i<=query;i++){
            int reverse = i;
            for (int j=1;j<=query -i;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print(j);
            }
            for (int j =1;j<i;j++){
                reverse--;
                System.out.print(reverse);
            }

            for (int j=1;j<=query -i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
