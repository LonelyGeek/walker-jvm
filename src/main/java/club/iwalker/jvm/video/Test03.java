package club.iwalker.jvm.video;

import java.util.Vector;

/**
 * Created by wangchen on 2016/11/27.
 */
public class Test03 {
    public static void main(String[] args) {

        //-Xms1m -Xmx1m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/Test03.dump
        //堆内存溢出

        /*
        （Out Of Menory）OOM，一旦这类问题发生在生产环境，可能引起严重的业务中断，java虚拟机提供了-XX:+HeapDumpOnOutOfMemoryError，
        使用该参数可以在内存溢出时导出整个堆信息，与之配合使用的还有参数，-XX:HeapDumpPath，可以设置导出堆的存放路径
         */
        Vector<Byte[]> v = new Vector();
        for(int i=0; i < 5; i ++){
            v.add(new Byte[1*1024*1024]);
        }

    }
}
