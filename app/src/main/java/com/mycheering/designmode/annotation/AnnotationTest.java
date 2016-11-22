package com.mycheering.designmode.annotation;

/**
 *  常见的系统给出的注解  @Override source 阶段//重写   @SuppressWarnings  //警告  @Deprecated //废弃
 *
 *  一个注解的声明周期 有3个阶段 ： java源文件  class文件  内存中的字节码
 *  javac  将 java源文件 编译成class文件 有可能去掉注解  类加载器 将class文件加载到内存中的时候，也有可能去掉注解。
 *  RetentionPolicy.SOURCE：java源文件阶段  RetentionPolicy.CLASS class文件阶段  RetentionPolicy.RUNTIME 内存中的字节码的阶段  默认是保留在class阶段的
 *
 * @author lpf
 *
 */
@LpfAnnotation(color="red",value="abc")
public class AnnotationTest {
    public static void main(String[] args){
        if(AnnotationTest.class.isAnnotationPresent(LpfAnnotation.class)){
            LpfAnnotation anno=AnnotationTest.class.getAnnotation(LpfAnnotation.class);
            System.out.println(anno.color());
        }
    }

    @Deprecated  //这个注解，表示这个方法废弃了，不提倡使用了
    public void say(){

    }

    @LpfAnnotation("abc")
    public void eat(){

    }


}
