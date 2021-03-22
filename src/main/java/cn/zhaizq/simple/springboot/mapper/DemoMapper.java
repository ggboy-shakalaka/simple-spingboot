package cn.zhaizq.simple.springboot.mapper;

import cn.zhaizq.simple.springboot.mapper.entry.DemoEntry;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper extends BaseMapper<DemoEntry> {
}