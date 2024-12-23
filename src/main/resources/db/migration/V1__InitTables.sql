CREATE TABLE todo (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    is_completed BOOLEAN DEFAULT FALSE
);
