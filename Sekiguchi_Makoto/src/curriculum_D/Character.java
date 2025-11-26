package Curriculum_D;
import java.util.Random;
//キャラクターの共通機能（HP,AK,SP）
public class Character {
//private➡Characterクラスの外から値が直接変更されるのを防ぐため。（=カプセル化）
	private String name;
	private int HP;
	private int AK;
	private int SP;
	
//コンストラクタ➡実引数を受け取った後、ランダムな初期値が加算される処理にしている。
	public Character(String name) {//MainBattleの65行目からユーザー入力を実引数として認識し、ここに渡し以下の処理を施す。
		
		this.name = name;
		
		Random rand = new Random();
		this.HP = HP + rand.nextInt(41);
		this.AK = AK + rand.nextInt(35);
		this.SP = SP + rand.nextInt(20);
	}

	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return HP;
	}
	public int getAK() {
		return AK;
	}
	public int getSP() {
		return SP;
	}
	
	//Demon用のコンストラクタ
	public Character(String name, int HP, int AK, int SP) {
		this.name = name;
		this.HP = HP;
		this.AK = AK;
		this.SP = SP;
	}
	
	//ダメージを受けたらHPを減らす処理をするメソッド
	public void takeDamage (int damage) {
		this.HP -= damage;
		if (this.HP < 0) {
			this.HP = 0;
		}
	}
	
	//生存確認（HPが0より大きいかどうかで生きてるかを判断する処理をするメソッド）
	public boolean isAlive() {
		return this.HP > 0;
	}
	
	//攻撃メソッド
	public int attack (Character target) {
		//攻撃力の乱幅数
		Random rand = new Random();
		int damage = this.AK + rand.nextInt(5) - 2;
		
		target.takeDamage(damage);
		return damage;
	}
	
	@Override
	public String toString() {
		return String.format("%s (HP: %d, AK: %d, SP: %d)", name, HP, AK, SP);
	}
	
}
