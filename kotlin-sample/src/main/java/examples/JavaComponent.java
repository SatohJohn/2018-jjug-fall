package examples;

public class JavaComponent {

    private static StringData getStringData() {
        String str = "string";
        return new StringData(str, str.length());
    }

    static class StringData {
        private String str;
        private int length;
        public StringData(String str, int length) {
            this.str = str;
            this.length = length;
        }
    }

    public static void main(String[] args) {
        StringData stringData = getStringData();
        System.out.println(String.format("%s, %s", stringData.str, stringData.length));
    }
}

