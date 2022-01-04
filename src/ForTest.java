import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK 5.0 新增了 foreach循环用于遍历数组集合
 */
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);

        // for (集合元素的类型 局部变量： 集合对象 )
        // 内部仍然调用的是迭代器
        for(Object obj : coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6};
        //for(数组数据类型 局部变量： 集合对象)
        for(int t : arr){
            System.out.println(t);
        }
    }
    // 练习题
    @Test
    public void test3(){
        String[] arr = new String[]{"mm","mm","mm"};
        //普通for循环
        for(int i = 0 ; i < arr.length; i ++ ){
            arr[i] = "gg";
        }
        for(int i = 0 ; i < arr.length ;i++){
            System.out.println(arr[i]);
        }
        //增强for
        for(String s: arr){
            s = "ee";
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
