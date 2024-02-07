import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../Product';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  private baseURL ="http://localhost:8080/api";

 

  constructor(private httpClient:HttpClient) { }


   getAll():Observable<Product[]>{
    return this.httpClient.get<Product[]>(`${this.baseURL}/products`);
  }

  getProductById(productID:number):Observable<Product>{
    return this.httpClient.get<Product>(`${this.baseURL}/products/${productID}`);
  }

  Addproduct(product:Product): Observable<object>{
    return this.httpClient.post(`${this.baseURL}/products`,product);
  }

  updateProduct(productID:number,product:Product): Observable<object>{
    return this.httpClient.put(`${this.baseURL}/products/${productID}`,product);
  }

  deleteProduct(productID:number):Observable<object>{
    return this.httpClient.delete(`${this.baseURL}/products/${productID}`);
  }
}
