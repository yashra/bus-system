import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Lab2Component } from './lab2/lab2.component';
import { EmployeeLab2Component } from './employee-lab2/employee-lab2.component';
import { LabsecComponent } from './labsec/labsec.component';
import { Lab3Component } from './lab3/lab3.component';
import { Lab4Component } from './lab4/lab4.component';
import { Lab5movieComponent } from './lab5movie/lab5movie.component';
import { AddComponent } from './lab5movie/add/add.component'
import { SearchComponent } from './lab5movie/search/search.component'

const routes: Routes = [
 {
   path:'Lab1',component:Lab2Component
 },
 {
   path:'Lab2',component:EmployeeLab2Component
 },
 {
   path:'lab2a',component:LabsecComponent
 },
 {
   path:'lab3',component:Lab3Component
 },
 {
   path:'lab4',component:Lab4Component
 },
 {
   path:'lab5',component:Lab5movieComponent,children:[
     {path:'add',component:AddComponent}
    ,{path:'search',component:SearchComponent}]
 }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
