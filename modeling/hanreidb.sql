

/* Create Tables */

CREATE TABLE CLS_BENCH
(
	BENCH_CODE VARCHAR(10) NOT NULL,
	BENCH_NAME VARCHAR(10) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (BENCH_CODE)
);


CREATE TABLE CLS_CASE_MARK
(
	CASE_MARK_CODE VARCHAR(10) NOT NULL,
	CASE_MARK_NAME VARCHAR(10),
	COURT_TYPE_CODE VARCHAR(10) NOT NULL,
	CASE_TYPE_CODE VARCHAR(10) NOT NULL,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (CASE_MARK_CODE)
);


CREATE TABLE CLS_CASE_TYPE
(
	CASE_TYPE_CODE VARCHAR(10) NOT NULL,
	CASE_TYPE_NAME VARCHAR(20) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (CASE_TYPE_CODE)
);


CREATE TABLE CLS_COURT_TYPE
(
	COURT_TYPE_CODE VARCHAR(10) NOT NULL,
	COURT_TYPE_NAME VARCHAR(50) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (COURT_TYPE_CODE)
);


CREATE TABLE CLS_ERA
(
	ERA_CODE CHAR(2) NOT NULL,
	ERA_NAME VARCHAR(10) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (ERA_CODE)
);


CREATE TABLE CLS_JUDGEMENT_RESULT
(
	JUDGEMENT_RESULT_CODE VARCHAR(10) NOT NULL,
	JUDGEMENT_RESULT_NAME VARCHAR(10) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (JUDGEMENT_RESULT_CODE)
);


CREATE TABLE CLS_JUDGEMENT_TYPE
(
	JUDGEMENT_TYPE_CODE VARCHAR(10) NOT NULL,
	JUDGEMENT_TYPE_NAME VARCHAR(20) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (JUDGEMENT_TYPE_CODE)
);


CREATE TABLE CLS_MINKEI
(
	MINKEI_CODE CHAR(3) NOT NULL,
	MINKEI_NAME VARCHAR(10) NOT NULL UNIQUE,
	DISPLAY_ORDER INTEGER NOT NULL UNIQUE,
	DESCRIPTION TEXT NOT NULL,
	VERSION_NO INTEGER NOT NULL,
	REGISTER_DATETIME DATETIME NOT NULL,
	REGISTER_TRACE VARCHAR(64) NOT NULL,
	UPDATE_DATETIME DATETIME NOT NULL,
	UPDATE_TRACE VARCHAR(64) NOT NULL,
	PRIMARY KEY (MINKEI_CODE)
);


CREATE TABLE JUDGEMENT
(
	JUDGEMENT_ID INTEGER NOT NULL,
	ERA_CODE CHAR(2) NOT NULL,
	CASE_NUMBER_YEAR INTEGER NOT NULL,
	CASE_NUMBER_MARK_CODE VARCHAR(10) NOT NULL,
	CASE_NUMBER_MARK_NUMBER INTEGER NOT NULL,
	KAN_NUMBER INTEGER NOT NULL,
	GO_NUMBER INTEGER NOT NULL,
	PAGE_NUMBER INTEGER NOT NULL,
	P INTEGER NOT NULL,
	T INTEGER NOT NULL,
	JUDGEMENT_DATE DATE NOT NULL,
	CASE_NAME TEXT NOT NULL,
	_JUDGEMENT_ID INTEGER NOT NULL,
	MAIN_TEXT TEXT NOT NULL,
	REASON TEXT NOT NULL,
	MINKEI_CODE CHAR(3) NOT NULL,
	BENCH_CODE VARCHAR(10) NOT NULL,
	JUDGEMENT_TYPE_CODE VARCHAR(10) NOT NULL,
	JUDGEMENT_RESULT_CODE VARCHAR(10) NOT NULL,
	PRIMARY KEY (JUDGEMENT_ID)
);



/* Create Foreign Keys */

ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_CLS_BENCH FOREIGN KEY (BENCH_CODE)
	REFERENCES CLS_BENCH (BENCH_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_NEW_TABLEAA FOREIGN KEY (CASE_NUMBER_MARK_CODE)
	REFERENCES CLS_CASE_MARK (CASE_MARK_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CLS_CASE_MARK
	ADD CONSTRAINT FK_CLS_CASE_MARK_CLS_CASE_TYPE FOREIGN KEY (CASE_TYPE_CODE)
	REFERENCES CLS_CASE_TYPE (CASE_TYPE_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE CLS_CASE_MARK
	ADD CONSTRAINT FK_CLS_CASE_MARK_CLS_COURT_TYPE FOREIGN KEY (COURT_TYPE_CODE)
	REFERENCES CLS_COURT_TYPE (COURT_TYPE_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_CLS_ERA FOREIGN KEY (ERA_CODE)
	REFERENCES CLS_ERA (ERA_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_CLS_JUDGEMENT_RESULT FOREIGN KEY (JUDGEMENT_RESULT_CODE)
	REFERENCES CLS_JUDGEMENT_RESULT (JUDGEMENT_RESULT_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_CLS_JUDGEMENT_TYPE FOREIGN KEY (JUDGEMENT_TYPE_CODE)
	REFERENCES CLS_JUDGEMENT_TYPE (JUDGEMENT_TYPE_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE JUDGEMENT
	ADD CONSTRAINT FK_JUDGEMENT_CLS_MINKEI FOREIGN KEY (MINKEI_CODE)
	REFERENCES CLS_MINKEI (MINKEI_CODE)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



