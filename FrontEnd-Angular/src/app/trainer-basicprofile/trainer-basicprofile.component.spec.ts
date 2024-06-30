import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainerBasicprofileComponent } from './trainer-basicprofile.component';

describe('TrainerBasicprofileComponent', () => {
  let component: TrainerBasicprofileComponent;
  let fixture: ComponentFixture<TrainerBasicprofileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainerBasicprofileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainerBasicprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
