import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetTeachersComponent } from './get-teachers.component';

describe('GetTeachersComponent', () => {
  let component: GetTeachersComponent;
  let fixture: ComponentFixture<GetTeachersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetTeachersComponent]
    });
    fixture = TestBed.createComponent(GetTeachersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
