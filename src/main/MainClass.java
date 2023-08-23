package main;

import java.util.Scanner;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록조회
    // 를 선택하는 코드를 작성합니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("======= 학생관리 =======");
            System.out.println("1.학생등록, 2.학생상세조회, 3.학생목록조회");
            System.out.println("선택> ");
            int num = Scanner.n();
            if (num == 1) {
                System.out.println("학생등록 메뉴");
                break;
            } else if (num == 2) {
                System.out.println("학생조회 메뉴");
                break;
            } else if (num == 3) {
                System.out.println("학생목록 메뉴");
                break;
            } else if (num == 4) {
                System.out.println("학생수정 메뉴");
                break;
            } else if (num == 5) {
                System.out.println("학생삭제 메뉴");
                break;
            } else if (num == 0) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("1~3까지만 입력");
                break;
            }
        }
    }
}
























