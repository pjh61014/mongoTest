package spring.data.mongodb.dto;

import org.springframework.data.repository.PagingAndSortingRepository;

//�ƹ��͵� �������� ���� ���� -CRUD�� ������ �⺻ �޼ҵ带 ���� �ִ� repository�� �ۼ��Ѵ�. 
//				spring-data���ο��� �ڵ����� ����
public interface ScoreRepository extends PagingAndSortingRepository<ScoreDTO, String > {

}
