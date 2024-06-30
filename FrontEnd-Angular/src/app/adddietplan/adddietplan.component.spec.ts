import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdddietplanComponent } from './adddietplan.component';

describe('AdddietplanComponent', () => {
  let component: AdddietplanComponent;
  let fixture: ComponentFixture<AdddietplanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdddietplanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdddietplanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
