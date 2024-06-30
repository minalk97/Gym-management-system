import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllocatetrainerComponent } from './allocatetrainer.component';

describe('AllocatetrainerComponent', () => {
  let component: AllocatetrainerComponent;
  let fixture: ComponentFixture<AllocatetrainerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllocatetrainerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllocatetrainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
