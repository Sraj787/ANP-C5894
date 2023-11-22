import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Batches } from 'src/Entity/Batches';
import { BatchesService } from 'src/Services/batches.service';

@Component({
  selector: 'app-get-batches',
  templateUrl: './get-batches.component.html',
  styleUrls: ['./get-batches.component.css']
})
export class GetBatchesComponent implements OnInit{

  batches!:Batches[];
  
  constructor(private batchesService:BatchesService,private router:Router)
  {

  }
  ngOnInit(): void {
   this.getBatches();
  }
  private getBatches(){
    this.batchesService.getAll().subscribe(data =>
      {
        this.batches=data;
      })
  }

 

 
  updateBatches(bid:number)
  {
    this.router.navigate(['/updateBatch',bid]);
  }
  deleteBatches(bid:number)
  {
    this.batchesService.deleteBatches(bid).subscribe(data=>{console.log(data);this.getBatches()})
  }
}
