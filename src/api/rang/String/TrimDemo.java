package api.rang.String;
/*
 java.lang.String �� �ִ�
 trim() �޼ҵ�� ���ڿ� �յ� ������ �����Ѵ�.
 ���ڿ� ������ ������ �������� �ʴ´�.
 */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "   Hello Java World !!";
		System.out.println("trim() ����"+str.trim());
		String str2 = "     Hello Java World   ";
		System.out.println("�޼��� ü������ ���� : "+ str2.trim().replace("Java", "Jap"));
		/*
		 trim() ó�� ���� String Ÿ���̸�,
		 String �� �޼ҵ带 �����ؼ� ����� �� �ִµ�,
		 �̰��� �޼ҵ� ü�̶�� �ϸ�,
		 ���� String Ŭ������ ���� �޼ҵ带 ������ ��
		 ���������� trim() �� ������Ѽ�
		 �����Ѵ�.
		 */
		 System.out.println("     Heloo Java".indexOf("J"));
		 System.out.println("trim() �� ����Ѱ�� "+"     Hello Java".trim().indexOf("J"));
	}
}
