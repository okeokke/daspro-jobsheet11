import java.util.Scanner;
public class SIAKAD08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int siswa, matkul;
    while (true) {
      System.out.print("Masukkan jumlah Mata Kuliah: ");
      matkul = sc.nextInt();
      sc.nextLine();
      
      if (matkul<1) {
        System.out.println("Masukkan angka di atas 0.");
        continue;
      } else {
        break;
      }
    }
    while (true) {
      System.out.print("Masukkan jumlah Siswa: ");
      siswa = sc.nextInt();
      sc.nextLine();
      
      if (siswa<1) {
        System.out.println("Masukkan angka di atas 0.");
        continue;
      } else {
        break;
      }
    }

    int[][] nilai = new int[siswa][matkul];
    for (int i = 0; i < nilai.length; i++) {
      System.out.println("Input nilai mahasiswa ke-"+(i+1));
      double totalPerSiswa=0;

      for (int j = 0; j < nilai[i].length; j++) {
        System.out.print("Nilai mata kuliah "+ (j+1) +": ");
        nilai[i][j]=sc.nextInt();
        totalPerSiswa+=nilai[i][j];
      }

      System.out.println("Nilai rata-rata: " + totalPerSiswa/siswa);
    }

    System.out.println("\n====================================");
    System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

    for (int i = 0; i < matkul; i++) {
      double totalPerMatkul=0;

      for (int j = 0; j < siswa; j++) {
        totalPerMatkul += nilai[j][i];
      }
      System.out.println("Mata Kuliah "+(i+1)+": "+ totalPerMatkul/matkul);
    }
    sc.close();
  }
}