package ch11.sec04;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
            System.out.println("value: " + value);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println();

        try (MyResource res = new MyResource("A")) {
            String data = res.read2();
            int value = Integer.parseInt(data);
            System.out.println("value: " + value);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println();

        try (MyResource res1 = new MyResource("A"); MyResource res2 = new MyResource("B")) {
            String data1 = res1.read1();
            String data2 = res2.read1();
            System.out.println("data1: " + data1 + ", data2: " + data2);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
