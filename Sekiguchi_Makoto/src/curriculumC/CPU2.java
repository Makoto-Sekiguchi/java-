package curriculumC;

import java.util.Random;

public class CPU2 {
	
private final Random random;
public CPU2() {
	this.random = new Random();
}

//以下、cpuの手をランダムに決定するコード
public int getCPUHand() {
	return random.nextInt(3);
}
	
	
}
