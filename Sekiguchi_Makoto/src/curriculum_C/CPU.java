package curriculum_C;

import java.util.Random;

public class CPU {

	public final Random random;//CPUクラスにrandomというフィールド(=インスタンス変数とも言う)を宣言している。
	
	public CPU() {//CPUメソッドではなく、CPUコンストラクタ！
		this.random = new Random();/*randomフィールドに対して、
		新たにランダムな数を生成する機能を持ったRandomオブジェクトを代入している。
		
		注意点：ランダムな値が代入されるのではなく、ランダムな値を生成する機械そのものを代入している！
		だから、この機械を使うことで、後からランダムな数を取り出せるよ！*/
	}
	
	public JankenHand getCPUHand() {
		int randomValue = random.nextInt(3);
		return JankenHand.fromValue(randomValue);
	}
}
