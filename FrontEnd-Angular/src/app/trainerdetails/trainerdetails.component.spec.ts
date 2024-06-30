import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainerdetailsComponent } from './trainerdetails.component';

describe('TrainerdetailsComponent', () => {
  let component: TrainerdetailsComponent;
  let fixture: ComponentFixture<TrainerdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainerdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainerdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
