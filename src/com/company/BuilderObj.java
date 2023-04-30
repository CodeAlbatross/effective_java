package com.company;

public class BuilderObj {

    private final String name;

    private final String gender;

    private final int age;

    public static class Builder{
        //Required
        private final String name;
        private final String gender;

        //Opt
        private int age  = 0;

        public Builder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public Builder age(int val){
            this.age = val;
            return this;
        }

        public BuilderObj build(){
            return new BuilderObj(this);
        }
    }

    public BuilderObj(Builder builder){
        name = builder.name;
        gender = builder.gender;
        age = builder.age;
    }
}
