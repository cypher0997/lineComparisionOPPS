public class lineComparisionOOPS{
	int x1,x2,y1,y2;
	double dis;
	lineComparisionOOPS(){
		x1=20;
		x2=40;
		y1=40;
		y2=80;
	}
	public void result(){
		dis=Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		System.out.println("the length of line between two cordinates"+"("+ x1 +","+ x2 +")"+"("+ y1 +","+ y2 +")"+"is:->"+ dis);
	}
	public static void main(String args[]){
		lineComparisionOOPS object = new lineComparisionOOPS();
		object.result();
	}
}