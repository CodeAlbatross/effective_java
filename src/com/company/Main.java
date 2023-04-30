package com.company;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = Collections.singletonList(2);

        BuilderObj build = new BuilderObj.Builder("Jack", "Man").age(23).build();

    }

}
