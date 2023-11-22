import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from 'src/Entity/Student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL ="http://localhost:8080/api/Student";

 

  constructor(private httpClient: HttpClient) { }


   getAll():Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}/Students`);
  }

  getStudentById(sid:number):Observable<Student>{
    return this.httpClient.get<Student>(`${this.baseURL}/${sid}`);
  }

  createStudent(student:Student): Observable<object>{
    return this.httpClient.post(`${this.baseURL}/AddStudent`,student);
  }

  updateStudent(sid:number ,student:Student): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/${sid}`,student);
  }

  deleteStudent(sid: number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/${sid}`);
  }
}
