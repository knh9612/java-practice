package lang.string.test;

// split()를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
public class TestSTring9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
