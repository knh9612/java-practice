package lang.string.test;

// substring()을 사용해서, hello 부분과 .txt 부분을 분리해라.
public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String result1 = str.substring(0, 5);
        String result2 = str.substring(5);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
