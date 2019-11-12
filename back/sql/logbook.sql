create table logbook_entries
(
    id                         serial                                          not null
        constraint logbook_pk
            primary key,
    dep_ad                     varchar(4)                                      not null,
    off_blocks                 timestamp with time zone                        not null,
    arr_ad                     varchar(4)                                      not null,
    on_blocks                  timestamp with time zone                        not null,
    ac_type                    varchar(4)                                      not null,
    ac_reg                     varchar                                         not null,
    single_pilot_single_engine boolean       default false                     not null,
    single_pilot_multi_engine  boolean       default false                     not null,
    multi_pilot                boolean       default false                     not null,
    name_pic                   varchar       default 'SELF'::character varying not null,
    day_landings               integer       default 0                         not null,
    night_landings             integer       default 0                         not null,
    night_time                 numeric(8, 2) default 0                         not null,
    ifr_time                   numeric(8, 2) default 0                         not null,
    pic_time                   numeric(8, 2) default 0                         not null,
    co_pilot_time              numeric(8, 2) default 0                         not null,
    dual_time                  numeric(8, 2) default 0                         not null,
    instruction_time           numeric(8, 2) default 0                         not null,
    other_if                   numeric(8, 2) default 0                         not null,
    other_nav                  numeric(8, 2) default 0                         not null,
    remarks                    text,
    other_comments             text
);

alter table logbook_entries
    owner to jesus_jimenez;

create unique index logbook_id_uindex
    on logbook_entries (id);

INSERT INTO public.logbook_entries (id, dep_ad, off_blocks, arr_ad, on_blocks, ac_type, ac_reg, single_pilot_single_engine, single_pilot_multi_engine, multi_pilot, name_pic, day_landings, night_landings, night_time, ifr_time, pic_time, co_pilot_time, dual_time, instruction_time, other_if, other_nav, remarks, other_comments) VALUES (1, 'LEJR', '2018-06-06 07:06:00.000000', 'LEJR', '2018-06-06 08:06:00.000000', 'PA28', 'EC-JMA', true, false, false, 'PICCOTIN', 1, 0, 0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, '(1) GH', 'First flight!!');
INSERT INTO public.logbook_entries (id, dep_ad, off_blocks, arr_ad, on_blocks, ac_type, ac_reg, single_pilot_single_engine, single_pilot_multi_engine, multi_pilot, name_pic, day_landings, night_landings, night_time, ifr_time, pic_time, co_pilot_time, dual_time, instruction_time, other_if, other_nav, remarks, other_comments) VALUES (3, 'LEJR', '2018-06-11 13:48:00.000000', 'LEJR', '2018-06-11 14:42:00.000000', 'PA28', 'EC-IOS', true, false, false, 'PICCOTIN', 1, 0, 0.00, 0.00, 0.00, 0.00, 0.90, 0.00, 0.00, 0.00, '(3) GH', null);
INSERT INTO public.logbook_entries (id, dep_ad, off_blocks, arr_ad, on_blocks, ac_type, ac_reg, single_pilot_single_engine, single_pilot_multi_engine, multi_pilot, name_pic, day_landings, night_landings, night_time, ifr_time, pic_time, co_pilot_time, dual_time, instruction_time, other_if, other_nav, remarks, other_comments) VALUES (2, 'LEJR', '2018-06-09 08:42:00.000000', 'LEJR', '2018-06-09 09:42:00.000000', 'PA28', 'EC-JMA', true, false, false, 'PICCOTIN', 0, 0, 0.00, 0.00, 0.00, 0.00, 1.00, 0.00, 0.00, 0.00, '(2) GH', '');
INSERT INTO public.logbook_entries (id, dep_ad, off_blocks, arr_ad, on_blocks, ac_type, ac_reg, single_pilot_single_engine, single_pilot_multi_engine, multi_pilot, name_pic, day_landings, night_landings, night_time, ifr_time, pic_time, co_pilot_time, dual_time, instruction_time, other_if, other_nav, remarks, other_comments) VALUES (4, 'LEJR', '2018-06-11 15:48:00.000000', 'LEJR', '2018-06-11 17:00:00.000000', 'PA28', 'EC_MBV', true, false, false, 'PICCOTIN', 1, 0, 0.00, 0.00, 0.00, 0.00, 1.20, 0.00, 0.00, 0.00, '(4) GH', null);