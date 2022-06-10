package chapter22.src.collection;


/*
�Զ��巺�Ϳ����𣿿���
    �Զ��巺�͵�ʱ��<> �������е���һ����ʶ�������д��
    javaԴ�����о������ֵ��ǣ�
        <E>��<T>
    E��Element��������ĸ��
    T��Type��������ĸ��
 */
public class GenericTest03<��ʶ�����д> {

    public void doSome(��ʶ�����д o){
        System.out.println(o);
    }

    public static void main(String[] args) {

        // new�����ʱ��ָ���˷����ǣ�String����
        GenericTest03<String> gt = new GenericTest03<>();

        // ���Ͳ�ƥ��
        //gt.doSome(100);

        gt.doSome("abc");

        // =============================================================
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(100);

        // ���Ͳ�ƥ��
        //gt2.doSome("abc");

        MyIterator<String> mi = new MyIterator<>();
        String s1 = mi.get();

        MyIterator<Animal> mi2 = new MyIterator<>();
        Animal a = mi2.get();

        // ���÷��;���Object���͡�
        /*GenericTest03 gt3 = new GenericTest03();
        gt3.doSome(new Object());*/
        System.out.println("==========================for each");
        int[] arr={1,2,3,4,5,5,61,61,6};
        for (int data:arr) {
            System.out.println(data);

        }

    }
}

class MyIterator<T> {
    public T get(){
        return null;
    }
}