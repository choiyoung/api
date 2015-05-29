package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	/*
	 	�޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̸�)�� �ʿ��ѵ�,
	   	�ѱ��� ������ �÷����� �ʵ忡 �����ؾ� �Ѵ�.
	   	�ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�..
	 */
	private Vector<GradeVO>vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	/*
	 1 - input() // �л����� ������ �Է� �޴� ���ΰ�..�׷� �Է¹޾Ƽ�
	  					������ ������ �ʿ��ϰڴµ�...�迭�� ���� ������
	  					�����ϴ� �����ε� �ѹ� �����ϸ� �߰��� �ø� �� ������
	  					�������� Ȯ���ϴ� �÷����� �����ؾߵȴ�.
	  					�׷��� ���� ���� �ƴ� �� ���� ���̴� ���Ϳ� �־���Ѵ�.
	 */
	@Override
	public void input(GradeVO vo) {
			vc.add(vo);		
	}
	/*
	 2 - print() // ��� �ϴ� ���ΰ�? �׷� vo  ��ü�� toString() �����;��Ѵ�.
	 */
	@Override
	public void print() {
		System.out.println(vc.toString());
	}
	/*
	 3 - searchGradeByHak()
	  		// �й����� ������ ��ȸ�ϴ� ����̴�
	  		// �й��� ���� �� �л����Ը� �����ϹǷ�
	  		// ���ϰ��� String ���״� ������ for loop + ���ο� if �� �غ����Ѵ�.
	 */
	@Override
	public String searchGradeHak(String hak) {
		// for �� �ȿ� ���������� �����ߴ���...
		// ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
		// ���� for �� ������ ���������� ������
		String msg = ""; // ���������ϱ� �ʱ�ȭ
		for(int i = 0; i<vc.size();i++){
			/*
			 myHak �� ���Ϳ��� i ��° ��ҿ��� �й���
			 �����Ͽ� ���� ����...Ÿ���� String
			 */
			
			String myHak = vc.elementAt(i).getHak();
			
			/*
			 �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 myHak �� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break;
			}else{
				msg = "��ȸ�ϴ� �й��� �����ϴ�.";
			}	break;		
		}		
		return 	msg;
	}
	/*
	4 - searchGradeByName()
	  		// �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ����
	  		// �������� String �� ó���ϰԲ� ����Ǿ���.
	  		// ���ϰ��� �ϳ� �� �������� for loop + if �����ۿ���
	  		// ���� ��� ��·����� ������ �װ� ��� �Ѵ�.
	 */
	@Override
	   public Vector<String> serchGradeByName(String name) {
	      /*
	       * for �� �ȿ� ���� ������ �����ߴ���..
	       * ���ϵǴ� ��ġ�� ������ �޶� ������ ����.
	       * ���� for �� ������ ���������� �ؾ߰ڴ�.
	       * */
	      Vector<String> local=new Vector<String>(); // �������� �ʱ�ȭ
	      for (int i = 0; i < vc.size(); i++) {
	         /*
	          * myHak �� ���Ϳ��� i��° ����� �й���
	          * �����Ͽ� ���� ����...Ÿ���� String
	          * */
	         String myName = vc.elementAt(i).getName();
	         /*
	          * �Ķ���ͷ� �޾� �� name�� ���Ϳ� ��� �ִ�
	          * myName�� ��ġ�ϴ� �� üũ�ϴ� ����
	          * */
	         if (name.equalsIgnoreCase(myName)) {
	            local.add(name);
	         }else{
	            local.add("");
	         }
	      }
	      return local;
	   }
	/*
	   5 - descGradeTotal()
	        // ����������
	        // Collections.sort ���� �ȴ�
	 */
	@Override
	public void descGradeTotal() {
	
	}
	/*
	  6 - ascGradeTotal()
	    	// ���������̸� Arrays.sort�� ����.
	 */
	@Override
	public void ascGradeTotal() {
		
	}

}
