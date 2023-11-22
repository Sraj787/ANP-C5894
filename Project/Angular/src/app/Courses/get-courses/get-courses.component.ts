import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Courses } from 'src/Entity/Courses';
import { CoursesService } from 'src/Services/courses.service';

@Component({
  selector: 'app-get-courses',
  templateUrl: './get-courses.component.html',
  styleUrls: ['./get-courses.component.css']
})
export class GetCoursesComponent implements OnInit {
  courses!:Courses[];
  
  constructor(private courseService:CoursesService,private router:Router)
  {

  }
  ngOnInit(): void {
   this.getCourses();
  }
  private getCourses(){
    this.courseService.getAll().subscribe(data =>
      {
        this.courses=data;
      })
  }

 

  courseDetails(cid:number)
  {
    this.router.navigate(['/addCourse',cid]);
  }
  updateCourse(cid:number)
  {
    this.router.navigate(['/updateCourse',cid]);
  }
  deleteCourse(cid:number)
  {
    this.courseService.deleteCourse(cid).subscribe(data=>{console.log(data);this.getCourses()})
  }

}
