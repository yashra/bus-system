import { Component, OnInit } from '@angular/core';
import{LabsecserService} from '../services/labsecser.service'
@Component({
  selector: 'app-labsec',
  templateUrl: './labsec.component.html',
  styleUrls: ['./labsec.component.css']
})
export class LabsecComponent implements OnInit {

  constructor(private sec:LabsecserService) { }
datalist=[];
sortByAsc:boolean=true;
  ngOnInit() {
    this.list();
  }
  list() {
    let data=this.sec.data();
    data["employee"].forEach(element=>
      {
        this.datalist.push(element);
        console.log(element);
      });
    
  }
  sortId(parm)
  {
    this.datalist.sort((a,b)=>{ return a.empId-b.empId });
  }
sortName(parm)
{
  if(this.sortByAsc==true)
  {
    this.sortByAsc=false;
    this.datalist.sort((a,b)=>
    {
      return a[parm].localeCompare(b[parm]);
    });
  }
  else{
    this.sortByAsc=true;
    this.datalist.sort((a,b)=>
    {
      return b[parm].localeCompare(a[parm]);
    });
  }
  
}
sortSal(parm)
  {
    this.datalist.sort((a,b)=>{return a.empSal - b.empSal});
  }
  sortDep(parm)
  {
    if(this.sortByAsc==true)
  {
    this.sortByAsc=false;
    this.datalist.sort((a,b)=>
    {
      return a[parm].localeCompare(b[parm]);
    });
  }
  else{
    this.sortByAsc=true;
    this.datalist.sort((a,b)=>
    {
      return b[parm].localeCompare(a[parm]);
    });
  }
  }
  sortJoin(parm)
  {
   
    if(this.sortByAsc==true)
  {
    this.sortByAsc=false;
    this.datalist.sort((a,b)=>
    {
      return a[parm].localeCompare(b[parm]);
    });
  }
  else{
    this.sortByAsc=true;
    this.datalist.sort((a,b)=>
    {
      return b[parm].localeCompare(a[parm]);
    });
  }
  }
}
