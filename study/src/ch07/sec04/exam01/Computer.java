package ch07.sec04.exam01;

public class Computer extends Calculator {
    @Override // 코드 입장에서는 주석, 컴파일러한테는 추가 정보(체크해달라)
    public double areaCicle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
