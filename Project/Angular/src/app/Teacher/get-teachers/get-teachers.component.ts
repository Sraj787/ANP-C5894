import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Teacher } from 'src/Entity/Teacher';
import { TeachersService } from 'src/Services/teachers.service';

@Component({
  selector: 'app-get-teachers',
  templateUrl: './get-teachers.component.html',
  styleUrls: ['./get-teachers.component.css']
})
export class GetTeachersComponent implements OnInit{


    tname!:String;
    teachers!:Teacher[];
  
    constructor(private teacherServie:TeachersService,private router:Router,private route : ActivatedRoute)
    {
  
    }
    ngOnInit(): void {
     this.getTeachers();
    }
    private getTeachers(){
      this.teacherServie.getAll().subscribe(data =>
        {
          this.teachers=data;
        }, error => console.log(error))
    }

    onSubmit(){
      this.teacherServie.getTeacherByName(this.tname).subscribe(data =>
        { 
        }, error => console.log(error))
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
      this.teacherServie.deleteTeacher(tid).subscribe(data=>{console.log(data);this.getTeachers()})
    }

    getTeacherName(tname:String){
      this.router.navigate(['/viewNameTeacher',tname]);
    }
  
  }
  
  
  
  
