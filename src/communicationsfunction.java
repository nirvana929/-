

import java.util.Scanner;

public class communicationsfunction implements communications{
private String number;
    @Override
    public void call() {
        System.out.println ("你将拨打：");
        getnumber ();
        System.out.println ("正在拨号："+number);
    }

    @Override
    public void send() {
        System.out.println ("你将发送短信至：");
        getnumber ();
        System.out.println ("正在发送短信至："+number);
    }
    public void getnumber(){
        System.out.println ("请输入号码");
        Scanner scanner=new Scanner (System.in);
        this.number=scanner.nextLine ();
    }
}
