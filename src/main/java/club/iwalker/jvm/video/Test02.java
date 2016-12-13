package club.iwalker.jvm.video;

/**
 * Created by wangchen on 2016/11/27.
 */
public class Test02 {
    public static void main(String[] args) {

        /*
        -XX:+PrintGC 使用这个参数，虚拟机启动后，只要遇到GC就会打印日志。
        -XX:+UseSerialGC 配置串行回收器
        -XX:+PrintGCDetails 可以查看详细信息，包括各个区的情况
        -Xms：设置java程序启动时初始堆大小
        -Xmx：设置java程序能获得的最大堆大小
        -Xmx20m -Xms5m -XX:+PrintCommandLineFlags : 可以将隐式或者显示传给虚拟机的参数输出

        新生代的配置
        -Xmn：可以设置新生代的大小，设置一个比较大的新生代会减少老年代的大小，这个参数对系统性能以及GC行为有很大的影响，新生代大小一般会设置整个堆空间的1/3到1/4左右。
        -XX:SurvivorRatio：用来设置新生代中eden空间和from/to空间的比例。含义：-XX:SurvivorRatio=eden/from=eden/to

        使用（-XX:NewRatio）设置新生代和老年代的比例：-XX:NewRatio=老年代/新生代


         */

        //第一次配置
        //-Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC

        //第二次配置
        //-Xms20m -Xmx20m -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC

        //第三次配置
        //-XX:NewRatio=老年代/新生代
        //-Xms20m -Xmx20m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC

        byte[] b = null;
        //连续向系统申请10MB空间
        for(int i = 0 ; i <10; i ++){
            b = new byte[1*1024*1024];
        }
    }
}
