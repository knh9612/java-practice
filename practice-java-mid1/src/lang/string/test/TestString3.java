package lang.string.test;

// str에서 ".txt" 문자열이 언제부터 시작하는지 위치를 찾아서 출려해라. indexOf()를 사용해라.
public class TestString3 {

    public static void main(String[] args) {
        String str = "hello.txt";
        int result = str.indexOf(".txt");
        System.out.println("result = " + result);
    }
}
