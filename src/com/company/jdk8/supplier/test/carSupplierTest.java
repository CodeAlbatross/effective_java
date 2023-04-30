package com.company.jdk8.supplier.test;

import com.company.jdk8.supplier.model.Car;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class carSupplierTest {
    public static void main(String[] args) {
        supplierTestWithLambdaExpression();

    }

    public static void supplierTestWithLambdaExpression(){
        Car car = Car.supplierMapper.get();
        //System.out.println(car);

        supplierUseCase();
    }

    public static void supplierUseCase(){


        //Supplier<Integer> numSupplierMapper = RandomNums::getNext;
        Supplier<Integer> numSupplierMapper = RandomNums::getNext;

        List<Integer> nums = Stream.generate(numSupplierMapper).limit(10).filter(num -> num > 5).collect(Collectors.toList());

        System.out.println(nums);
    }

}


class RandomNums{
    private static final Random randomUtil = new Random();

    public static Integer getNext(){
        return randomUtil.nextInt(10);
    }

    public static void fun1(){

    }
}
