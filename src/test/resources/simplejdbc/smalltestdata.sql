INSERT INTO DISCOUNT_CODE(DISCOUNT_CODE, RATE) 
	VALUES ('H', 16.00);

INSERT INTO MICRO_MARKET(ZIP_CODE, RADIUS, AREA_LENGTH, AREA_WIDTH) 
	VALUES ('95051', 255.59, 689.856, 478.479);

INSERT INTO CUSTOMER(CUSTOMER_ID, DISCOUNT_CODE, ZIP, NAME, ADDRESSLINE1, ADDRESSLINE2, CITY, STATE, PHONE, FAX, EMAIL, CREDIT_LIMIT) 
	VALUES (1, 'H', '95051', 'Jumbo Eagle Corp', '111 E. Las Olivas Blvd', 'Suite 51', 'Fort Lauderdale', 'FL', '305-555-0188', '305-555-0189', 'jumboeagle@example.com', 100000);

