package Practice.Konstruktor;

public class C extends B{
    C() { // super(): Tambahkan kode secara otomatis oleh Java untuk memanggil KOnstruktor dari SuperClassnya
        super(); //Konstruktor dafault dari class B object dipanggil
        System.out.println("Konstruktor kelas C dieksekusi");
    }
}
