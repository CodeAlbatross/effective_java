package com.company.classAndInterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedHashSet_2<E> extends ForwardingSet<E> {

    private int addCount  = 0;

    public InstrumentedHashSet_2(Set<E> s) {
        super(s);
    }

    public int getAddCount() {
        return addCount;
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    /**
     * 这样通过继承了转发类就不会使用到重写的add方法
     * @param c
     * @return
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        InstrumentedHashSet_2<Integer> ihs = new InstrumentedHashSet_2<>(new HashSet<>());
        ihs.addAll(Arrays.asList(12,3,1));
        System.out.println(ihs.addCount);//3 right
    }
}
