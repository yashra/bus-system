import { Component, OnInit } from '@angular/core';
import{FormGroup,FormBuilder,Validators} from '@angular/forms'
import { from } from 'rxjs';
@Component({
  selector: 'app-lab3',
  templateUrl: './lab3.component.html',
  styleUrls: ['./lab3.component.css']
})
export class Lab3Component implements OnInit {
myForm:FormGroup;
arr=[]
categories = [{'id':1, 'name':'Grocery'}, {'id':2, 'name': 'Electronics'}, {'id':3, 'name': 'Mobile'}];
  constructor(private fb:FormBuilder) {
    this.myForm=this.fb.group(
      {
        'id':['',Validators.required],
        'name':['',Validators.required],
        'cost':['',Validators.required],
        'radios':['',Validators.required],
        'category':['',Validators.required],
        'checks':['',Validators.required]
      }
    )
   }
show()
{
  let formData=this.myForm.getRawValue();
  console.log(formData)
}
  ngOnInit() {
  }

}
