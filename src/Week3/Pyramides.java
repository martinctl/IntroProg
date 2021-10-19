package Week3;

public class Pyramides {
    public static void main(String[] args) {

        for (int i = 1; i<10 ; i++){
            for (int j = 9; j>0 ; j--){
                if (j<=i){
                    System.out.print(i-j+1);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }



    }
}
