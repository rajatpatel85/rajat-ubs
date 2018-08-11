/**
 * Create script for initialization of DB
 */

------ insert sample order data -----------

insert into order_detail (order_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (1, 'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order yet to start', 'INITIAL','ABC');

insert into order_detail (order_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (2, 'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order started by XYZ', 'STARTED','XYZ');

insert into order_detail (order_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (3, 'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order COMPLETED', 'COMPLETED','der');

insert into order_detail (order_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (4, 'REPAIR-GARAGE', 'REPAIR OF HOUSE GARAGE', now(), ' Order yet to start', 'INITIAL','ABC');

insert into order_detail (order_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (5, 'REPAIR-KITCHEN', 'REPAIR OF HOUSE KITCHEN', now(), ' Order yet to start', 'INITIAL','ABC');

