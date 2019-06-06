CREATE TABLE SportEvents (
		ID INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
		eventName    VARCHAR(255)  NOT NULL,
		dateOfEvent  VARCHAR(255)  NOT NULL,
		description  VARCHAR(255) ,
		eventType    VARCHAR(255)  NOT NULL,
		venue        VARCHAR(255)  NOT NULL,
		importantInfo    VARCHAR(255) ,
		roomTypes    VARCHAR(255) ,
		eventImage   VARCHAR(255) )