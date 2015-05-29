package api.utill.vector;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		
	
		GradeServiceImpl service = Input();
		service.print();
		

	}

	public static GradeServiceImpl Input() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학번 입력 : ");
		String hak = scanner.next();
		System.out.print("이름 입력 :");
		String name = scanner.next();
		System.out.print("국어 입력 : ");
		int kor = scanner.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scanner.nextInt();
		System.out.print("수학 입력 : ");
		int math = scanner.nextInt();
		GradeVO vo = new GradeVO(hak,name,kor,eng,math);
		GradeServiceImpl service = new GradeServiceImpl();
		service.input(vo);
		return service;
	}

}
