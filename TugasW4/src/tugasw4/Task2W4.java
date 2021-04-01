
package tugasw4;

// @author Cybernet

public class Task2W4 {

    public static void main(String[] args) {
        
        System.out.println("         Do_While           ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i= 1;
        do {      
           System.out.print("  "+i+"");
                i *= 2;
        }while (i<100);
        System.out.println("");
    }
}

class test {
    
    public static void main(String[] args) {
        
        System.out.println("         Do_While           ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i= 2;
        do {      
           System.out.print(" "+i+"");
                i += 2;
        }while (i<100);
        System.out.println("");
    }
} 