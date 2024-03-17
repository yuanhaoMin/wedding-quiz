IF OBJECT_ID('dbo.UserChoices') IS NULL
    CREATE TABLE dbo.UserChoices (
        choice_id INT IDENTITY(1,1) PRIMARY KEY,
        user_last_name VARCHAR(255) NOT NULL,
        question_id INT NOT NULL,
        chosen_user_last_name VARCHAR(255) NOT NULL,
        CONSTRAINT UC_UserQuestion UNIQUE (user_last_name, question_id),
        CONSTRAINT UC_QuestionChosenUser UNIQUE (question_id, chosen_user_last_name)
    );