import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetAllProductComponent } from './get-all-product.component';

describe('GetAllProductComponent', () => {
  let component: GetAllProductComponent;
  let fixture: ComponentFixture<GetAllProductComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetAllProductComponent]
    });
    fixture = TestBed.createComponent(GetAllProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
