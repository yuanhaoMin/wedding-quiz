IF OBJECT_ID('dbo.user_choices') IS NULL
CREATE TABLE dbo.user_choices (
    id INT IDENTITY(1,1) PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    choices NVARCHAR(MAX),
    created_on DATETIME,
    updated_on DATETIME,
);