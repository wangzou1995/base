package base.wangz.com.collection;
import java.util.ArrayList;
/**
 * LinkedListʹ�÷���
 */
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {
	// ���� ���Ԫ�ش���
	static final int N=50000;
	// ��ȡlist���ʱ��
    static long timeList(List<Object> list){
        long start=System.currentTimeMillis();
        Object o = new Object();
        for(int i=0;i<N;i++) {
            list.add(0, o);
        }
        return System.currentTimeMillis()-start;
    }
    /**
     * ��ȡlist 
     * @param list
     * @return ���ض�ȡʱ��
     */
    static long readList(List<Object> list){
        long start=System.currentTimeMillis();
        for(int i=0,j=list.size();i<j;i++){

        }
        return System.currentTimeMillis()-start;
    }

    static List<Object> addList(List<Object> list){
        Object o = new Object();
        for(int i=0;i<N;i++) {
            list.add(0, o);
        }
        return list;
    }

	public static void main(String[] args) {

		// LinkedList �̳� AbstractSequentialList 
		// AbstractSequentialList �̳� AbstractList
		// ArrayList �̳� AbstractList
		// LinkedList ��ArrayList ���÷�������ͬ
		// ��������
//		1.ArrayList��ʵ���˻��ڶ�̬��������ݽṹ��LinkedList������������ݽṹ�� 
//		2.�����������get��set��ArrayList��������LinkedList����ΪLinkedListҪ�ƶ�ָ�롣 
//		3.����������ɾ������add��remove��LinkedList�Ƚ�ռ���ƣ���ΪArrayListҪ�ƶ����ݡ�
		
	        System.out.println("ArrayList���"+N+"����ʱ��"+timeList(new ArrayList<Object>()));
	        System.out.println("LinkedList���"+N+"����ʱ��"+timeList(new LinkedList<Object>()));

	        List<Object> list1=addList(new ArrayList<>());
	        List<Object> list2=addList(new LinkedList<>());
	        System.out.println("ArrayList����"+N+"����ʱ��"+readList(list1));
	        System.out.println("LinkedList����"+N+"����ʱ��"+readList(list2));
	    
	}
}
