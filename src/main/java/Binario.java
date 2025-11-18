import java.util.Arrays;
import java.util.Scanner;
public class Binario
{
    static int[] arr={0,0,0,0,0,0,0,0};
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite un número; ");
        int n= scanner.nextInt();
        for(int i=7;i>0;i--){
            if((n%2) ==0){
                arr[i]=0;

            }
            else {
                arr[i]=1;
                n=n/2;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
