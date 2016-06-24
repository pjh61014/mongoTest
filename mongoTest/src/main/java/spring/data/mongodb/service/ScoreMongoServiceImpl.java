package spring.data.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.data.mongodb.dao.ScoreMongoDAO;
import spring.data.mongodb.dto.ScoreDTO;

@Service
public class ScoreMongoServiceImpl implements ScoreMongoService {
	@Autowired
	ScoreMongoDAO dao;

	@Override
	public void insertDocument(ScoreDTO doc) {
		dao.insertDocument(doc);
		
	}

	@Override
	public void insertAllDocument(List<ScoreDTO> docs) {
		dao.insertAllDocument(docs);		
		
		
	}

	@Override
	public ScoreDTO findById(String key, String value) {
		return dao.findById(key, value);
	}

	@Override
	public List<ScoreDTO> findCriteria(String field, String value) {
		
		return dao.findCriteria(field,value);
	}

	@Override
	public void updateDocument(ScoreDTO doc) {
		dao.updateDocument(doc);
		
	}
}
