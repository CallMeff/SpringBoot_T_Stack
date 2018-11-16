package com.feng.domian.dataobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @desc：用户实体类
 * @title：UserDO
 * @author: tianfengluyao
 * @date: 2018/11/16 16:29
 */
@Entity
@Table(name = "t_user")
@Getter
@Setter
public class UserDO {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 10)
    private String name;

    @Column(name = "language")
    private int language;

}
