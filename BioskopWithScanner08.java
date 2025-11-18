import java.util.Scanner;
public class BioskopWithScanner08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int baris, kolom;
    String nama, next;
    String[][] penonton = new String[4][2];
    int menu;
    while (true) {
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu : ");menu=sc.nextInt(); sc.nextLine();

        if (menu==1) {
            while (true) {
                System.out.print("Masukkan nama: ");
                nama=sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris=sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan kolom: ");
                kolom=sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Kursi tidak tersedia.");
                    continue;
                }

                penonton[baris-1][kolom-1]=nama;
                
                System.out.print("Input penonton lainnya? (y/n): ");
              next = sc.nextLine();
        
              if (next.equalsIgnoreCase("n")) {
                break;
              }
            }
        }
        if (menu==2) {
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    System.out.print(penonton[i][j] + "\t");
                }
                System.out.println();
            }
        }
        if (menu==3) {
            break;
        }
        if (menu>3 || menu<1){
            System.out.println("Masukkan Angka 1, 2, atau 3.");
        }
    }
    sc.close();
    
  }
}
