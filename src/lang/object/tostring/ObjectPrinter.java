package lang.object.tostring;

public class ObjectPrinter {

    //자식이 재정의가 되어있으면 자식 toString을 호출함
    public static void print(Object obj) {
        String string = "객체 정보 출력: " + obj.toString();
        System.out.println(string);
    }
}
