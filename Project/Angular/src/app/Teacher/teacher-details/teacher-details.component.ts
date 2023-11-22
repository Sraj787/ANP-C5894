import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Teacher } from 'src/Entity/Teacher';
import { TeachersService } from 'src/Services/teachers.service';

@Component({
  selector: 'app-teacher-details',
  templateUrl: './teacher-details.component.html',
  styleUrls: ['./teacher-details.component.css']
})
export class TeacherDetailsComponent  implements OnInit{
  

  tid!: number;
  //creating the object of the Employee
  teacher: Teacher = new Teacher();
  

  //creating constructor
  constructor(private teacherService:TeachersService,
    private router:Router,
    private route : ActivatedRoute){}
  
  ngOnInit(): void {
    this.tid = this.route.snapshot.params['tid'];

    this.teacherService.getTeacherById(this.tid).subscribe(data => {
      this.teacher = data;
    }, error => console.log(error));
    } 

  gotoTeacherList(){
    this.router.navigate(['/teachers'])
  }
 
  onSubmit(){
    this.teacherService.getTeacherById(this.tid).subscribe(data=>{
      this.gotoTeacherList();
    },error=>console.log(error));
  }
}



