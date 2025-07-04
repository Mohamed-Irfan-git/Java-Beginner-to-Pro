package basic.costamArrayList;

import java.util.Arrays;

public class CustomArrayListE <T>{
    private Object [] data;
    private int size =0;

    private static int DEFAULT_CAPACITY=1;

    CustomArrayListE(){
        data = new Object[DEFAULT_CAPACITY];
    }

    void add(T value){
        if(isFull()){
            resize();
        }
        data[size++]=value;

    }

    private void resize(){
        Object [] temp = new Object[size*2];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];

        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed =(T) (data[--size]);
        return  removed;
    }
    private T get(int index){
        return (T) (data[index]);
    }
    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayListE{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListE<Integer> list = new CustomArrayListE<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove();
        list.add(6);
        list.set(0,6);
        System.out.println(Arrays.toString(list.data));
    }
}