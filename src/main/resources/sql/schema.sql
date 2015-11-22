create table  IF NOT EXISTS t_user(
	id INT PRIMARY KEY,
   	guests VARCHAR(255)
);

create table IF NOT EXISTS t_profile(
	id INT PRIMARY KEY,
	user INT,
	name  VARCHAR(255)
);	
  
create table IF NOT EXISTS t_history(
	id BIGINT auto_increment,
	user INT,
	guest INT,
	visit datetime
);

create table IF NOT EXISTS t_history(
	id BIGINT auto_increment,	
	queue_date datetime
);
 
  	
