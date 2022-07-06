public class CollectionFramWork {
    public static void main(String[] args) {
        /**
         * 자료구조 : 자료를 저장할 수 있는 구조
         * 자료구조 클래스들을 컬렉션 프레임워크라고 함
         *
         * Collection은 저장된 자료를 하나씩 꺼낼 수 있는 iterator라는 인터페이스를 반환
         *      iterator는 hasNext()(가지고 있는지 없는지)와 next()(하나씩 자료를 꺼낼때.)메소드 가짐
         *
         * Generic --> 가상의 타입으로 선언하고, 사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있음
         *
         * Set : 중복허용이 안되고, 순서가 없는 자료구조. Hashset과 TreeSet이 있음.
         * List : 중복허용 가능하고, 순서도 있는 자료구조.
         * Map : key와 value를 쌍으로 저장하는 자료구조. key는 중복될 수 없고(key는 set과 비), value는 중복될 수 있다
         *
         * Date 클래스 : 날짜와 시간을 구하기 위한 클래스
         *             지역화에 대한 부분이 고려되지 않음
         *             Date클래스는 대부분의 생성자와 메소드가 Deprecated되어 있음 (앞으로 지원을 안하거나 문제가 있을 수 있으니 사용하지 말라는 뜻)
         *             SimpleDateFormat으로 원하는 형태로 출력 가능
         *             yyyy = 년 / MM = 월 / dd = 일 / hh = 시간 / mm = 분 / ss = 초 / a = 오전 or 오후 / zzz = TimeZone
         *             Date date = new Date(); --> Date인스턴스 만듦
         *             SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd 'at' hh:mm:ss a zzz");
         *             System.out.println(ft.format(date));
         *             long today = System.currentTimeMillis(); -- > 시스템의 현재시각 알 수 있음
         *             System.out.println(today - date.getTime()(Date가 생성된 시간)); -- > 코드사이에 걸린 시간
         * Calendar 클래스 : Date클래스의 단점을 해결하고 등장한 클래스
         *                 Calendar클래스는 추상클래스. 따라서 자기자신 스스로 인스턴스 할 수 없음
         *                 인스턴스를 생성하려면 Calender가 가지고 있는 클래스 메소드 getInstance()를 사용해야함. 메소드 호출시 내부적으로 java.util.GregorianCalendar 인스턴스를 만들어서 리턴함!!
         *                 GregorianCalendar는 Calendar의 자식클래스
         *                 Calendar cal = Calendar.getInstance();
         *                 Calendar 클래스를 이용해서 현재 날짜와 시간에 대한 정보를 알아내는 방법 --> Calendar가 가지고 있는 get메소드에 Calendar의 상수(상수사용시 : 클래스명.상수)를 어떤 것을 넣어주느냐에 따라서 다른값이 나오게 됨
         *                      월은 0부터 시작하기 때문에 +1해줘야함. Hour는 12시간으로 표현. Hour_Of_Day 같은 경우는 24시간 표현
         *                 Calendar 클래스를 이용해서 원하는 날짜나 시간에 대한 정보 얻어오는 방법 : Calendar가 가지고 있는 add메소드 이용하면 다음날짜나 이전 날짜를 구할 수 있음
         *
         * java.time 패키지
         *      새로운 API의 핵심 클래스는 오브젝트를 생성하기 위해 다양한 factory 메서드 사용
         *      LocalDateTime timePoint = LocalDateTime.now(); // 현재의 날짜와 시간
         *      오브젝트 자기 자신의 특정 요소를 가지고 오브젝트를 생성할 경우 of 메소드 호출, 다른 타입으로 변경할 경우에는 from 메소드 호출
         *      객체 생성하고 getValue()를 사용해서 얻어 낼 수도 있음.
         *
         *
         *
         */
    }
}
