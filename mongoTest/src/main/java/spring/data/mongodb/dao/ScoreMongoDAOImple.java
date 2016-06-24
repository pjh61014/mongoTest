package spring.data.mongodb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import oracle.net.aso.i;
import spring.data.mongodb.dto.ScoreDTO;

@Repository
public class ScoreMongoDAOImple implements ScoreMongoDAO {
	@Autowired
	MongoTemplate mongoTemplate;
	@Override
	public void insertDocument(ScoreDTO doc) {
		mongoTemplate.insert(doc);		
	}

	@Override
	public void insertAllDocument(List<ScoreDTO> docs) {
		mongoTemplate.insertAll(docs);
	}

	@Override
	public ScoreDTO findById(String key, String value) {
		//MongoDB�� ������ �𵨸��� ��ü � �ʵ忡 ���ؼ� � ������ ������ �������� ����
		//key = �ʵ�� 
		Criteria criteria = new Criteria(key);
		//���ǿ� ���� ���� - value���� ��Ȯ�ϰ� ��ġ�ϴ� document�� ��ȸ
		criteria.is(value);
		
		Query query = new Query(criteria);
		ScoreDTO data = mongoTemplate.findOne(query, ScoreDTO.class,"score");
		return data;
	}

	@Override
	public List<ScoreDTO> findCriteria(String field, String value) {
		Criteria criteria = new Criteria(field);
		//criteria.regex(value);
		criteria.gt(new Integer(value));
		Query query = new Query(criteria);
		List<ScoreDTO> datalist = mongoTemplate.find(query, ScoreDTO.class,"score");
		
		return datalist;
		
	}

	@Override
	public void updateDocument(ScoreDTO doc) {
		Criteria criteria = new Criteria("id");
		criteria.is(doc.getId());
		Query query = new Query(criteria);
		Update update = new Update();
		update.set("id", doc.getId());
		update.set("name", doc.getName());
		update.set("dept", doc.getDept());
		update.set("addr", doc.getAddr());
		update.set("java", doc.getJava());
		update.set("servlet", doc.getServlet());
		update.set("bonus", doc.getBonus());
		update.set("spring", doc.getSpring());
		
		mongoTemplate.updateMulti(query, update, ScoreDTO.class);
		System.out.println(query.toString());
		
	}
	
	
	
	}



