import com.sun.org.apache.regexp.internal.RE;
import sun.jvm.hotspot.debugger.cdbg.TemplateType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Testclick testclick = new Testclick();
//        testclick.tessss(new TestCling(1,2){
//
//            @Override
//            public String oncling(int a, int b) {
//                return null;
//            }
//        });
//        testclick.tessss(()->{
//
//        });
    }

    public abstract static class TestCling{
        public TestCling(int a,int b){

        }
        public abstract String oncling(int a,int b);
    }

    public  interface onClick{
//       String ondo(int a,int b);
       String tessss(TestCling testCling);
    }

    public static class Testclick implements onClick{


        @Override
        public String tessss(TestCling testCling) {
            return null;
        }
    }

    /**
     * lambda for 循环
     */
    public static void lamfor(){
        List<String> avengersRoster = Arrays.asList("iron man", "captain america", "ant man", "spider-man", "black widow", "hulk", "thor");

        //old style
        for (String avenger : avengersRoster) {
            System.out.println("old for "+avenger);
        }

        //lambda expression
        avengersRoster.forEach(a -> System.out.println("lambda for " + a));
    }

    /**
     * lambda 匿名内部类，接口回调
     */
    public static void testCustomerCallBack(){
        LambdaFunc func = new LambdaInterfaceImpl();
        func.testInterface("haha", "hehe", new LambdaInterfaceCallBack<String>() {
            @Override
            public String testfun(String s) {

                System.out.println(s+s);
                return null;
            }
        });

        String a = func.testInterface("123","seffff", callback->{
            return callback+"sfdfsf234434324";
        });
        System.out.println(a);
    }

    public static void innerClass(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("old wocao");
            }
        }).start();
        new Thread(()->{
            System.out.println("lambda wocao");
        }).start();
    }

    public static void test(){
        sort();

    }


    public static void sort(){
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(1);
        ints.add(2);
        ints.add(4);
        ints.forEach(a->System.out.println(a));
        ints.forEach(System.out::println);
        ints.forEach(a->haha(a));

    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static void haha(Object a){
        System.out.println("print by haha " + a);
    }

}
