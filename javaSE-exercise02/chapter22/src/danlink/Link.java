package chapter22.src.danlink;

import java.util.ArrayList;
import java.util.Collection;

public class Link {
   public void add(Object data){
    //Node中有Node header； 为什么不能直接在if中写这个判断语句，而在Link中写Node header=null；才不会报错，因为header直接==null赋值操作，当然不行，需要boolearn(不确定)
       Node header=null;
       if (header==null){//
           new Node(data,null);

       }
   }



}
    //为什么在link里面不添加Node header；就报错，访问控制权限？在Node中添加不能调用？