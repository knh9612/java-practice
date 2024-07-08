package nested.anonymous.test1;

// 지역 클래스를 완성해라
public class OuterClass3 {

    public void myMethod() {
        // 여기에 LocalClass를 구현해라. 그리고 hello() 메서드를 만들어라.
        class LocalClass {
            void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
