package lang.wrapper.test;

// String str을 Integer로 변환해서 출력해라.
// Integer를 int로 변환해서 출력해라.
// int를 Integer로 변환해서 출력해라.
// 오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.
public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        Integer wrapperNum = Integer.valueOf(str);
        System.out.println(wrapperNum);

        int num = wrapperNum.intValue();
        System.out.println(num);

        Integer wrapperInt = Integer.valueOf(num);
        System.out.println(wrapperInt);
    }
}
