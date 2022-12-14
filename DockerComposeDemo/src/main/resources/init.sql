CREATE TABLE IF NOT EXISTS `tutorial` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `description` varchar(250) DEFAULT NULL,
  `published` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
);

REPLACE INTO tutorial(id,name,price,description,published) VALUES (1,'To Kill a Mockingbird, by Harper Lee',10.22,'This book is a timeless classic that discusses human behavior and the collective conscience of The Deep South during the 20th century.',1);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (2,'1984, by George Orwell',9.33,'1984 is George Orwell’s dystopian and totalitarian world where fear, control and lies take over the lives of people.',0);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (3,'Harry Potter',9.33,'In this book, you can join Harry as he journeys into the Wizarding World and he triumphs over Lord Voldemort. Throughout these books, you’ll get to know characters such as Hermione, Ron, Hagrid, Dumbledore, and many more.',1);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (4,'The Lord of the Rings, by J.R.R. Tolkien',9.89,'Follow the protagonist Frodo Baggins as the embarks on a challenging quest. This trilogy will definitely leave you at the edge of your seat.',0);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (5,'The Great Gatsby, by F. Scott Fitzgerald',12.34,'The novel was published in 1925 and perfectly shows how decadent the Jazz Age was. It will teach you a valuable lesson that not everyone is fortunate in love.',1);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (6,'New Tutorial',11.22,'This is an interesting tutorial',1);
REPLACE INTO tutorial(id,name,price,description,published) VALUES (8,'Europe Is Red',88.88,'The novel was published in 1925 and perfectly shows how decadent the Jazz Age was. It will teach you a valuable lesson that not everyone is fortunate in love.',0);

