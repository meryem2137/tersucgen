import java.util.Scanner;

public class tersüçgen{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("basamak değeri giriniz: ");
        n=input.nextInt();
        for(int i=n; i>=1; i-- ){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int l=1; l<=(2*i)-1; l++){
                System.out.print("*");
            }System.out.println();
        }






    }}




















//www.patika.dev



































































