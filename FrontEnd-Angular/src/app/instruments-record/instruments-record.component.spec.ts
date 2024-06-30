import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InstrumentsRecordComponent } from './instruments-record.component';

describe('InstrumentsRecordComponent', () => {
  let component: InstrumentsRecordComponent;
  let fixture: ComponentFixture<InstrumentsRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InstrumentsRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InstrumentsRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
