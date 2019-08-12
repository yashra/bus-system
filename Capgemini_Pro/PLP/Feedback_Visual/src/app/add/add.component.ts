import { Component, OnInit } from '@angular/core';

import { Feedback } from '../feedback';
import { AddService } from '../add.service';
@Component({
  selector: 'add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {

  
feedback: Feedback=new Feedback();
submitted=false;
constructor(private fed:AddService)
{}

data():void
{
  alert("Thanks");
 this.submitted=false;
 this.feedback=new Feedback();
}

save()
{
  console.log("hii")
  console.log(this.feedback);
  this.fed.add(this.feedback).subscribe(error => console.log(error),data=>{alert("Feedback submitted:"+this.feedback.feedback_id);});
  this.feedback=new Feedback();
}

onSubmit()
{
  this.submitted=true;
  this.save();
  
}


  ngOnInit() {
  }

}
