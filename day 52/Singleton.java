
package singleton;


public class Singleton {

    public static void main(String[] args) {
         PrinterManager p1 = PrinterManager.getInstance();

        
        PrinterManager p2 = PrinterManager.getInstance();

        
        p1.print();
        p2.print();

        
        if (p1 == p2) {
            System.out.println("Both references point to SAME object.");
        } else {
            System.out.println("Different objects created.");
        }
       
    }
    
}
