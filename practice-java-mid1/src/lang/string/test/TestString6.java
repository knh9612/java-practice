package lang.string.test;

// str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
// indexOf()를 반복문과 함께 풀면 된다.
public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        // indexOf()을 했을 때, 존재하지 않으면 -1을 반환!
        while (index >= 0) {
            index = str.indexOf(key, index + key.length()); // 두 번째 인자는 검색을 시작할 index
            count++;
        }
        System.out.println("count = " + count);
    }
}
