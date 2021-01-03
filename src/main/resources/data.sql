DELETE FROM status;
INSERT INTO status (status_cd, status_nm) VALUES ('1', '未着');
INSERT INTO status (status_cd, status_nm) VALUES ('2', '進行中');
INSERT INTO status (status_cd, status_nm) VALUES ('3', '完了');
DELETE FROM m_user;
INSERT INTO m_user (username, password) VALUES ('test', 'test');
DELETE FROM m_user_roles;
INSERT INTO m_user_roles (username, role_nm) VALUES ('test', 'USER');
