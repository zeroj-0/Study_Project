public class Study {
    public static void main(String[] args) {
        /**
         * 자바란 : C와 C++언어의 문법을 기본으로 차용하여 개발된 언어
         *        포인터와 다중 상속 제거
         *        JVM()(Java Virtual Machine)만 있으면 윈도우,리눅스,맥등 어떤 플랫폼에서도 실행이 가능
         *        객체지향 언어 !!! -> 절차지향언어의 반댓말
         *                         디버깅/업데이트가 쉽다
         *        메모리 관리를 자동으로 해준다
         *
         * 변수 : 값(data)을 저장할 수 있는 메로리의 공간을 의미
         * 변수 선언 --> 타입형 변수이름;
         * 식별자 : 프로그래머가 프로그램 작성시 변수나 메소드 등에 붙여주는 이름을 뜻함
         *        규칙 --> 알파벳 대문자, 소문자, 숫자, _, $로 구성될 수 있으며 첫문자는 숫자가 오면 안된다
         *                대부분 첫문자는 대문자로 하며 단어 결합시에는 결합되는 단어를 대문자로 만들거나 _를 사용하여 결합
         *                변수나 메소드의 이름은 첫 자는 소문자
         *                보통 식별자를 만들 때 대문자, 소문자, _만을 사용하는 것이 좋다.
         * 상수 : 수식에서 변하지 않는 값을 의미
         *       대문자의 명명규칙을 사용. 여러 단어로 구성된 이름의 경우 단어 사이에 _를 써서 구분
         *       값이 변하면 위험한 경우 상수 사용, 값만 봤을때 무엇을 의미하는지 쉽게 파악할 수 없는 값에 값 자체를 사용하기 보다는 상수를 사용
         * 상수 선언 --> final 타입형 상수명;
         *
         * 기본형 데이터 타입 => 정수형, 실수형, 문자형, 불린형 의미
         *  논리형 : boolean(1byte) --> true or false
         *  문자형 : char(2byte) --> ''를 이용하여 한 글자 표현
         *  정수형 : 표현할 수 있는 정수의 범위에 따라서 다양하게 제공
         *         byte(1byte)
         *         short(2byte)
         *         char(2byte)
         *         int(4byte) -->  가장 많이 사용
         *         long(8byte) --> int보다 더 큰 범위의 정수를 표현하고 싶을 때 사용
         *  실수형 : float(4byte)
         *         double(8byte) --> float보다 더 큰 범위의 실수 표현가능
         * 리터럴 : 소스 코드의 고정된 값을 대표하는 용어. 일종의 값을 뜻.
         *        ex) true,false,10,a 등
         * 기본형 타입변환 : 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 것
         *              기본형 타입 크기 나열 ==> byte < short,char < int < long < float < double
         *      묵시적 형변환 : 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때에는 묵시적으로 형을 바꾸어줌
         *      명시적 형변환(= 강제 형변환) : 크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 명시적으로 변환 해주어야 함
         *                              ex) long x = 1000;
         *                                  int y = (int) x;
         *
         * 연산 : 데이터를 처리하여 결과를 산출하는 것
         *      연산자 : 연산에 사용되는 표시나 기호
         *             부호 연산자(+ - : 부호결정), 산술 연산자(+ - * / % : 산술 연산), 증감 연산자(++ -- : 1씩 증가하거나 감소)
         *             증감 연산자에서 피연산자 앞에 붙이면 먼저 피연산자의 계산후 계산된 값을 변수에 넣음(전위 연산자)
         *                               뒤에 붙이면 피연산자값을 변수에 먼저 넣고 계산함(후위 연산자)
         *      피연산자 : 연산 대상이 되는 데이터
         *               피 연산자가 1개인 연산자는 단항 연산자
         *      단순 대입 연산자 : 오른쪽에 있는 피연산자의 값을 왼쪽 피연산자의 변수에 저장
         *                     ex) i = 10
         *      복합 대입 연산자 : 정해진 연산을 수행한 후 결과에 대입
         *                     ex) i += 10; (i = i+10;과 같은 의미)
         *      비교연산자 : ==,!=,<,>,<=,>=
         *                비교연산자의 결과는 boolean 값
         *                (비교연산자가 논리 연산자보다 우선순위가 높음)
         *      논리연산자 : &&, ||, !, ^ (and 연산 과 or 연산이 나왔을 경우 and 연산이 먼저 수행)
         *                논리연산자의 피연산자는 boolean타입만 사용 가능.
         *      삼항연산자 : 조건식? 피연산자1: 피연산자2
         *                조건식의 연산결과가 true이면 결과는 피연산자1이고, false이면 결과는 피연산자
         *      연산식 : 연산자와 피연산자를 이용하여 연산과정을 기술한 것
         *
         * if문 : 조건식의 연산 결과에 따라 블록 내부의 문장의 실행 여부를 결정할 수 있다
         *       if(조건문){
         *          실행문;
         *       }
         *       조건식이 true일 경우에만 실행문 실행
         *       {} 생략 가능하지만 실행문은 단 한줄만 포함된다.
         *
         *       if(조건문){
         *          실행문;
         *       }else if(조건식){
         *          실행문;
         *       }else{
         *          실행문;
         *       }
         *       처음 if문의 조건식의 조건문이 true인 경우 처음 if문의 블록 실행, false인 경우 다음 조건식의 결과에 따라 실행 블록 달라짐
         *       else if문의 수는 제한x. 그러나 너무 많으면 실행속도 느려짐
         *       마지막 else블록은 생략되어도 상관 없다.
         *
         * switch문 : 어떤 변수의 값에 따라서 문장을 실행할 수 있도록 하는 제어문
         *           문자열타입도 가능
         *           사용 키워드 --> switch, case, default, break
         *            switch(변수){
         *              case 값1 :
         *                  실행문;
         *                  break;
         *              case 값2 :
         *                  실행문;
         *                  break;
         *              default;
         *            }
         *           break제거 시 그 해당 케이스만 실행되는 것이 아니라 그 외의 케이스가 연속해서 실행.
         *
         * while문 : 조건문의 실행 결과가 true일 동안 반복해서 실행
         *           while(조건문){
         *              실행문;
         *           }
         * do while문 : 무조건 한번은 실행되는 반복문. while문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.
         *             do{
         *                 실행문;
         *             }while(조건문);
         *             ex) do{
         *                      value = scan.nextInt();
         *                      System.out.println("입력받은 수 : " + value);
         *                 }while(value != 10); //value값이 10이 아닐 경우에는 계속 반복한다는 뜻
         *
         * for문 : 변수초기화, 조건식, 중감식이 한줄에 모두 있음
         *        초기화식은 최초 한번만 수행 -> 조건식을 수행해서 수행결과가 false라면 for 반복문을 빠져나감 -> 수행 결과 true라면 실행문 수행 -> 증감식 수행 -> 2-4번 반복적으로 수행
         *        for(초기화식;조건식;증감식){
         *          실행문;
         *          실행문;
         *        }
         * for each문 : 값을 꺼내어 담아주는 역할 해줌
         *             반복해서 자료를 꺼내기위해 배열이나 자료구조의 크기를 알아냈어야 했으나 for each는 그럴 필요 없음
         *             for(타입형 값을 받아줄 변수명 : 출력하고 싶은 자료구조){
         *                  실행문;
         *             }
         *
         * 배열 : 같은 데이터 타입을 가진 연속된 메모리 공간으로 이루어진 자료구조
         *       같은 데이터 타입을 가진 여러개의 변수가 필요할 때 사용
         *       자바에서 배열의 인덱스는 0번부터 사용. 크기를 4로 정하면 0부터 3까지의 인덱스를 가짐
         *       타입형[] 배열이름 = new 타입형[배열의 크기]; --> 배열 생성 방법
         * 2차원 배열 : 배열의 배열을 뜻함
         *            타입형[][] 배열이름 = new 타입형[배열의 크기][배열의 크기];
         *            ex) int[][] array = {{1},{2,3},{4,5,6}};
         *                      --> array[0][0]의 값은 1. array[2][1]의 값은 5
         *
         *
         * 어노테이션(Annotation) : 클래스나 메소드 위에 붙여 사용. 소스코드에 메타코드(추가정보)를 주는 것
         *                       ex) @Override
         *                       자바가 기본적으로 제공해주는 것도 있고, 사용자가 직접 만들 수도 있음.
         *                       사용짜가 직접 작성하는 어노테이션을 Custom 어노테이션이라함
         *                       JVM실행시에 감지할 수 있도록 하려면 @Retention(RetentionPolicy.RUNTIME)(실행시에 감지할 수 있는 어노테이션)를 붙여줘야함
         *                       메소드의 정보를 얻을 수 있는 코드 작성해야함
         *                       메소드라는 객체 생성
         *                          ex) Method method = hello.getClass().getDeclaredMethod("hello");
         *                              이때 getClass는 Object가 가지는 메소드. 클래스의 정보를 리턴
         *                              getDeclaredMethod는 클래스에 대한 정보를 얻고 그 정보로부터 hello라는 이름의 메소드의 정보를 구해라라는 뜻
         *                              이것은 Exception을 처리해야하는 메소드
         *                              method.isAnnotationPresent(Count100.class)
         *                              메소드 객체를 이용해 isAnnotationPresent 사용. 이 메소드는 특정 어노테이션이 메소드에 적용되어 있는지 알아낼 수 있음
         *                       이용방법 : 어노테이션 정의 -> 클래스에 사용 -> 이용하여 실행
         *
         *
         *
         *
         *
         */
    }
}
