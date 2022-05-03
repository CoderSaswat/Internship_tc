create database library;
use library;

-- creating student table and inserting records 
create table student (
student_id int NOT NULL,
student_name varchar(255),
branch varchar(255),
primary key (student_id)
);

insert into student (student_id,student_name,branch)
values(1,'saswat','MCA');
insert into student (student_id,student_name,branch)
values(2,'kanha','Btech');
insert into student (student_id,student_name,branch)
values(3,'raja','MBBS');
insert into student (student_id,student_name,branch)
values(4,'lubun','MBA');
insert into student (student_id,student_name,branch)
values(5,'babu','BSc');

select * from student;

-- creating book table and inserting records
create table book (
book_id int NOT NULL,
book_title varchar(255),
author varchar(255),
primary key (book_id)
);

insert into book (book_id,book_title,author)
values(1,'rich dad poor dad','robert kiyosaki');
insert into book (book_id,book_title,author)
values(2,'psychology of money','morgan housel');
insert into book (book_id,book_title,author)
values(3,'the power of mind','joseph murphy');
insert into book (book_id,book_title,author)
values(4,'think and grow rich','napoleon hill');
insert into book (book_id,book_title,author)
values(5,'life amazing secrets','gaur gopal das');

select * from book;

-- creating BorrowedBook table and inserting records
create table BorrowedBook (
borrowed_id int NOT NULL,
book_id int,
student_id int,
primary key (borrowed_id),
FOREIGN KEY (book_id) REFERENCES book(book_id),
FOREIGN KEY (student_id) REFERENCES student(student_id)
);
select * from BorrowedBook; 
insert into BorrowedBook (borrowed_id,book_id,student_id) values(1,5,3);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(2,3,2);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(3,4,1);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(4,3,3);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(5,3,1);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(6,4,2);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(7,5,3);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(8,1,3);
insert into BorrowedBook (borrowed_id,book_id,student_id) values(9,2,1);

select * from BorrowedBook;

-- fetching records of all 3 tables
select * from student;
select * from book;
select * from BorrowedBook;


-- Extracting student's information who borrowed at least one book.
-- as you can see from BorrowedBook table student_id = 1,2 & 3 have borrowed at least one book
-- so it displays all information of those students only

SELECT distinct student.student_id, student.student_name, student.branch
FROM student   
INNER JOIN BorrowedBook   
ON student.student_id = BorrowedBook.student_id;


-- this sql query displays the title of the book that has been borrowed by the students maximun times
-- you can see from BorrowedBook tables book_id = 3 has been borrowed by students maximun times i.e 3 times
-- so it displays the title of that book i.e 'the power of mind'

select
	book.book_title
from
    BorrowedBook inner join book
on
	BorrowedBook.book_id = book.book_id
group by
    BorrowedBook.book_id
order by
	count(BorrowedBook.book_id) desc
limit 1;


-- this query displays the name of the student who has borrowed the maximum number of books
-- as you can see from BorrowedBook table student_id = 1 has borrowed maximum no of books i.e 4 books
-- so it displays the name of that student i.e 'saswat'

select
	student.student_name
from
    BorrowedBook inner join student
on
	BorrowedBook.student_id = student.student_id
group by
    BorrowedBook.student_id
order by
	count(BorrowedBook.student_id) desc
limit 1;


-- stored procedure for above queries
-- stored procedure for above queries
-- stored procedure for above queries

-- showing all student information
DELIMITER &&  
CREATE PROCEDURE show_all_students ()  
BEGIN  
    SELECT * FROM student;    
END &&  
DELIMITER ;
CALL show_all_students();

-- showing all books information
DELIMITER &&  
CREATE PROCEDURE show_all_books()  
BEGIN  
    SELECT * FROM book;    
END &&  
DELIMITER ;
CALL show_all_books();

-- showing all borrowedBooks information
DELIMITER &&  
CREATE PROCEDURE show_all_borrowedBooks()  
BEGIN  
    SELECT * FROM BorrowedBook;    
END &&  
DELIMITER ;
CALL show_all_borrowedBooks();

-- all student info who has borrowed at atleast one book
DELIMITER &&  
CREATE PROCEDURE all_students_who_borrowed_books()  
BEGIN  
    SELECT distinct student.student_id, student.student_name, student.branch
	FROM student   
	INNER JOIN BorrowedBook   
	ON student.student_id = BorrowedBook.student_id;   
END &&  
DELIMITER ;
CALL all_students_who_borrowed_books();

-- title of the book that has been borrowed max times by students
DELIMITER &&  
CREATE PROCEDURE maximum_times_borrwoed_bookname()  
BEGIN  
	select
		book.book_title
	from
		BorrowedBook inner join book
	on
		BorrowedBook.book_id = book.book_id
	group by
		BorrowedBook.book_id
	order by
		count(BorrowedBook.book_id) desc
	limit 1; 
END &&  
DELIMITER ;
CALL maximum_times_borrwoed_bookname();

-- name of the student who has borrowed max no of books
DELIMITER &&  
CREATE PROCEDURE student_who_borrowed_maximum_books()  
BEGIN  
	select
		student.student_name
	from
		BorrowedBook inner join student
	on
		BorrowedBook.student_id = student.student_id
	group by
		BorrowedBook.student_id
	order by
		count(BorrowedBook.student_id) desc
	limit 1;
END &&  
DELIMITER ;
CALL student_who_borrowed_maximum_books();








