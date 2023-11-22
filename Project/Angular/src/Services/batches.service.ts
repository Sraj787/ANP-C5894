import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Batches } from 'src/Entity/Batches';

@Injectable({
  providedIn: 'root'
})
export class BatchesService {

  private baseURL ="http://localhost:8080/api/Batch";

  
 
   constructor(private httpClient: HttpClient) { }
 
 
    getAll():Observable<Batches[]>{
     return this.httpClient.get<Batches[]>(`${this.baseURL}/Batches`);
   }
 
   getBatchesById(bid:number):Observable<Batches>{
     return this.httpClient.get<Batches>(`${this.baseURL}/${bid}`);
   }
 
   createBatches(batches:Batches): Observable<object>{
     return this.httpClient.post(`${this.baseURL}/AddBatches`,batches);
   }
 
   updateBatches(bid:number ,batches:Batches): Observable<object>{
     return this.httpClient.put(`${this.baseURL}/${bid}`,batches);
   }
 
   deleteBatches(bid: number):Observable<object>{
     return this.httpClient.delete(`${this.baseURL}/${bid}`);
   }
}
