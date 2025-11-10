import java.util.Arrays;
import java.util.Scanner;

public class curriculum4{

	public static void main(String[] args) {
		//目標：２パターン載せsン現方法と２パターンの宣言方法を５秒以内に書けるようになる。
		// TODO 自動生成されたメソッド・スタブ
//Q1配列宣言と正順表示
		//１パターン目の宣言方法：{}に具体的な要素を直接記入する
		
		int [] a = {1, 2, 3, 4, 5};//具体的な要素数を配列宣言。
		for (int i : a) {//正順表示するならこれでおk。forループによって個々の配列要素に変換される。
//ポイント：forループなしに直接aを出力すると、配列オブジェクト自体の出力をするものと認識されてしまうから注意！
			//つまり、forループは、個々の要素に視点が向けられるような指示文ということ！
			System.out.println(i);
		}
		System.out.println();
		
		//2パターン目の宣言方法：要素数を宣言してからどの配列に何を格納するかを代入する。		
//		int [] c = new int [5];//要素数で配列宣言
//		c[0] = 1;
//		c[1] = 2;
//		c[2] = 3;
//		c[3] = 4;
//		c[4] = 5;
		//1パターン目の出力方法：拡張for文
//		for (int i : a/c ) {
//			System.out.println(i);
//		}
		//2パターン目の出力方法：変数iの状態を明記：普通のfor文でiが5になるまで増加。
		//そのiを適用させる対象：配列c[]に入れることで順に増加するという性質を配列cに適用できる。
//		for (int i = 0 ; i < c.length ; i++) {
//			System.out.println(c[i]);
//		}
		System.out.println();
		
//Q2配列宣言と逆順表示　必要なもの：配列、逆順ループ（=デクリメントの使用）
		int [] b = {10, 20, 30, 40, 50};
		for (int i = b.length - 1 ; i >= 0 ; i--) {//変数iはデクリメント表記にすることで逆順の性質を持たせる
			System.out.println(b[i]);//逆順の性質をb[i]とすることで配列bに適用させた。
		}
		System.out.println();
		
//Q3大事配列の合計値を出力する方法　必要なもの：配列、int sum変数、拡張for文と加算代入
		int [] c_Q3 = {3, 5, 7, 9, 11};//配列を用意
		int sum = 0;//配列の各要素の合計値を格納するsum変数を用意。
		/*ここが=0でないと、for-each文でのsumでiの合計値のみを入れることができない*/
		
		for (int i : c_Q3) {//c_Q3の3,5,7,9,11の値が変数iに代入されていくことを意味する。
			sum += i;//iに代入されてくる値をそれぞれsumに加算代入するという意味。sum = sum + iと同じ意味。
//注意ポイント：System.out.println(sum);//ここに出力コードを書くと以下のようにsum変数にiが代入される度に加算代入の結果を
//			出力してしまうので注意！
//			3
//			8
//			15
//			24
//			35
		}
		System.out.println(sum);//ここに書けばforループの領域外なのですべてを加算代入した結果を出力するよ！
		System.out.println();
//		int [] c = new int[5];
//		c[0] = 3;
//		c[1] = 5;
//		c[2] = 7;
//		c[3] = 9;
//		c[4] = 11;
//		for (int i : c) {
//			System.out.println();
//		}
		
//Q4大事配列の最大値と最小値を出力する方法　必要なもの：配列、int max,min変数
		int [] d_Q4 = {12, 7, 9, 21, 5, 18};
		int max = d_Q4[0];//配列の最初の要素を最大値に設定
		int min = d_Q4[0];//配列の最初の要素を最小値に設定
		
		for (int i  = 1 ; i < d_Q4.length ; i++) {//iが5に達するまで順に増加する。
			if(d_Q4[i] > max) {//変数iを配列d_Q4のインデックスとして使用し、それがmax、つまりd_Q4[0]を超えたら、
				max = d_Q4[i];//maxの値にd_Q4[i]が代入されるという意味。
				
			}
			if (d_Q4[i] < min) {
				min = d_Q4[i];
				
			}
//注意ポイント：System.out.println("最大値：" + max);ここはまだforループの領域なので、ここに出力コードを書くと以下のように
//			System.out.println("最小値：" + min);羅列されてしまうので注意！
//			最大値：12
//			最小値：7
//			最大値：12
//			最小値：7
//			最大値：21
//			最小値：7
//			最大値：21
//			最小値：5
//			最大値：21
//			最小値：5
		}
		System.out.println("最大値：" + max);/*ここに書けばforループの領域外なのでforループ内で吟味された内容
		のみを出力してくれるよ！*/
		System.out.println("最小値：" + min);
		System.out.println();
//Q5大事配列内を２倍に変更する方法。拡張for文で配列を出力する方法。
		int [] e_Q5 = {1, 2, 3, 4, 5};
		
		for (int i = 0 ; i < e_Q5.length ; i++) {/*変数iはこのあとe_Q5配列に適用させる予定なので、
			e_Q5[0]を実現するためにi=0から開始する。*/
			e_Q5[i] *= 2;//e_Q5[i] = e_Q5[i] * 2と同じ意味。これによってe_Q5配列内の各値が永久に２倍されたことを意味する。
			//上限４まで順増加する変数iをe_Q5配列に適用し、*= 2によってそれらを2倍することを意味する。
		   System.out.println(e_Q5[i]);//e_Q5配列を適用した変数iの本来の出力方法。以下のように別の場所で出力することも可能。
		}
		for (int element : e_Q5) {//拡張for文での出力方法
			System.out.println(element);//このように別の場所でもう一度同じ配列を出力することも可能。
		}
		System.out.println();
		
//Q6大事ユーザーの整数値の入力が配列の要素に含まれるかどうかの判定　switch文またはStream API*ラムダ式の２パターンあり。
//		Scanner sc = new Scanner(System.in);
//		int userInput = sc.nextInt();
//		
//		int [] f_Q6 = {4, 7, 10, 15, 20};
//		switch (userInput) {
//		case 4, 7, 10, 15, 20:
//			System.out.println("入力した値は配列に含まれています。");
//			break;
//		default:
//			System.out.println("入力した値は配列に含まれていません。");
//			break;
//		}
//
		//Stream APIとラムダ式を使って出力してみる。		
	Scanner scanner = new Scanner(System.in);
	int userInput = scanner.nextInt();
	
	int [] arr = {4, 7, 10, 15, 20};
	
	boolean found = Arrays.stream(arr).anyMatch(n -> n == userInput);
	String result = userInput + "は配列に";
	if (found) {
		result += "含まれています。";
	} else {
		result += "含まれていません。";
	}
	
	System.out.println(result);
	scanner.close();
	System.out.println();
	
        //booleanのみでコード化したパターン
//	Scanner scanner1 = new Scanner(System.in);
//	int userInput1 = scanner1.nextInt();
//	
//	int[] arr1 = {4, 7, 10, 15, 20};
//	boolean found1 = false;
//	for (int i : arr1) {配列の要素を一個一個変数iに代入していく。
//		if (userInput == i) {ユーザー入力と配列の要素が一致したら、
//			found1 = true;boolean foundをtrueにし、
//			System.out.println("入力内容は配列の要素に含まれています。");と出力する。
//		}
//	}
	
//Q7大事多次元配列を表形式化
	System.out.println("Q7開始");
	int [][] arr_Q7 = {{1, 2}, {3, 4}, {5, 6}};
	
	for (int i = 0 ; i < arr_Q7.length ; i++) {//i = 1だと以下にあるarr_Q7[i][j]で3 4 5 6と出力される。
		for (int j = 0 ; j < arr_Q7[i].length ; j++) {
			System.out.print(arr_Q7[i][j] + " ");//[i]に対応する[j]を出力。これだけだと一列で1 2 3 4 5 6と出力される。
		}
		System.out.println();//3行生成される。
	}
//	System.out.println(arr_Q7.length);//要素数は3と出力される。
	
	System.out.println();
	
//Q8大事多次元配列の合計値の出力
	
//ポイント:1.合計値を格納する変数と多次元配列の用意。2.
//注意点：合計値を格納するsum変数を忘れない！	
	
	System.out.println("Q8開始");
	
	int sum1 = 0;// 合計値を格納する変数sum
	int [][] arr_Q8 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};// 多次元配列を用意
	
