package JavaStudy;
public class InRecul {
    public static void main(String[] args) {
        showHi(3);
        }
    
    public static void show(int cnt) {
    	System.out.println("Hi~ ");
    	if(cnt == 1)
    		return;
    	showHi(cnt--);
    }
   }