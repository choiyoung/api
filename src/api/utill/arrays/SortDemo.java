package api.utill.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.rmi.CORBA.Util;

import api.lang.object.ToStringDemo;

/*
 api.utill.arrays �� �޼ҵ���
 sort() �� ���� ����� �Ѵ�.
 */
public class SortDemo {
	Vector<Integer> vec = new Vector<Integer>();
	public Vector<Integer> getAscSort1(int[] arr){
		int temp = 0;
		for(int i = 0; i<arr.length;i++){
			for(int j = 0;j<arr.length;j++){
				if(arr[i]<arr[j]){
				// ���� �˰��� = �������� �����ٲٱ� �˰���
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] =  temp;
			}
				
			}
		}
		// Ȯ��� for �� :  for(��� : �迭){} ���� �� ������.
		for(int k : arr){
			vec.addElement(k);
		}
		return vec;
	}
	// �������� ���� 1.2.3.4.5...
	public Vector<Integer>getAscSort2(int[] arr){
		
		Arrays.sort(arr);
		for(int k : arr){
			vec.addElement(k);
		}
		return vec;
	}
	public static void main(String[] args) {
		SortDemo uti1 = new SortDemo();
		SortDemo uti2 = new SortDemo();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int[] arr = {8,5,9,4,1,0};
		list1 = uti1.getAscSort1(arr);
		list2 = uti2.getAscSort2(arr);
		System.out.println("���Ҿ˰��� ����� �������� ����"+list1.toString());
		System.out.println("Arrays.sort() ����� �������� ����"+list2.toString());
		
	}
	

}
