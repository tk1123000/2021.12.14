
public class MauosMain {

	public static void main(String[] args) {
		Mauos mouse1 = new Mauos();
		mouse1.leftClick();
		mouse1.rightClick();

		WheelMouse mouse2 = new WheelMouse();
		mouse2.scroll();

		// 업캐스팅 ->하위 클래스의 객체가
		// 상위 클래스의 객체 타입으로 형변환!
		Mauos mouse3 = mouse2;
		mouse3.rightClick();
		mouse3.leftClick();
		// 오버라이딩한 기능일 경우
		// 업캐스팅 하더라도 자식에 있는 기능을 사용한다
		mouse3.leftClick();
	}

}
