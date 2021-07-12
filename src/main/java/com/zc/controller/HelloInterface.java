package com.zc.controller;

public interface HelloInterface {
    public String sayHello(String world);

    class A implements HelloInterface {

        @Override
        public String sayHello(String world) {
            System.out.println(world);
            return world;
        }

        public static void main(String[] args) {
            HelloInterface helloInterface = new HelloInterface() {
                public String sayHello(String world) {
                    System.out.println(world);
                    return world;
                }
            };
        }
    }


}
