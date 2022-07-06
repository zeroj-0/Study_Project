public class ExceptionStudy {
    public static void main(String[] args) {
        /**
         * Exception(예외처리) : 프로그램실행중 예기치 못한 사건을 예외라고 한다. 예외 상황을 미리 예측하고 처리할 수 있는 기능
         *      try - catch - finally
         *      try{
         *          수행할코드, 예외발생가능성이있는 블록
         *      }catch(예외클래스 변수명){
         *          예외처리블록
         *      }finally{
         *          예외발생여부에 상관없이 반드시 실행되는 블록 --> 생략가능
         *      }
         *
         *      throws : 예외가 발생했을때 예외를 호출한 쪽에서 처리하도록 던져준다.
         *               메소드명뒤에 throws키워드 사용
         *
         * 사용자 정의 Exception : Exception이나 Exception의 후손을 상속받아 만들어진 클래스
         *                      public class 클래스이름 extends Exception {
         *                              ...
         *                      }
         *          Exception을 상속받은 checked Exception : 오류처리를 하지 않으면 컴파일 오류남. 반드시 오류처리해야함
         *          RuntimeException을 상속받은 unChecked Exception : 오류처리 반드시하지 않아도 컴파일상 오류를 발생시키지 않음
         *
         *
         */
    }
}
