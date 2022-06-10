package chapter22.src.freedom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("a");
        c.add("ab");
        c.add("abc");
        c.add("abcd");
       Iterator i=c.iterator();
       while (i.hasNext()){
           Object o=i.next();
           System.out.println(o);
       }
    }
}
