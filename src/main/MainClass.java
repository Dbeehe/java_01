package main;

import service.StudentService;

import java.util.Scanner;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록조회
    // 를 선택하는 코드를 작성합니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        boolean run = true;

        while (run) {
            System.out.println("======= 학생관리 =======");
            System.out.println("1.학생등록, 2.학생상세조회, 3.학생목록조회");
            System.out.println("선택> ");
            int sel = scanner.nextInt();
            if (sel == 1) {
                System.out.println("학생등록 메뉴");
                studentService.save();
                break;
            } else if (sel == 2) {
                System.out.println("학생조회 메뉴");
                /*
                    service 의 findByid 메서드를 호출함.
                    
                    service 의 findByid
                    - id값을 입력받고 repository의 findById로 id값을 넘김
                    - 입력받은 id에 해당하는 학생 데이터를 리턴받음.
                    - 리턴받은 값을 출력함
                 */
                break;
            } else if (sel == 3) {
                System.out.println("학생목록 메뉴");
                studentService.findAll();
                break;
            } else if (sel == 4) {
                System.out.println("학생수정 메뉴");
                break;
            } else if (sel == 5) {
                System.out.println("학생삭제 메뉴");
                break;
            } else if (sel == 0) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("1~3까지만 입력");
                break;
            }
        }
    }
}
























