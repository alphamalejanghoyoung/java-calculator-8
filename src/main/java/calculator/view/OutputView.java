package calculator.view;

public class OutputView {
    public void printResult(int result) {
        System.out.println("결과 :" + result);
    }
    public void printError(String error) {
        System.out.println("잘못된 문자열을 입력했습니다.");
    }
}
