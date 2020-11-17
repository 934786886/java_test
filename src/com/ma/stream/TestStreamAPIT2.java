package com.ma.stream;

import com.ma.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPIT2 {
    List<Employee>  employees = Arrays.asList(
            new Employee("张三",19,9999.99),
            new Employee("李四",59,6666.66),
            new Employee("王五",29,5555.55),
            new Employee("牛六",49,7777.77),
            new Employee("田七",69,8888.88),
            new Employee("田七",69,8888.88),
            new Employee("田七",69,8888.88)
    );

    @Test
    public void test1(){
       Stream<Employee> stream = employees.stream()
                .filter((e)->e.getAge()>35);
       stream.forEach(System.out::println);
    }

    @Test
    public void tes2(){
        employees.stream()
                .filter((e)->e.getSalary()>5000)
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void tes3(){
        employees.stream()
                .filter((e)->e.getSalary()>5000)
                .skip(2)
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test4(){
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd","eee");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);



    }





}
