CREATE TABLE IF NOT EXISTS todo (
    id INT
    ,status_cd TEXT
    ,title TEXT NOT NULL
    ,content TEXT
);
CREATE TABLE IF NOT EXISTS status (
    status_cd TEXT
    ,status_nm TEXT
);

DELETE FROM status;
INSERT INTO status (status_cd, status_nm) VALUES ('1', '未着');
INSERT INTO status (status_cd, status_nm) VALUES ('2', '進行中');
INSERT INTO status (status_cd, status_nm) VALUES ('3', '完了');
