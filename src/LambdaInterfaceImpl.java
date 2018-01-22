public class LambdaInterfaceImpl implements LambdaFunc {
    @Override
    public <T> T testInterface(String s1, String s2, LambdaInterfaceCallBack<T> lambdaInterfaceCallBack) {
        System.out.println(s1+s2);
        return lambdaInterfaceCallBack.testfun(s1);
    }
}
