package kadai_014;

public class Car_Chapter14 {
	// 初期化
	private int gear = 1;
	private int speed = 10;
	
	// ギアの値により速度を変える
	public void gearChange(final int afterGear) {
		int beforGear = this.gear;
		this.gear = afterGear;
		this.speed = switch(this.gear) {
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		System.out.println("ギア" + beforGear + "から" + this.gear + "に切り替えました");
	}
	
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
