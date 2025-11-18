import java.util.Scanner;
public class T1Job11_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=10, c=6; //r=row, c=column
        int respon[][] = new int[r][c];
        int totalResp, totalAsk;
        double avgAll;
    
    for (int i = 0; i < respon.length; i++) { //baris
        System.out.println("Responden ke-"+(i+1)+"\t: ");

        for (int j = 0; j < respon[i].length; j++) { //kolom
            System.out.print(" Penilaian ke-"+(j+1)+"\t: ");
            respon[i][j]=sc.nextInt();
            sc.nextLine();
            if (respon[i][j]<1||respon[i][j]>5) {
                System.out.println("Masukkan hanya angka 1-5!");
                j-=1;
                continue;
            }
        }
    }
    
    // BAGIAN A
    System.out.println("\nHasil Survey : ");
    for (int i = 0; i < respon.length; i++) { //baris
        System.out.print("Responden ke-"+(i+1)+"\t: ");

        for (int j = 0; j < respon[i].length; j++) { //kolom
            System.out.print(respon[i][j]+" ");
        }
        System.out.println();
    }
    
    
    // BAGAIAN B
    System.out.println("\nTotal dan rata-rata nilai tiap responden : ");
    for (int i = 0; i < respon.length; i++) { //baris
        System.out.print("total nilai responden ke-"+(i+1)+"\t: ");
        totalResp=0;
        for (int j = 0; j < respon[i].length; j++) { //kolom
            totalResp+=respon[i][j];
        }
        System.out.print(totalResp+"\t| Rata-rata : "+ (String.format("%.2f", ((double)(totalResp/c)) ) )  );
        System.out.println();
    }

    // BAGIAN C
    System.out.println("\nTotal dan rata-rata nilai tiap pertanyaan : ");
    if (respon.length>0) {
        for (int i = 0; i < respon[0].length; i++) { //baris
            System.out.print("total nilai pertanyaan ke-"+(i+1)+"\t: ");
            totalAsk=0;
            for (int j = 0; j < respon.length; j++) { //kolom
                totalAsk+=respon[j][i];
            }
            System.out.print(totalAsk+"\t| Rata-rata : "+  (String.format("%.2f",((double)(totalAsk/r)) )  )   );
            System.out.println();
        }
    }

    
    // BAGIAN D
    System.out.println();
    int total=0;
    System.out.print("Total semua nilai : ");
    for (int i = 0; i < respon.length; i++) {
        for (int j = 0; j < respon[i].length; j++) {
          total += respon[i][j];
        }
    }
    System.out.print(total);
    System.out.println();
    avgAll=total/(r*c);
    System.out.printf("Rata-rata semua nilai : %.2f \n", +avgAll);
    sc.close();
  }
}

// Sebuah perusahaan melakukan survei untuk mengukur kepuasan pelanggan terhadap 
// layanan yang diberikan. Survei tersebut terdiri dari 6 pertanyaan dengan pilihan jawaban
// bernilai 1-5. Terdapat 10 data responden yang diterima. Untuk memudahkan analisis 
// data, perusahaan ingin menggunakan array 2 dimensi untuk menyimpan hasil survei.
// Buatlah flowchart untuk:
// a. Menyimpan hasil survey
// b. Menampilkan nilai rata-rata untuk setiap responden
// c. Menampilkan nilai rata-rata untuk setiap pertanyaan
// d. Menampilkan nilai rata-rata secara keseluruhan