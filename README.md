# SpringBasicLesson4
Spring Basic Lesson4 https://lms.cbs.com.ua/mod/assign/view.php?id=1913 

# Завдання 1
Вивчіть конструкції та поняття, розглянуті на уроці.

# Завдання 2
Створіть класи сутності, які відповідатимуть таблицям у БД.

# Завдання 3
Для створених у попередньому завданні сутностей створіть репозиторії для отримання та збереження даних у БД будь-яким із розглянутих на уроці методом.

# Завдання 4
Створити репозиторій, який отримуватиме дані з БД. У цьому репозиторії необхідно створити 2 методи, які отримуватимуть дані. Запит має бути сформований за допомогою назв методів. Також створіть 2 методи. Один з методів буде оновлювати інформацію в БД, а інший – видаляти дані за допомогою анотації @Query та нативного запиту бази (використовуючи параметр анотації nativeQuery=true).


## Requirements

* Postgres Database
* JDK 19
* 
1. Create database named `lesson4_db`
2. docker run --name Lesson4-pg-13.3 -p 5433:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=secret -e POSTGRES_DB=lesson4_db -d postgres:13.3
2. Modify [Application config](src/main/resources/application.yaml) if needed
3. Run using IDEA or maven wrapper command `./mvnw spring-boot:run`
