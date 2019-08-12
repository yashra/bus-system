import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AddService {

  private baseUrl= 'http://localhost:8086/api/get';
  constructor(private http:HttpClient) { }
  add(feedback:Object):Observable<Object>
  {
    console.log(feedback);
    return this.http.post(`${this.baseUrl}`+`/feed`,feedback);
  }

}
