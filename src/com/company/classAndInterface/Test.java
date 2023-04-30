package com.company.classAndInterface;

public class Test {

    public static void main(String[] args) {

    }

    public void test(){
        //非静态内部类无法在外部实例中创建实例
        /*StaticMemberClassDemo.NonstaticMemberClass n =
                new StaticMemberClassDemo().NonstaticMemberClass;
*/


        StaticMemberClassDemo.StaticMemberClass s =
                new StaticMemberClassDemo.StaticMemberClass();
    }
}
