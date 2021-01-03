DROP DATABASE IF EXISTS ibs;

CREATE DATABASE ibs;

use ibs;
******************************************************
CREATE TABLE customer(
CID BigInt PRIMARY KEY,
cname VARCHAR(20) NOT NULL,
dob DATE NOT NULL,
mobile CHAR(10) NOT NULL,
Address VARCHAR(50) NOT NULL,
loginPwd VARBINARY(255) NOT NULL,
transPwd VARBINARY(255) NOT NULL,
cardPIN VARBINARY(255) NOT NULL
);


INSERT INTO customer VALUES
(1234567891234567,'John','1990-05-01','9964932944','St-John Street',AES_ENCRYPT('Pass123','secret'),AES_ENCRYPT('Pass@12345','secret'),AES_ENCRYPT('1234','secret')),
(1234567891234566,'Anny','1991-06-02','9964961944','St-John Street1',AES_ENCRYPT('Pass113','secret'),AES_ENCRYPT('Pass@12145','secret'),AES_ENCRYPT('1224','secret'))
;
******************************************************
CREATE TABLE bankKYC(
refID INT PRIMARY KEY,
cname VARCHAR(20) NOT NULL,
dob DATE NOT NULL,
mobile CHAR(10) NOT NULL,
Email VARCHAR(50) UNIQUE,
documentUpload VARCHAR(50) NOT NULL,
kycStatus VARCHAR(20) NOT NULL
);

INSERT INTO bankKYC VALUES
(123,'John','1990-05-01','9964932944','John@gmail.com','PAN','Approved'),
(213,'Anny','1991-06-02','9964961944',NULL,'Aadhar','Approved'),
(214,'Shaw','1990-03-01','9961932944','Shaw@gmail.com','Passport','Pending'),
(124,'Shane','1989-06-02','9854961944',NULL,'Aadhar','Declined')
;
*******************************************************
CREATE TABLE bankRepMgt(
repID INT PRIMARY KEY,
CID BigInt NOT NULL,
AccntNum VARCHAR(20) NOT NULL,
CardNum VARCHAR(20),
CardType VARCHAR(15),
LoanType VARCHAR(10),
LoanAccNum VARCHAR(50)
);

INSERT INTO bankRepMgt VALUES
(201,1234567891234567,'12345678911213','5684 1121 5846 7777','Debit','Home','2256847963123'),
(202,1234567891234567,'12345678911213','5684 1121 5845 7214','Credit',NULL,NULL),
(203,1234567891234566,'12345678911224','5664 1111 5843 7234','Credit','Personal',2156847963122)
;
**********************************************************
CREATE TABLE savingAccount(
TranscID Int PRIMARY KEY,
AccNum VARCHAR(20) NOT NULL,
cname VARCHAR(20) NOT NULL,
AccStartDt DATE NOT NULL,
AmountDeposit DECIMAL(10,2),
DepositDt DATE,
AmountWithDrawn DECIMAL(10,2),
WithdrawnDt DATE,
BalanceAmt DECIMAL(10,2)
);


INSERT INTO savingAccount VALUES
(101,'12345678911213','John','2019-05-01','50000.00','2019-05-15','10000.00','2019-06-01','40000.00'),
(102,'12345678911213','John','2019-05-01', NULL, NULL,'10000.00','2019-07-01','30000.00'),
(103,'12345678911224','Anny','2020-01-01','80000.00','2020-02-10','30000.00','2020-03-01','52000.00')
;
**********************************************************
CREATE TABLE cardMgt(
cardNum VARCHAR(20) PRIMARY KEY,
card VARCHAR(10) NOT NULL,
cardType VARCHAR(20) NOT NULL,
expirtDt DATE NOT NULL,
cardLimit DECIMAL(10,2),
CID BigInt NOT NULL,
Active CHAR(1) NOT NULL
);

INSERT INTO cardMgt VALUES
('5684 1121 5846 7777','Debit','VISA','2025-06-01',NULL,1234567891234567,'Y'),
('5684 1121 5845 7214','Credit','Gold','2025-07-01','100000.00',1234567891234567,'Y'),
('5664 1111 5843 7234','Credit','Platinum','2020-06-01','100000.00',1234567891234566,'N')
;
**********************************************************
CREATE TABLE loanMgt(
loanAccNum BigInt PRIMARY KEY,
loanType VARCHAR(20) NOT NULL,
intRate DECIMAL(10,2) NOT NULL,
loanTenure Int NOT NULL,
loanEMI DECIMAL(10,2) NOT NULL,
CID BigInt NOT NULL
);

INSERT INTO loanMgt VALUES
(2256847963123,'Home','7.00',15,'25000.00',1234567891234567),
(2156847963122,'Personnel','11.00',4,'11500.00',1234567891234566)
;
