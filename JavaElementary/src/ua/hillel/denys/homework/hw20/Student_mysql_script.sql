CREATE DATABASE Student;

CREATE TABLE students (
	ID_student int NOT NULL ,
	full_name char (30) NOT NULL ,
	ID_group int NOT NULL ,
	year_of_admission int NOT NULL
);

CREATE TABLE study_groups (
    ID_group int NOT NULL ,
    study_group char (10) NOT NULL
);

CREATE TABLE points (
    ID_point int NOT NULL ,
    ID_lesson int NOT NULL ,
    ID_student int NOT NULL ,
    point int NOT NULL
);

CREATE TABLE lessons (
    ID_lesson int NOT NULL ,
    name_of_the_subject char (25) NOT NULL ,
    ID_lecturer int NOT NULL ,
    semester int NOT NULL ,
    academic_year int NOT NULL
);

CREATE TABLE lecturers (
    ID_lecturer int NOT NULL ,
    full_name char (30) NOT NULL ,
    ID_department int NOT NULL
);

CREATE TABLE departments (
    ID_department int NOT NULL ,
    department_name char (30) NOT NULL ,
    head_of_department char (30) NOT NULL
);

ALTER TABLE departments ADD
    CONSTRAINT PK_dep PRIMARY KEY
    (
        ID_department
    );

ALTER TABLE lecturers ADD
    CONSTRAINT PK_lec PRIMARY KEY
    (
        ID_lecturer
    );

ALTER TABLE lessons ADD
    CONSTRAINT PK_les PRIMARY KEY
    (
        ID_lesson
    );

ALTER TABLE points ADD
    CONSTRAINT PK_p PRIMARY KEY
    (
        ID_point
    );

ALTER TABLE study_groups ADD
    CONSTRAINT PK_st_gr PRIMARY KEY
    (
        ID_group
    );

ALTER TABLE students ADD
    CONSTRAINT PK_stud PRIMARY KEY
    (
        ID_student
    );

ALTER TABLE lecturers ADD
	CONSTRAINT FK_Lecturers_Departments FOREIGN KEY
	(
		ID_department
	) REFERENCES departments (
		ID_department
	);

ALTER TABLE lessons ADD
	CONSTRAINT FK_Lessons_Lecturers FOREIGN KEY
	(
		ID_lecturer
	) REFERENCES lecturers (
		ID_lecturer
	);

ALTER TABLE points ADD
	CONSTRAINT FK_Points_Lessons FOREIGN KEY
	(
		ID_lesson
	) REFERENCES lessons (
		ID_lesson
	);

ALTER TABLE points ADD
	CONSTRAINT FK_Points_Students FOREIGN KEY
	(
		ID_student
	) REFERENCES students (
		ID_student
	);

ALTER TABLE students ADD
	CONSTRAINT FK_Students_Study_groups FOREIGN KEY
	(
		ID_group
	) REFERENCES study_groups (
		ID_group
	);

/*---Students----------------------------------------------------------------------------*/
insert into students values (001, 'Ivanov Ivan Ivanovich         ', 10, 2020);
insert into students values (002, 'Petrov Petr Petrovich         ', 20, 2020);
insert into students values (003, 'Makarov Makar Makarovich      ', 30, 2020);
insert into students values (004, 'Nikitin Nikita Nikitovich     ', 40, 2020);
insert into students values (005, 'Surkova Irina Olegovna        ', 10, 2020);
insert into students values (006, 'Talikov Petr Petrovich        ', 40, 2020);
insert into students values (007, 'Pritula Larisa Petrovna       ', 20, 2020);
insert into students values (008, 'Momot Marina Sergeevna        ', 40, 2020);
insert into students values (009, 'Dorogovceva Diana Dmitrievna  ', 10, 2020);
insert into students values (010, 'Surja Natalia Nikolaevna      ', 20, 2020);
insert into students values (011, 'Strikalo Roman Romanovich     ', 10, 2020);
insert into students values (012, 'Shapovalova Nadejda Ivanovna  ', 20, 2020);
insert into students values (013, 'Stepanov Sergey Georgeevich   ', 30, 2020);
insert into students values (014, 'Shustova Nina Alekseevna      ', 10, 2020);
insert into students values (015, 'Glebova Irina Andreevna       ', 20, 2020);
insert into students values (016, 'Rudenko Svetlana Sergeevna    ', 40, 2020);
insert into students values (017, 'Shilo Ivan Ivanovich          ', 10, 2020);
insert into students values (018, 'Shost Tatiana Vladimirivna    ', 20, 2020);
insert into students values (019, 'Gayvan Stepan Stepanovich     ', 30, 2020);
insert into students values (020, 'Chubko Yana Leonidovna        ', 40, 2020);
insert into students values (021, 'Mateiko Matvey Sergeevich     ', 10, 2020);
insert into students values (022, 'Zubov Genadiy Igorevich       ', 10, 2020);
insert into students values (023, 'Stepanenko Taras Tarasovich   ', 40, 2020);
insert into students values (024, 'Shevchenko Anna Sergeevna     ', 30, 2020);

