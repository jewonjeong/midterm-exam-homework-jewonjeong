package kr.ac.sahmyook.home.func;
import java.util.Scanner;

public class IfSample {
    public void maxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println("두 정수 중 큰 값은 " + num1 + "입니다.");
        } else if (num2 > num1){
            System.out.println("두 정수 중 큰 값은 " + num2 + "입니다.");
        } else {
            System.out.println("두 정수는 같습니다.");
        }
    }

    public void minNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int num3 = sc.nextInt();
        System.out.print("정수를 입력해주세요 : ");
        int num4 = sc.nextInt();
        if (num3 < num4){
            System.out.println("두 정수 중 작은 값은 " + num3 + "입니다.");
        } else if (num3 > num4){
            System.out.println("두 정수 중 작은 값은 " + num4 + "입니다.");
        } else {
            System.out.println("두 정수는 같습니다.");
        }

    }

    public void threeMaxMin() {
        System.out.println("threeMaxMin호출됨");

    }


    public void checkEven() {
        System.out.println("checkEven호출됨");

    }

    public void isPassFail() {
        System.out.println("isPassFail호출됨");

    }

    public void scoreGrade() {
        System.out.println("scoreGrade호출됨");

    }

    public void checkPlusMinusZero() {
        System.out.println("checkPlusMinusZero호출됨");

    }

    public void whatCaracter() {
        System.out.println("whatCaracter호출됨");

    }
}
