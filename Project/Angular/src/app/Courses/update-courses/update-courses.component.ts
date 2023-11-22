import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Courses } from 'src/Entity/Courses';
import { CoursesService } from 'src/Services/courses.service';

@Component({
  selector: 'app-update-courses',
  templateUrl: './update-courses.component.html',
  styleUrls: ['./update-courses.component.css']
})
export class UpdateCoursesComponent implements OnInit {
 
    cid!: number;
    //creating the object of the course
    course: Courses = new Courses();
    
  
    //creating constructor
    constructor(private courseService:CoursesService,
      private router:Router,
      private route : ActivatedRoute){}
    
    ngOnInit(): void {
      
      this.cid = this.route.snapshot.params['cid'];
  
      this.courseService.getCourseById(this.cid).subscribe(data => {
        this.course = data;
      }, error => console.log(error));
      } 
  
    
    updateCourse(){
      this.courseService.updateCourse(this.cid, this.course).subscribe(data=>
      {
        this.gotoCourseList();
      },error => console.log(error));
    }
   
    onSubmit(){
      this.updateCourse();
    }
  
    gotoCourseList(){
      this.router.navigate(['/courses'])
    }
  }
  

