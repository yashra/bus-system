import { Component, OnInit } from '@angular/core';
import{FormGroup,FormBuilder,Validators} from '@angular/forms'
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  myForm:FormGroup;
  arr=[]
  categories = [{'id':1, 'name':'Drama'}, {'id':2, 'name': 'Fiction'}, {'id':3, 'name': 'Satire'}];
  constructor(private fb:FormBuilder) {
    this.myForm=this.fb.group(
      {
        'name':['',Validators.required,Validators.pattern('[a-zA-Z0-9]*')],
        'rate':['',Validators.required],
        'category':['',Validators.required],
      });
   }

  ngOnInit() {
  }
  show()
  {
    let formData=this.myForm.getRawValue();
  console.log(formData)
  }

}
