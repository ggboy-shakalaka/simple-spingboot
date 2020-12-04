package cn.zhaizq.simple.springboot.mapper;

import cn.zhaizq.simple.springboot.mapper.entry.BaseEntry;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface BaseMapper extends Mapper<BaseEntry> {
    @Select("${arg0}")
    List<Map<String, Object>> select(String sql);

    @Select("${arg0}")
    Map<String, Object> selectOne(String sql);

    @Insert("${arg0}")
    int insert(String sql, @Param("data") Map<String, Object> map);

    @Update("${arg0}")
    int update(String sql, @Param("data") Map<String, Object> map);
}