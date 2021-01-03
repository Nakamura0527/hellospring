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
CREATE TABLE IF NOT EXISTS m_user (
    username TEXT
    ,password TEXT
);
CREATE TABLE IF NOT EXISTS m_user_roles (
    username TEXT
    ,role_nm TEXT
);
