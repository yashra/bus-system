import { Injectable } from '@angular/core';
import{HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class Lab4serviceService {

  constructor(private http:HttpClient) { }
  getProducts()
  {
    let url="assets/booklist.json";
    return this.http.get(url);
  }
}