/*---Study_groups------------------------------------------------------------------------*/
insert into study_groups values (10, 'MT-041    ');
insert into study_groups values (20, 'MS-041    ');
insert into study_groups values (30, 'MO-041    ');
insert into study_groups values (40, 'MD-041    ');

/*----Points-----------------------------------------------------------------------------*/
insert into points values (0001, 101, 001, 5);
insert into points values (0002, 401, 002, 4);
insert into points values (0003, 101, 003, 3);
insert into points values (0004, 301, 004, 2);
insert into points values (0005, 101, 005, 5);
insert into points values (0006, 601, 006, 4);
insert into points values (0007, 201, 007, 3);
insert into points values (0008, 501, 008, 2);
insert into points values (0009, 401, 009, 5);
insert into points values (0010, 301, 010, 4);
insert into points values (0011, 101, 011, 3);
insert into points values (0012, 601, 012, 2);
insert into points values (0013, 101, 013, 5);
insert into points values (0014, 401, 014, 4);
insert into points values (0015, 201, 015, 3);
insert into points values (0016, 101, 016, 2);
insert into points values (0017, 601, 017, 5);
insert into points values (0018, 101, 018, 4);
insert into points values (0019, 301, 019, 3);
insert into points values (0020, 201, 020, 2);
insert into points values (0021, 101, 021, 5);
insert into points values (0022, 501, 022, 4);
insert into points values (0023, 201, 023, 3);
insert into points values (0024, 301, 024, 2);

/*----Lessons----------------------------------------------------------------------------*/
insert into lessons values (101, 'Maths                    ', 1, 1, 2020);
insert into lessons values (201, 'Physic                   ', 2, 1, 2020);
insert into lessons values (301, 'Theoretical mechanics    ', 3, 2, 2020);
insert into lessons values (401, 'Informatics              ', 4, 1, 2020);
insert into lessons values (501, 'History                  ', 5, 1, 2020);
insert into lessons values (601, 'Mathematical analysis    ', 1, 2, 2020);

/*----Lecturers--------------------------------------------------------------------------*/
insert into lecturers values (1, 'Usov Igor Igorevich           ', 1001);
insert into lecturers values (2, 'Dibrova Nikolay Nikolaevich   ', 2001);
insert into lecturers values (3, 'Lukash Semen Stepanovich      ', 3001);
insert into lecturers values (4, 'Gusin Oleg Olegovich          ', 4001);
insert into lecturers values (5, 'Slepukhina Rimma Ivanovna     ', 5001);

/*----Departments------------------------------------------------------------------------*/
insert into departments values (1001, 'Department of Math            ', 'Tutova Larisa Sergeevna       ');
insert into departments values (2001, 'Department of Physics         ', 'Zalugniy Sergey Sergeevich    ');
insert into departments values (3001, 'Department of Mechanics       ', 'Kot Sergey Olegovich          ');
insert into departments values (4001, 'Department of Informatics     ', 'Shust Bogdan Igorevich        ');
insert into departments values (5001, 'Department of History         ', 'Slepukhina Rimma Ivanovna     ');