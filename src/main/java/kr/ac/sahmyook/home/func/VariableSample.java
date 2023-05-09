package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile() {
        String name = "제원정";
        System.out.println("이름 : " + name);
    }

    public void empInformation() {
        Scanner sc = new Scanner(System.in);
        String empname = sc.nextLine();
        System.out.println("사원 이름 : " + empname);
    }
}
