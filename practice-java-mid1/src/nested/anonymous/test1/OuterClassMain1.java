package nested.anonymous.test1;

public class OuterClassMain1 {

    public static void main(String[] args) {
        // 여기에서 NestedClass의 hello() 메서드를 호출하라.
        OuterClass1.NestedClass nested = new OuterClass1.NestedClass();

        nested.hello();
    }
}
