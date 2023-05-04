CREATE TABLE CART (
  customer_id BIGINT NOT NULL,
   product_id BIGINT,
   quantity INT,
   CONSTRAINT pk_cart PRIMARY KEY (customer_id)
);

CREATE TABLE CHECKOUT (
  customer_id BIGINT NOT NULL,
   CONSTRAINT pk_checkout PRIMARY KEY (customer_id)
);

ALTER TABLE CART ADD CONSTRAINT FK_CART_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES CHECKOUT (customer_id);