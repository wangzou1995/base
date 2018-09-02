package base.wangz.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList�÷�
 * 
 * @author JacksonWang
 *
 */
public class ArrayListUsage {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// ��list���Ԫ��,����ֵ��Boolean��
		list.add("wz");
		list.add("qaz");
		list.add("wz");
		// ͨ��������ȡ�����ϵ�Ԫ�� index�� 0��ʼ
		list.get(0);
		// �ж�list�Ƿ�Ϊ��
		list.isEmpty();
		// ���list
		// list.clear();
		// �ж�list���Ƿ���ĳ��Ԫ�أ��з���true û�з���false
		list.contains("wz");
		// ͨ��Ԫ�ط���Ԫ�ض�Ӧ������
		list.indexOf("wz");
		// ͨ��Ԫ�ط��ض�Ӧ�����һ������
		list.lastIndexOf("wz");
		// �Ƴ�list��Ӧ��Ԫ�� (���list������ͬ��Ԫ�أ��Ƴ��ľ��ǵ�һ����Ӧ��Ԫ��)
		// list.remove("wz");
		// ����list����
		list.size();
		// ָ����ĳ���������Ԫ�أ�������������Ԫ�أ�����ƶ���������list�ĳ��� �ͻ��쳣��
		
		list.set(2,"qqq");
		// ��������ʹ�÷�ʽ
		// ��1��ListIterator��add()������������List����Ӷ��󣬶�Iterator����
		// ��2��ListIterator��Iterator����hasNext()��next()����������ʵ��˳��������������ListIterator��hasPrevious()��previous()����������ʵ������˳����ǰ��������Iterator�Ͳ����ԡ�
		// ��3��ListIterator���Զ�λ��ǰ������λ�ã�nextIndex()��previousIndex()����ʵ�֡�Iteratorû�д˹��ܡ�
		// ��4������ʵ��ɾ�����󣬵���ListIterator����ʵ�ֶ�����޸ģ�set()��������ʵ�֡�Iierator���ܱ����������޸ġ�

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}

	}
}
