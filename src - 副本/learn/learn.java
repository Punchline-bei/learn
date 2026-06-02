package learn;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class learn {
    public static void main(String[] args) {

        int money =200;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入抢红包的人数：");
        int n = sc.nextInt();
        if(money< n)
        {
            System.out.println("钱不够");
        }
        Random r=new Random();
        for (int i = 1; i < n; i++) {
            int mymoney = r.nextInt(money-(n-i))+1;
            money-=mymoney;
            System.out.println("第"+i+"个人的红包的钱为："+mymoney);
        }
        System.out.println("第5个人的红包的钱为："+money);
    }
}

