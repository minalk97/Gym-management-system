import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MydietplanComponent } from './mydietplan.component';

describe('MydietplanComponent', () => {
  let component: MydietplanComponent;
  let fixture: ComponentFixture<MydietplanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MydietplanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MydietplanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
