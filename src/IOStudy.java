import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStudy {
    public static void main(String[] args) {
        /**
         * 자바IO(Input, Output) : 입출려글 위한 인터페이스와 클래스들
         *                        byte단위 입출력 클래스 --> inputStream과 outputStreamd이라는 추상클래스를 상속받아 만들어짐
         *                        문자(char)단위 입출력 클래스 --> Reader와 Writer라는 추상클래스를 상속받아 만들어짐
         *                        위의 4가지 추상클래스를 받아들이는 생성자가 있다면, 다양한 입출력방법을 제공하는 클래스
         *                                                  생성자가 없다면, 어디로부터 입력받을것인지, 어디에 쓸것인지 나타내는 클래스는 1byte나 1char단위로 입력하거나 배열단위로 입출력하게 됨
         *                        파일로부터 입력받고 쓰기 위한 클래스 : FileInputStream, FileOutputStream, FileReader, FileWriter
         *                        배열로부터 입력받고 쓰기 위한 클래스 : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
         *                              => 이들은 어디로부터, 어디에라는 대상을 지정할 수 있는 IO클래스. = 장식대상 클래스
         *                        DataInputStream, DataOutputStream같은 클래스는 다양한 데이터 형을 입력받고 출력함
         *                        PrintWriter는 다양하게 한줄 출력하는 println()메소드 가짐
         *                        BufferReader는 한줄 입력받는 readLine()메소드 가짐
         *                              => 이들은 다양한 방식으로 입력하고, 출력하는 기능 제공. = 장식하는 클래스
         *
         *                        데코레이터 패턴 : 하나의 클래스를 장식 하는 것처럼 생성자에서 감싸서 새로운 기능을 계속 추가 할 수 있도록 클래스를 만드는 방식
         */

         /**
         * Byte 단위 입출력 클래스
         *      파일로부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램 작성
         *          파일로부터 읽어오기 위한 객체 : FileInputStream
         *          파일에 쓸수 있게 해주는 객체 : FileOutputStream
         *      FileInputStream과 FileOutputStream을 이용하여 1바이트씩 읽어들여 1바이트씩 저장
         *      read()메소드는 더이상 읽어들일 것이 없을때의 리턴값을 정해주어야함
         *      byte를 리턴한다면 끝을 나타내는 값을 표현할 수 없어서 int로 리턴해주어야함. 따라서 read()메소드는 리턴타입이 int
         *      원하는 byte크기를 정해 byte[] 배열 사용해서 쓰면 된다.
         */
//                FileInputStream fis = null;
//                FileOutputStream fos = null;
//                try {
//                    fis = new FileInputStream();
//                    fos = new FileOutputStream();
//
//                int readCount = -1;
//                 byte[] buffer = new byte[512];
//                 while((readCount = fis.read(buffer))!= -1) {  --> byte배열의 크기만큼 읽어드. 더이상 읽어드릴 파일이 없을때 -1을 리턴
//                     fos.write(buffer, 0, readCount);  -->fileoutputstream에 지정해놓은 파일에 저장 !!
//                 }
//                }catch (Exception e){
//                    e.printStackTrace();
//                }finally {
//                    try {
//                        fos.close();
//                    }catch (IOException e){
//                        e.printStackTrace();
//                    }
//                }
         /**
         * try-with-resources 블럭 선언
         *      try(io 객체 선언){
         *          io객체 사용
         *      }catch(Exception ex){
         *          ex.printStackTrace();
         *      }
         *
         *      다양한 타입으로 저장하기 위한 DataOutputStream사
         *      순서대로 저장했으면 읽어드릴때도 같은 순서로 읽어야함니다. 다양한 타입의 데이터를 읽어낼 수 있는 DataInputStream사용
         *
         * Char단위 입출력(Console) : char단위 입출력 클래스는 클래스 이름이 Reader나 Writer로 끝이 남
         *      System.in - 키보드를 의미(inputStream). InputStream타입!!
         *      BufferedReader - 한줄씩 입력 받기위한 클래스
         *      BufferedReader클래스의 생성자는 inputStream을 입력받는 생성자가 없다. reader객체만 받아 드릴수 있음 그래서 inputstreamreader클래스를 이욯해야함
         *
         *
         *
         *
         */
    }
}
