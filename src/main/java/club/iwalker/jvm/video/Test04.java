package club.iwalker.jvm.video;

/**
 * Created by wangchen on 2016/11/27.
 */
public class Test04 {

    /*
    -Xss来指定线程的最大栈空间，整个参数也直接决定了函数可调用的最大深度
     */

    //-Xss1m
    //-Xss5m

    //栈调用深度
    private static int count;

    public static void recursion(){
        count++;
        recursion();
    }
    public static void main(String[] args){
        try {
            recursion();
        } catch (Throwable t) {
            System.out.println("调用最大深入：" + count);
            t.printStackTrace();
        }
    }
}
