import org.junit.Test;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 1.向TreeSet中添加的数据，要求是相同类的对象。
 * 2.两种排序方式：自然排序(实现Comparable接口)和定制排序（Comparator）;
 * 3.自然排序中，比较两个对象是否相同的标准为：compareTo返回0，不再是equals():
 * 4.定制排序中，比较两个对象是否相同的标准为：compare()返回0，不再是equals();
 */
public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet set = new TreeSet();
            //不能添加不同类的对象
//        set.add(123);
//        set.add(123);
//        set.add(456);
//        set.add("aa");
//        set.add(new Person("tom",12));
// ****************************************************
            set.add(12);
            set.add(34);
            set.add(-10);
            set.add(1);
            Iterator iterator = set.iterator();
            //可以按照大小排序进行遍历 从小到大
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
    }
    @Test
    public void test2(){
        Comparator com = new Comparator(){
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2){
                if(o1 instanceof Person && o2 instanceof  Person) {
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return Integer.compare(p1.getAge(), p2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new Person("tom" , 13));
        set.add(new Person("jerry" , 40));
        set.add(new Person("jim" , 13));
        set.add(new Person("mike" , 21));
        set.add(new Person("blue" , 99));
        System.out.println(set);

    }
}
