--liquibase formatted sql
--changeset jitunayak:add test data in to person

INSERT INTO persons VALUES(
1, "Jitu", "India"
);

INSERT INTO persons VALUES(
2, "Sagar", "India"
);

--rollback DROP TABLE
--rollback testTable