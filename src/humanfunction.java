import java.util.Scanner;

public class humanfunction {
    static electronicfunction e=new electronicfunction () ;
    static amusementfunction a=new amusementfunction ();
    static communicationsfunction c=new communicationsfunction ();
    static String []functions={"bluetooth","charge","WiFe","music","learn","games","call","send","退出"};
    static void sayhello() {
        System.out.println("我是小V，有什么可以帮到你的吗？");
    }
    static void showfunction(){
        for (int i = 0; i < 9; i++) {
            System.out.println((i+1)+"、"+functions[i]);
        }
    }
    static void work(){

        int ret=0;
        for (int i = 0;i!=-1; i++) {
            Scanner scanner=new Scanner(System.in);
            int m=scanner.nextInt();
            switch (m){
                case 1:e.bluetooth();break;
                case 2:e.charge();break;
                case 3:e.WiFe();break;
                case 4:a.music();break;
                case 5:a.learn();break;
                case 6:a.games();break;
                case 7:c.call();break;
                case 8:c.send();break;
                case 9:ret=1;
            }
            if(ret==1){
                break;
            }
        }
    }
    static void saygoodbye() {
        System.out.println("期待下次为您服务");
    }
}
