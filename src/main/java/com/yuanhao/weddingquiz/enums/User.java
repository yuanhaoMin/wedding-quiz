package com.yuanhao.weddingquiz.enums;

public enum User {

    // @formatter:off
    USER1  (1,  "Kathi"),
    USER2  (2,  "Wilhelm"),
    USER3  (3,  "Valentina"),
    USER4  (4,  "Alex"),
    USER5  (5,  "Hildegard"),
    USER6  (6,  "Klaus"),
    USER7  (7,  "Johannes"),
    USER8  (8,  "Theresa"),
    USER9  (9,  "Stefanie"),
    USER10 (10, "Markus"),
    USER11 (11, "Magdalena"),
    USER12 (12, "Christoph"),
    USER13 (13, "Manfred"),
    USER14 (14, "Marina"),
    USER15 (15, "Martina"),
    USER16 (16, "Clemens"),
    USER17 (17, "Frani"),
    USER18 (18, "Christian"),
    USER19 (19, "Claudia"),
    USER20 (20, "Veronika"),
    USER21 (21, "Alexander"),
    USER22 (22, "Nathalie"),
    USER23 (23, "Beni"),
    USER24 (24, "Oliver"),
    USER25 (25, "Waltraud"),
    USER26 (26, "Criti"),
    USER27 (27, "Ulli"),
    USER28 (28, "Gerhard"),
    USER29 (29, "Mathias"),
    USER30 (30, "Antonia"),
    USER31 (31, "Jasmin"),
    USER32 (32, "Valentin"),
    USER33 (33, "Lothar"),
    USER34 (34, "Sarah"),
    USER35 (35, "Michi");
    // @formatter:on

    private final int id;
    private final String lastName;

    User(int id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

}