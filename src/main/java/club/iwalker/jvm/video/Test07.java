package club.iwalker.jvm.video;

/**
 * Created by wangchen on 2016/11/30.
 */
public class Test07 {
    public static void alloc(){
        byte[] b = new byte[2];
    }
    public static void main(String[] args) {

        /*
         -XX:+UseTLAB 使用TLAB
         -XX:+TLABSize 设置TLAB大小
         -XX:TLABRefillWasteFraction 设置维护进入TLAB空间的单个对象大小，他是一个比例值，默认为64，即如果对象大于整个空间的1/64，则在堆创建对象。
         -XX:+PrintTLAB 查看TLAB信息
         -XX:ResizeTLAB 自调整TLABRefillWasteFraction阀值。

         DoEscapeAnalysis 逃逸分析参数

         */

        //TLAB分配
        //参数：-XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis -server
        for(int i=0; i<10000000;i++){
            alloc();
        }
    }
}
