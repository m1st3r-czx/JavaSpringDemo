package com.myjava.controller.student;

import com.myjava.po.student.StudentPO;
import com.myjava.request.student.StudentRequest;
import com.myjava.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Validated
@RestController
@RequestMapping(value = "/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/getlist")
    public ArrayList<StudentPO> getList(@RequestBody StudentRequest studentRequest) {
        return studentService.getList(studentRequest);
    }

    @GetMapping("/getinfo/{id}")
    public StudentPO getInfo(@PathVariable(name = "id") @Min(value = 1, message = "id必须大于0") Long id) {
        return studentService.getInfo(id);
    }

    @PostMapping("/insert")
    public Long insert(@Valid @RequestBody StudentRequest studentRequest) {
        return studentService.insert(studentRequest);
    }

    @PutMapping("/update/{id}")
    public Boolean update(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id,@Valid @RequestBody StudentRequest studentRequest) {
        return studentService.update(id, studentRequest);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable(name = "id") @NotNull(message = "id不能为空") @Min(value = 1, message = "id必须大于0") Long id) {
        return studentService.delete(id);
    }
}
