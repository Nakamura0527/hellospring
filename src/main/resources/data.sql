DELETE FROM status;
INSERT INTO status (status_cd, status_nm) VALUES ('1', '未着');
INSERT INTO status (status_cd, status_nm) VALUES ('2', '進行中');
INSERT INTO status (status_cd, status_nm) VALUES ('3', '完了');
DELETE FROM tuser;
INSERT INTO tuser (username, password) VALUES ('test', 'test');
