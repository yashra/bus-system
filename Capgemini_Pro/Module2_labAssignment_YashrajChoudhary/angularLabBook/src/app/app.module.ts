import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import{FormsModule,ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Lab2Component } from './lab2/lab2.component';
import { EmployeeLab2Component } from './employee-lab2/employee-lab2.component';
import { LabsecComponent } from './labsec/labsec.component';
import { Lab3Component } from './lab3/lab3.component';
import { Lab4Component } from './lab4/lab4.component';
import{HttpClientModule} from '@angular/common/http';
import { SearchPipe } from './pipes/search.pipe';
import { Lab5movieComponent } from './lab5movie/lab5movie.component';
import { AddComponent } from './lab5movie/add/add.component';
import { SearchComponent } from './lab5movie/search/search.component'
@NgModule({
  declarations: [
    AppComponent,
    Lab2Component,
    EmployeeLab2Component,
    LabsecComponent,
    Lab3Component,

    Lab4Component,

    SearchPipe,

    Lab5movieComponent,
    AddComponent,
    SearchComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
