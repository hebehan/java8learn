# JAVA8学习笔记

##> lambda表达式
### 1.表达形式
    (arguments) -> (body)
    
    (int a) is the same as (a)
    
###2.简化内部类
    new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("old wocao");
                }
            }).start();
            new Thread(()->{
                System.out.println("lambda wocao");
            }).start();
            
            使用(参数,参数)->{}这种形式可以替换匿名内部类,简化写法,默认实现第一个方法

###3.容器 foreach 排序
     List<Integer> ints = new ArrayList<>();
             ints.add(3);
             ints.add(1);
             ints.add(2);
             ints.add(4);
             ints.forEach(a->System.out.println(a));
             ints.forEach(System.out::println);
             

##> Stream

##> Deafult Interface