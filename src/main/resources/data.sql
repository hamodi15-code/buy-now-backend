INSERT INTO category (id, name) VALUES (1, 'Smartphones');
INSERT INTO category (id, name) VALUES (2, 'Laptops');
INSERT INTO category (id, name) VALUES (3, 'Tablets');
INSERT INTO category (id, name) VALUES (4, 'Headphones');
INSERT INTO category (id, name) VALUES (5, 'Smartwatches');
INSERT INTO category (id, name) VALUES (6, 'Televisions');
INSERT INTO category (id, name) VALUES (7, 'Gaming');
INSERT INTO category (id, name) VALUES (8, 'Cameras');
INSERT INTO category (id, name) VALUES (9, 'Accessories');
INSERT INTO category (id, name) VALUES (10, 'Home Appliances');

INSERT INTO product (id, brand, category_id, description, inventory, name, price) VALUES
                                                                                      (1, 'Apple', 1, 'Premium Apple smartphone with advanced performance and camera.', 15, 'iPhone 15 Pro', 1199.99),
                                                                                      (2, 'Samsung', 1, 'Flagship Samsung smartphone with powerful battery and bright display.', 18, 'Samsung Galaxy S24', 999.99),
                                                                                      (3, 'Xiaomi', 1, 'Modern Xiaomi smartphone with sleek design and fast processor.', 20, 'Xiaomi 14', 749.99),
                                                                                      (4, 'Apple', 3, 'Elegant Apple tablet for productivity and study.', 12, 'iPad Air 2024', 799.99),
                                                                                      (5, 'Samsung', 3, 'High-end Android tablet with premium display.', 10, 'Galaxy Tab S9', 699.99),
                                                                                      (6, 'Dell', 2, 'Lightweight laptop for office work and daily productivity.', 9, 'Dell XPS 13', 1399.99),
                                                                                      (7, 'HP', 2, 'Reliable laptop suitable for students and home users.', 14, 'HP Pavilion 15', 899.99),
                                                                                      (8, 'Lenovo', 2, 'Business laptop with strong performance and keyboard comfort.', 11, 'ThinkPad X1 Carbon', 1599.99),
                                                                                      (9, 'Asus', 2, 'Gaming laptop with high performance graphics.', 7, 'ROG Zephyrus G14', 1799.99),
                                                                                      (10, 'Sony', 4, 'Wireless noise cancelling headphones with premium sound.', 25, 'Sony WH-1000XM5', 399.99),
                                                                                      (11, 'JBL', 4, 'Comfortable wireless headphones with strong bass.', 30, 'JBL Tune 770NC', 149.99),
                                                                                      (12, 'Apple', 4, 'Compact wireless earbuds with noise cancellation.', 28, 'AirPods Pro 2', 249.99),
                                                                                      (13, 'Apple', 5, 'Smartwatch with health tracking and iPhone integration.', 16, 'Apple Watch Series 9', 429.99),
                                                                                      (14, 'Samsung', 5, 'Stylish smartwatch with fitness monitoring.', 17, 'Galaxy Watch 6', 349.99),
                                                                                      (15, 'LG', 6, '4K OLED television with premium color quality.', 6, 'LG OLED C3 55-inch', 1299.99),
                                                                                      (16, 'Samsung', 6, 'Large smart TV with vivid QLED display.', 5, 'Samsung QLED Q80C 65-inch', 1499.99),
                                                                                      (17, 'Sony', 7, 'Next generation gaming console with immersive experience.', 13, 'PlayStation 5', 499.99),
                                                                                      (18, 'Canon', 8, 'Mirrorless camera suitable for creators and beginners.', 8, 'Canon EOS R50', 899.99),
                                                                                      (19, 'Sony', 8, 'Compact content creator camera with interchangeable lenses.', 9, 'Sony ZV-E10', 799.99),
                                                                                      (20, 'Logitech', 9, 'Premium wireless productivity mouse.', 35, 'MX Master 3S', 109.99);

INSERT INTO image (id, file_name, file_type, download_url, product_id) VALUES
                                                                           (1, 'iphone15.jpeg', 'image/jpeg', '/product-images/iphone15.jpeg', 1),
                                                                           (2, 'galaxy-s24.jpeg', 'image/jpeg', '/product-images/galaxy-s24.jpeg', 2),
                                                                           (3, 'xiaomi14.jpeg', 'image/jpeg', '/product-images/xiaomi14.jpeg', 3),
                                                                           (4, 'ipad-air.jpg', 'image/jpg', '/product-images/ipad-air.jpg', 4),
                                                                           (5, 'galaxy-tab-s9.jpg', 'image/jpg', '/product-images/galaxy-tab-s9.jpg', 5),
                                                                           (6, 'dell-xps13.jpeg', 'image/jpeg', '/product-images/dell-xps13.jpeg', 6),
                                                                           (7, 'hp-pavilion15.jpg', 'image/jpg', '/product-images/hp-pavilion15.jpg', 7),
                                                                           (8, 'thinkpad-x1-carbon.jpg', 'image/jpg', '/product-images/thinkpad-x1-carbon.jpg', 8),
                                                                           (9, 'rog-g14.png', 'image/png', '/product-images/rog-g14.png', 9),
                                                                           (10, 'sony-wh1000xm5.jpg', 'image/jpg', '/product-images/sony-wh1000xm5.jpg', 10),
                                                                           (11, 'jbl-770nc.jpg', 'image/jpg', '/product-images/jbl-770nc.jpg', 11),
                                                                           (12, 'airpods-pro2.jpeg', 'image/jpeg', '/product-images/airpods-pro2.jpeg', 12),
                                                                           (13, 'apple-watch9.jpeg', 'image/jpeg', '/product-images/apple-watch9.jpeg', 13),
                                                                           (14, 'galaxy-watch6.jpg', 'image/jpg', '/product-images/galaxy-watch6.jpg', 14),
                                                                           (15, 'lg-oled-c3.jpg', 'image/jpg', '/product-images/lg-oled-c3.jpg', 15),
                                                                           (16, 'samsung-q80c.jpg', 'image/jpg', '/product-images/samsung-q80c.jpg', 16),
                                                                           (17, 'ps5.jpg', 'image/jpg', '/product-images/ps5.jpg', 17),
                                                                           (18, 'canon-r50.jpg', 'image/jpg', '/product-images/canon-r50.jpg', 18),
                                                                           (19, 'sony-zve10.jpg', 'image/jpg', '/product-images/sony-zve10.jpg', 19),
                                                                           (20, 'mx-master-3s.jpg', 'image/jpg', '/product-images/mx-master-3s.jpg', 20);