package lang.string.test;

// length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라
public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;
        for (String s : arr) {
            result += s.length();
        }
        System.out.println("result = " + result);
    }
}
