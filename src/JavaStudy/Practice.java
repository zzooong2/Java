package JavaStudy;
class Practice {
    public static void main(String[] args) {
    	String[][] ar =  {
    	{"ㅋㅋ", "배고프다"},
    	{"저녁", "메뉴는"},
    	{"금득", "씨가만든카레"}
    	};
    	for(int i = 0; i < ar.length; i++) {
    		for(int j = 0; j < ar[i].length; j++) {
    			System.out.print(ar[i][j] + "\t");
        }
    	    System.out.println();
    	}
    }
}