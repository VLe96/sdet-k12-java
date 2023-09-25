package lession_01;

public class VariableLearning {
    public static void main(String[] args) {
        // snake_case (thường dùng trong python), camelCase, PascalCase...
        // trong Java ngta sẽ follow PascaslCase, camelCase -> viết hoa chữ đầu
        int myNum = 18; // đây gọi là declaration
        long myLongNumber = 10L; // đối với Long phải có chữ L đằng sau con số
        float myFloatNum= 3.12f; // phải có f nếu ko sẽ nhầm sang double
        double myDouble = 3.24D;

        System.out.println(myNum);

        //trường hợp re-assigned, ko dc re-decalration trong lập trình như int myNum = 19 thêm lần nữa, chỉ dc re-assign
        myNum = 19;
        System.out.println(myNum);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
