import java.util.Random;
public class Lab5_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int lines = 5, columns = 5;
        int z[][] = new int[lines][columns];
        int sum = z[0][0];
        int k=0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                z[i][j] = rand.nextInt(20)-10;
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
        for (int j=0; j<columns; j++){
            for (int i=0; i<lines; i++) {
                if (z[i][j] > 0) {
                    k = k + 1;
                    sum = sum + z[i][j];
                }
            }
                System.out.println("Количество положительных элементов: "+k);
                System.out.println("Сумма положительных элементов по столбцам: " + sum);
                k=0;
                sum=0;
        }
    }
}


