package basic.sigleton;

public class Singleton {
    int num = 10;

    Singleton(){
        System.out.println("hello world");
    }
    private static Singleton instance;

    public static Singleton getInstance(){
          if (instance == null){
              instance = new Singleton();
          }

          return instance;
    }
}
