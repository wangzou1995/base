package base.wangz.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet用法
 * 
 * @author JacksonWang
 *
 */
public class HashSetUsage {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// 添加元素
		set.add("a");
		// 清空元素
		set.clear();
		// 移除指定元素
		set.remove("a");
		// 查询是否存在元素
		set.contains("a");
		// set大小
		set.size();
		// 是否空
		set.isEmpty();
		
		
		// 迭代器的使用
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		// 使用Set保存对象时 对象必须重写 equals 和 hashCode 方法 HashSet 存放的元素是不可重复的

	}
}
