import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Batches } from 'src/Entity/Batches';
import { BatchesService } from 'src/Services/batches.service';

@Component({
  selector: 'app-add-batches',
  templateUrl: './add-batches.component.html',
  styleUrls: ['./add-batches.component.css']
})
export class AddBatchesComponent implements OnInit {
  batches : Batches = new Batches();
  

  constructor(private batchesService : BatchesService, private router:Router){
  }
  ngOnInit(): void {}
  
  saveBatches(){
    this.batchesService.createBatches(this.batches).subscribe(data=>{
      console.log(data);
      this.gotoBatchesList();
    },
    error => console.log(error));
}
  gotoBatchesList(){
    this.router.navigate(['/batches'])
  }

  onSubmit(){
    console.log(this.batches);
    this.saveBatches();
  }
}
