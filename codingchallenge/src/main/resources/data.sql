INSERT INTO shipment (tracking_code, warehouse_address, shipment_status, weight , created_at, updated_at) VALUES ('TRCK0001', 'BERLIN, DE', 'SHIPPED', 2,  NOW(), NOW());
INSERT INTO SHIPMENT (tracking_code, warehouse_address, shipment_status, weight , created_at, updated_at) VALUES ('TRCK0002', 'BERLIN, DE', 'CREATED', 1, NOW(), NOW());
INSERT INTO SHIPMENT (tracking_code, warehouse_address, shipment_status, weight , created_at, updated_at) VALUES ('TRCK0003', 'BERLIN, DE', 'CREATED', 1, NOW(), NOW());
INSERT INTO order_entity (shipment_id, created_at, updated_at) VALUES (1, NOW(), NOW());