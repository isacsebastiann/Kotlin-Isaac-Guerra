CREATE TABLE IF NOT EXISTS table1 (
    id SERIAL,
    description VARCHAR(100) NOT NULL,
    description2 VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS table2 (
    id SERIAL,
    description VARCHAR(100) NOT NULL,
    description2 VARCHAR(100) NOT NULL,
    table1_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (table1_id ) REFERENCES table1(id)
    );
