package api.utill.vector;

import java.util.Vector;

public interface GradeService {
	
	public void input(GradeVO vo);
	public void print();
	public String searchGradeHak(String hak);
	public Vector<String> serchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
	
}
