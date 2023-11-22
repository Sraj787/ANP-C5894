import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Teacher } from 'src/Entity/Teacher';

@Injectable({
  providedIn: 'root'
})
export class TeachersService {

  private baseURL ="http://localhost:8080/api/Teacher";

 

  constructor(private httpClient: HttpClient) { }


   getAll():Observable<Teacher[]>{
    return this.httpClient.get<Teacher[]>(`${this.baseURL}/Teachers`);
  }

  getTeacherById(eid:number):Observable<Teacher>{
    return this.httpClient.get<Teacher>(`${this.baseURL}/${eid}`);
  }

  getTeacherByName(tname:String):Observable<Teacher[]>{
    return this.httpClient.get<Teacher[]>(`${this.baseURL}/ByName/${tname}`);
  }


  createTeacher(teacher:Teacher): Observable<object>{
    return this.httpClient.post(`${this.baseURL}/AddTeacher`,teacher);
  }

  updateTeacher(tid:number ,teacher:Teacher): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/${tid}`,teacher);
  }

  deleteTeacher(tid: number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/${tid}`);
  }
}
