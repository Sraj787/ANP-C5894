import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateBatchesComponent } from './update-batches.component';

describe('UpdateBatchesComponent', () => {
  let component: UpdateBatchesComponent;
  let fixture: ComponentFixture<UpdateBatchesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateBatchesComponent]
    });
    fixture = TestBed.createComponent(UpdateBatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
