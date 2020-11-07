
import java.util.Scanner;

public class 王者荣耀 {

    String []hero={"干将莫邪","元歌","露娜","镜","关羽"};
        public void entrance(){
            System.out.println ("timi");
        }
        public void hero(){
            for (int j = 0; j < 5; j++) {
                System.out.println (j+"、"+hero[j]);
            }
            System.out.println ("请选择你的英雄");
    }
    public void choosehero(){
        Scanner scanner=new Scanner (System.in);
        int i=scanner.nextInt ();
        System.out.println ("你选择的英雄是"+hero[i]);
    }
    public void start(){
        System.out.println ("欢迎来到王者荣耀");
        System.out.println ("敌军还有5秒钟到达战场");
        System.out.println ("准备集合团战");
        System.out.println ("……"+" "+"……"+" "+"此处省略500字");
    }
}