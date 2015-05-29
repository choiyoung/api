package api.util.vector;

import java.util.Vector;

public class GradeMain {

	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// ������ setter ����Ⱑ ������.
		// �����ڷ� �� ���� ��������...
		// �Ʒ�ó�� ���̰� ����.. ���߿� ���ٰ�..
		GradeVO g1 = new GradeVO("ȫ�浿","1111",70,80,90);
		GradeVO g2 = new GradeVO("��浿","2222",75,90,40);
		GradeVO g3 = new GradeVO("��浿","3333",10,10,10);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		
		service.print();
		
		String dummy = service.searchGradeHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.serchGradeByName("��浿");
		System.out.println(temp.toString());
	}

}
