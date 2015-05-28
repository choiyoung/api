package api.lang.object;
/*
 ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ����
 �˾ƺ��� ���� instanceof �����ڸ� ����Ѵ�.
 ������ ����δ� ture �� false �� �ϳ��� �����Ѵ�.
 */
public class InstanceOfDemo {
	private void mian() {
		FireCar fireCar = new FireCar();
		Amblulance amblulance = new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
	}
	public void doWork(Car c){
		/*
		 �Ķ���ͷ� �Ѿ�� c�� FireCar Ÿ������ Ȯ�� ��
		 �´ٸ� (FireCar) �� ��ü ĳ������ �϶�
		 */
		if(c instanceof FireCar){
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shooWater();
			/*
			  �Ķ���ͷ� �Ѿ�� c�� ���深�� Ÿ������ Ȯ�� ��
			 �´ٸ� (Amblulance) �� ��ü ĳ������ �϶�
			 */
		}else if(c instanceof Amblulance){
			Amblulance a = (Amblulance) c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){System.out.println("������..");}
	void stop(){System.out.println("����!!");}
}
class FireCar extends Car{// Car Ŭ������ ��ӹ��� �ҹ���
	void shooWater(){
		System.out.println("���ѷ� �Ҳ��� ��...");
	}
}
class Amblulance extends Car{ // Car Ŭ������ ��ӹ��� ������
	void siren(){
		System.out.println("���̷��� �︮�� ���� ��...");
	}
}
