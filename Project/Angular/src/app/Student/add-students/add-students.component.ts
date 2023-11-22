import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/Entity/Student';
import { StudentService } from 'src/Services/student.service';

@Component({
  selector: 'app-add-students',
  templateUrl: './add-students.component.html',
  styleUrls: ['./add-students.component.css']
})
export class AddStudentsComponent  implements OnInit{

  student : Student = new Student();
  

  constructor(private studentService : StudentService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveStudent(){
    this.studentService.createStudent(this.student).subscribe(data=>{
      console.log(data);
      this.gotoStudentList();
    },
    error => console.log(error));
}
  gotoStudentList(){
    this.router.navigate(['/students'])
  }

  onSubmit(){
    console.log(this.student);
    this.saveStudent();
  }
}
