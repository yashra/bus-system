import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Lab5movieComponent } from './lab5movie.component';

describe('Lab5movieComponent', () => {
  let component: Lab5movieComponent;
  let fixture: ComponentFixture<Lab5movieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Lab5movieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Lab5movieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
