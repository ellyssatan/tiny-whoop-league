create table racecourse (
    race_id int auto_increment not null,
	name varchar(8) not null,
    number_of_laps enum(3, 5) not null default '3',
    closing_date date not null,

    primary key(race_id)
);

create table pilots (
    race_id int not null,
    pilot_id char(8) not null,
    pilot_name varchar(64) not null,
    email varchar(64) not null,
	drone_name varchar(8) not null,
    
    primary key(item_id),
    constraint fk_race_id
        foreign key(race_id) references racecourse(race_id)
);

create table lapDetails (

)
