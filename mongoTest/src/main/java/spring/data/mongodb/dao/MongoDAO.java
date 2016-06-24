package spring.data.mongodb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.dto.ScoreRepository;

@Repository
public class MongoDAO {
	@Autowired
	ScoreRepository repository;
	
	public List<ScoreDTO> findAll(){
		List<ScoreDTO> mongolist = (List<ScoreDTO>)repository.findAll();
		System.out.println(mongolist.size());
		
		return mongolist;
		}
	
	public List<ScoreDTO> findAll(int pageNo) {
		Page<ScoreDTO> page = repository.findAll(new PageRequest(pageNo, 5));
		List<ScoreDTO> mongolist = page.getContent();
		return mongolist;
	}
}
