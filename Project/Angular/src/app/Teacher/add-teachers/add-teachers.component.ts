import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Teacher } from 'src/Entity/Teacher';
import { TeachersService } from 'src/Services/teachers.service';

@Component({
  selector: 'app-add-teachers',
  templateUrl: './add-teachers.component.html',
  styleUrls: ['./add-teachers.component.css']
})
export class AddTeachersComponent implements OnInit {

  teacher : Teacher = new Teacher();
  

  constructor(private teacherService : TeachersService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveTeacher(){
    this.teacherService.createTeacher(this.teacher).subscribe(data=>{
      console.log(data);
      this.gotoTeacherList();
    },
    error => console.log(error));
}
  gotoTeacherList(){
    this.router.navigate(['/teachers'])
  }

  onSubmit(){
    console.log(this.teacher);
    this.saveTeacher();
  }

}
