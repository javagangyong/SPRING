package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.ProductDTO;

@Repository
public interface ProductDAO {

	@Select("select * from product order by idx")
	List<ProductDTO> selectList();

	@Insert("insert into product (productName, price, productQuantity, img)"
			+ "		values (#{productName}, #{price}, #{productQuantity}, #{img})")
	int insert(ProductDTO dto);

}
