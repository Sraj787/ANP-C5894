import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Courses } from 'src/Entity/Courses';
import { CoursesService } from 'src/Services/courses.service';

@Component({
  selector: 'app-add-courses',
  templateUrl: './add-courses.component.html',
  styleUrls: ['./add-courses.component.css']
})
export class AddCoursesComponent implements OnInit{
  course : Courses = new Courses();
  

  constructor(private courseService : CoursesService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveCourse(){
    this.courseService.AddCourse(this.course).subscribe(data=>{
      console.log(data);
      this.gotoCourseList();
    },
    error => console.log(error));
}
  gotoCourseList(){
    this.router.navigate(['/courses'])
  }

  onSubmit(){
    console.log(this.course);
    this.saveCourse();
  }
}
