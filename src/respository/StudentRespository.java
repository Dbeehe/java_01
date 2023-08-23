package respository;

import dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentRespository {
    // 학생정보를 저장할 리스트
    private List<StudentDTO> studentDTOList = new ArrayList<>();

    public  boolean save(StudentDTO studentDTO){
        // id 값을 하나씩 증가시켜 함께 저장
        // (현재 리스트에 저장된 학생수 가져오고 1증가하여 저장
        int size = studentDTOList.size();
        studentDTO.setId((long) (size+1));
        // 리스트에 신규학생 추가
        return studentDTOList.add(studentDTO);
    }

    public List<StudentDTO> findAll(){
        return  studentDTOList;
    }
}























