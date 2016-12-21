import java.util.Random;
public class Lab5_1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int lines = 5, columns = 5;
		int b[][] = new int[lines][columns];

		int k=0;
		int t=0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				b[i][j] = rand.nextInt(100);
			}
		}
		int max=b[0][0];
		int min=b[0][0];
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j < columns; j++) {
				if (b[i][j]>max){
					max=b[i][j];
					k=i;
				}
				if (b[i][j]<min){
					min=b[i][j];
					t=i;
				}
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("k=" + k +" "+"t=" + t);
		for (int j = 0; j < columns; j++) {
				int d=b[k][j];
				b[k][j]=b[t][j];
				b[t][j]=d;
		}
		for (int i = 0; i < lines; i++){
			for (int j = 0; j < columns; j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		}
}
