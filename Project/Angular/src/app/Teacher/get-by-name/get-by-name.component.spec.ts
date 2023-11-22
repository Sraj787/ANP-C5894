import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetByNameComponent } from './get-by-name.component';

describe('GetByNameComponent', () => {
  let component: GetByNameComponent;
  let fixture: ComponentFixture<GetByNameComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetByNameComponent]
    });
    fixture = TestBed.createComponent(GetByNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
