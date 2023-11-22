import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GetTeachersComponent } from './Teacher/get-teachers/get-teachers.component';
import { AddTeachersComponent } from './Teacher/add-teachers/add-teachers.component';
import { UpdateTeacherComponent } from './Teacher/update-teacher/update-teacher.component';
import { TeacherDetailsComponent } from './Teacher/teacher-details/teacher-details.component';
import { GetStudentComponent } from './Student/get-student/get-student.component';
import { AddStudentsComponent } from './Student/add-students/add-students.component';
import { StudentdetailsComponent } from './Student/studentdetails/studentdetails.component';
import { UpdatestudentComponent } from './Student/updatestudent/updatestudent.component';
import { AddCoursesComponent } from './Courses/add-courses/add-courses.component';
import { UpdateCoursesComponent } from './Courses/update-courses/update-courses.component';
import { GetCoursesComponent } from './Courses/get-courses/get-courses.component';
import { GetdepartmentComponent } from './Department/getdepartment/getdepartment.component';
import { UpdatedepartmentComponent } from './Department/updatedepartment/updatedepartment.component';
import { GetBatchesComponent } from './Batches/get-batches/get-batches.component';
import { UpdateBatchesComponent } from './Batches/update-batches/update-batches.component';
import { AddBatchesComponent } from './Batches/add-batches/add-batches.component';
import { GetByNameComponent } from './Teacher/get-by-name/get-by-name.component';


const routes: Routes = [
  {path: '', redirectTo: 'teachers', pathMatch: 'full'},
  {path:'viewTeacher/:tid',component:TeacherDetailsComponent},
  {path:'viewNameTeacher/:tname',component:GetByNameComponent},
  {path:'teachers',component:GetTeachersComponent},
  {path:'addTeacher',component:AddTeachersComponent},
  {path:'updateTeacher/:tid',component:UpdateTeacherComponent},
  
  {path: '', redirectTo: 'students', pathMatch: 'full'},
  {path:'students',component:GetStudentComponent},
  {path:'addStudent',component:AddStudentsComponent},
  {path:'viewStudent/:sid',component:StudentdetailsComponent},
  {path:'updateStudent/:sid',component:UpdatestudentComponent},
  
  {path: '', redirectTo: 'courses', pathMatch: 'full'},
  {path:'addCourse',component:AddCoursesComponent},
  {path:'updateCourse/:cid',component:UpdateCoursesComponent},
  {path:'courses',component:GetCoursesComponent},
  
  {path: '', redirectTo: 'departments', pathMatch: 'full'},
  {path:'departments',component:GetdepartmentComponent},
  {path:'updateDepartment',component:UpdatedepartmentComponent},
  {path:'updateDepartment/:did',component:UpdatedepartmentComponent},
  
  {path: '', redirectTo: 'batches', pathMatch: 'full'},
  {path:'batches',component:GetBatchesComponent},
  {path:'updateBatch/:bid',component:UpdateBatchesComponent},
  {path:'addBatch',component:AddBatchesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
