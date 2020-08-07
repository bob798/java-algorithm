package me.bob.java.algorithm.search;

public class BinarySearch {


    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 7};
//        System.out.println(binarySearch(arr, 0, arr.length, 9));
        System.out.println(5 / 2);
        System.out.println(1 / 2);
        System.out.println(binarySearchWhile(arr, 0, arr.length-1, 0));
    }

    public static int binarySearch(int[] arr, int start, int end, int hkey) {

        if (start > end) {
            return -1;
        }
        int mid = start + (end -start) / 2;
        if (arr[mid] > hkey) {
            return binarySearch(arr, start, mid - 1,hkey);
        }
        if (arr[mid] < hkey) {
            return binarySearch(arr, mid + 1, end, hkey);
        }
        return mid;
    }

    public static int binarySearchWhile(int[] arr, int start, int end, int hkey) {
        if (start > end) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == hkey) {
                return mid;
            } else {
                if (arr[mid] > hkey) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}

/*
* 单元测试
*性能
* 递归模式：栈溢出
* */
