INSERT INTO `company` VALUES (1,'SS-HN','CUDER','123456','IT company');

INSERT INTO `department` VALUES (1,'TU','HR','1234567',1),(2,'IU','IT','1234567',1);

INSERT INTO `member` VALUES (1,'VP','1999-06-15','linhduonghy@gmail.com','12345','Duong Van Linh','linhdv','123456','Đại học',	'Male','linhdv',2);
INSERT INTO `member` VALUES (2,'HN','1999-08-22','linhhh@gmail.com','12345','Hoang Ha Linh','linhhh','123456','Đại học','Male','linhhh',2);
INSERT INTO `member` VALUES (3,'Lam Thao - Phu Tho','1999-10-03','huynd@gmail.com','12345','Nguyen Duc Huy','huynd','123456','Đại học','Male','huynd',2);
INSERT INTO `member` VALUES (4,'SS-HN','1999-10-19','iu@gmail.com','12345','IUTU','iu','123456','Đại học','Female','iu',1);
INSERT INTO `member` VALUES (5,'VP','1999-02-11','flna@gmail.com','12345','flna','flna','123456','Đại học','Female','flna',1);

--INSERT INTO `bonus` VALUES (1,'',1000000),(2,'',1000000),(3,'',1000000),(4,'',1000000),(5,'',1000000);
INSERT INTO `allowance`(allowance_code,allowance_name,allowance_value) VALUES ('A1','N1',1000000);
INSERT INTO `allowance`(allowance_code,allowance_name,allowance_value) VALUES ('A2','N2',2000000);
INSERT INTO `allowance`(allowance_code,allowance_name,allowance_value) VALUES ('A3','N3',3000000);

INSERT INTO `basic_salary`(basic_salary_name,basic_salary_value,created_date) VALUES ('CB1',5000000,'2021-05-18');
INSERT INTO `basic_salary`(basic_salary_name,basic_salary_value,created_date) VALUES ('CB2',6000000,'2021-05-18');
INSERT INTO `basic_salary`(basic_salary_name,basic_salary_value,created_date) VALUES ('CB3',7000000,'2021-05-18');

INSERT INTO `salary`(id,salary,coefficient_basic_salary,created_date,allowance_id,basic_salary_id,member_id) VALUES (1,5000000,1, '2020-06-15','A1','CB1',1);
INSERT INTO `salary`(id,salary,coefficient_basic_salary,created_date,allowance_id,basic_salary_id,member_id) VALUES (2,5000000,1, '2020-07-15','A2','CB2',2);
INSERT INTO `salary`(id,salary,coefficient_basic_salary,created_date,allowance_id,basic_salary_id,member_id) VALUES (3,5000000,2, '2020-08-15','A3','CB1',1);
INSERT INTO `salary`(id,salary,coefficient_basic_salary,created_date,allowance_id,basic_salary_id,member_id) VALUES (4,6000000,2, '2020-09-15','A2','CB2',2);
INSERT INTO `salary`(id,salary,coefficient_basic_salary,created_date,allowance_id,basic_salary_id,member_id) VALUES (5,6000000,2.5, '2020-10-15','A3','CB3',3);

insert into `staff`(id,member_id) values ('NV1', 1);
insert into `staff`(id,member_id) values ('NV2', 2);
insert into `staff`(id,member_id) values ('NV3', 3);

insert into `manager`(id,years_of_experience,member_id) values('QL1',3,4);
insert into `manager`(id,years_of_experience,member_id) values('QL2',9,5);

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

INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (1,'2021-05-20','desc','QL1','NV1',1);
INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (2,'2021-05-25','desc','QL1','NV1',5);
INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (3,'2021-05-25','desc','QL1','NV2',4);
INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (4,'2021-05-25','desc','QL2','NV1',5);
INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (5,'2021-05-25','desc','QL1','NV3',7);
INSERT INTO appointment(id,appointed_date,description,manager_id,staff_id,title_id)  VALUES (6,'2021-05-25','desc','QL2','NV2',5);

insert into `contract_type`(id,contract_type_name,description) values(1,'Hợp đồng chính thức', '');
insert into `contract_type`(id,contract_type_name,description) values(2,'Hợp đồng thử việc', '');

insert into `contract`(id,note,contract_signing_date,contract_end_date,contract_type_id,staff_id,manager_id) values('CT01','Hợp đồng 1', '2019-06-15','2021-06-15',1,'NV1','QL1');
insert into `contract`(id,note,contract_signing_date,contract_end_date,contract_type_id,staff_id,manager_id) values('CT02','Hợp đồng 2', '2019-10-19','2021-10-19',1,'NV2','QL1');
insert into `contract`(id,note,contract_signing_date,contract_end_date,contract_type_id,staff_id,manager_id) values('CT03','Hợp đồng 3', '2019-02-11','2021-02-11',1,'NV3','QL1');
