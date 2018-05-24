CREATE TABLE product_info(
  product_id VARCHAR(32) NOT NULL COMMENT '商品个数较多时，int类型可能会溢出',
  product_name VARCHAR(64) NOT NULL ,
  product_price DECIMAL(8, 2) NOT NULL ,
  product_stock INT NOT NULL COMMENT '库存',
  product_description VARCHAR(64),
  product_icon VARCHAR(512) COMMENT '图片',
  category_type INT NOT NULL COMMENT '类目编号',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp on UPDATE current_timestamp
                COMMENT '每次执行更新操作时自动更新该时间',
  PRIMARY KEY (product_id)
) COMMENT '商品信息表';




CREATE TABLE product_category(
  category_id INT NOT NULL AUTO_INCREMENT,
  category_name VARCHAR(64) NOT NULL,
  category_type INT NOT NULL COMMENT '类目编号',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp on UPDATE current_timestamp
                COMMENT '每次执行更新操作时自动更新该时间',
  PRIMARY KEY (category_id),
  UNIQUE KEY (category_type)
) COMMENT '类目表';



CREATE TABLE order_list(
  order_id VARCHAR(32) NOT NULL ,
  buyer_name VARCHAR(32) NOT NULL ,
  buyer_phone VARCHAR(32) NOT NULL ,
  buyer_address VARCHAR(128) NOT NULL ,
  buyer_openid VARCHAR(64) NOT NULL COMMENT '买家微信openid',
  order_amount DECIMAL(8, 2) NOT NULL COMMENT '订单总金额',
  order_status TINYINT(3) NOT NULL DEFAULT '0' COMMENT '订单状态，默认为0表示新下单',
  pay_status TINYINT(3) NOT NULL DEFAULT '0' COMMENT '支付状态，默认为0表示未支付',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp on UPDATE current_timestamp
                COMMENT '每次执行更新操作时自动更新该时间',
  PRIMARY KEY (order_id),
  KEY (buyer_openid)
)COMMENT '订单表';




CREATE TABLE order_info(
  info_id VARCHAR(32) NOT NULL ,
  order_id VARCHAR(32) NOT NULL ,
  product_id VARCHAR(32) NOT NULL ,
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp on UPDATE current_timestamp
                 COMMENT '每次执行更新操作时自动更新该时间',
  PRIMARY KEY (info_id),
  KEY (order_id)



)COMMENT '订单详情表';
