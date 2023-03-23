package edu.homework.lesson4;

import edu.homework.lesson4.repository.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBasicLesson4ApplicationTests {

	@Autowired
	private UsersRepository usersRepository;

	@Test
	void testUsersById() {
		var userID = 2;
		var users = usersRepository.getUsersById(userID);
		System.out.println("====== testUsersById ========");
		users.forEach(System.out::println);

	}

	@Test
	void testUserByName() {
		var userName = "Tester1";
		var users = usersRepository.getUsersByNameIs(userName);
		System.out.println("====== testUserByName ========");
		users.forEach(System.out::println);
	}

}
