import java.util.Scanner;

class staticTest{
    public static void main(String[]args){

        int b = 0;
        int c = 7;
        int a = test(b, c);

        System.out.println(a);

    }
    static int test(int b, int c){

        Scanner input  = new Scanner(System.in);
        b = input.nextInt();
        System.out.println("input: " + b);
        int answer = b-c;
        if(b == 10){
            System.out.println("sigma sigma on the wall, who's the skibidiest of them all?");
        }
        return answer;

    }
}