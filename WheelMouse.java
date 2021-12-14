
public class WheelMouse extends Mauos {

	public void scroll() {
		System.out.println("스크롤을 굴렸습니다");
	}
	// 오버라이딩 -> 상속관계에서 자식 클랙스가
	// 부모클래스의 기능을 재정의 할때 사용한다!
	@Override
	public void leftClick() {
		System.out.println("왼쪽클릭");
		System.out.println("드래그");
	}
}
