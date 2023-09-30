package com.demos.javase.day07.demo14;

import java.util.Arrays;

/**
 * Arrays类的使用
 * String toString(int[] a): 返回该数组的字符串表示形式
 * sort(int[] a): 对a数组进行升序排序
 * sort(int[] a, int fromIndex, int toIndex): 对a数组指定范围内的元素进行排序. fromIndex：含; toIndex：不含
 * binarySearch(int[] a, int key): 使用搜索前必须使用sort方法进行排序，在a数组中搜索是否存在key这个元素.
 * 如果搜索到：返回元素的索引, 如果没有搜索到：按顺序计算到key元素应该插入的位置index，最终返回(-index-1)的值
 * copyOf(int[] original, int newLength): 从original数组拷贝的0下标拷贝到newLength下标到新数组，并将新数组返回；其中0（含），newLength（不含）
 * copyOfRange(int[] original, int from, int to) : 从original数组拷贝的from下标拷贝到to下标到新数组，并将新数组返回；其中from（含），to（不含）
 * equals(int[] a, int[] a2)：比较两个数组中的元素是否相同；
 */
public class Demo14 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 6, 5};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        System.out.println("Arrays.toString(arr1) => " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Arrays.sort(arr1) => " + Arrays.toString(arr1));

        System.out.println("Arrays.binarySearch(arr1, 2) => " + Arrays.binarySearch(arr1, 2) );
        System.out.println("Arrays.binarySearch(arr1, 0) => " + Arrays.binarySearch(arr1, 0) );

        Object copyOfArr1 = Arrays.copyOf(arr1, 3);
        System.out.println("Arrays.copyOf(arr1, 3) => " + copyOfArr1);
    }
}
