[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/5NVhkB2F)
# SistemManajemenKehadiranSiswaMiniProject
A solution for Sistem Manajemen Kehadiran Siswa mini project 
Sistem Manajemen Kehadiran Siswa adalah sistem untuk membantu sekolah mengelola catatan kehadiran mereka secara efisien. Sistem ini menyediakan antarmuka sederhana dengan menggunakan console untuk navigasi menu dan interaksi. Sistem ini menggunakan SQLite sebagai database  untuk menyimpan org.kehadiransiswa.data kehadiran dengan aman. Sistem ini menekankan prinsip-prinsip Pemrograman Berorientasi Objek (OOP) untuk memastikan modularitas kode, reuseability, dan pemeliharaan.

## Requirement
Pengerjaan terbagi menjadi 2 tahap.
Tahap 1 adalah sebagai berikut :
1. **Antarmuka Pengguna**: Menerapkan antarmuka pengguna berbasis konsol sederhana untuk interaksi dengan sistem. Gunakan menu dan perintah berbasis teks untuk navigasi dan input.
2. **Manajemen Pengguna**: Menambah, mengedit, dan menghapus akun pengguna. Pengguna dapat memperbarui informasi profil mereka (misalnya username, password, email dan role).
3. **Manajemen Course**: Menambah, mengedit, dan menghapus Course. Setiap Course harus memiliki pengidentifikasi, judul, dan deskripsi unik.
4. **Manajemen Kelas**: Menambah, mengedit dan menghapus jadwal kelas untuk setiap Course. Setiap kelas harus memiliki detail seperti tanggal, waktu, durasi, dan lokasi.
5. **Manajemen Siswa** : Menambah, mengedit, dan menghapus profil siswa. Setiap profil siswa harus menyertakan informasi dasar (misalnya nama, nomor daftar, email).
6. **Pencatatan Kehadiran**: Pengguna dapat menandai kehadiran siswa di setiap kelas. Kehadiran dapat ditandai sebagai hadir, absen, atau terlambat.

Tahap 2 adalah sebagai berikut :
1. **Otentikasi & otorisasi Pengguna**:  Menerapkan mekanisme otentikasi (username & password) dan otorisasi dasar sehingga untuk dapat menggunakan sistem, user harus menggunakan kredensial mereka (username dan password). Sistem juga harus memiliki Role yang berbeda, yaitu ADMIN, STUDENT, dan TEACHER. Role ADMIN dapat menggunakan semua fitur sistem, TEACHER tidak dapat menggunakan fitur manajemen pengguna, dan STUDENT hanya dapat melakukan Pencatatan Kehadiran. 
2. **Laporan Kehadiran**: Menghasilkan laporan kehadiran untuk masing-masing siswa atau seluruh kelas. Laporan harus mencakup persentase kehadiran, jumlah kelas yang dihadiri, dan jumlah kelas yang diselenggarakan. 
3. **Persistensi Data**: Gunakan SQLite sebagai database backend untuk menyimpan akun pengguna, kursus, kelas, siswa, dan catatan kehadiran. Pastikan desain database dan integritas org.kehadiransiswa.data yang tepat. 
4. **Validasi**: Menerapkan validasi input untuk memastikan integritas semua data dan mencegah kesalahan. Validasi dilakukan saat menginput data seperti email, format tanggal, waktu dan sebagainya. 
5. **Penanganan Kesalahan**: Tangani pengecualian dengan baik untuk memberikan pengalaman pengguna yang lancar. Menampilkan pesan kesalahan yang berarti untuk skenario umum (misalnya, kredensial masuk tidak valid, kesalahan basis org.kehadiransiswa.data). 
6. **Dokumentasi**: Menyediakan dokumentasi komprehensif termasuk ikhtisar proyek, arsitektur sistem, panduan pengguna, dan dokumentasi pengembang. Sertakan petunjuk pengaturan, pedoman penggunaan, dan tip pemecahan masalah.

## Desain
Berikut adalah desain class diagram aplikasi yang akan dibuat.  
![plot](/img/classDiagram.png)