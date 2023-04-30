package com.company.classAndInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount  = 0;

    public int getAddCount() {
        return addCount;
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    /**
     * 错误的计数方式, 因为addAll会调用super.add方法,
     * 上面重写了add方法所以造成了count每个元素都多加了一次
     * 正确的方法是写一个装法类来实现Set接口的每一个方法
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        InstrumentedHashSet<Integer> ihs = new InstrumentedHashSet<>();
        ihs.addAll(Arrays.asList(12,3,1));
        System.out.println(ihs.addCount);//6 error
    }
}
