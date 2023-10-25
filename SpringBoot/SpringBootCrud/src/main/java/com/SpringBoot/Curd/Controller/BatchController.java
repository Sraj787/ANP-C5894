package com.SpringBoot.Curd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Batches;
import com.SpringBoot.Curd.service.BatchesService;

@RestController
public class BatchController {

	@Autowired 
	BatchesService bs;
	
	@PostMapping("/Batches/addBatch")
	public ResponseEntity<Batches> addBatch(@RequestBody Batches batches ){
		return new ResponseEntity<Batches>(bs.addBatchDetails(batches),HttpStatus.CREATED);	
	}
	@GetMapping("Batch/getBatch/{bid}")
	public ResponseEntity<Batches> getBatch(@RequestBody Batches batches,@PathVariable int bid){
		return new ResponseEntity<Batches>(bs.getBatchDeatils(bid),HttpStatus.OK);	
	}
	@PutMapping("/Batch/editBatch/{bid}")
	public ResponseEntity<Batches> editBatch(@RequestBody Batches batches,@PathVariable int bid){
		return new ResponseEntity<Batches>(bs.EditBatchDetails(bid, batches),HttpStatus.OK);	
	}
	
	@GetMapping("/Batch/getAllBatch")
	Iterable<Batches> getAllBatch(){
		return bs.allBatches();	
	}
	@DeleteMapping("Btach/DeleteBatch/{bid}")
	public ResponseEntity<String> deleteBatch(@PathVariable int bid){
		bs.DeleteBatchDeatils(bid);
		return new ResponseEntity<String>("Batch Deleted Sucessfully..",HttpStatus.OK);
		
	}
	
}
