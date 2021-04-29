package Practice.Pewarisan;

public class Demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        
        System.out.println("Super Class");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilakanNilaiXY();
        
        System.out.println("Sub Class");
        superOb.x = 5;
        superOb.y = 4;
        superOb.TampilakanNilaiXY();
        
        //member tambahan yang hanya ada pada subclass
        subOb.z = 50;
        subOb.TampilkanJumblah();
    }
}