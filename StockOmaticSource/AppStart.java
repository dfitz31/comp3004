public class AppStart{
	public static void main(String[] args){
		Control start = new Control();
		View view = new View(start);
		view.run();
	}
}