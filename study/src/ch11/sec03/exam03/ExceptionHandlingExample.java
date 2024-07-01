package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 처리: 배열 인덱스 초과 - " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("예외 처리: null 값 - " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("예외 처리: 숫자 형식 오류 - " + e.getMessage());
            }
        }
    }
}

// ArrayIndexOutOfBoundsException
// NullPointerException
// NumberFormatException