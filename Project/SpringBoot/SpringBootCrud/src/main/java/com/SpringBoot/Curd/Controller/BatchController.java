package com.SpringBoot.Curd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Batches;
import com.SpringBoot.Curd.service.BatchesService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class BatchController {

	@Autowired 
	BatchesService bs;
	
	@PostMapping("/Batch/AddBatches")
	public ResponseEntity<Batches> addBatch(@RequestBody Batches batches ){
		return new ResponseEntity<Batches>(bs.addBatchDetails(batches),HttpStatus.CREATED);	
	}
	@GetMapping("/Batch/{bid}")
	public ResponseEntity<Batches> getBatch(@PathVariable("bid") int bid){
		return new ResponseEntity<Batches>(bs.getBatchDeatils(bid),HttpStatus.OK);	
	}
	@PutMapping("/Batch/{bid}")
	public ResponseEntity<Batches> editBatch(@RequestBody Batches batches,@PathVariable("bid") int bid){
		return new ResponseEntity<Batches>(bs.EditBatchDetails(bid, batches),HttpStatus.OK);	
	}
	
	@GetMapping("/Batch/Batches")
	public List<Batches> getAllBatch(){
		return bs.allBatches();	
	}
	@DeleteMapping("/Batch/{bid}")
	public ResponseEntity<String> deleteBatch(@PathVariable int bid){
		bs.DeleteBatchDeatils(bid);
		return new ResponseEntity<String>("Batch Deleted Sucessfully..",HttpStatus.OK);
		
	}
	
}
