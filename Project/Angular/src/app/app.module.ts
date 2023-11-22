import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddTeachersComponent } from './Teacher/add-teachers/add-teachers.component';
import { GetTeachersComponent } from './Teacher/get-teachers/get-teachers.component';
import { UpdateTeacherComponent } from './Teacher/update-teacher/update-teacher.component';


import { UpdatestudentComponent } from './Student/updatestudent/updatestudent.component';
import { GetStudentComponent } from './Student/get-student/get-student.component';
import { AddStudentsComponent } from './Student/add-students/add-students.component';


import { UpdatedepartmentComponent } from './Department/updatedepartment/updatedepartment.component';
import { GetdepartmentComponent } from './Department/getdepartment/getdepartment.component';

import { AddCoursesComponent } from './Courses/add-courses/add-courses.component';
import { UpdateCoursesComponent } from './Courses/update-courses/update-courses.component';
import { GetCoursesComponent } from './Courses/get-courses/get-courses.component';

import { AddBatchesComponent } from './Batches/add-batches/add-batches.component';
import { UpdateBatchesComponent } from './Batches/update-batches/update-batches.component';
import { GetBatchesComponent } from './Batches/get-batches/get-batches.component';
import { TeacherDetailsComponent } from './Teacher/teacher-details/teacher-details.component';
import { StudentdetailsComponent } from './Student/studentdetails/studentdetails.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { GetByNameComponent } from './Teacher/get-by-name/get-by-name.component';


@NgModule({
  declarations: [
    AppComponent,
    AddTeachersComponent,
    GetTeachersComponent,
    UpdateTeacherComponent,
    TeacherDetailsComponent,
    UpdatestudentComponent,
    GetStudentComponent,
    AddStudentsComponent,
    UpdatedepartmentComponent,
    GetdepartmentComponent,
    AddCoursesComponent,
    UpdateCoursesComponent,
    GetCoursesComponent,
    AddBatchesComponent,
    UpdateBatchesComponent,
    GetBatchesComponent,
    StudentdetailsComponent,
    GetByNameComponent,
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
