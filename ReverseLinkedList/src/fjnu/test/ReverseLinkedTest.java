package fjnu.test;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedTest {

	/**
	 * @author LoveTaeyeon
	 * @param k k值
	 * @param linked 要被反转的链表
	 */
	public static List<Integer> reverse(List<Integer> linked,int k){
		int arrNum = linked.size()/k;			//一共有几组要开始进行翻转
		//当k为单双数时应采用不同的做法
		for(int i = 0;i < arrNum;i ++){
			for(int j = 0;j < k/2;j ++){
				int temp;
				temp = linked.get(i*k + j);
				linked.set(i*k + j, linked.get(i*k + (k-j-1)));
				linked.set(i*k + (k-j-1),temp);
			}
		}
		return linked;
	}
	
	/**
	 * 生成的List的规则为1,2,3...
	 * @param size 链表（集合）的大小
	 * @return
	 */
	public static List<Integer> initLinked(int size){
		List<Integer> linked = new ArrayList<Integer>();
		for(int i = 0;i < size;i ++){
			linked.add(i+1);
		}
		return linked;
	}
	
	public static void showList(List<Integer> linked){
		System.out.println("翻转后的结果为：");
		for(Integer i : linked){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		List<Integer> linked = initLinked(6);
		showList(reverse(linked,4));
	}
	
}
