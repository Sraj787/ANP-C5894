import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Department } from 'src/Entity/Departments';
import { DepartmentsService } from 'src/Services/departments.service';

@Component({
  selector: 'app-getdepartment',
  templateUrl: './getdepartment.component.html',
  styleUrls: ['./getdepartment.component.css']
})
export class GetdepartmentComponent implements OnInit{
  departments!:Department[];
  
  constructor(private departmentService:DepartmentsService,private router:Router)
  {

  }
  ngOnInit(): void {
   this.getDepartment();
  }
  private getDepartment(){
    this.departmentService.getAll().subscribe(data =>
      {
        this.departments=data;
      })
  }

 

  
  updateDepartment(did:number)
  {
    this.router.navigate(['/updateDepartment',did]);
  }
  deleteDepartment(did:number)
  {
    this.departmentService.deleteDepartment(did).subscribe(data=>{console.log(data);this.getDepartment()})
  }

}
