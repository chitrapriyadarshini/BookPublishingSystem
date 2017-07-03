package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	
	
	//PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public User findByEmailAndPassword(String email, String password) {
		User u=userRepository.findByUserName(email);
	//	boolean isValid = passwordEncoder.matches(password,u.getPassword());
		//if(isValid)
		return userRepository.findByUserNameAndPassword(email,u.getPassword());
		//else 
		//	return null;
	}

	/*public void register(RegistrationForm regUserForm) throws Exception {

		User user = userRepository.findByEmail(regUserForm.getEmail());
		System.out.println("Is email already exists? " + user);
		if (user != null) {
			throw new Exception("Email already exists!!!");
		}
*/		
	//	String hashedPassword = passwordEncoder.encode(regUserForm.getPassword());
	//	System.out.println(hashedPassword);
		User userObj = new User();
		/*userObj.setName(regUserForm.getName());
		userObj.setEmail(regUserForm.getEmail());
		userObj.setPassword(regUserForm.getPassword());
		userObj.setActive(true);*/
		
		//userRepository.save(userObj);

		// Send Registration Notification Mail
		//String subject = "Your account has been created";
		//String body = "Welcome to Revature ! You can login to your account !";
		// emailUtil.send(user.getEmail(), subject, body);

	
	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(Integer id) {
		return userRepository.findOne(id);
	}

	public User save(User user) {
		return userRepository.save(user);
		
	}

	public User findByUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePassword(String newPassword, String username) {
		// TODO Auto-generated method stub
		
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

}
