import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Department } from 'src/Entity/Departments';

@Injectable({
  providedIn: 'root'
})
export class DepartmentsService {

  private baseURL ="http://localhost:8080/api/department";

 

  constructor(private httpClient: HttpClient) { }


   getAll():Observable<Department[]>{
    return this.httpClient.get<Department[]>(`${this.baseURL}/departments`);
  }

  getDepartmentById(did:number):Observable<Department>{
    return this.httpClient.get<Department>(`${this.baseURL}/${did}`);
  }

  createDepartment(department:Department): Observable<object>{
    return this.httpClient.post(`${this.baseURL}/addDepartment`,department);
  }

  updateDepartment(did:number ,department:Department): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/${did}`,department);
  }

  deleteDepartment(did: number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/${did}`);
  }
}
