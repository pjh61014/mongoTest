package spring.data.mongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.service.ScoreMongoService;

@Controller
public class ScoreMongoController {
	@Autowired
	ScoreMongoService service;
	@RequestMapping(value="/score/insertform",method=RequestMethod.GET)
	public String insertForm(){
		return "mongo_insert";
	}
	@RequestMapping(value="/score/insert",method=RequestMethod.POST)
	public String insert(ScoreDTO document){
		service.insertDocument(document);
		return "redirect:/score/list?page=0";
	
	}
	
	@RequestMapping(value="/score/multiinsert")
	public String multiinsert(){
		List<ScoreDTO> docs = new ArrayList<ScoreDTO>();
		ScoreDTO dto = null;
		for (int i = 1; i < 5; i++) {
			dto = new ScoreDTO();
			dto.setId("multi"+i);
			dto.setName("multi"+i);
			dto.setAddr("¼­¿ï");
			dto.setDept("±âÈ¹½Ç");
			docs.add(dto);
		}
		service.insertAllDocument(docs);
		return "redirect:/score/list?pageNo=0";
	
	}
	
	
	
}
