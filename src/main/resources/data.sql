
CREATE TABLE IF NOT EXISTS producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DOUBLE NOT NULL
);

INSERT INTO producto (nombre, precio) VALUES
('Laptop', 300.99),
('Smartphone', 180.99),
('Tablet', 120.99),
('Mouse', 29.99),
('Smartwatch', 100.99),
('Headphones', 29.99);



