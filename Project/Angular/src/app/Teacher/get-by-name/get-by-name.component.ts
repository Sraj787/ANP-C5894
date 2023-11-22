import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Teacher } from 'src/Entity/Teacher';
import { TeachersService } from 'src/Services/teachers.service';

@Component({
  selector: 'app-get-by-name',
  templateUrl: './get-by-name.component.html',
  styleUrls: ['./get-by-name.component.css']
})
export class GetByNameComponent implements OnInit {
    
  tname!:String;
  teachers!: Teacher[];

  constructor(private teacherService:TeachersService,private router:Router,private route : ActivatedRoute){}
    //creating constructor
  
  
  ngOnInit(): void {
    this.tname = this.route.snapshot.params['tname'];

    this.teacherService.getTeacherByName(this.tname).subscribe(data => {
      this.teachers = data;
    }, error => console.log(error));
    } 

 
 
  onSubmit(){
    this.teacherService.getTeacherByName(this.tname).subscribe(data=>{
    },error=>console.log(error));
  }
  

  teacherDetails(tid:number)
  {
    this.router.navigate(['/viewTeacher',tid]);
  }
  updateTeacher(tid:number)
  {
    this.router.navigate(['/updateTeacher',tid]);
  }
  deleteTeacher(tid:number)
  {
    this.teacherService.deleteTeacher(tid).subscribe(data=>{console.log(data)})
  }

}
