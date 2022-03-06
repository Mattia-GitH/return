CREATE TABLE TBL_components
(
    ID        int(11)                NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SUPPLIER  enum ('A','B','C','D') NOT NULL,
    COMPONENT varchar(255)           NOT NULL
);

CREATE TABLE TBL_phone
(
    IMEI  int(15)                                 NOT NULL PRIMARY KEY,
    MODEL enum ('SE','X','XS','XR','11','11_PRO') NOT NULL
);

CREATE TABLE TBL_orders
(
    ID       int(11)                         NOT NULL PRIMARY KEY,
    DATE     date                            NOT NULL,
    OPERATOR enum ('Mattia','Dixi','Biagio') NOT NULL,
    IMEI     int(11)                         NOT NULL,
    VERIFIED BOOLEAN                         NOT NULL,
    NOTE     text                            NOT NULL
);

CREATE TABLE TBL_reparations
(
    IMEI          int(11)                                                    NOT NULL,
    STATE         enum ('REPAIRED', 'NOT_REPAIRED', 'REPLACED', 'POSTPONED') NOT NULL,
    OLD_COMPONENT int(11)                                                    NOT NULL,
    NEW_COMPONENT int(11)                                                    NOT NULL
);

CREATE TABLE TBL_replacement
(
    OLD_IMEI int(11) NOT NULL,
    NEW_IMEI int(11) NOT NULL,
    NOTE     text    NOT NULL
);

ALTER TABLE TBL_orders
    ADD FOREIGN KEY ("IMEI")
        REFERENCES TBL_phone (IMEI);

ALTER TABLE TBL_reparations
    ADD FOREIGN KEY ("IMEI")
        REFERENCES TBL_phone (IMEI);

ALTER TABLE TBL_reparations
    ADD FOREIGN KEY ("OLD_COMPONENT")
        REFERENCES TBL_components (ID);

ALTER TABLE TBL_reparations
    ADD FOREIGN KEY ("NEW_COMPONENT")
        REFERENCES TBL_components (ID);

ALTER TABLE TBL_replacement
    ADD FOREIGN KEY ("OLD_IMEI")
        REFERENCES TBL_phone (IMEI);

ALTER TABLE TBL_replacement
    ADD FOREIGN KEY ("NEW_IMEI")
        REFERENCES TBL_phone (IMEI);