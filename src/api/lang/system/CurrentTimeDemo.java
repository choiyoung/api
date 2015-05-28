package api.lang.system;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 java.lang.system �� ����
 CurrentTimeMillis() ��
 ROM �� ����� �ð��� �����Ѵ�.
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : "+curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 new Date() �ÿ� import ������ �ΰ��� �ε�
		 ���� java.utill.Date �� �����Ѵ�.
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� : "+nowTime);
	}
}