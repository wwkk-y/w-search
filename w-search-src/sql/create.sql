create table inverted_index(
    word varchar(256) primary key,
    document_id int unsigned not null,
    ref_field varchar(512) default '{}' comment 'JSON {field_name: field_value}'
) comment '倒排索引';

create table document(
    id int unsigned primary key auto_increment,
    content text
) comment '文档';
