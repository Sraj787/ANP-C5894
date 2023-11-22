package com.SpringBoot.Curd.service;

import java.util.List;

import com.SpringBoot.Curd.Entity.Batches;

public interface BatchesService {
	
	public Batches addBatchDetails(Batches batches);

	public Batches getBatchDeatils(int bid);
	
	public Batches EditBatchDetails(int bid,Batches batches);
	
	List<Batches> allBatches();
	
	public void DeleteBatchDeatils(int bid);
	
	
}
