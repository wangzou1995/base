package base.wangz.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMapʹ�÷���
 * 
 * @author JacksonWang
 *
 */
public class HashMapUsage {
	public static void main(String[] args) {
		// Map �Ǵ惦�Iֵ����Ԫ�� ���׌�ʹ�Ô��M��朱����ʽ�惦Ԫ�أ����M�е�ÿһ���һ��朱�
		Map<Integer, String> map = new HashMap<>();
		// ��Map�д��Ԫ�أ��Iֵ����ʽ���I��ֵ�����Ԟ�null��
		map.put(1, "a");
		map.put(2, "b");
		map.put(null, "c");
		// ����Map����I�ѽ����ڵ�Ԫ�ؕr ��put�������ԭ����fֵ
		map.put(null, null);
		// ͨ�^�I�@ȡMap�Ќ�����ֵ
		map.get(null);
		// ���Map
		map.clear();
		// ���Բ鿴Map���Ƿ��Ќ�����ֵ���з���true,�]�з���false
		map.containsValue("a");
		// ���Բ鿴Map���Ƿ��Ќ������I���з���true,�]�з���false
		map.containsKey(1);
		// �Ƴ�Map�м�Ϊ1�ļ�ֵ��
		map.remove(1);
		// �滻Map�м�Ϊ1�ļ�ֵ�Ե�ֵ
		map.replace(1, "c");
		// ��ȡMapԪ�����м�
		Set<Integer> set = map.keySet();
		// map��С
		map.size();
		// ��������ʹ��
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
