import java.util.Scanner;

public class BubbleSort {

    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        int k=scanner.nextInt();
        int[] number = new int[k];
        for(int i=0 ; i<number.length ; i++){
            number[i] = scanner.nextInt();
        }
        for(int i = number.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( number[j] > number[j+1] ){
                    int tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
        for(int i=0 ; i<number.length ; i++){
            System.out.print(number[i] + " ");
        }
    }
}

