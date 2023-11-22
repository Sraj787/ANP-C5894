import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetdepartmentComponent } from './getdepartment.component';

describe('GetdepartmentComponent', () => {
  let component: GetdepartmentComponent;
  let fixture: ComponentFixture<GetdepartmentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetdepartmentComponent]
    });
    fixture = TestBed.createComponent(GetdepartmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
