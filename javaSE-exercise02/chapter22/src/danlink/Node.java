package chapter22.src.danlink;

import java.security.PublicKey;

public class Node{
    Object data;
    Node next;
    Node header;
    public Node(){

    }
    public Node(Object data, Node next){
        this.data=data;
        this.next=next;
    }
}

