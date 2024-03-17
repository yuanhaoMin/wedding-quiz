package com.yuanhao.weddingquiz.enums;

public enum Question {

    // @formatter:off
    QUESTION1  (1,  "... am See wohnt."),
    QUESTION2  (2,  "… ein Haustier hat."),
    QUESTION3  (3,  "… einen BMW fährt."),
    QUESTION4  (4,  "… stricken kann."),
    QUESTION5  (5,  "… mindestens vier Sprachen spricht."),
    QUESTION6  (6,  "… schon mal in New York war."),
    QUESTION7  (7,  "… Brot bäckt."),
    QUESTION8  (8,  "… Takamaka mag."),
    QUESTION9  (9,  "… (Wirtschafts-) Informatik studiert hat."),
    QUESTION10 (10, "… im Fehrnsehen war."),
    QUESTION11 (11, "… Einzelkind ist."),
    QUESTION12 (12, "… mit der Braut zur Schule/Uni gegangen ist."),
    QUESTION13 (13, "… ein MacBook hat."),
    QUESTION14 (14, "… in München arbeitet oder gearbeitet hat."),
    QUESTION15 (15, "… einen Dreitausender erklommen hat. "),
    QUESTION16 (16, "… einen Wehrdienst geleistet hat."),
    QUESTION17 (17, "… Yoga macht."),
    QUESTION18 (18, "… eine mehrtägige Fahrradtour gemacht hat."),
    QUESTION19 (19, "… keinen Kaffee mag."),
    QUESTION20 (20, "... dieses Jahr Skifahren war."),
    QUESTION21 (21, "… in einem Schaltjahr geboren wurde."),
    QUESTION22 (22, "… ein Musikinstrument spielen kann."),
    QUESTION23 (23, "… schon mal beim Schloss Neuschwanstein war."),
    QUESTION24 (24, "… noch nie auf dem Oktoberfest war.");
    // @formatter:on

    private final int id;
    private final String content;

    Question(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}