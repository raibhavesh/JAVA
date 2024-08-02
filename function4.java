import java.util.*;
public class function4 {
    public static int findFactorial(int a){
        int fact =1;
        for(int i=a ;i>=1;i--){

            fact = fact*i;

        }
        System.out.println(fact); 
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        findFactorial(a);
    }
    
}
