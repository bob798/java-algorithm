package me.bob.java.algorithm.concurrent;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/slowest-key/
 * 按键持续时长最长的键
 * 核心点：1. 最长的键位 2. 字母顺序排列最大的键
 * 程序化思维：核心点如何转化为程序表达
 */
class SlowestKey {
    public static void main(String[] args) {
        System.out.println( slowestKey(new int[]{9, 29, 49, 50}, "cbcd"));
    }
    public static char slowestKey(int[] releaseTimes, String keysPressed) {

        char maxKey=0 ;
        int maxTime = 0;
        for (int i = 0; i < releaseTimes.length; i++) {
            int sub = i == 0 ? releaseTimes[0] : (releaseTimes[i] - releaseTimes[i - 1]);
            if ( sub> maxTime) {
                maxKey = keysPressed.charAt(i);
                maxTime = i == 0 ? releaseTimes[0] : releaseTimes[i] - releaseTimes[i - 1];
            } else if (sub == maxTime) {
                maxKey = (char) Math.max(maxKey, keysPressed.charAt(i));
            }
        }
        return maxKey;
    }
}