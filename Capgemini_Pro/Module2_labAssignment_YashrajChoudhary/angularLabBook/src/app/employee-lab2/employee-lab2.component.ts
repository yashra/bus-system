import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators} from '@angular/forms';

@Component({
  selector: 'app-employee-lab2',
  templateUrl: './employee-lab2.component.html',
  styleUrls: ['./employee-lab2.component.css']
})
export class EmployeeLab2Component implements OnInit {
myEmployee:FormGroup;
ind;
count;
myEmployee2:FormGroup;
msg;
arr=[];
  constructor(private fb:FormBuilder) { 
    this.myEmployee=this.fb.group(
      {
        'id':['',Validators.required],
        'name':['',Validators.required],
        'salary':['',Validators.required],
        'dept':['',Validators.required]
      }
    )
    this.myEmployee2=this.fb.group(
      {
        'id':['',Validators.required],
        'name':['',Validators.required],
        'salary':['',Validators.required],
        'dept':['',Validators.required]
      }
    )
  }

  ngOnInit() {
  }
show()
{
  let formData=this.myEmployee.getRawValue();
  // console.log(JSON.stringify(formData)
  this.arr.push(formData)
  this.msg="DATA INSERTED";
}
delete(id)
{
  let pos=this.arr.indexOf(id);
  this.arr.splice(pos,1);
  this.msg="DATA DELETED";
}
updata()
{
  let fData=this.myEmployee2.getRawValue();
  this.arr[this.ind]=fData;
  this.count=0;
}
update(id)
{
  this.count=1;
    this.ind=this.arr.indexOf(id);
    this.myEmployee2.controls.id.patchValue(this.arr[this.ind].id);
    this.myEmployee2.controls.name.patchValue(this.arr[this.ind].name);
    this.myEmployee2.controls.salary.patchValue(this.arr[this.ind].salary);
    this.myEmployee2.controls.dept.patchValue(this.arr[this.ind].dept);
}
}
