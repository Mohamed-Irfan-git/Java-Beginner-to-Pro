package basic.Access;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class A {
     private String name;
     protected int age;

//     public A(){
//         System.out.println("hello world");
//     }

     public void hello(){
         System.out.println("hi friends");

     }

     private void ex(){
         System.out.println("You are the my ex");
     }

     protected static void ex2(){
         System.out.println("You are the my second ex2");
     }

     public String getName(){
         return this.name;
     }

     void fuck(){
         System.out.println("i love u");
     }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        A a = (A) o;
//        return age == a.age && Objects.equals(name, a.name);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash("razim");
//    }


    public static void main(String[] args) {
       A x = new A();
       A x1 = new A();
       long a =x.hashCode();
       System.out.println(a);
       System.out.println(x.hashCode());
       System.out.println(x1.hashCode());

       System.out.println(x instanceof A);

    }
}
