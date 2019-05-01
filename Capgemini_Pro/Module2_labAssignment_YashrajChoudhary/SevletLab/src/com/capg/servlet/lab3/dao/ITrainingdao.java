package com.capg.servlet.lab3.dao;

import java.util.List;


import com.capg.servlet.lab3.bean.Training;

public interface ITrainingdao {

	public List<Training> ShowTraining();
	public String UpdateTraining(int id,int seats);
}
