package org.kehadiransiswa;

import java.util.Scanner;

public class AttendanceManagementSystem {

    public AttendanceManagementSystem() {
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di sistem presensi siswa");
            System.out.println("0. Keluar");
            System.out.print("Masukan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 0:
                    exitApps();
                default:
                    System.out.println("Pilihan tidak sesuai. Coba lagi.");
            }
        }
    }

    private void exitApps(){
        System.out.println("Keluar aplikasi. Goodbye!");
        System.exit(0);
    }

    public static void main(String[] args) {
        AttendanceManagementSystem attendanceManagementSystem = new AttendanceManagementSystem();
        attendanceManagementSystem.start();
    }
}