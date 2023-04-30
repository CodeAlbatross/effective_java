package com.company.commonCases.comparable;

import java.util.Comparator;

public class PhoneNumber implements Comparable<PhoneNumber>{

    private int areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    //写一个比较器,指定比较规则
    private final static Comparator<PhoneNumber> COMPARATOR =
            Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode).thenComparingInt(pn -> pn.prefix).thenComparingInt(pn -> pn.lineNum);

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber(1,1,3);
        PhoneNumber phoneNumber1 = new PhoneNumber(1,1,2);

        System.out.println(phoneNumber.compareTo(phoneNumber1));
    }
}
