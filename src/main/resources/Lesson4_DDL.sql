create table public.users
(
    id    integer generated always as identity
        constraint users_pk
            primary key,
    name  text,
    email text
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
    card_id       serial
        constraint cards_users_id_fk
            references public.users,
    number        integer,
    currency_code integer
        constraint cards_currency_code_fk
            references public.currency (code)
);

alter table public.cards
    owner to postgres;


