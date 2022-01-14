CREATE TABLE IF NOT EXISTS BoughtList(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	item_name VARCHAR(10),
	item_count int,
	item_price INT,
	item_memo VARCHAR(20)
);
