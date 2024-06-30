import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerAllMembersComponent } from './manager-all-members.component';

describe('ManagerAllMembersComponent', () => {
  let component: ManagerAllMembersComponent;
  let fixture: ComponentFixture<ManagerAllMembersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagerAllMembersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerAllMembersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
