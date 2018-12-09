package examples;

public class JavaScope {
    private static class TestObject {
        private final String param;

        public TestObject(String param) {
            this.param = param;
        }
    }
    public static void main(String[] args) {
        String param = "parameter";
        System.out.println(param);
        TestObject result = create(param.toUpperCase());
    }

    private static TestObject create(String param) {
        return new TestObject(param);
    }
}
