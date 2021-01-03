DELETE FROM status;
INSERT INTO status (status_cd, status_nm) VALUES ('1', '未着');
INSERT INTO status (status_cd, status_nm) VALUES ('2', '進行中');
INSERT INTO status (status_cd, status_nm) VALUES ('3', '完了');
DELETE FROM m_user;
INSERT INTO m_user (username, password) VALUES ('test', '$2a$10$lngBok1MF6ZXR3/l2HwrE.RshflLETq46W4ZB64naSVXOsmugbm0a');
DELETE FROM m_user_roles;
INSERT INTO m_user_roles (username, role_nm) VALUES ('test', 'ROLE_USER');
