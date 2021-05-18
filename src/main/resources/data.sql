INSERT INTO `company` VALUES (1,'SS-HN','CUDER','123456','IT company');

INSERT INTO `department` VALUES (1,'TU','HR','1234567',1),(2,'IU','IT','1234567',1);

INSERT INTO `bonus` VALUES (1,'',1000000),(2,'',1000000),(3,'',1000000),(4,'',1000000),(5,'',1000000);
INSERT INTO `basic_salary` VALUES (1,1000000,'2021-05-18',''),(2,1000000,'2021-05-18',''),(3,1000000,'2021-05-18',''),(4,1000000,'2021-05-18',''),(5,1000000,'2021-05-18','');
INSERT INTO `allowance` VALUES (1,1,''),(2,1,''),(3,1,''),(4,1,''),(5,1,'');

INSERT INTO `salary` VALUES (1,'...',3000000,1,1,1),(2,'...',3000000,2,2,2),(3,'...',3000000,3,3,3),(4,'...',3000000,4,4,4),(5,'...',3000000,5,5,5);

INSERT INTO `member` VALUES (1,'VP','1999-06-15','linhduonghy@gmail.com','12345','Duong Van Linh','linhdv','123456','Male','linhdv',2,1);
INSERT INTO `member` VALUES (2,'HN','1999-08-22','linhhh@gmail.com','12345','Hoang Ha Linh','linhhh','123456','Male','linhhh',2,2);
INSERT INTO `member` VALUES (3,'Lam Thao - Phu Tho','1999-10-03','huynd@gmail.com','12345','Nguyen Duc Huy','huynd','123456','Male','huynd',2,3);
INSERT INTO `member` VALUES (4,'SS-HN','1999-10-19','iu@gmail.com','12345','IUTU','iu','123456','Female','iu',1,4);
INSERT INTO `member` VALUES (5,'VP','1999-02-11','flna@gmail.com','12345','flna','flna','123456','Female','flna',1,5);

insert into `staff`(id,member_id) values (1, 1);
insert into `staff`(id,member_id) values (2, 2);
insert into `staff`(id,member_id) values (3, 3);

insert into `manager`(id,years_of_experience,member_id) values(1,3,4);
insert into `manager`(id,years_of_experience,member_id) values(2,9,5);

insert into `contract_type`(id,contract_type_name,description) values(1,'Hợp đồng chính thức', ''), (2,'Hợp đồng thử việc','');

insert into `term`(id,name,description,status,start_date,end_date) values(1, 'Tuyển dụng đợt 1 - 2021', '', 'Hết hạn tuyển dụng', '2021-01-01', '2021-04-01');
insert into `term`(id,name,description,status,start_date,end_date) values(2, 'Tuyển dụng đợt 2 - 2021', '', 'Đang tuyển dụng', '2021-04-02', '2021-08-02');
insert into `term`(id,name,description,status,start_date,end_date) values(3, 'Tuyển dụng đợt 3 - 2021', '', 'Đang tuyển dụng', '2021-08-03', '2021-12-03');

insert into `title`(id,description,title_name) values(1,'','Data Analyst');
insert into `title`(id,description,title_name) values(2,'','Data Scientist');
insert into `title`(id,description,title_name) values(3,'','System Administrator');
insert into `title`(id,description,title_name) values(4,'','QA Tester');
insert into `title`(id,description,title_name) values(5,'','Network Administrator');
insert into `title`(id,description,title_name) values(6,'','Database Administrator');
insert into `title`(id,description,title_name) values(7,'','Systems Analyst');
insert into `title`(id,description,title_name) values(8,'','Devops Engineer');
insert into `title`(id,description,title_name) values(9,'','Network Technician');
insert into `title`(id,description,title_name) values(10,'','Recruiter');
insert into `title`(id,description,title_name) values(11,'','Training Coordinator');
insert into `title`(id,description,title_name) values(12,'','Payroll Clerk');

