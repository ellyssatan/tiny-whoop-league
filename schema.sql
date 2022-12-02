create table raceDetails (
    id int auto_increment,
	name varchar(8) not null,
    number_of_laps enum('3', '5') default '3',
    closing_date date not null,

    primary key(race_id)
);

create table pilots (
    id char(5) not null,
    pilot_name varchar(64) not null,
	drone_name varchar(8) not null,
    
    primary key(id)
);

create table lapDetails (
    id int not null,
    race_id int not null,
    pilot_id char(5) not null,
    time_s decimal(2,2) not null,
    
    primary key(id),
    -- constraint fk_race_id
        foreign key(race_id) references raceDetails(id),
    -- constraint fk_pilot_id 
        foreign key(pilot_id) references pilots(id)
);
