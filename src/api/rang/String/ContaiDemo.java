package api.rang.String;
/*
 java.lang.String
 contain(s) : s ��� ���ڰ� ���ԵǾ����� ���� üũ
 */
public class ContaiDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		 (���ǽ�) ? "��" : "����" ;
		 */
		
		System.out.println(str.contains("f")? "f �� ����" : "f �� ������");
	}
}
