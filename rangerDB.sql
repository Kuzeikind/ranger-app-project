DROP DATABASE IF EXISTS park;

CREATE DATABASE park;
\c park
CREATE SCHEMA rangers;
SET search_path='rangers';


CREATE TABLE ranger_rank (
	id smallserial PRIMARY KEY,
	rank_name varchar
);

INSERT INTO ranger_rank (rank_name) VALUES
    ('JUNIOR'),
    ('MIDDLE'),
    ('SENIOR'),
    ('LEAD')
;

CREATE TABLE ranger (
	id bigserial PRIMARY KEY,
	first_name varchar NOT NULL,
	last_name varchar NOT NULL,
	email varchar NOT NULL UNIQUE,
    rank smallint REFERENCES ranger_rank(id) DEFAULT 1
);

CREATE TABLE ranger_passwords (
	id bigint REFERENCES ranger(id),
	password varchar NOT NULL
);


CREATE TABLE task_type (
	id smallserial PRIMARY KEY,
	type_name varchar
);

INSERT INTO task_type (type_name) VALUES
    ('PLANT'),
    ('REPAIR'),
    ('DECORATE'),
    ('REMOVE')
;

CREATE TABLE task_priority (
	id smallserial PRIMARY KEY,
	priority_name varchar
);

INSERT INTO task_priority (priority_name) VALUES
    ('LOW'),
    ('MEDIUM'),
    ('HIGH'),
    ('CRITICAL')
;

CREATE TABLE task (
	id bigserial PRIMARY KEY,
	assigned_to bigint REFERENCES ranger(id),
	priority smallint REFERENCES task_type(id),
	type smallint REFERENCES task_priority(id),
	description text,
	latitude real,
	longitude real,
	created_at timestamp
);
