package api.rang.String;
/*
 java.lang.String 에 속한 메소드
 charAt() : 지정된 위체 있는 문자를 리턴함. index 는 0부터 시작
 indexOf() : 주어진 문자가 존재하는지 확인하여 위치를 알려줌
 			없으면 - 1 변환
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-1555555";
		/*
		 index 는 0부터 시작하므로
		 남녀를 구분하는 1값은 7번째 인덱스에 위치한다.
		 */
		//char isMan = ssn.charAt(7);
		/*
		 indexOf() 는 파라미터로 주어진 String 값의
		 위치값을 리턴한다. "-"의 다음값이 남녀를
		 구분하는 값이므로 +1을 주었다.
		 */
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		switch(isMan){
		case '1' : System.out.println("남성");break;
		case '2' : System.out.println("여성");break;
		default : System.out.println("잘못된 입력입니다.");break;
		}
	}
}
