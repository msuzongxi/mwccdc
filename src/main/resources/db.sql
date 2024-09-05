--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.3

-- Started on 2024-09-05 17:24:05

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 16411)
-- Name: t_point; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.t_point (
    user_name character varying(100),
    task_name character varying(100),
    score numeric,
    remark character varying(2000),
    created_date timestamp without time zone
);


ALTER TABLE public.t_point OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16406)
-- Name: t_task; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.t_task (
    task_name character varying(100),
    task_type character varying(30),
    task_desc character varying(2000),
    created_date timestamp without time zone
);


ALTER TABLE public.t_task OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16403)
-- Name: t_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.t_user (
    user_name character varying(100),
    created_date timestamp without time zone,
    status "char"
);


ALTER TABLE public.t_user OWNER TO postgres;

--
-- TOC entry 3324 (class 0 OID 16411)
-- Dependencies: 216
-- Data for Name: t_point; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.t_point (user_name, task_name, score, remark, created_date) FROM stdin;
AJM	01-minterface	10	performance remark	2024-08-10 17:09:37.757963
JordanS	01-minterface	0	N/A	2024-08-12 16:35:35.345598
ZacharyF	01-minterface	10	test	2024-08-29 15:16:22.555115
JonahT	01-minterface	5	test	2024-08-29 15:16:22.562653
MakayleeD	01-minterface	3	test	2024-08-29 15:16:22.563889
BennettR	01-minterface	5	N/A	2024-08-29 15:16:22.565475
MarkA	01-minterface	3	N/A	2024-08-29 15:16:22.569253
ZacharyF	02-apache	10	N/A	2024-08-29 15:17:41.626437
JonahT	02-apache	5	N/A	2024-08-29 15:17:41.636597
MakayleeD	02-apache	3	N/A	2024-08-29 15:17:41.641267
AJM	02-apache	10	N/A	2024-08-29 15:17:41.651939
BennettR	02-apache	5	N/A	2024-08-29 15:17:41.657003
AidenW	02-apache	3	N/A	2024-08-29 15:18:47.21509
ZacharyF	03-prestashop	10	N/A	2024-08-29 15:18:47.226388
JonahT	03-prestashop	8	N/A	2024-08-29 15:18:47.231285
MakayleeD	03-prestashop	9	N/A	2024-08-29 15:18:47.255501
AJM	03-prestashop	10	N/A	2024-08-29 15:18:47.260285
BennettR	03-prestashop	8	N/A	2024-08-29 15:18:47.264107
AidenW	01-minterface	5	N/A	2024-08-29 15:20:29.995096
MarkA	02-apache	9	N/A	2024-08-29 15:23:50.552464
MarkA	03-prestashop	6	N/A	2024-08-29 15:23:50.556547
\.


--
-- TOC entry 3323 (class 0 OID 16406)
-- Dependencies: 215
-- Data for Name: t_task; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.t_task (task_name, task_type, task_desc, created_date) FROM stdin;
01-minterface	pafw	minterface, security policy configuration	2024-03-24 01:30:24.048908
02-apache	service	configure apache home page	2024-08-28 21:16:31.982854
03-prestashop	service	install and restore	2024-08-28 21:17:00.606353
\.


--
-- TOC entry 3322 (class 0 OID 16403)
-- Dependencies: 214
-- Data for Name: t_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.t_user (user_name, created_date, status) FROM stdin;
ZacharyF	2024-03-23 22:45:45.095779	A
JonahT	2024-03-23 22:48:55.623586	A
MakayleeD	2024-03-23 22:48:55.623586	A
AJM	2024-03-23 22:48:55.623586	A
BennettR	2024-03-23 22:48:55.623586	A
AidenW	2024-03-23 22:48:55.623586	A
MarkA	2024-03-23 22:48:55.623586	A
JordanS	2024-03-23 22:48:55.623586	A
NathanimP	2024-03-23 22:48:55.623586	A
MatthewC	2024-03-23 22:48:55.623586	A
ReidB	2024-03-26 08:40:28.750838	A
JackP	2024-03-26 08:40:28.750838	A
\.


-- Completed on 2024-09-05 17:24:06

--
-- PostgreSQL database dump complete
--

