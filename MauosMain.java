
public class MauosMain {

	public static void main(String[] args) {
		Mauos mouse1 = new Mauos();
		mouse1.leftClick();
		mouse1.rightClick();

		WheelMouse mouse2 = new WheelMouse();
		mouse2.scroll();

		// ��ĳ���� ->���� Ŭ������ ��ü��
		// ���� Ŭ������ ��ü Ÿ������ ����ȯ!
		Mauos mouse3 = mouse2;
		mouse3.rightClick();
		mouse3.leftClick();
		// �������̵��� ����� ���
		// ��ĳ���� �ϴ��� �ڽĿ� �ִ� ����� ����Ѵ�
		mouse3.leftClick();
	}

}
