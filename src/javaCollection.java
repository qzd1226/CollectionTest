import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的方法的测试
 *
 * 向collection接口的实现类的对象添加obj时，要求obj所在类重写equals方法
 */

public class javaCollection {

    @Test
    public  void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        coll.add(new Person("Jery", 21));
        //contains(object obj):判断是否包含这个obj
        //我们会调用object对象所在类的equals方法。
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("tom"))); // true 利用的是equals 比较的是内容
        System.out.println(coll.contains(p)); //true
        System.out.println(coll.contains(new Person("Jery", 21))); // false  没有重写equal方法
        //containsAll(Collection coll1): 判断行参中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));
    }
    @Test
    public void test2(){
        // 3. remove(Object obj): 从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        coll.remove(p);
        System.out.println(coll);

        // 4. removeAll(Collection coll1): 差集的操作 从当前集合中移除coll1中的虽有元素
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        //retainAll(Collection coll1) : 交集：获取当前集合和coll1的交集 并返回给当前集合
        Collection coll1 = Arrays.asList(123,456,789);
        coll.retainAll(coll1);
        System.out.println(coll);

        //equals(Object obj):要想返回true，需要当前集合和行参集合完全相同
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("tom"));
        coll2.add(false);
        Person x = new Person("Jerry", 20);
        coll2.add(p);
        System.out.println(coll.equals(coll2));
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        // 7.hashCode 返回当前对象的哈希值 对应存储位置
        System.out.println(coll.hashCode());
        // 8. toArray() 集合————》数组
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 拓展： 数组 ————》 集合 调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"aa","bb","cc"});
        System.out.println(list);
        List<int[]> arr1 = Arrays.asList(new int[]{123,456}); // 把整个结构当成一个参数了
        System.out.println(arr1);
        List arr2 = Arrays.asList(123,456);
        System.out.println(arr2);

        //9。iterator():返回Iterator接口的实例，用于遍历集合元素，放在iteratorTest.java中测试

    }}
