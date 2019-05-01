import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeLab2Component } from './employee-lab2.component';

describe('EmployeeLab2Component', () => {
  let component: EmployeeLab2Component;
  let fixture: ComponentFixture<EmployeeLab2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeLab2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeLab2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
