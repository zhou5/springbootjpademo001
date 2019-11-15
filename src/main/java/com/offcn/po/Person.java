package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity  //表示这个类映射到指定数据表
@Table(name = "tb_person") //自定义表的名字
public class Person {
    @Id  //表示id属性对应主键
    @GeneratedValue  //自增主键
    private Long id;

    @Column(name = "name",length = 100,nullable = true)
    private String name;

    @Column(name = "age",length = 12,nullable = false)
    private Integer age;
}
