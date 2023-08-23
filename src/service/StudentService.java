package service;

import dto.StudentDTO;
import respository.StudentRespository;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    Scanner scanner = new Scanner(System.in);
    StudentRespository studentRespository = new StudentRespository();
    // 학생등록
    // 매개변수 없음.
    // 리턴없음.
    // 메서드 이름: save()
    // 실행내용
    // 스캐너로 이름(studentName), 학과(studentMajor), 전화번호(studentMobile) 를 입력받고
    // 입력값을 DTO객체에 담아서 StudentRepository의 save() 메서드로 전달

    public void save(){
        System.out.println("이름> ");
        String studentName = scanner.next();
        System.out.println("학과> ");
        String studentMajor = scanner.next();
        System.out.println("전화번호> ");
        String studentMobile = scanner.next();
        // DTO 객체
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentMajor(studentMajor);
        studentDTO.setStudentMobile(studentMobile);

        // DTO 객체를 StudentRespository의 save() 메서드로 전달하여 리턴을 boolean으로 받음.
        boolean result = studentRespository.save(studentDTO);
        // respository의 save() 내용
        // 넘겨받은 DTO 객체를 리스트에 추가하고 추가하면 true 리턴
        if (result){
            System.out.println("등록 성공");
        }else{
            System.out.println("등록실패");
        }
    }
    public void findAll(){
        // - Repository의 finAll 메서드를 호출하여 리스트를 리턴받음
        List<StudentDTO> studentDTOList = studentRespository.findAll();
        for (StudentDTO studentDTO: studentDTOList){
            System.out.println("studentDTO = " + studentDTO);
        }
    }

        /*
            findAll() 메서드
            Main에서 3번 선택시 호출되는 메서드
            매개변수 리턴 없음.
            실행내용
                - Repository의 findAll 메서드를 호출하여 리스트를 리턴받음.
                - 리턴받은 리스트에 담긴 데이터를 for문을 이용하여 출력
         */
}















