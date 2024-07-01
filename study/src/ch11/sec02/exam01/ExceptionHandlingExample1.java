package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println("예외 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

// 원래의 문제점 : printLength(null); 호출 시 NullPointerException 발생.
// 한수의 해결책 : try-catch 블록을 사용하여 예외를 처리하고, 예외 메시지 및 스택 추적 내용을 출력.