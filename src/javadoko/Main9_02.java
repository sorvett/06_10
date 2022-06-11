package javadoko;
class Game{
	boolean flag = true;
}
public class Main9_02 {
	public static void main(String[] args) {
		Game game= new Game();
		
		if(game.flag) {
			System.out.println("T");
		}else {
			System.out.println("F");
		}
	}
}
