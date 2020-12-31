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
CREATE TABLE IF NOT EXISTS tuser (
    username TEXT
    ,password TEXT
);
