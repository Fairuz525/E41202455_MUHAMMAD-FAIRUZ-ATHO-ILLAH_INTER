package Practice.Overriding;

public class B extends A {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Memanggil method milik dari superclassnya.
        System.out.println("Method milik class B dipanggil");
    }
}
