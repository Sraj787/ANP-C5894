import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from 'src/Entity/Student';
import { StudentService } from 'src/Services/student.service';

@Component({
  selector: 'app-updatestudent',
  templateUrl: './updatestudent.component.html',
  styleUrls: ['./updatestudent.component.css']
})
export class UpdatestudentComponent implements OnInit{
  
  
    sid!: number;
    //creating the object of the Student
    student: Student = new Student();
    
  
    //creating constructor
    constructor(private studentService:StudentService,
      private router:Router,
      private route : ActivatedRoute){}
    
    ngOnInit(): void {
      
      this.sid = this.route.snapshot.params['sid'];
  
      this.studentService.getStudentById(this.sid).subscribe(data => {
        this.student = data;
      }, error => console.log(error));
      } 
  
    
    updateStudent(){
      this.studentService.updateStudent(this.sid, this.student).subscribe(data=>
      {
        this.gotoStudentList();
      },error => console.log(error));
    }
   
    onSubmit(){
      this.updateStudent();
    }
  
    gotoStudentList(){
      this.router.navigate(['/students'])
    }
  }
  

