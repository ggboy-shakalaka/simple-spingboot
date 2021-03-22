package cn.zhaizq.simple.springboot.mapper.entry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("demo_table")
public class DemoEntry {
    private Integer id;
    private String name;
}