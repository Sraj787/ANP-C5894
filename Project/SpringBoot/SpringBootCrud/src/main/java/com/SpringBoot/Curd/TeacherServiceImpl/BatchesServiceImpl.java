package com.SpringBoot.Curd.TeacherServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Curd.Entity.Batches;
import com.SpringBoot.Curd.Exception.BatchIdNotFoundException;
import com.SpringBoot.Curd.repository.BatchesReposity;
import com.SpringBoot.Curd.service.BatchesService;

@Service
public class BatchesServiceImpl implements BatchesService{

	@Autowired
	BatchesReposity brepo;
	@Override
	public Batches addBatchDetails(Batches batches) {
		
		return brepo.save(batches);
	}

	@Override
	public Batches getBatchDeatils(int bid) {
		// TODO Auto-generated method stub
		return brepo.findById(bid).orElseThrow(()->new BatchIdNotFoundException("Batch id is incorrect"));
	}

	@Override
	public Batches EditBatchDetails(int bid, Batches batches) {
		Batches updatebatch = brepo.findById(bid).orElseThrow(()->new BatchIdNotFoundException("Batch id is incorrect"));
		
		updatebatch.setBname(batches.getBname());
		updatebatch.setSubject(batches.getSubject());
		updatebatch.setStartdate(batches.getStartdate());
		updatebatch.setEnddate(batches.getEnddate());
		updatebatch.setDuration(batches.getDuration());
		brepo.save(updatebatch);
		return updatebatch;
	}

	@Override
	public List<Batches> allBatches() {
		// TODO Auto-generated method stub
		return brepo.findAll();
	}

	@Override
	public void DeleteBatchDeatils(int bid) {
		brepo.findById(bid).
		orElseThrow(()-> new BatchIdNotFoundException("batch id is incorrect"));
		brepo.deleteById(bid);
	}

}
