package lang.string.test;

// split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라.
public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String join = String.join("->", split);
        System.out.println(join);
    }
}
