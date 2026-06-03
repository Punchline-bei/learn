package learn;
/*给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后
能接多少雨水
输入: height=[0,1,0,2,1,0,1,3,2,1,2,1]
输出：6
解释：下面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6
个单位的雨水 (蓝色部分表示雨水)*/
/*
思路：
1.创建一个数组left，数组长度为arr.length，初始值为0
2.定义一个temp为0，从左到右遍历数组，比较值，如果temp小于arr[i]，则left[i]=temp，否则left[i]=arr[i]，temp=arr[i]
3.创建一个数组right，数组长度为arr.length，初始值为0
4.同样操作2，但方向相反
5.创建一个数组result，数组长度为arr.length，初始值为0
6.遍历result，取left和right的较小值，并减去arr[i]，得到结果
7.输出sum
*/

public class study3 {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int temp=0;
        //左边
        int[]left=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(temp>arr[i])
            {
                left[i]=temp;
            }else {
                left[i]=arr[i];
                temp=arr[i];
            }
        }
        //打印
        for (int i = 0; i < left.length; i++) {
            System.out.print(left[i]+" ");
        }
        System.out.println();
        //右边
        int[]right=new int[arr.length];
        temp=0;
        for (int i = arr.length-1; i >=0; i--) {
            if(temp>arr[i])
            {
                right[i]=temp;
            }else {
                right[i]=arr[i];
                temp=arr[i];
            }
        }
        //打印
        for (int i = 0; i < right.length; i++) {
            System.out.print(right[i]+" ");
        }
        System.out.println();
        int[]result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(left[i]<right[i]){
                result[i]=left[i];
            }else{
                result[i]=right[i];
            }
        }
        //打印
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
        int sum=0;
        for (int i = 0; i < result.length; i++) {
            sum+=result[i]-arr[i];
        }
        System.out.println();
        System.out.println("总雨水为："+sum);
    }

}
