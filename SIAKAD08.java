import java.util.Scanner;
public class SIAKAD08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] nilai = new int[4][3];
    for (int i = 0; i < nilai.length; i++) {//line
      System.out.println("Inout nilai mahasiswa ke-"+(i+1)+" : ");
      for (int j = 0; j < nilai.length; j++) {
        System.out.print("Nilai mata kuliah ke-"+(i+1)+" : ");
        nilai[i][j]=sc.nextInt();
      }
      
    }
    sc.close();
  }
}
