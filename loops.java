public class loops {
    public static void main(String[] args){
        //for loop
        for(int i=0;i <=3;i++){
            System.out.println("hello");
        }
        //while loop
        int a = 1;
        while(a<3){
            System.out.println("world");
            a++;
        }
        //do while loop
        int c =0;
        do { 
            System.out.println("shivam here");
            c++; 
        } while (c<3);
        //ques1
        int sum = 0;
        for (int d=1;d<=5;d++){
            sum += d;
        }
        System.out.println(sum);
    }   
}
