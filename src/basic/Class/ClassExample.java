package basic.Class;

public class ClassExample {
    public static void main(String[] args) {
        Student irfan = new Student(12,"irfan",95);


        System.out.println(irfan.name);

        Student random = new Student(irfan); //other will replace with irfan  // this keyword will replace with random
        System.out.println(random.marks);
    }
}

class Student{
   int ron;
   String name;
   double marks;

   Student(int ron , String name, double marks){
       this.ron = ron;
       this.name = name;
       this.marks = marks;
   }

   Student(Student other){
       this.ron = other.ron;
       this.name = other.name;
       this.marks = other.marks;
   }
}
