package club.iwalker.jvm.video;

/**
 * Created by wangchen on 2016/11/27.
 */
public class Test01 {
    public static void main(String[] args) {

        //-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags

        //
        //-XX:+PrintGC -Xms5m -Xmx20m -XX:+UseSerialGC -XX:+PrintGCDetails

        //查看GC信息
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());

        byte[] b1 = new byte[1*1024*1024];
        System.out.println("分配了1M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());

        byte[] b2 = new byte[4*1024*1024];
        System.out.println("分配了4M");
        System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
        System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
        System.out.println("total memory:" + Runtime.getRuntime().totalMemory());

    }
}
