package com.company.commonCases.equals;

public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s){
        this.s = s;
    }

    //不标准的equals方法, 不符合对称性
/*    @Override
    public boolean equals(Object o){
        if (o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if (o instanceof String){
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }*/

    //正确的写法, 规避了与string比较的逻辑
    @Override
    public boolean equals(Object o){
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString s = new CaseInsensitiveString("China");
        String str = "china";

        System.out.println(s.equals(str));
        System.out.println(str.equals(s));

    }
}


