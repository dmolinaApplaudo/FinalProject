CREATE TABLE product (
  product_id BIGINT NOT NULL,
   name VARCHAR(50) NOT NULL,
   price DOUBLE PRECISION NOT NULL,
   CONSTRAINT pk_product PRIMARY KEY (product_id)
);