	for (int i = 0 ; i < arr_Q8.length ; i++) {
		for (int j = 0 ; j < arr_Q8[i].length ; j++) {
			sum1 += arr_Q8[i][j];//arr_Q8[0][0]～arr_Q8[2][2]までを加算代入した結果をsum1変数に代入するという意味。sum1 = sum1 + arr_Q8[i][j]と同じ意味。
			
			//sum1 = arr_Q8[i] + arr_Q8[j]はコンパイルエラーになる！
			/*理由：１．これだと一次元配列同士の加算を意味してしまい、182行目の二次元配列コードとの矛盾が生じるから。
			２．また、javaにおいては配列同士を直接加算演算子でつなげることができない。*/
			
		     /*System.out.println(sum1);//出力コードを書くと二次元[i]と[j]に着目した計算過程と結果が出力される。
		 sum[0][0],sum[0][1],sum[0][2],sum[1][0],sum[1][1]...とかく配列同士の計算過程をすべて出力できる。*/
		 
		}
		/*System.out.println(sum1);ここに出力コードを書くと[i]と[j]のうち、[i]に着目した計算過程と結果が出力される。
		結果のみ出力したい場合はforループの外に書けばよいとわかる。*/
	}
	System.out.println(sum1);
//	//拡張forループver.
//		int sum2 = 0;
//		int [][] arr1 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		
//		for (int [] row : arr1) {
//			for (int element : row) {
//			sum2 += element;
//			System.out.println(sum2);// ×:element += row;
//			}
//		}
	System.out.println();
//Q9 多次元配列のmaxとminの出力
	System.out.println("Q9開始");
	int [][] arr_Q9 = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}};
    int maxQ9 = arr_Q9[0][0];//配列内の12のこと。           //×int maxQ9 = 0;
    int minQ9 = arr_Q9[0][0];//配列内の12のこと。　　　　　//×int minQ9 = 0;
    
    for (int [] row : arr_Q9) {//arr_Q9の内容が繰り返しrowに代入されていく。
    	for (int element : row) {//arr_Q9の内容が代入されたrowがelementに代入されていく。
    		if (element > maxQ9) {
    			maxQ9 = element;
    		}
    		if (element < minQ9) {
    			minQ9 = element;
    		}
    	}
    }
    System.out.println(maxQ9);
    System.out.println(minQ9);
	
//	for (int i = 0 ; i < arr_Q9.length ; i++) {
//		for (int j = 0 ; j < arr_Q9[i].length ; j++) {
//			if (i > maxQ9) {
//				i = maxQ9;
//				System.out.println(i);
//			}
//			if (j < minQ9) {
//				j = minQ9;
//				System.out.println(j);
//			}
//		}
//	}
	System.out.println();
	}

}
