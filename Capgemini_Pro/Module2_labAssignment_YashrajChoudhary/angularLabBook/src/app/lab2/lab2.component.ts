import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lab2',
  templateUrl: './lab2.component.html',
  styleUrls: ['./lab2.component.css']
})
export class Lab2Component implements OnInit {
id;
name;
salary;
dept;
  constructor() { }

  ngOnInit() {
  }
  add()
  {
    alert(`${this.id} ${this.name} ${this.salary} ${this.dept}`);
  }

}
