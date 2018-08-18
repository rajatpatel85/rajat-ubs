/**
 * Create script for initialization of DB
 */

------ insert sample order data -----------

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (1, 1, 1,  'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order yet to start', 'OPEN','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (2, 1, 1, 'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order started by XYZ', 'WORKING','XYZ');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (3, 1, 1, 'REPAIR-PIPE', 'REPAIR OF HOUSE PIPE', now(), ' Order COMPLETED', 'COMPLETED','der');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (4, 1, 2, 'REPAIR-GARAGE', 'REPAIR OF HOUSE GARAGE', now(), ' Order yet to start', 'OPEN','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (5, 2, 2, 'REPAIR-KITCHEN', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (6, 2, 2, 'REPAIR-KITCHEN', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (7, 3, 2, 'FIX-DOOR', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (8, 3, 2, 'FIX-DOOR', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (9, 4, 2, 'FIX-DOOR', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

insert into order_detail (id, order_id, customer_id, order_code, order_description, order_create_date, order_notes, order_status, order_update_user_name) 
values (10, 4, 2, 'FIX-DOOR', 'REPAIR OF HOUSE KITCHEN', now(), ' Order started by XYZ', 'WORKING','ABC');

