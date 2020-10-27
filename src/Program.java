import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Container array=new Container();
		for(int i=0;i<10;i++){
			int value=in.nextInt();
			array.Insert(value, i);
		}
		array.Output();
	}

}
