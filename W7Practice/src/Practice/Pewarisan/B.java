package Practice.Pewarisan;

public class B extends A { // Mendeklarasikan Class B yang diturunkan
    int z;                 // dari Class A
    
    void TampilkanJumblah() {
         //subclass dapat mengakses member dari superclass
         System.out.println("Jumblah :" + (x+y+z));
    }
}    

