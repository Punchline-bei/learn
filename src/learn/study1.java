package learn;
//利用二分法找中位数
public class study1 {
    public static void main(String[] args) {
        int[]arr1={1,3,5,7,9,10};
        int[]arr2={2,4,6};
        insertsort(arr1,arr2);
    }
    public static double insertsort(int[]arr1,int[]arr2){
        int z1=0;
        int z2=0;
        int[]arr=new int[arr1.length+arr2.length];
        for (int i = 0; i < 8; i++) {
            if (z1 == arr1.length) {
                arr[i] = arr2[z2];
                z2++;
                continue;
            }
            if (z2 == arr2.length) {
                arr[i] = arr1[z1];
                z1++;
                continue;
            }
            if (arr1[z1] < arr2[z2]) {
                arr[i] = arr1[z1];
                z1++;
            } else {
                arr[i] = arr2[z2];
                z2++;
            }
        }
        //输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //找中位数
        if(arr.length%2==0)
        {
            System.out.println("中位数为："+(arr[arr.length/2]+arr[arr.length/2-1])/2.0);
        }
        else
        {
            System.out.println("中位数为："+arr[(arr.length)/2]);
        }
        return 0;
    }
}


