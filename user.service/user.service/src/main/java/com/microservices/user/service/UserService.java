package com.microservices.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservices.user.VO.Contact;
import com.microservices.user.VO.ResponseTemplateVO;
import com.microservices.user.entity.User;
import com.microservices.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;
	@Autowired
	private RestTemplate restTemplate;

	public User addUser(User user) {
		return userrepo.save(user);

	}

	public ResponseTemplateVO getUserWithContact(Long userId) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userrepo.findByUserId(userId);
		Contact contact =restTemplate.getForObject("http://localhost:9001/contacts/"+ user.getContactId() 
				,Contact.class);
		vo.setUser(user);
		vo.setContact(contact);
		return vo;
		
	}

	public User notAutherizedMessage(User user) {
		// TODO Auto-generated method stub
		return notAutherizedMessage(user);
	}

	

}
