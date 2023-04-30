package com.company.classAndInterface;

public class StaticMemberClassDemo {

    public final int size = 2;

    public static final int staticSize = 2;

    public void printSize(){
        System.out.println(size);
    }

    //非静态成员类可以访问外部类所有成员
    class NonstaticMemberClass{
        FinalClass finalClass = new FinalClass();
        public void test(){
            int size = StaticMemberClassDemo.this.size;
            System.out.println(size);

            printSize();
        }
    }

    //静态成员类可以访问外部类静态成员
    static class StaticMemberClass{
        FinalClass finalClass = new FinalClass();
        public void test(){
            int size = StaticMemberClassDemo.staticSize;
        }
    }


    public void test() {
        //非静态成员类的实例被创建就有一个与外围实例之间的关联关系被建立, 消耗非静态成员的空间
        NonstaticMemberClass nonstaticMemberClass = new NonstaticMemberClass();
        nonstaticMemberClass.test();

        StaticMemberClass staticMemberClass  =new StaticMemberClass();
        staticMemberClass.test();
    }

}
