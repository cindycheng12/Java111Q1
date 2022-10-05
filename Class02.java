package test;
class Data{
	private String name;
	private Test score;
	public class Test{
		int english;
		int math;
		   public Test(int eng,int m)      // 定義建構元Test()
		   {
		      english=eng;
		      math=m;
		   }
		    public double avg(){
			   System.out.println("avg="+(english+math)/2);
		   }

			}
    public void show() {
    	System.out.println("name="+name);
    	System.out.println("English="+english);
    }

}
public class Class02 {
	
}
