package com.ma;

import org.junit.Test;


import java.util.function.*;

public class Method {

    @Test
    public void test1(){
        Consumer<String> con2 = System.out::println;
        con2.accept("asd");

    }

    @Test
    public void test2(){
        Employee emp= new Employee();
        Supplier<String> sup = ()->emp.getName();

        Supplier<Integer> sup2 = emp::getAge;
        Integer s= sup2.get();
        System.out.println(s);

    }



    @Test
    public void test4(){
        BiPredicate<String,String> bp = (x,y)->x.equals(y);
        BiPredicate<String,String> bp1 = String::equals;
        boolean b = bp1.test("1","1");
        System.out.println(b);
    }
    @Test
    public void test5(){
        Supplier<Employee> sup = Employee::new;
        Employee emp = sup.get();
        System.out.println(emp);
    }

    @Test
    public void test6(){
        Function<Integer,Employee> fun = (x)->new Employee(x);
        Function<String,Employee> fun2=Employee::new;
        Employee emp = fun2.apply("xiaohua");
        System.out.println(emp);
    }

    @Test
    public void test7(){
        BiFunction<String,Integer,Employee> fun = Employee::new;
         Employee emp = fun.apply("xiaoli",100);
        System.out.println(emp);
    }
    @Test
    public void test8(){
       Function<Integer,String[]> fun = String[]::new;
       String[] str = fun.apply(20);
        System.out.println(str.length);
    }
    @Test
    public void test9(){
        System.out.println("这是新添加的代码");
    }
    @Test
    public void test10(){
        System.out.println("这是第二次添加的代码");
    }
    @Test
    public void test11(){
        System.out.println("这是第二次添加的代码");
    }
}
