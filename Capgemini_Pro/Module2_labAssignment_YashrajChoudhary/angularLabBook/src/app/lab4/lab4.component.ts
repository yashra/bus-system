import { Component, OnInit } from '@angular/core';
import{Lab4serviceService} from '../services/lab4service.service'
@Component({
  selector: 'app-lab4',
  templateUrl: './lab4.component.html',
  styleUrls: ['./lab4.component.css']
})
export class Lab4Component implements OnInit {

  constructor(private p:Lab4serviceService) { }
resData;
  ngOnInit() {
    this.p.getProducts().subscribe(res=>
      {
        this.resData=res;
        console.log(res);
      },err=>
      {
        console.log(err);
      })
  }

}
