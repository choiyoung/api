package api.utill.vector;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		
	
		GradeServiceImpl service = Input();
		service.print();
		

	}

	public static GradeServiceImpl Input() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�й� �Է� : ");
		String hak = scanner.next();
		System.out.print("�̸� �Է� :");
		String name = scanner.next();
		System.out.print("���� �Է� : ");
		int kor = scanner.nextInt();
		System.out.print("���� �Է� : ");
		int eng = scanner.nextInt();
		System.out.print("���� �Է� : ");
		int math = scanner.nextInt();
		GradeVO vo = new GradeVO(hak,name,kor,eng,math);
		GradeServiceImpl service = new GradeServiceImpl();
		service.input(vo);
		return service;
	}

}
