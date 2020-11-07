

public class electronicfunction implements electronic {
    @Override
    public void bluetooth() {
        System.out.println ("蓝牙配对中");
        System.out.println ("蓝牙已连接");
    }

    @Override
    public void charge() {
        System.out.println ("手机电量不足，请充电");
    }

    @Override
    public void WiFe() {
        System.out.println ("Wife已连接");
    }
}
