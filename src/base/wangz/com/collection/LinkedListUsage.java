package base.wangz.com.collection;
import java.util.ArrayList;
/**
 * LinkedList使用方法
 */
import java.util.LinkedList;
import java.util.List;

public class LinkedListUsage {
	// 定义 添加元素次数
	static final int N=50000;
	// 获取list添加时间
    static long timeList(List<Object> list){
        long start=System.currentTimeMillis();
        Object o = new Object();
        for(int i=0;i<N;i++) {
            list.add(0, o);
        }
        return System.currentTimeMillis()-start;
    }
    /**
     * 读取list 
     * @param list
     * @return 返回读取时间
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

		// LinkedList 继承 AbstractSequentialList 
		// AbstractSequentialList 继承 AbstractList
		// ArrayList 继承 AbstractList
		// LinkedList 与ArrayList 的用法基本相同
		// 两者区别：
//		1.ArrayList是实现了基于动态数组的数据结构，LinkedList基于链表的数据结构。 
//		2.对于随机访问get和set，ArrayList觉得优于LinkedList，因为LinkedList要移动指针。 
//		3.对于新增和删除操作add和remove，LinkedList比较占优势，因为ArrayList要移动数据。
		
	        System.out.println("ArrayList添加"+N+"条耗时："+timeList(new ArrayList<Object>()));
	        System.out.println("LinkedList添加"+N+"条耗时："+timeList(new LinkedList<Object>()));

	        List<Object> list1=addList(new ArrayList<>());
	        List<Object> list2=addList(new LinkedList<>());
	        System.out.println("ArrayList查找"+N+"条耗时："+readList(list1));
	        System.out.println("LinkedList查找"+N+"条耗时："+readList(list2));
	    
	}
}
