package edu.homework.lesson4;

import edu.homework.lesson4.entity.Users;
import edu.homework.lesson4.repository.UsersRepository;
import edu.homework.lesson4.services.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBasicLesson4ApplicationTests {

	@Autowired
	private UsersRepository usersRepository;

	@Test
	void testUsersById() {
		var userID = 2;
		var users = usersRepository.findUsersById(userID);
		System.out.println("====== testUsersById ========");
		users.forEach(System.out::println);

	}

	@Test
	void testUserByName() {
		var userName = "Tester1";
		var users = usersRepository.findUsersByNameIs(userName);
		System.out.println("====== testUserByName ========");
		users.forEach(System.out::println);
	}

	@Test
	void testGetUserByEmail() {
		var userEmail = "tester1.tester@gmail.com";
		var users = usersRepository.findUsersByEmailIs(userEmail);
		System.out.println("====== testGetUserByEmail ========");
		users.forEach(System.out::println);
	}

	@Test
	void testUsersServicesFindAll() {
		List<Users> usersList;
		usersList = new UsersService(usersRepository).findAll();
		System.out.println("====== testUsersServicesFindAl ========");
		usersList.forEach(System.out::println);
	}

}
