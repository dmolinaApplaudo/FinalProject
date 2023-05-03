CREATE TABLE checkout (
  customer_id BIGINT NOT NULL,
   product_list BLOB,
   CONSTRAINT pk_checkout PRIMARY KEY (customer_id)
);