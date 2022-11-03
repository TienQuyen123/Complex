package Complex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spTong = new Complex();

        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();

        spTong = sp1.congSP(sp2);
        System.out.println("Ket qua cua phep cong sp1 cho sp2 la:");
        spTong.hienThi();

        spTong = sp1.truSP(sp2);
        System.out.println("Ket qua cua phep tru sp1 cho sp2 la:");
        spTong.hienThi();

        spTong = sp1.nhanSP(sp2);
        System.out.println("Ket qua cua phep nhan sp1 cho sp2 la:");
        spTong.hienThi();

        spTong = sp1.chiaSP(sp2);
        System.out.println("Ket qua cua phep chia sp1 cho sp2 la:");
        spTong.hienThi();

        sc.close();
    }
}
