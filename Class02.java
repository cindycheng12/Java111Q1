package Java111Q1;
class Data{
	private String name;
	private Test score;
	public class Test{
		int english;
		int math;
		Test(int eng,int m)      // 定義建構元Test()
		{
		    english=eng;
		    math=m;
		}
		double avg(){
			return(english+math)/2;
		}
			}
    public void show() {
    	System.out.println("name="+name);
    	System.out.println("English="+score.english);
        System.out.println("math="+score.math);
        System.out.println("avg="+score.avg());
    }
    Data(String n,int eng,int m){
        name=n;
        score=new Test(eng,m);
    }

}
public class Class02 {
    public static void main(String[] args) {
       Data a1 = new Data("Annie", 85, 92);
       a1.show();
       Data a2 = new Data("Brian", 77, 56);
       a2.show();
    }
}
