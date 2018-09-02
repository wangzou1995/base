package base.wangz.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList用法
 * 
 * @author JacksonWang
 *
 */
public class ArrayListUsage {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// 向list添加元素,返回值是Boolean型
		list.add("wz");
		list.add("qaz");
		list.add("wz");
		// 通过索引获取索引上的元素 index从 0开始
		list.get(0);
		// 判断list是否为空
		list.isEmpty();
		// 清空list
		// list.clear();
		// 判断list中是否有某个元素，有返回true 没有返回false
		list.contains("wz");
		// 通过元素返回元素对应的索引
		list.indexOf("wz");
		// 通过元素返回对应的最后一个索引
		list.lastIndexOf("wz");
		// 移除list对应的元素 (如果list存有相同的元素，移除的就是第一个对应的元素)
		// list.remove("wz");
		// 返回list长度
		list.size();
		// 指定再某索引处添加元素（返回索引处旧元素，如果制定索引大于list的长度 就会异常）
		
		list.set(2,"qqq");
		// 迭代器的使用方式
		// （1）ListIterator有add()方法，可以向List中添加对象，而Iterator不能
		// （2）ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator就不可以。
		// （3）ListIterator可以定位当前的索引位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
		// （4）都可实现删除对象，但是ListIterator可以实现对象的修改，set()方法可以实现。Iierator仅能遍历，不能修改。

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
