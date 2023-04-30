package com.company.classAndInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Point {
    private double x;
    private double y;

    //错误的,长度非零的数组是可以被改变的, 可能会被客户端修改
    //public final static Point[] points = {};

    private final static Point[] points = {};

    //可以返回一个points的克隆
    public Point[] getPoints(){
        return points.clone();
    }

    //或者返回一个list
    public static final List<Point> fakePoints =
            Collections.unmodifiableList(Arrays.asList(points));


}
