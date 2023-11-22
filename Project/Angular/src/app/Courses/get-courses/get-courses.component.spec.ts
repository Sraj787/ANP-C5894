import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetCoursesComponent } from './get-courses.component';

describe('GetCoursesComponent', () => {
  let component: GetCoursesComponent;
  let fixture: ComponentFixture<GetCoursesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetCoursesComponent]
    });
    fixture = TestBed.createComponent(GetCoursesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
