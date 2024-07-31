import java.util.*;
public class function3 {
    public static int CalculateProduct(int a, int b){
        int product = (a*b);

        return product;

        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int product = CalculateProduct(a, b);

        System.out.println(product);
    }
    
}
