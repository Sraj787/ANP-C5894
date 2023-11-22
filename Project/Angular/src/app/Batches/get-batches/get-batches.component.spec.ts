import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetBatchesComponent } from './get-batches.component';

describe('GetBatchesComponent', () => {
  let component: GetBatchesComponent;
  let fixture: ComponentFixture<GetBatchesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GetBatchesComponent]
    });
    fixture = TestBed.createComponent(GetBatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
