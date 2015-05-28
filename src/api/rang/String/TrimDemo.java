package api.rang.String;
/*
 java.lang.String 에 있는
 trim() 메소드는 문자열 앞뒤 공백을 제거한다.
 문자열 내부의 공백은 제거하지 않는다.
 */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "   Hello Java World !!";
		System.out.println("trim() 사용시"+str.trim());
		String str2 = "     Hello Java World   ";
		System.out.println("메서드 체인으로 사용시 : "+ str2.trim().replace("Java", "Jap"));
		/*
		 trim() 처럼 값이 String 타입이면,
		 String 의 메소드를 연결해서 사용할 수 있는데,
		 이것을 메소드 체이라고 하며,
		 보통 String 클래스에 속한 메소드를 구현할 때
		 습관적으로 trim() 을 연결시켜서
		 진행한다.
		 */
		 System.out.println("     Heloo Java".indexOf("J"));
		 System.out.println("trim() 을 사용한경우 "+"     Hello Java".trim().indexOf("J"));
	}
}
