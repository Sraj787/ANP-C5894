import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Batches } from 'src/Entity/Batches';
import { BatchesService } from 'src/Services/batches.service';

@Component({
  selector: 'app-update-batches',
  templateUrl: './update-batches.component.html',
  styleUrls: ['./update-batches.component.css']
})
export class UpdateBatchesComponent implements OnInit{
 
  
    bid!: number;
    //creating the object of the Employee
    batches: Batches = new Batches();
    
  
    //creating constructor
    constructor(private batchesService:BatchesService,
      private router:Router,
      private route : ActivatedRoute){}
    
    ngOnInit(): void {
      
      this.bid = this.route.snapshot.params['bid'];
  
      this.batchesService.getBatchesById(this.bid).subscribe(data => {
        this.batches = data;
      }, error => console.log(error));
      } 
  
    
    updateBatch(){
      this.batchesService.updateBatches(this.bid, this.batches).subscribe(data=>
      {
        this.gotoBatchList();
      },error => console.log(error));
    }
   
    onSubmit(){
      this.updateBatch();
    }
  
    gotoBatchList(){
      this.router.navigate(['/batches'])
    }
  }
  

