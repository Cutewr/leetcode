package Easy.IsHappy_202;
/*
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」 定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果这个过程 结果为 1，那么这个数就是快乐数。
 * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
 */

public class solution {
    public static void main(String[] args) {
        int n=2;
        Boolean res=isHappy(n);
        System.out.println(res);
    }
    //知识点：如果需要判断的东西【有可能发生循环】
    //使用快慢指针：一个指针一次走一步，一个一次走两步
    public static boolean isHappy(int n) {
        int slowRunner=n;
        int fastRunner=getNext(n);
        while (fastRunner!=1&&slowRunner!=fastRunner) {
            slowRunner=getNext(slowRunner);
            fastRunner=getNext(getNext(fastRunner));
        }
        return fastRunner==1;
    }
    public static int getNext(int n){
        int next=0;
        while (n>0) {
            int temp=n%10;
            n/=10;
            next+=temp*temp;
        }
        return next;
    }
}
