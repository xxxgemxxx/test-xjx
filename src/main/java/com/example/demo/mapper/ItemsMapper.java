package com.example.demo.mapper;




import com.example.demo.pojo.Items;
import com.example.demo.pojo.ItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsMapper {


    Items selectByPrimaryKey(Integer id);


}