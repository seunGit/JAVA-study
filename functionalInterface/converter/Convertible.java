package functionalInterface.converter;

 // 함수형 인터페이스를 쓴다고 명시
 @FunctionalInterface // 메서드 하나만 사용 가능, 2개 이상 사용시 에러 발생시킴
public interface Convertible {
    void convert(int USD);
}
