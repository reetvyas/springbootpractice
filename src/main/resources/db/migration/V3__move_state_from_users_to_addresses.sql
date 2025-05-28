alter table store_jpa.users
    drop column state;

alter table store_jpa.addresses
    add state varchar(255) not null;
