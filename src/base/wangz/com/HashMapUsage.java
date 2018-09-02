package base.wangz.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap使用方法
 * 
 * @author JacksonWang
 *
 */
public class HashMapUsage {
	public static void main(String[] args) {
		// Map 是存儲鍵值對的元素 ，底層使用數組和鏈表的形式存儲元素，數組中的每一項是一個鏈表
		Map<Integer, String> map = new HashMap<>();
		// 向Map中存放元素（鍵值對形式，鍵和值都可以為null）
		map.put(1, "a");
		map.put(2, "b");
		map.put(null, "c");
		// 當向Map存放鍵已經存在的元素時 ，put后會返回原來的舊值
		map.put(null, null);
		// 通過鍵獲取Map中對應的值
		map.get(null);
		// 清空Map
		map.clear();
		// 可以查看Map中是否有對應的值，有返回true,沒有返回false
		map.containsValue("a");
		// 可以查看Map中是否有對應的鍵，有返回true,沒有返回false
		map.containsKey(1);
		// 移除Map中键为1的键值对
		map.remove(1);
		// 替换Map中键为1的键值对的值
		map.replace(1, "c");
		// 获取Map元素所有键
		Set<Integer> set = map.keySet();
		// map大小
		map.size();
		// 迭代器的使用
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
