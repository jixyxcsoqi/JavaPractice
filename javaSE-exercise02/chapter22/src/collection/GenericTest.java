package chapter22.src.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
//        砖石表达式在jdk8之后才出来，可以直接省略后面<>类型，所以可以直接new Bird()添加
        List<Animal>list=new ArrayList<>();

       Cat c=new Cat();
       Bird b=new Bird();

       list.add(new Bird());
       list.add(c);
       //使用泛型之后迭代的都是Animal类型，不用写Object类型了,不用向下转型了，但是如果调用子类特有方法还是要转型
        Iterator<Animal> it=list.iterator();
        while (it.hasNext()){
            Animal animal=it.next();
            if (animal instanceof Cat){
                Cat x=(Cat)animal;
               x.catchMouse();
            }
            if (animal instanceof Bird){
                Bird y=(Bird)animal;
                y.flying();
            }
        }
    }
}
class Animal{
    public void  move(){
        System.out.println("Animal on the move");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("The cat is catching mice ");
    }
}
class Bird extends Animal {
    public void flying() {
        System.out.println("Bird is flying ");
    }
}
