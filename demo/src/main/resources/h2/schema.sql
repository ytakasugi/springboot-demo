CREATE TABLE IF NOT EXISTS USER_COMMENT (
    ID NUMBER(10) AUTO_INCREMENT, -- 主キーとしてふさわしいものがないのでIDを採番
    NAME VARCHAR2(20),
    MAILADDRESS VARCHAR2(100),
    TEXT VARCHAR2(400) NOT NULL,  -- NULLを許容しない
    CONSTRAINT ID_PKC PRIMARY KEY(ID) -- IDをプライマリキーとする。(プライマリキーの名前をID_PKCとする)
);