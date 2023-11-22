import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Courses } from 'src/Entity/Courses';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private baseURL ="http://localhost:8080/api/Course";

 

  constructor(private httpClient: HttpClient) { }


   getAll():Observable<Courses[]>{
    return this.httpClient.get<Courses[]>(`${this.baseURL}/courses`);
  }

  getCourseById(cid:number):Observable<Courses>{
    return this.httpClient.get<Courses>(`${this.baseURL}/${cid}`);
  }

  AddCourse(course:Courses): Observable<object>{
    return this.httpClient.post(`${this.baseURL}/AddCourse`,course);
  }

  updateCourse(cid:number ,course:Courses): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/${cid}`,course);
  }

  deleteCourse(cid: number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/${cid}`);
  }
}
