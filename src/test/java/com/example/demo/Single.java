package com.example.demo;

/**
 * @Describe
 * @Author Gary
 * @Create 2019-10-31 11:22
 */
public class Single {
    public volatile static Single single;
    public Single (){}
    public static Single getSingle(){
        if (single == null){
            synchronized (Single.class){
                if (single == null)
                    single = new Single();
            }
        }
        return single;
    }
}
