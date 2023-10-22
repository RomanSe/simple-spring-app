DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users
(
    id              SERIAL,
    username        VARCHAR(50) NOT NULL,
    password        VARCHAR(80) NOT NULL,
    email           VARCHAR(50) NOT NULL,
    created_at       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP   NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS roles CASCADE;
CREATE TABLE roles
(
    id   SERIAL,
    name VARCHAR(50) DEFAULT NULL UNIQUE,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS users_roles CASCADE;
CREATE TABLE users_roles
(
    user_id INTEGER NOT NULL,
    role_id INTEGER NOT NULL,

    PRIMARY KEY (user_id, role_id),

    CONSTRAINT FK_USER_ID_01 FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION,

    CONSTRAINT FK_ROLE_ID FOREIGN KEY (role_id)
        REFERENCES roles (id)
        ON DELETE NO ACTION ON UPDATE NO ACTION
);

INSERT INTO roles (name)
VALUES ('USER'),
       ('ADMIN');

INSERT INTO users (username, password, email)
VALUES ('admin', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'admin@gmail.com');

INSERT INTO users (username, password, email)
VALUES ('user', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'user@gmail.com');


