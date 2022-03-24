package net.zdsoft.redisdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author jwc
 * @date 2022/3/24
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -4655852492436707699L;

    private String name;
    private int age;
}
