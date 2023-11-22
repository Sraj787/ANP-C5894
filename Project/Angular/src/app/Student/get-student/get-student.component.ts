import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from 'src/Entity/Student';
import { StudentService } from 'src/Services/student.service';

@Component({
  selector: 'app-get-student',
  templateUrl: './get-student.component.html',
  styleUrls: ['./get-student.component.css']
})
export class GetStudentComponent implements OnInit {
  students!:Student[];
  
  constructor(private studentService:StudentService,private router:Router)
  {

  }
  ngOnInit(): void {
   this.getStudents();
  }
  private getStudents(){
    this.studentService.getAll().subscribe(data =>
      {
        this.students=data;
      })
  }

 

  studentDetails(sid:number)
  {
    this.router.navigate(['/viewStudent',sid]);
  }
  updateStudent(sid:number)
  {
    this.router.navigate(['/updateStudent',sid]);
  }
  deleteStudent(sid:number)
  {
    this.studentService.deleteStudent(sid).subscribe(data=>{console.log(data);this.getStudents()})
  }

}






