package JavaStudy;
public class BitShiftOp {
    public static void main(String[] args) {
        byte num;
        
        num = 2; // 00000010      
        System.out.print((byte)(num << 1) + " "); // 00000100
        System.out.print((byte)(num << 2) + " "); // 00001000
        System.out.print((byte)(num << 3) + " " + '\n'); // 00010000
        
        num = 8; // 00001000      
        System.out.print((byte)(num >> 1) + " "); // 00000100
        System.out.print((byte)(num >> 2) + " "); // 00000010
        System.out.print((byte)(num >> 3) + " " + '\n'); // 00000001
        
        num = -8; // 10001000      
        System.out.print((byte)(num >> 1) + " "); // 10001100
        System.out.print((byte)(num >> 2) + " "); // 10001110
        System.out.print((byte)(num >> 3) + " " + '\n'); // 10001111
      }
   }