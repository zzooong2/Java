package ObjectClass;

class INum {
	private int num ;
		public INum(int num) {
		this.num = num;
		}
		
		public boolean equals(Object obj) {
			if(this.num == ((INum)obj).num)
				return true;
			else
				return false;
		}
}
