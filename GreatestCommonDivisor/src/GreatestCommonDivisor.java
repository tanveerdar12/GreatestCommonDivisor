import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int HCF(int x, int y){
        while(x !=y){
            if(x>y){
                x=x-y;
            }else{
                y=y-x;
            }
        }
        return y;
    }

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of x");
            int x = sc.nextInt();

            System.out.println("Enter value of y");
            int y = sc.nextInt();

            int factor = HCF(x, y);
            System.out.println(factor);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
    }
}

