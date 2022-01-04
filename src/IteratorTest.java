import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素对的遍历 使用迭代器Iterator接口
 * 1 内部方法 hasNext, next
 * 2 集合对象每次调用iterato（）方法都得到一个全新的迭代器对象，
 * 默认游标都在集合的第一个元素之前
 * 3 内部定义了remov（），可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove
 * 注意： 如果还未调用next（）或在上一次调用next方法之后已经调用了remove方法。
 * 再调用remove都会报IllegalStateException
 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        Iterator iterator = coll.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //异常
//        System.out.println(iterator.next());
        //方式二
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//
//        }
        //方式三：
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if("tom".equals(obj)){
                //删除集合中tom的数据
                iterator.remove();
            }
        }
        System.out.println(coll);
    }
}
