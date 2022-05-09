INSERT INTO order_entity (created_at, updated_at) VALUES (NOW(), NOW());
INSERT INTO order_entity (created_at, updated_at) VALUES (NOW(), NOW());
INSERT INTO shipment (order_id, tracking_code, warehouse_address, shipment_status, weight, created_at, updated_at) VALUES (1, 'TRCK0001', 'BERLIN, DE', 'CREATED', 2,  NOW(), NOW());
INSERT INTO SHIPMENT (order_id, tracking_code, warehouse_address, shipment_status, weight, created_at, updated_at) VALUES (1, 'TRCK0002', 'BERLIN, DE', 'SHIPPED', 1, NOW(), NOW());
INSERT INTO SHIPMENT (order_id, tracking_code, warehouse_address, shipment_status, weight, created_at, updated_at) VALUES (2, 'TRCK0003', 'BERLIN, DE', 'CREATED', 1, NOW(), NOW());