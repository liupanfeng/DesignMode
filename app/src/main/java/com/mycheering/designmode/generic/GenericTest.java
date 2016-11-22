package com.mycheering.designmode.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 只用引用类型，才能当做泛型的参数
 * 1.如果想用 T 需要在返回值的位置加上 <T>
 * 2.实际类型 ：只能是引用类型  不能是基本类型
 * Created by lpf on 2016/11/22.
 */
public class GenericTest {
    public static void main(String[] args) {

        // 遍历 map数据 借助map的entry这个类进行遍历 map因为没有继承 Iterable这个接口，所以不能直接遍历
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("lpf", 29);
        maps.put("zxw", 27);
        maps.put("gjm", 30);
        maps.put("lxc", 33);

        Set<Map.Entry<String, Integer>> entrySet = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Integer[] a={1,5,2,6,9};
        print(a);
        print(swap(a,1,2));

        Object obj="abc";
        String x=autoConvert(obj);


    }
    /**
     * 定义方法级别的泛型
     * 自动转换任意一个Object对象成其他类型
     * @param obj
     * @return
     */
    public static <T> T autoConvert(Object obj){
        return (T)obj;
    }

    /**
     * 交换数组中任意两个元素的位置
     * @param t
     * @param i
     * @param j
     * @return
     */
    public static <T> T[] swap(T[] t, int i, int j) {
        T tmp = t[i];
        t[i] = t[j];
        t[j] = tmp;
        return t;
    }


    /**
     * 打印任何类型的数组的
     * @param tArray
     */
    public static <T> void print(T[] tArray){
        for (int i = 0; i < tArray.length; i++) {
            System.out.print(tArray[i]);
        }
        System.out.println("");
    }

}
