package examples;

public class JavaIf {
    public static void main(String[] args) {
        String param = "Product Param";
        boolean isTest = args.length > 1 && args[0].contains("test");
        if (isTest) {
            param = "Test Param";
        }
        System.out.println(param);
    }
}
