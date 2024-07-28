import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");

        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("the fabonacci series of the given number is");
        for(int i=0;i<num;i++){
            System.out.print(a + " ");
            
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
        