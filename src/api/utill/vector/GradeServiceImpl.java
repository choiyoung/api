package api.utill.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	Vector<GradeVO> vec = new Vector<GradeVO>();
	GradeVO vo = new GradeVO();
	@Override
	public void input(GradeVO vo) {
		vec.addElement(vo);
		vo.getTotal();
	}
	/*
	 ����ǥ�� ����ϴ� �޼ҵ�
	 vo.toString() ���� ó�� �����ϰ� ����.
	 */
	@Override
	public void print() {
		for(int i = 0; i < vec.size(); i++){
			System.out.println(vec.elementAt(i));
		}
	}
	/*
	 �й����� �˻��ϴ� ����� ���� �޼ҵ�
	 */
	@Override
	public String searchGradeHak(String hak) {
		return null;
	}
	/*
	 �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 */
	@Override
	public Vector<String> serchGradeByName(String name) {
		return null;
	}
	/*
	�������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void descGradeTotal() {
		
		for(int i = 0 ; i<vec.size(); i++){
			for(int j = 0 ; j<vec.size(); j++){
			
			}
		}
	}
	/*
	 �������� �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 */
	@Override
	public void ascGradeTotal() {
		
	}
	
}
