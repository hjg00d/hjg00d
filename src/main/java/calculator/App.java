package calculator;

import java.sql.SQLOutput;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<>();
 // integer은 랩퍼클래스
        // ArrayList 배열 -> 중간에 삭제하면 그 칸을 비워두지 않고 뒤에껄 끌어와서 배열의 길이를 조절한다
     //   int[] results = new int[10];
     //   int index = 0; // 값이 0부터 올 수 있게 해준다

         // do-while 반목문이 더 깔끔하다
        do {
            System.out.print("First number: ");  // sout 을 생활화
            int num1 = sc.nextInt();
            System.out.print("Second number: ");
            int num2 = sc.nextInt();
            System.out.println("Please enter a symbol.(+, -, *, /): ");
            char operator = sc.next().charAt(0);
 // 1 chapter 숫자 입력하기
            int result = 0;
// switch 피연산자 + case 조건 -> if 문을 쓸 때보다 더 깔끔하게 사용할 수 있음
            // int result 값과 case에서 result 값처럼 맞춰야지 제대로 작동한다.
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Input 0 X");
                        return;
                    }
                    break;
      // break; 가까운 블럭을 for문, while문, switch 문을 중단시킨다
                default:
                    System.out.println("X");
                    return; // break를 쓰면 끝나기 때문에 return을 사용하여 잘못 입력하여도 돌아가도록 설정
            }
            System.out.println("result: = " + result);
            results.add(result);

            System.out.println("remove? (Delete when you enter remove)");
            if(Objects.equals(sc.next(), "remove")) {  // 그냥 b:라고 입력하면 에러가 뜬다
                // Objects.equals에 대해선 추가 공부 더
                results.remove(0);  // remove, 0 앞에는 따로 입력하지 않고 바로 쓴다. 해결하는데 1시간 걸렸다
            }
            // index == 10 -> 마지막 번호가 9 이므로 다 채웠다는 것을 의미할 수 있다
            //fori 값
            System.out.println("inquiry of stored calculation results? (Inquiry when enter Inquiry)");
           // Inquiry로 해서 소문자로 검색하면 안됐었다. inquiry로 바꾸었더니 바로 됨
            if(Objects.equals(sc.next(), "inquiry")) {
                for (Integer res :results) { 
                    System.out.println("Result : " + res);
                }
            }

            //if("inquiry".equals(sc.next()))
            //if(index == 10){
               // for (int i = 0; i < results.length - 1; i++) {
                   // results[i] = results[i+1];
             // result[0] = results[1] 식으로 다 만들어줘도 되지만 i를 통해 간편하게 식을 쓴다

               // index--; //증감 연산자를 통해 9로 줄여주고 마지막을 특정해 주었다(위에 10이기 때문)
                // results[9] = 0; 을 사용해도 되지만 index가 더 간편



           // results[index] = result;
          //  index++;
          //  System.out.println("Arrays.toString(results)= " + Arrays.toString(results));
            // Arrays.ToString(results) -> ?

            System.out.println("If you type in anything, you'll continue? (Exit when you enter exit)");
        } while (!sc.next().equals("exit"));

    }
}
