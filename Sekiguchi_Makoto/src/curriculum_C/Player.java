package curriculum_C;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
	
private final Scanner scanner;

public Player(Scanner scanner) {
	this.scanner = scanner;
}

public JankenHand getInputHand() {
	while(true) {
		try {
			int inputNum = scanner.nextInt();
			
			return JankenHand.fromValue(inputNum);//JankenHand.fromValueメソッドが有効な入力かチェックする。
			
		} catch (InputMismatchException e) {
			System.out.println("error:無効な入力形式です。(0,1,2)のいずれかで入力してください。");
			scanner.next();//不適切な入力をクリア
		} catch (IllegalArgumentException e) {
			System.out.println("error:無効な入力形式です。(0,1,2)のいずれかで入力してください。");
		}
	}
}
}
