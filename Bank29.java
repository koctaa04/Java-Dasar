import java.util.Scanner;

public class Bank29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTabunganAwal, lamaMenabung;
        double jumlahTabunganAkhir, bunga, prosentaseBunga = 0.02;

        System.out.println("Masukkan jumlah tabungan awal");
        jumlahTabunganAwal = sc.nextInt();
        System.out.println("Masukkan lama menabung");
        lamaMenabung = sc.nextInt();
        bunga = jumlahTabunganAwal * prosentaseBunga * lamaMenabung;
        jumlahTabunganAkhir = jumlahTabunganAwal + bunga;
        System.out.println("Bunga sebesar " + bunga);
        System.out.println("Jumlah tabungan akhir adalah " + jumlahTabunganAkhir);

    }
}
