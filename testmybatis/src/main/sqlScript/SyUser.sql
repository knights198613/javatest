CREATE TABLE sy_user
(
    id BIGINT(20) PRIMARY KEY NOT NULL COMMENT '主键自增' AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL COMMENT '姓名',
    user_code VARCHAR(100) NOT NULL COMMENT '用户名',
    age SMALLINT(6),
    sex VARCHAR(10) COMMENT '1:男 2:女',
    email VARCHAR(100) COMMENT '电子邮箱',
    tel VARCHAR(30),
    degree SMALLINT(6),
    duty VARCHAR(100) COMMENT '职级',
    born_city VARCHAR(200) COMMENT '籍贯',
    pass_word VARCHAR(100) NOT NULL,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    modify_time DATETIME NOT NULL,
    del_flag SMALLINT(6) COMMENT '0:删除  1:有效',
    modify_user VARCHAR(100) COMMENT '修改人'
);