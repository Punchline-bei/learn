package learn;
import java.util.Random;
/*
学校选举学生会主席，有 5 个候选人
全校 1000 名同学参与投票 (每人一票，可以弃权，或者选 1-5 号。
投票使用 Random 模拟。0: 弃权，1~5: 给对应的候选人投要
要求 1:
统计每个候选人的得票数和得票率，找出得票最多的候选人？
要求 2:
统计弃票数和弃票率是多少？
 */
public class study2 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int a = r.nextInt(0, 6);
            arr[a]++;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第" + i + "个候选人的得票数是：" + arr[i] + "，得票率是：" + (arr[i] / 1000.0) * 100 + "%");
        }
        //找出得票数最大的
        int max = arr[1];
        for (int i = 2; i < 6; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i1 = 1; i1 < arr.length;i1++) {
                if (max == arr[i1]) {
                    System.out.println("第" + i1 + "个候选者票数最多为：" + max);
                }
        }
        //期票数
        System.out.println("弃票数是：" + arr[0] + "，弃票率是：" + (arr[0] / 1000.0) * 100 + "%");
    }
}
