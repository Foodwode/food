package com.example.demo;


import com.example.utils.DistributedRedisLock;
import org.redisson.Redisson;
import org.redisson.api.RLock;

/**
 * @Describe
 * @Author Gary
 * @Create 2019-10-17 10:41
 */
public class Priority {

    public static void main(String[] args) throws Exception {

    }

    public static int getKey(int[] arr, int key, int init, int hight){
        if (init > hight)
            return -1;
        int keyPointer = (init + hight) / 2;
        if (key == arr[keyPointer])
            return keyPointer;
        if (key > arr[keyPointer]) {
            int key1= getKey(arr, key, keyPointer + 1, hight);
            return key1;
        } else {
            int key1 = getKey(arr, key, init, keyPointer - 1);
            return key1;
        }

    }



}