import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerMemberDetailsComponent } from './manager-member-details.component';

describe('ManagerMemberDetailsComponent', () => {
  let component: ManagerMemberDetailsComponent;
  let fixture: ComponentFixture<ManagerMemberDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagerMemberDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerMemberDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
