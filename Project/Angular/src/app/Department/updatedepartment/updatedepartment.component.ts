import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Department } from 'src/Entity/Departments';
import { DepartmentsService } from 'src/Services/departments.service';

@Component({
  selector: 'app-updatedepartment',
  templateUrl: './updatedepartment.component.html',
  styleUrls: ['./updatedepartment.component.css']
})
export class UpdatedepartmentComponent implements OnInit {
  
  
    did!: number;
    //creating the object of the deartment
    department: Department = new Department();
    
  
    //creating constructor
    constructor(private departmentService:DepartmentsService,
      private router:Router,
      private route : ActivatedRoute){}
    
    ngOnInit(): void {
      
      this.did = this.route.snapshot.params['did'];
  
      this.departmentService.getDepartmentById(this.did).subscribe(data => {
        this.department = data;
      }, error => console.log(error));
      } 
  
    
    updateDepartment(){
      this.departmentService.updateDepartment(this.did, this.department).subscribe(data=>
      {
        this.gotoDepartmentList();
      },error => console.log(error));
    }
   
    onSubmit(){
      this.updateDepartment();
    }
  
    gotoDepartmentList(){
      this.router.navigate(['/department'])
    }
  }
  

