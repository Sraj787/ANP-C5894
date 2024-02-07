import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Category } from '../Category';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class CategoryServiceService {

  private baseURL ="http://localhost:8080/api/categories";



  constructor(private httpClient:HttpClient) { }


   getAll():Observable<Category[]>{
    return this.httpClient.get<Category[]>(`${this.baseURL}`);
  }

  getCategoryById(categoryId:number):Observable<Category>{
    return this.httpClient.get<Category>(`${this.baseURL}/${categoryId}`);
  }

  AddCategory(category:Category): Observable<object>{
    return this.httpClient.post(`${this.baseURL}`,category);
  }

  updateCategory(categoryId:number,category:Category): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/${categoryId}`,category);
  }

  deleteCategory(categoryId:number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/${categoryId}`);
  }
}
