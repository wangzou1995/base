package base.wangz.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet�÷�
 * 
 * @author JacksonWang
 *
 */
public class HashSetUsage {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// ���Ԫ��
		set.add("a");
		// ���Ԫ��
		set.clear();
		// �Ƴ�ָ��Ԫ��
		set.remove("a");
		// ��ѯ�Ƿ����Ԫ��
		set.contains("a");
		// set��С
		set.size();
		// �Ƿ��
		set.isEmpty();
		
		
		// ��������ʹ��
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		// ʹ��Set�������ʱ ���������д equals �� hashCode ���� HashSet ��ŵ�Ԫ���ǲ����ظ���

	}
}
