import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from 'src/Entity/Student';
import { StudentService } from 'src/Services/student.service';

@Component({
  selector: 'app-studentdetails',
  templateUrl: './studentdetails.component.html',
  styleUrls: ['./studentdetails.component.css']
})
export class StudentdetailsComponent implements OnInit {
  
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

  gotoStudentList(){
    this.router.navigate(['/student'])
  }
 
  onSubmit(){
    this.studentService.getStudentById(this.sid).subscribe(data=>{
      this.gotoStudentList();
    },error=>console.log(error));
  }

}
