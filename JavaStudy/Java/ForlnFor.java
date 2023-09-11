package Java;
public class ForlnFor {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
        	System.out.println("-----------------");
        	for(int j = 0; j < 3; j++) {
        		System.out.print("[" + i + "," + j + "] ");
        	}
          	System.out.print('\n');
        }
    }
}