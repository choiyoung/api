package api.rang.String;
/*
 java.lang.String �޼ҵ�
 replace("OLD","NEW") : String ���ڿ����� "OLD" ���ڸ�
 "NEW"�� ��ü�Ѵ�.
 ���� ��ü�ϴ� ���ڰ� �����̸� replaceAll() �� ����Ѵ�.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D ".replaceAll("C D", "E F"));
	}
}