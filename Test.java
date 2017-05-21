public class Test{
	public static void main(String[] args){
		Fortint value1 = new Fortint(10);
		Fortint value2 = new Fortint(15);
		Test.exchange(value1,value2);
		System.out.println("½á¹ûÎª£º\n" + value1.getTerp());
		System.out.println(value2.getTerp());
	}
	public static void exchange(Fortint a,Fortint b){
		Fortint t = new Fortint(a.getTerp());
		a.setTerp(b.getTerp());
		b.setTerp(t.getTerp());
	}
	
}

class Fortint{
	private int terp;
	public Fortint(int i){
		this.terp = i;
	}
	public void setTerp(int t){
		this.terp = t;
	}
	public int getTerp(){
		int v = this.terp;
		return v;
	}
}	

