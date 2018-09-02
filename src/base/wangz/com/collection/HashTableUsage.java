package base.wangz.com.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable的使用方法
 * @author JacksonWang
 *
 */
public class HashTableUsage {
	
	public static void main(String[] args) {
		Map<Integer,Integer> map = new Hashtable<>();
		
		// HashTable 的基本与用法与HashMap相似
		// 但是在put的時候 會判断值是否为null 如果为null 会爆出异常 而HashMap 不会
		// HashTable 是线程安全的  （HashTable 几乎所有方法都有 synchronized ）
		
	}
}
