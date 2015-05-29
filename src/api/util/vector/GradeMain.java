package api.util.vector;

import java.util.Vector;

public class GradeMain {

	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// 일일이 setter 만들기가 귀찮다.
		// 생성자로 한 번에 만들어야지...
		// 아래처럼 더미값 생성.. 나중에 없앨것..
		GradeVO g1 = new GradeVO("홍길동","1111",70,80,90);
		GradeVO g2 = new GradeVO("김길동","2222",75,90,40);
		GradeVO g3 = new GradeVO("김길동","3333",10,10,10);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		
		service.print();
		
		String dummy = service.searchGradeHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.serchGradeByName("김길동");
		System.out.println(temp.toString());
	}

}
