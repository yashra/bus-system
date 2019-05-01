import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LabsecComponent } from './labsec.component';

describe('LabsecComponent', () => {
  let component: LabsecComponent;
  let fixture: ComponentFixture<LabsecComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LabsecComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LabsecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
