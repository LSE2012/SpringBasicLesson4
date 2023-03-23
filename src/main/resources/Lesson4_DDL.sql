create table public.users
(
    id      integer generated always as identity
        constraint users_pk
            primary key,
    name    text,
    email   text,
    card_id integer
);

comment on table public.users is 'user';

alter table public.users
    owner to postgres;

create table public.currency
(
    id   serial,
    name text,
    code integer
        constraint currency_pk
            unique
);

alter table public.currency
    owner to postgres;

create table public.cards
(
    card_id       serial,
    number        integer,
    currency_code integer
        constraint cards_currency_code_fk
            references public.currency (code),
    user_id       integer
);

alter table public.cards
    owner to postgres;

