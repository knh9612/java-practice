package lang.string.test;

// 양쪽 공백을 제거
public class TestString7 {

    public static void main(String[] args) {
        String original = "     Hello Java     ";
        String restult = original.strip();
        System.out.println("restult = " + restult);
    }
}
